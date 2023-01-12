package de.pikerando.backend.groupordermanagement.logic.api;

import java.util.List;

import de.pikerando.backend.general.sevice.model.ItemTo;

/**
 * TODO ykharita This type ...
 *
 */

public interface ItemManagement {
  void createItem(ItemTo itemTo);

  List<ItemTo> listItemsOfGroupOrder(Long groupOrderId);

  void deleteItem(Long itemId);

  void updateItem(ItemTo itemTo);
}
