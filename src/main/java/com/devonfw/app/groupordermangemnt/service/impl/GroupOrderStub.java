package com.devonfw.app.groupordermangemnt.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.devonfw.app.groupordermangemnt.common.model.GroupOrderTo;
import com.devonfw.app.groupordermangemnt.common.model.ItemTo;
import com.devonfw.app.groupordermangemnt.logic.api.GroupOrderMangment;
import com.devonfw.app.groupordermangemnt.service.api.GroupOrdersApi;

public class GroupOrderStub implements GroupOrdersApi {
  @Inject
  GroupOrderMangment groupOrder;

  @Override
  @Transactional
  public void createGroupOrder(GroupOrderTo groupOrderTo) {

    this.groupOrder.createGroupOrder(groupOrderTo);
  }

  @Override
  public void createItem(String groupOrderId, ItemTo itemTo) {

  }

  @Override
  public List<GroupOrderTo> listGroupOrders(Integer limit) {

    return this.groupOrder.listGroupOrders(limit);
    // List<GroupOrderTo> orders = new ArrayList<>();
    // GroupOrderTo order1 = new GroupOrderTo();
    // order1.setName("order1");
    // order1.setId(1L);
    // GroupOrderTo order2 = new GroupOrderTo();
    // order2.setName("order2");
    // order2.setId(2L);
    // orders.add(order1);
    // orders.add(order2);
    // return orders;
  }

  @Override
  public List<ItemTo> showGroupOrderById(String groupOrderId) {

    List<ItemTo> items = new ArrayList<>();
    ItemTo item1 = new ItemTo();
    item1.setName("pizza margerta");
    item1.setId(1L);
    ItemTo item2 = new ItemTo();
    item2.setName("pizza salam");
    item2.setId(2L);
    items.add(item1);
    items.add(item2);
    return items;
  }

}
