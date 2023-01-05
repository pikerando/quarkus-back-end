package de.pikerando.backend.item.logic.api;

import java.util.List;

import de.pikerando.backend.general.sevice.model.ItemTo;

/**
 * TODO ykharita This type ...
 *
 */

public interface ItemManagement {
  public void createItem(Long groupOrderId, ItemTo itemTo);

  public void deleteItem(Long itemId);

  public List<ItemTo> listItemsOfGroupOrder(Long groupOrderId);
}
