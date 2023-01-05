package de.pikerando.backend.restaurant.logic.api;

import java.util.List;

import de.pikerando.backend.general.sevice.model.RestaurantTo;

/**
 * TODO ykharita This type ...
 *
 */
public interface RestaurantMangment {
  List<RestaurantTo> listRestaurants(Integer limit);

  RestaurantTo getRestaurantById(Long restaurantId);
}
