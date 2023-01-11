package de.pikerando.backend.item.logic.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import de.pikerando.backend.dish.service.api.DishToItemService;
import de.pikerando.backend.general.sevice.model.ItemTo;
import de.pikerando.backend.grouporder.service.api.UpdateGroupOrderSevice;
import de.pikerando.backend.item.dataaccess.Item;
import de.pikerando.backend.item.dataaccess.repo.api.ItemRepository;
import de.pikerando.backend.item.logic.api.ItemManagement;
import de.pikerando.backend.item.logic.api.ItemMapper;

/**
 * TODO ykharita This type ...
 *
 */
@ApplicationScoped
public class ItemManagementImpl implements ItemManagement {

  @Inject
  private ItemRepository itemRepo;

  @Inject
  private ItemMapper itemMapper;

  @Inject
  private DishToItemService dishService;

  @Inject
  UpdateGroupOrderSevice updateGroupOrder;

  @Override
  public void createItem(ItemTo itemTo) {

    this.updateGroupOrder.updateTotalPrice(itemTo.getGroupOrderId(), itemTo.getDish().getPrice());
    this.itemRepo.persist(this.itemMapper.toEntity(itemTo));

  }

  @Override
  public List<ItemTo> listItemsOfGroupOrder(Long groupOrderId) {

    List<ItemTo> items = this.itemMapper.toToList(this.itemRepo.findeByGroupOrderId(groupOrderId));

    return items.stream().map(e -> {
      e.setDish(this.dishService.getDishByDishId(e.getDish().getId()));
      return e;
    }).toList();

  }

  @Override
  public void deleteItem(Long itemId) {

    Item item = this.itemRepo.find("itemId", itemId).firstResult();
    Float price = -1 * this.dishService.getDishByDishId(item.getDishId()).getPrice();
    this.updateGroupOrder.updateTotalPrice(item.getGroupOrderId(), price);
    this.itemRepo.delete("itemId", itemId);

  }

  @Override
  public void updateItem(ItemTo itemTo) {

    Item item = this.itemRepo.findByItemId(itemTo.getId());
    if (itemTo.getName() != null) {
      item.setName(itemTo.getName());
    }
    if (itemTo.getGroupOrderId() != null) {
      item.setGroupOrderId(itemTo.getGroupOrderId());
    }
    if (itemTo.getDish() != null) {
      this.updateGroupOrder.updateTotalPrice(itemTo.getGroupOrderId(), itemTo.getDish().getPrice());
      item.setDishId(itemTo.getDish().getId());
    }

    this.itemRepo.persist(item);
  }
}
