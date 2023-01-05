package de.pikerando.backend.restaurant.service;

import java.util.List;

import javax.inject.Inject;

import de.pikerando.backend.dish.service.api.DishService;
import de.pikerando.backend.general.sevice.api.RestaurantsApi;
import de.pikerando.backend.general.sevice.model.RestaurantTo;
import de.pikerando.backend.restaurant.logic.api.RestaurantManagement;

/**
 * TODO ykharita This type ...
 *
 */
public class RestaurantServiceImpl implements RestaurantsApi {

  @Inject
  private RestaurantManagement restaurantmangemnt;

  @Inject
  private DishService dishservice;

  @Override
  public List<RestaurantTo> listRestaurants(Integer limit) {

    return this.restaurantmangemnt.listRestaurants(limit);
  }

  @Override
  public RestaurantTo showRestaurantById(Long restaurantId) {

    RestaurantTo restaurant = this.restaurantmangemnt.getRestaurantById(restaurantId);
    restaurant.setMenu(this.dishservice.listDishesForRestaurant(restaurantId));

    return restaurant;
  }

}
