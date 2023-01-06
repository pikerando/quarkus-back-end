package de.pikerando.backend.item.service.api;

import java.util.List;

import de.pikerando.backend.general.sevice.model.ItemTo;

/**
 * TODO ykharita This type ...
 *
 */

public interface ItemGroupOrderService {

  public List<ItemTo> listItemsOfGroupOrder(Long groupOrderId);

}
