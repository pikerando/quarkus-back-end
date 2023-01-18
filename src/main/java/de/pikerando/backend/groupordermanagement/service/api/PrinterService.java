package de.pikerando.backend.groupordermanagement.service.api;

import javax.enterprise.context.ApplicationScoped;

import de.pikerando.backend.groupordermanagement.service.Order;

/**
 * TODO ykharita This type ...
 *
 */
@ApplicationScoped
public interface PrinterService {
  Order order(Long GroupOrderId);
}
