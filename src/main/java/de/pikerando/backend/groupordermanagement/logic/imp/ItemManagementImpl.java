package de.pikerando.backend.groupordermanagement.logic.imp;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import de.pikerando.backend.general.sevice.model.ItemTo;
import de.pikerando.backend.groupordermanagement.dataaccess.entity.Item;
import de.pikerando.backend.groupordermanagement.dataaccess.repo.api.ItemRepository;
import de.pikerando.backend.groupordermanagement.logic.api.ItemManagement;
import de.pikerando.backend.groupordermanagement.logic.api.ItemMapper;

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

  @Override
  public void createItem(ItemTo itemTo) {

    this.itemRepo.persist(this.itemMapper.toEntity(itemTo));

  }

  @Override
  public List<ItemTo> listItemsOfGroupOrder(Long groupOrderId) {

    return this.itemMapper.toToList(this.itemRepo.findeByGroupOrderId(groupOrderId));

  }

  @Override
  public void deleteItem(Long itemId) {

    this.itemRepo.delete("id", itemId);

  }

  @Override
  public void updateItem(ItemTo itemTo) {

    Item item = this.itemRepo.find("id", itemTo.getId()).firstResult();
    item.setDishName(itemTo.getDishName());
    item.setExtras(itemTo.getExtras());
    item.setPrice(itemTo.getPrice());
    item.setGroupOrderId(itemTo.getGroupOrderId());
    this.itemRepo.persist(item);
  }
}
