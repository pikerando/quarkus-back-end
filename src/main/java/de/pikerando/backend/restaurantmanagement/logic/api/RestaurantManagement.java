package de.pikerando.backend.restaurantmanagement.logic.api;

import java.util.List;

import de.pikerando.backend.general.sevice.model.RestaurantTo;

/**
 * TODO ykharita This type ...
 *
 */
public interface RestaurantManagement {
  List<RestaurantTo> listRestaurants(Integer limit);

  RestaurantTo getRestaurantById(Long restaurantId);

  void createRestaurant(RestaurantTo restaurantTo);

  void deleteRestaurant(Long restaurantId);

  void updateRestaurant(RestaurantTo restaurantTo);
}
