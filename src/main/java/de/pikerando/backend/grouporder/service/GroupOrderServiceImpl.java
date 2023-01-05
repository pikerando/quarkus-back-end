package de.pikerando.backend.grouporder.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import de.pikerando.backend.general.sevice.api.GroupOrdersApi;
import de.pikerando.backend.general.sevice.model.GroupOrderTo;
import de.pikerando.backend.general.sevice.model.ItemTo;
import de.pikerando.backend.grouporder.logic.api.GroupOrderMangment;
import de.pikerando.backend.item.service.impl.ItemGroupOrderServiceImpl;

public class GroupOrderServiceImpl implements GroupOrdersApi {
  @Inject
  private GroupOrderMangment groupOrder;

  @Inject
  private ItemGroupOrderServiceImpl itemsevice;

  @Override
  @Transactional
  public void createGroupOrder(GroupOrderTo groupOrderTo) {

    this.groupOrder.createGroupOrder(groupOrderTo);
  }

  @Override
  public List<GroupOrderTo> listGroupOrders(Integer limit) {

    return this.groupOrder.listGroupOrders(limit);

  }

  @Override
  public void createItem(Long groupOrderId, ItemTo itemTo) {

    this.itemsevice.createItem(groupOrderId, itemTo);

  }

  @Override
  public List<ItemTo> showGroupOrderById(Long groupOrderId) {

    return this.itemsevice.listItemsOfGroupOrder(groupOrderId);

  }

  @Override
  public void deleteItem(Long itemId) {

    this.itemsevice.deleteItem(itemId);
  }

}
