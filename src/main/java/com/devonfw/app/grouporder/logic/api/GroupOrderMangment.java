package com.devonfw.app.grouporder.logic.api;

import java.util.List;

import com.devonfw.app.grouporder.common.model.GroupOrderTo;

/**
 *
 *
 */

public interface GroupOrderMangment {
  public List<GroupOrderTo> listGroupOrders(Integer limit);

  public void createGroupOrder(GroupOrderTo groupOrderTo);
}
