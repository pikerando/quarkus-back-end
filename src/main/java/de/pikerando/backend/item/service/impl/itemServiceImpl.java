package de.pikerando.backend.item.service.impl;

import javax.inject.Inject;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

import de.pikerando.backend.general.sevice.api.ItemsApi;
import de.pikerando.backend.general.sevice.model.ItemTo;
import de.pikerando.backend.item.logic.api.ItemManagement;

/**
 * TODO ykharita This type ...
 *
 */
public class itemServiceImpl implements ItemsApi {

  @Inject
  private ItemManagement itemManagement;

  @Override
  @Transactional
  public void createItem(ItemTo itemTo) throws PersistenceException {

    try {
      this.itemManagement.createItem(itemTo);

    } catch (PersistenceException e) {
      throw new PersistenceException("Duplicate value detected: " + itemTo.getId());
    }

  }

  @Override
  @Transactional
  public void deleteItem(Long itemId) {

    this.itemManagement.deleteItem(itemId);

  }

  @Override
  @Transactional
  public void updateItem(ItemTo itemTo) {

    this.itemManagement.updateItem(itemTo);

  }

}
