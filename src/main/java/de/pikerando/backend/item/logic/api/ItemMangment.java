package de.pikerando.backend.item.logic.api;

import java.util.List;

import de.pikerando.backend.grouporder.sevice.model.ItemTo;

/**
 * TODO ykharita This type ...
 *
 */

public interface ItemMangment {
  public void createItem(Long groupOrderId, ItemTo itemTo);

  public List<ItemTo> listItemsOfGroupOrder(Long groupOrderId);
}