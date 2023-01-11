package de.pikerando.backend.grouporder.logic.api;

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

  void updateTotalPrice(Long groupOrderId, Float price);
}
