package com.devonfw.app.groupordermangemnt.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import com.devonfw.app.groupordermangemnt.common.GroupOrderTo;
import com.devonfw.app.groupordermangemnt.dataaccess.GroupOrder;
import com.devonfw.app.groupordermangemnt.logic.api.GroupOrderMapper;
import com.devonfw.app.groupordermangemnt.logic.imp.GroupOrderMangmentImpl;

import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;

/**
 * @author ykharita
 *
 */
@QuarkusTest
public class GroupOrderTest {
  @Inject
  GroupOrderMangmentImpl groupOrder;

  @Inject
  GroupOrderMapper mapper;

//  @Test
//  @TestTransaction
//  void creatGroupOrderTest() {
//
//    GroupOrderTo order = new GroupOrderTo();
//    order.setId(10L);
//    order.setName("order10");
//    this.groupOrder.createGroupOrder(order);
//    assertTrue(this.groupOrder.listGroupOrders(100).contains(order));
//  }

  @Test
  void toGroupOrderToTest() {

    GroupOrderTo order = new GroupOrderTo();
    order.setId(100L);
    order.setName("order100");
    assertEquals(this.mapper.toEntity(order).getClass(), GroupOrder.class);
  }
}
