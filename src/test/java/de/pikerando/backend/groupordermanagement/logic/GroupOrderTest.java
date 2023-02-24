package de.pikerando.backend.groupordermanagement.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import de.pikerando.backend.general.sevice.model.GroupOrderTo;
import de.pikerando.backend.groupordermanagement.dataaccess.entity.GroupOrder;
import de.pikerando.backend.groupordermanagement.logic.api.GroupOrderMapper;
import de.pikerando.backend.groupordermanagement.logic.imp.GroupOrderManagementImpl;

import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;

/**
 * @author ykharita
 *
 */
@QuarkusTest
public class GroupOrderTest {
  @Inject
  GroupOrderManagementImpl groupOrder;

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
