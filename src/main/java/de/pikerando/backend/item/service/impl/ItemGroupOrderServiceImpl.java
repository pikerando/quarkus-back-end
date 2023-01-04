package de.pikerando.backend.item.service.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import de.pikerando.backend.grouporder.sevice.model.ItemTo;
import de.pikerando.backend.item.logic.api.ItemMangment;
import de.pikerando.backend.item.service.api.ItemGroupOrderService;

/**
 * TODO ykharita This type ...
 *
 */
@ApplicationScoped
public class ItemGroupOrderServiceImpl implements ItemGroupOrderService {

  @Inject
  ItemMangment itemMangemnt;

  @Override
  public void createItem(Long groupOrderId, ItemTo itemTo) {

    this.itemMangemnt.createItem(groupOrderId, itemTo);

  }

  @Override
  public List<ItemTo> listItemsOfGroupOrder(Long groupOrderId) {

    return this.itemMangemnt.listItemsOfGroupOrder(groupOrderId);
  }

}
