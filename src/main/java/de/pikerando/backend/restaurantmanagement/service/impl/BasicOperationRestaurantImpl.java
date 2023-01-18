package de.pikerando.backend.restaurantmanagement.service.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import de.pikerando.backend.general.sevice.model.RestaurantTo;
import de.pikerando.backend.restaurantmanagement.logic.api.RestaurantManagement;
import de.pikerando.backend.restaurantmanagement.service.api.BasicOperationRestaurant;

/**
 * TODO ykharita This type ...
 *
 */
@ApplicationScoped
public class BasicOperationRestaurantImpl implements BasicOperationRestaurant {

  @Inject
  private RestaurantManagement restaurantmanagement;

  @Override
  public void createRestaurant(RestaurantTo restaurantTo) {

    this.restaurantmanagement.createRestaurant(restaurantTo);

  }

  @Override
  public void deleteRestaurant(Long RestaurantId) {

    this.restaurantmanagement.deleteRestaurant(RestaurantId);

  }

  @Override
  public void updateRestaurant(RestaurantTo restaurantTo) {

    updateRestaurant(restaurantTo);

  }

}
