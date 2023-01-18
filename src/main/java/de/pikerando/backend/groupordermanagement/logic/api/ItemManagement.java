package de.pikerando.backend.groupordermanagement.logic.api;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import de.pikerando.backend.general.sevice.model.ItemTo;

/**
 * TODO ykharita This type ...
 *
 */

@ApplicationScoped
public interface ItemManagement {
  void createItem(ItemTo itemTo);

  List<ItemTo> listItemsOfGroupOrder(Long groupOrderId);

  void deleteItem(Long itemId);

  void updateItem(Long itemId, ItemTo itemTo);
}
