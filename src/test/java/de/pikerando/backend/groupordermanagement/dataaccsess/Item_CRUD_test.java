package de.pikerando.backend.groupordermanagement.dataaccsess;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import de.pikerando.backend.groupordermanagement.dataaccess.entity.Item;
import de.pikerando.backend.groupordermanagement.dataaccess.repo.impl.ItemRepositoryImpl;

import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class Item_CRUD_test {

  @Inject
  ItemRepositoryImpl itemRepo;

  @Test
  void testInjected() {

    // first simple test that checks,
    // if annotations for JUnit/container execution
    // are correctly used (and injection is working)
    assertNotNull(this.itemRepo);
  }

  @Test
  void findAllitem() {

    List<Item> items;
    items = this.itemRepo.findAll().list();
    assertNotNull(items);
    assertEquals(items.size(), 3);
  }

  @Test
  void findByitemID() {

    Item item;
    item = this.itemRepo.findById(11L);
    assertNotNull(item);
    Item item2;
    item2 = this.itemRepo.findById(12343132L);
    assertNull(item2);

  }

  @Test
  void creatItem() {

    Item item = new Item();
    creatOrder(item);
    assertNotNull(item.getId());

  }

  @TestTransaction
  void creatOrder(Item item) {

    this.itemRepo.persist(item);

  }
}
