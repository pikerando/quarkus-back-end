package de.pikerando.backend.groupordermanagement.service;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import de.pikerando.backend.groupordermanagement.service.api.PrinterService;

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

    System.out.print(this.printerService.order(12L).getOrder());
  }
}
