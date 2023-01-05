package de.pikerando.backend.dish.service.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import de.pikerando.backend.dish.logic.api.DishManagement;
import de.pikerando.backend.dish.service.api.DishService;
import de.pikerando.backend.general.sevice.model.DishTo;

/**
 * TODO ykharita This type ...
 *
 */
@ApplicationScoped
public class DishServiceImpl implements DishService {
  @Inject
  private DishManagement dishmanagement;

  @Override
  public List<DishTo> listDishesForRestaurant(Long RestaurantId) {

    return this.dishmanagement.ListDishesForRestaurant(RestaurantId);
  }

}
