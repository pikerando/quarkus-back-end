package de.pikerando.backend.item.service.impl;

import javax.inject.Inject;
import javax.persistence.PersistenceException;

import de.pikerando.backend.general.sevice.api.ItemsApi;
import de.pikerando.backend.general.sevice.model.GroupOrderTo;
import de.pikerando.backend.general.sevice.model.ItemTo;
import de.pikerando.backend.item.logic.api.ItemManagement;

/**
 * TODO ykharita This type ...
 *
 */
public class itemServiceImpl implements ItemsApi {
  @Inject
  private ItemGroupOrderServiceImpl itemsevice;

  @Inject
  private ItemManagement itemManagement;

  @Override
  public void createItem(ItemTo itemTo) throws PersistenceException {

    try {

      this.itemManagement.createItem(itemTo);

    } catch (PersistenceException e) {
      throw new PersistenceException("Duplicate value detected: " + itemTo.getId());
    }

  }

  @Override
  public void deleteItem(Long itemId) {

    this.itemManagement.deleteItem(itemId);
    ;
  }

  @Override
  public GroupOrderTo updateItem(ItemTo itemTo) {

    // TODO Auto-generated method stub
    return null;
  }

}
