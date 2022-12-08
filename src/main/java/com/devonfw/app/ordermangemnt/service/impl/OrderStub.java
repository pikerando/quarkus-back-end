package com.devonfw.app.ordermangemnt.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.openapi.quarkus.openapi_yaml.model.InlineObject;
import org.openapi.quarkus.openapi_yaml.model.InlineObject1;

import com.devonfw.app.ordermangemnt.common.ItemTo;
import com.devonfw.app.ordermangemnt.common.OrderTo;
import com.devonfw.app.ordermangemnt.service.api.OrdersApi;

/**
 * TODO ykharita This type ...
 *
 */
public class OrderStub implements OrdersApi {

  @Override
  public void createIteam(String orderId, InlineObject1 inlineObject1) {

    // TODO Auto-generated method stub

  }

  @Override
  public void createOrder(InlineObject inlineObject) {

    // TODO Auto-generated method stub

  }

  @Override
  public List<OrderTo> listOrders(Integer limit) {

    List<OrderTo> orders = new ArrayList<>();
    OrderTo order1 = new OrderTo();
    order1.setName("order1");
    order1.setId(1L);
    OrderTo order2 = new OrderTo();
    order2.setName("order2");
    order2.setId(2L);
    orders.add(order1);
    orders.add(order2);
    return orders;

  }

  @Override
  public List<ItemTo> showOrderById(String orderId) {

    List<ItemTo> items = new ArrayList<>();
    ItemTo item1 = new ItemTo();
    item1.setName("item1");
    item1.setId(1L);
    ItemTo item2 = new ItemTo();
    item2.setName("item2");
    item2.setId(2L);
    items.add(item1);
    items.add(item2);
    return items;
  }

}
