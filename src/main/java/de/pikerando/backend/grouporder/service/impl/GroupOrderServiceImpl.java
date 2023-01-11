package de.pikerando.backend.grouporder.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

import de.pikerando.backend.general.sevice.api.GroupOrdersApi;
import de.pikerando.backend.general.sevice.model.GroupOrderTo;
import de.pikerando.backend.general.sevice.model.ItemTo;
import de.pikerando.backend.grouporder.logic.api.GroupOrderManagement;
import de.pikerando.backend.item.service.impl.ItemGroupOrderServiceImpl;

public class GroupOrderServiceImpl implements GroupOrdersApi {
  @Inject
  private GroupOrderManagement groupOrder;

  @Inject
  private ItemGroupOrderServiceImpl itemsevice;

  @Override
  @Transactional
  public void createGroupOrder(GroupOrderTo groupOrderTo) throws PersistenceException {

    try {
      this.groupOrder.createGroupOrder(groupOrderTo);
    } catch (PersistenceException e) {
      throw new PersistenceException("Duplicate value detected: " + groupOrderTo.getId());
    }

  }

  @Override
  public List<GroupOrderTo> listGroupOrders(Integer limit) {

    return this.groupOrder.listGroupOrders(limit);

  }

  @Override
  public List<ItemTo> showGroupOrderById(Long groupOrderId) {

    return this.itemsevice.listItemsOfGroupOrder(groupOrderId);

  }

  @Override
  @Transactional
  public GroupOrderTo updateStatusOfGroupOrder(Long groupOrderId) {

    return this.groupOrder.updateStatusOfGroupOrder(groupOrderId);
  }

  @Override
  @Transactional
  public void deleteGroupOrder(Long groupOrderId) {

    this.groupOrder.deleteGroupOrder(groupOrderId);
  }

}
