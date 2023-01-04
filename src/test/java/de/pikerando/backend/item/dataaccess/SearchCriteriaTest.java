package de.pikerando.backend.item.dataaccess;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import de.pikerando.backend.item.dataaccess.repo.imp.ItemRepositoryImpl;

import io.quarkus.test.junit.QuarkusTest;

/**
 * TODO ykharita This type ...
 *
 */
@QuarkusTest
public class SearchCriteriaTest {

  @Inject
  ItemRepositoryImpl itemRepo;

  @Test
  void findByGroupOrderID() {

    List<Item> items;
    items = this.itemRepo.findeByGroupOrderId(3L);
    assertNotNull(items);
    assertEquals(items.size(), 2);

  }
}
