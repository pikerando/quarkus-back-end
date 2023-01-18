package de.pikerando.backend.restaurantmanagement.service.api;

import de.pikerando.backend.general.sevice.model.RestaurantTo;

/**
 * TODO ykharita This type ...
 *
 */
public interface BasicOperationRestaurant {

  void createRestaurant(RestaurantTo restaurantTo);

  void deleteRestaurant(Long RestaurantId);

  void updateRestaurant(RestaurantTo restaurantTo);
}
