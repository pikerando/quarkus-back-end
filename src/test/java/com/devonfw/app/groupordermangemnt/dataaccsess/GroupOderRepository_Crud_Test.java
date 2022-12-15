package com.devonfw.app.groupordermangemnt.dataaccsess;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import com.devonfw.app.groupordermangemnt.dataaccess.GroupOrder;
import com.devonfw.app.groupordermangemnt.dataaccess.repo.api.GroupOrderRepository;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class GroupOderRepository_Crud_Test {

  @Inject
  GroupOrderRepository groupOrderRepo;

  @Test
  void testInjected() {

    // first simple test that checks,
    // if annotations for JUnit/container execution
    // are correctly used (and injection is working)
    assertNotNull(this.groupOrderRepo);
  }

  @Test
  void findAllgroupOrder() {

    List<GroupOrder> orders;
    orders = (List<GroupOrder>) this.groupOrderRepo.findAll();
    assertNotNull(orders);
    assertEquals(orders.size(), 3);
  }

  @Test
  void findBygroupOrderID() {

    Optional<GroupOrder> order;
    order = this.groupOrderRepo.findById(1L);
    assertNotNull(order);
    Optional<GroupOrder> order2;
    order2 = this.groupOrderRepo.findById(1000L);
    assertEquals(order2, Optional.empty());
    ;
  }
}
