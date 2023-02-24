package de.pikerando.backend.restaurantmanagement.service.impl;

import javax.transaction.Transactional;

import de.pikerando.backend.general.sevice.api.DishRegisterApi;
import de.pikerando.backend.general.sevice.model.DishTo;
import de.pikerando.backend.restaurantmanagement.logic.api.DishManagement;

/**
 * TODO ykharita This type ...
 *
 */
public class DishesServiceImpl implements DishRegisterApi {

  DishManagement dishmanagment;

  @Override
  public void deleteRestaurant(Long dishId) {

    this.dishmanagment.deleteDish(dishId);

  }

  @Override
  @Transactional
  public void createDish(Long restaurantId, DishTo dishTo) {

    this.dishmanagment.creatDish(restaurantId, dishTo);

  }

  @Override
  @Transactional
  public DishTo updateDish(Long dishId, DishTo dishTo) {

    return this.dishmanagment.updateDish(dishId, dishTo);

  }

}
