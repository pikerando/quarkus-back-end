package de.pikerando.backend.restaurant.service;

import java.util.List;

import javax.inject.Inject;

import de.pikerando.backend.general.sevice.api.RestaurantsApi;
import de.pikerando.backend.general.sevice.model.RestaurantTo;
import de.pikerando.backend.restaurant.logic.api.RestaurantMangment;

/**
 * TODO ykharita This type ...
 *
 */
public class RestaurantServiceImpl implements RestaurantsApi {

  @Inject
  private RestaurantMangment restaurantmangemnt;

  @Override
  public List<RestaurantTo> listRestaurants(Integer limit) {

    return this.restaurantmangemnt.listRestaurants(limit);
  }

  @Override
  public RestaurantTo showRestaurantById(Long restaurantId) {

    return this.restaurantmangemnt.getRestaurantById(restaurantId);
  }

}
