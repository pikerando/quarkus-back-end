package de.pikerando.backend.restaurantmanagement.service.impl;

import de.pikerando.backend.general.sevice.model.DishTo;
import de.pikerando.backend.restaurantmanagement.logic.api.DishManagement;
import de.pikerando.backend.restaurantmanagement.service.api.BasicOperationDishes;

/**
 * TODO ykharita This type ...
 *
 */
public class BasicOperationDishesImpl implements BasicOperationDishes {

  DishManagement dishmanagment;

  @Override
  public void creatDish(DishTo dishTo, Long RestaurantId) {

    this.dishmanagment.creatDish(dishTo, RestaurantId);

  }

  @Override
  public void deleteDish(Long dishId) {

    this.dishmanagment.deleteDish(dishId);

  }

  @Override
  public void updateDish(DishTo dishto) {

    this.dishmanagment.updateDish(dishto);

  }

}
