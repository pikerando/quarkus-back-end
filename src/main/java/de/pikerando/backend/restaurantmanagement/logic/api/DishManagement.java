package de.pikerando.backend.restaurantmanagement.logic.api;

import de.pikerando.backend.general.sevice.model.DishTo;

/**
 * TODO ykharita This type ...
 *
 */
public interface DishManagement {

  DishTo findDishByDishId(Long dishId);

  void creatDish(DishTo dishTo, Long RestaurantId);

  void deleteDish(Long dishId);

  void updateDish(DishTo dishTo);
}
