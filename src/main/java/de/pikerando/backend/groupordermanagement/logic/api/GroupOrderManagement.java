package de.pikerando.backend.groupordermanagement.logic.api;

import java.util.List;

import de.pikerando.backend.general.sevice.model.GroupOrderTo;

/**
 *
 *
 */

public interface GroupOrderManagement {
  List<GroupOrderTo> listGroupOrders(Integer limit);

  void createGroupOrder(GroupOrderTo groupOrderTo);

  void deleteGroupOrder(Long groupOrderId);

  GroupOrderTo updateStatusOfGroupOrder(Long groupOrderId);

}
