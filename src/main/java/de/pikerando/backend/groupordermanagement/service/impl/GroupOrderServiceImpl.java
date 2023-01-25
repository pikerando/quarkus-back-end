package de.pikerando.backend.groupordermanagement.service.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

import de.pikerando.backend.general.sevice.api.GroupOrdersApi;
import de.pikerando.backend.general.sevice.model.GroupOrderTo;
import de.pikerando.backend.general.sevice.model.ItemTo;
import de.pikerando.backend.groupordermanagement.logic.api.GroupOrderManagement;
import de.pikerando.backend.groupordermanagement.logic.api.ItemManagement;

@ApplicationScoped
public class GroupOrderServiceImpl implements GroupOrdersApi {
  @Inject
  private GroupOrderManagement groupOrder;

  @Inject
  private ItemManagement items;

  @Override
  @Transactional
  public GroupOrderTo createGroupOrder(GroupOrderTo groupOrderTo) throws PersistenceException {

    try {
      return this.groupOrder.createGroupOrder(groupOrderTo);
    } catch (PersistenceException e) {
      throw new PersistenceException(e.getMessage());
    }

  }

  @Override
  public List<GroupOrderTo> listGroupOrders(Integer limit) {

    return this.groupOrder.listGroupOrders(limit);

  }

  @Override
  public List<ItemTo> showGroupOrderById(Long groupOrderId) {

    return this.items.listItemsOfGroupOrder(groupOrderId);

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
