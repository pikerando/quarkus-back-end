package com.devonfw.app.item.logic.api;

import java.util.List;

import com.devonfw.app.grouporder.common.model.ItemTo;

/**
 * TODO ykharita This type ...
 *
 */
public interface ItemMangment {
  public void createItem(String groupOrderId, ItemTo itemTo);

  public List<ItemTo> showGroupOrderById(String groupOrderId);
}
