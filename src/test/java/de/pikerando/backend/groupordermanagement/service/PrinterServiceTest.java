package de.pikerando.backend.groupordermanagement.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import de.pikerando.backend.groupordermanagement.service.api.PrinterService;
import de.pikerando.backend.restaurantmanagement.logic.Order;

import io.quarkus.test.junit.QuarkusTest;

/**
 * TODO ykharita This type ...
 *
 */
@QuarkusTest
public class PrinterServiceTest {
  @Inject
  PrinterService printerService;

  @Test
  void testPrinter() {

    Order expectedOrder = new Order();
    expectedOrder.setRestaurantName("the best Pizza");
    expectedOrder.setOrderer("youssef");

    Order actualOrder = this.printerService.order(12L);
    assertEquals(expectedOrder, actualOrder);

  }
}
