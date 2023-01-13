package de.pikerando.backend.groupordermanagement.logic.imp;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import de.pikerando.backend.general.sevice.model.ItemTo;
import de.pikerando.backend.groupordermanagement.dataaccess.entity.GroupOrder;
import de.pikerando.backend.groupordermanagement.dataaccess.entity.Item;
import de.pikerando.backend.groupordermanagement.dataaccess.repo.api.GroupOrderRepository;
import de.pikerando.backend.groupordermanagement.dataaccess.repo.api.ItemRepository;
import de.pikerando.backend.groupordermanagement.logic.api.ItemManagement;
import de.pikerando.backend.groupordermanagement.logic.api.ItemMapper;

/**
 * @author ykharita
 *
 */
@ApplicationScoped
public class ItemManagementImpl implements ItemManagement {

  @Inject
  private ItemRepository itemRepo;

  @Inject
  private ItemMapper itemMapper;

  @Inject
  private GroupOrderRepository groupOrderRepo;

  @Override
  public void createItem(ItemTo itemTo) throws NullPointerException {

    GroupOrder order = this.groupOrderRepo.findById(itemTo.getGroupOrderId());

    try {
      order.setTotalPrice(order.getTotalPrice() + itemTo.getPrice());
    } catch (NullPointerException e) {
      throw new NullPointerException("price not given: " + itemTo.getPrice());
    }

    this.itemRepo.persist(this.itemMapper.toEntity(itemTo, order));

  }

  @Override
  public List<ItemTo> listItemsOfGroupOrder(Long groupOrderId) {

    return this.itemMapper.toToList(this.itemRepo.findeByGroupOrderId(groupOrderId));

  }

  @Override
  public void deleteItem(Long itemId) throws NullPointerException {

    Item item = this.itemRepo.findById(itemId);

    try {
      item.getGroupOrder().setTotalPrice(item.getGroupOrder().getTotalPrice() - item.getPrice());
    } catch (NullPointerException e) {
      throw new NullPointerException("price not given: " + item.getPrice());
    }

    this.itemRepo.delete("id", itemId);

  }

  @Override
  public void updateItem(ItemTo itemTo) {

    Item item = this.itemRepo.find("id", itemTo.getId()).firstResult();
    item.setDishName(itemTo.getDishName());
    item.setExtras(itemTo.getExtras());
    try {
      item.getGroupOrder().setTotalPrice(item.getGroupOrder().getTotalPrice() + itemTo.getPrice() - item.getPrice());
    } catch (NullPointerException e) {
      throw new NullPointerException("there is no price either by TO" + itemTo.getPrice() + "or by " + item.getPrice());
    }

    item.setPrice(itemTo.getPrice());
    this.itemRepo.persist(item);
  }
}
