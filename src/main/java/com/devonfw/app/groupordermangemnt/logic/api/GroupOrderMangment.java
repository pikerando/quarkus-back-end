package com.devonfw.app.groupordermangemnt.logic.api;

import java.util.List;

import com.devonfw.app.groupordermangemnt.common.GroupOrderTo;

/**
 *
 *
 */

public interface GroupOrderMangment {
  public List<GroupOrderTo> listGroupOrders(Integer limit);

  public void createGroupOrder(GroupOrderTo groupOrderTo);
}
