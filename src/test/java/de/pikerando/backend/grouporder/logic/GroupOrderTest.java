package de.pikerando.backend.grouporder.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import de.pikerando.backend.grouporder.dataaccess.GroupOrder;
import de.pikerando.backend.grouporder.logic.api.GroupOrderMapper;
import de.pikerando.backend.grouporder.logic.imp.GroupOrderMangmentImpl;
import de.pikerando.backend.grouporder.sevice.model.GroupOrderTo;

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
