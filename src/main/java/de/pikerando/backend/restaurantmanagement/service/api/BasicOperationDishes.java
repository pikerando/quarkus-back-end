package de.pikerando.backend.restaurantmanagement.service.api;

import de.pikerando.backend.general.sevice.model.DishTo;

/**
 * TODO ykharita This type ...
 *
 */
public interface BasicOperationDishes {

  void creatDish(DishTo dishTo, Long RestaurantId);

  void deleteDish(Long dishId);

  void updateDish(DishTo dishto);

}
