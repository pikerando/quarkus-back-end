package de.pikerando.backend.item.logic.api;

import java.util.List;

import de.pikerando.backend.general.sevice.model.ItemTo;

/**
 * TODO ykharita This type ...
 *
 */

public interface ItemManagement {
  void createItem(ItemTo itemTo);

  void deleteItem(Long itemId);

  List<ItemTo> listItemsOfGroupOrder(Long groupOrderId);

  void updateItem(ItemTo itemTo);
}
