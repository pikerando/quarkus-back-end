package de.pikerando.backend.item.service.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import de.pikerando.backend.general.sevice.model.ItemTo;
import de.pikerando.backend.item.logic.api.ItemManagement;
import de.pikerando.backend.item.service.api.ItemGroupOrderService;

/**
 * TODO ykharita This type ...
 *
 */
@ApplicationScoped
public class ItemGroupOrderServiceImpl implements ItemGroupOrderService {

  @Inject
  ItemManagement itemManagement;

  @Override
  public void createItem(Long groupOrderId, ItemTo itemTo) {

    this.itemManagement.createItem(groupOrderId, itemTo);

  }

  @Override
  public List<ItemTo> listItemsOfGroupOrder(Long groupOrderId) {

    return this.itemManagement.listItemsOfGroupOrder(groupOrderId);
  }

  @Override
  public void deleteItem(Long itemId) {

    this.itemManagement.deleteItem(itemId);
  }

}
