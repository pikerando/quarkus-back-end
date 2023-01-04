package de.pikerando.backend.grouporder.logic.api;

import java.util.List;

import de.pikerando.backend.general.sevice.model.GroupOrderTo;

/**
 *
 *
 */

public interface GroupOrderMangment {
  public List<GroupOrderTo> listGroupOrders(Integer limit);

  public void createGroupOrder(GroupOrderTo groupOrderTo);
}
