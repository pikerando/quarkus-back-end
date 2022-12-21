package com.devonfw.app.groupordermangemnt.dataaccsess;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import com.devonfw.app.groupordermangemnt.dataaccess.GroupOrder;
import com.devonfw.app.groupordermangemnt.dataaccess.repo.impl.GroupOrderRepositoryImpl;

import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class GroupOderRepository_Crud_Test {

  @Inject
  GroupOrderRepositoryImpl groupOrderRepo;

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
    orders = this.groupOrderRepo.findAll().list();
    assertNotNull(orders);
    assertEquals(orders.size(), 3);
  }

  @Test
  void findBygroupOrderID() {

    GroupOrder order;
    order = this.groupOrderRepo.findById(123456L);
    assertNotNull(order);
    GroupOrder order2;
    order2 = this.groupOrderRepo.findById(12343132L);
    assertNull(order2);

  }

  @Test
  void creatGroupOrder() {

    GroupOrder order = new GroupOrder();
    order.setGroupOrderId(10L);
    order.setName("order10");
    creatOrder(order);
    assertNotNull(order.getId());

  }

  @TestTransaction
  void creatOrder(GroupOrder order) {

    this.groupOrderRepo.persist(order);

  }
}
