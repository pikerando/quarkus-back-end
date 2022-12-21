package com.devonfw.app.groupordermangemnt.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import com.devonfw.app.groupordermangemnt.common.model.GroupOrderTo;
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

  @Test
  void togroupOrderTest() {

    GroupOrderTo order = new GroupOrderTo();
    order.setId(100L);
    order.setName("order100");
    assertEquals(this.mapper.toEntity(order).getClass(), GroupOrder.class);

  }

  @Test
  void toGroupOrderToTest() {

    GroupOrder order = new GroupOrder();
    order.setGroupOrderId(100L);
    order.setName("order100");
    assertEquals(this.mapper.toTO(order).getClass(), GroupOrderTo.class);
  }

  @Test
  @TestTransaction
  void creatGroupOrderTest() {

    GroupOrderTo order = new GroupOrderTo();
    order.setId(100L);
    order.setName("order100");
    this.groupOrder.createGroupOrder(order);
  }

}
