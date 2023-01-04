package de.pikerando.backend.item.sevice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import de.pikerando.backend.general.sevice.model.ItemTo;
import de.pikerando.backend.item.service.api.ItemGroupOrderService;

import io.quarkus.test.junit.QuarkusTest;

/**
 * TODO ykharita This type ...
 *
 */
@QuarkusTest
public class FindBySearchCriteria {

  @Inject
  ItemGroupOrderService itemservice;

  @Test
  void findItemsforGroupOrderId() {

    List<ItemTo> items;
    items = this.itemservice.listItemsOfGroupOrder(3L);
    assertNotNull(items);
    assertEquals(items.size(), 2);
  }
}
