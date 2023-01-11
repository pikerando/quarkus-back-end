package de.pikerando.backend.grouporder.service.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import de.pikerando.backend.grouporder.logic.api.GroupOrderManagement;
import de.pikerando.backend.grouporder.service.api.UpdateGroupOrderSevice;

/**
 * TODO ykharita This type ...
 *
 */
@ApplicationScoped
public class UpdateGroupOrderServiceImpl implements UpdateGroupOrderSevice {
  @Inject
  GroupOrderManagement groupOrder;

  @Override
  @Transactional
  public void updateTotalPrice(Long groupOrderId, Float price) {

    this.groupOrder.updateTotalPrice(groupOrderId, price);

  }

}
