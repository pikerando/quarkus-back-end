package de.pikerando.backend.groupordermanagement.logic.api;

import javax.enterprise.context.ApplicationScoped;

import de.pikerando.backend.restaurantmanagement.logic.Order;

/**
 * TODO ykharita This type ...
 *
 */
@ApplicationScoped
public interface Printermanagment {
  Order order(Long GroupOrderId);
}
