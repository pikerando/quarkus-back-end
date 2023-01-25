package de.pikerando.backend.groupordermanagement.logic.imp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import de.pikerando.backend.general.sevice.model.RestaurantTo;
import de.pikerando.backend.groupordermanagement.dataaccess.entity.GroupOrder;
import de.pikerando.backend.groupordermanagement.dataaccess.entity.Item;
import de.pikerando.backend.groupordermanagement.dataaccess.repo.api.GroupOrderRepository;
import de.pikerando.backend.groupordermanagement.logic.api.Printermanagment;
import de.pikerando.backend.restaurantmanagement.logic.Order;
import de.pikerando.backend.restaurantmanagement.service.impl.OrderServiceImpl;

/**
 * TODO ykharita This type ...
 *
 */
@ApplicationScoped
public class PrinterManagemntImpl implements Printermanagment {

  @Inject
  GroupOrderRepository groupOrederRepo;

  @Inject
  OrderServiceImpl restaurantSevrvice;

  @Override
  public Order order(Long GroupOrderId) {

    GroupOrder groupOrder = this.groupOrederRepo.findById(GroupOrderId);
    RestaurantTo restaurant = this.restaurantSevrvice.showRestaurantById(groupOrder.getRestaurantId());
    List<Item> items = groupOrder.getItems();
    Order order = new Order();
    order.setRestaurantName(restaurant.getName());
    order.setOrderer(groupOrder.getCreator());
    Map<String, List<Item>> groupedItems = new HashMap<String, List<Item>>();
    for (Item item : items) {
      String key = item.getDishName();
      if (groupedItems.get(key) == null) {
        groupedItems.put(key, new ArrayList<Item>());
      }
      groupedItems.get(key).add(item);
    }

    Set<String> groupedItemsKeyset = groupedItems.keySet();
    String orderers;
    String extra;
    String dishName = "";
    float price = 0f;
    int amount = 0;
    for (String dish : groupedItemsKeyset) {
      List<Item> itemsWithSameDish = groupedItems.get(dish);
      amount = itemsWithSameDish.size();
      dishName = itemsWithSameDish.get(0).getDishName();
      price = itemsWithSameDish.get(0).getPrice();
      orderers = " ";
      extra = " ";
      for (Item item : itemsWithSameDish) {
        orderers += item.getCreator() + ", ";
        if (item.getExtras() != null) {
          extra += item.getExtras() + ", ";
        }

      }
      String o = amount + "x <" + dishName + "> ordered by <" + orderers.substring(0, orderers.length() - 2)
          + " > extras wish <" + extra.substring(0, extra.length() - 2) + " > price per one:" + price;
      order.getOrder().add(o);
    }
    return order;

  }

}
