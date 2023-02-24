package de.pikerando.backend.restaurantmanagement.service.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import de.pikerando.backend.general.sevice.api.RestaurantRegisterApi;
import de.pikerando.backend.general.sevice.model.RestaurantTo;
import de.pikerando.backend.restaurantmanagement.logic.api.RestaurantManagement;

/**
 * TODO ykharita This type ...
 *
 */
@ApplicationScoped
public class RestaurantServiceImpl implements RestaurantRegisterApi {

  @Inject
  private RestaurantManagement restaurantmanagement;

  @Override
  @Transactional
  public RestaurantTo createRestaurant(RestaurantTo restaurantTo) {

    return this.restaurantmanagement.createRestaurant(restaurantTo);

  }

  public void deleteRestaurant(Long RestaurantId) {

    this.restaurantmanagement.deleteRestaurant(RestaurantId);

  }

  @Override
  @Transactional
  public RestaurantTo showRestaurantById(Long restaurantId) {

    return this.restaurantmanagement.getRestaurantById(restaurantId);
  }

  @Override

  @Transactional
  public RestaurantTo updateRestaurant(Long restaurantId, RestaurantTo restaurantTo) {

    return this.restaurantmanagement.updateRestaurant(restaurantId, restaurantTo);
  }

}
