package de.pikerando.backend.groupordermanagement.service.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import de.pikerando.backend.groupordermanagement.logic.api.Printermanagment;
import de.pikerando.backend.groupordermanagement.service.Order;
import de.pikerando.backend.groupordermanagement.service.api.PrinterService;

/**
 * TODO ykharita This type ...
 *
 */
@ApplicationScoped
public class PrinterServiceImpl implements PrinterService {

  @Inject
  Printermanagment printerManagment;

  @Override
  public Order order(Long GroupOrderId) {

    return this.printerManagment.order(GroupOrderId);

  }

}
