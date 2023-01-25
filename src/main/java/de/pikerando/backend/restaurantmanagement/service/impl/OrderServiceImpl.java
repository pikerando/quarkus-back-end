package de.pikerando.backend.restaurantmanagement.service.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import de.pikerando.backend.general.sevice.api.RestaurantsApi;
import de.pikerando.backend.general.sevice.model.RestaurantTo;
import de.pikerando.backend.restaurantmanagement.logic.api.RestaurantManagement;

/**
 * TODO ykharita This type ...
 *
 */
@ApplicationScoped
public class OrderServiceImpl implements RestaurantsApi {

  @Inject
  private RestaurantManagement restaurantmanagement;

  @Override
  public List<RestaurantTo> listRestaurants(Integer limit) {

    return this.restaurantmanagement.listRestaurants(limit);
  }

  @Override
  public RestaurantTo showRestaurantById(Long restaurantId) {

    return this.restaurantmanagement.getRestaurantById(restaurantId);
  }

}
