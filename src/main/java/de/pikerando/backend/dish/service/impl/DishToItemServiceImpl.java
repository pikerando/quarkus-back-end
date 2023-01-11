package de.pikerando.backend.dish.service.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import de.pikerando.backend.dish.logic.api.DishManagement;
import de.pikerando.backend.dish.service.api.DishToItemService;
import de.pikerando.backend.general.sevice.model.DishTo;

/**
 * TODO ykharita This type ...
 *
 */
@ApplicationScoped
public class DishToItemServiceImpl implements DishToItemService {

  @Inject
  DishManagement dishManagement;

  @Override
  public DishTo getDishByDishId(Long dishId) {

    return this.dishManagement.findDishByDishId(dishId);
  }

}
