package de.pikerando.backend.item.service.api;

import java.util.List;

import de.pikerando.backend.grouporder.sevice.model.ItemTo;

/**
 * TODO ykharita This type ...
 *
 */

public interface ItemGroupOrderService {

  public void createItem(Long groupOrderId, ItemTo itemTo);

  public List<ItemTo> listItemsOfGroupOrder(Long groupOrderId);

}
