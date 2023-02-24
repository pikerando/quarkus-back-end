package de.pikerando.backend.groupordermanagement.service.impl;

import javax.inject.Inject;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

import de.pikerando.backend.general.sevice.api.ItemsApi;
import de.pikerando.backend.general.sevice.model.ItemTo;
import de.pikerando.backend.groupordermanagement.logic.api.ItemManagement;

/**
 * TODO ykharita This type ...
 *
 */
public class itemServiceImpl implements ItemsApi {

  @Inject
  private ItemManagement itemManagement;

  @Override
  @Transactional
  public ItemTo createItem(ItemTo itemTo) throws PersistenceException {

    try {
      return this.itemManagement.createItem(itemTo);

    } catch (PersistenceException e) {
      throw new PersistenceException("Duplicate value detected: " + itemTo.getId());
    }

  }

  @Override
  @Transactional
  public void deleteItem(Long itemId) throws PersistenceException {

    try {
      this.itemManagement.deleteItem(itemId);
    } catch (PersistenceException e) {
      throw new PersistenceException("persistenceException => " + e.getMessage());
    }

  }

  @Transactional
  @Override
  public void updateItem(Long itemId, ItemTo itemTo) {

    try {
      this.itemManagement.updateItem(itemId, itemTo);
    } catch (PersistenceException e) {
      throw new PersistenceException("persistenceException => " + e.getMessage());
    } catch (NullPointerException e) {
      throw new NullPointerException("nullpointerexception: cant find the item in the database => " + e.getMessage());
    }

    // TODO Auto-generated method stub

  }

}
