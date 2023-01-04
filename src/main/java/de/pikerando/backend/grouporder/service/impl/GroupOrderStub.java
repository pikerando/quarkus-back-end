package de.pikerando.backend.grouporder.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import de.pikerando.backend.grouporder.logic.api.GroupOrderMangment;
import de.pikerando.backend.grouporder.sevice.api.GroupOrdersApi;
import de.pikerando.backend.grouporder.sevice.model.GroupOrderTo;
import de.pikerando.backend.grouporder.sevice.model.ItemTo;
import de.pikerando.backend.item.service.impl.ItemGroupOrderServiceImpl;

public class GroupOrderStub implements GroupOrdersApi {
  @Inject
  GroupOrderMangment groupOrder;

  @Inject
  ItemGroupOrderServiceImpl itemsevice;

  @Override
  @Transactional
  public void createGroupOrder(GroupOrderTo groupOrderTo) {

    this.groupOrder.createGroupOrder(groupOrderTo);
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
  public void createItem(Long groupOrderId, ItemTo itemTo) {

    this.itemsevice.createItem(groupOrderId, itemTo);

  }

  @Override
  public List<ItemTo> showGroupOrderById(Long groupOrderId) {

    return this.itemsevice.listItemsOfGroupOrder(groupOrderId);
    // List<ItemTo> items = new ArrayList<>();
    // ItemTo item1 = new ItemTo();
    // item1.setName("pizza margerta");
    // item1.setId(1L);
    // ItemTo item2 = new ItemTo();
    // item2.setName("pizza salam");
    // item2.setId(2L);
    // items.add(item1);
    // items.add(item2);

  }

}
