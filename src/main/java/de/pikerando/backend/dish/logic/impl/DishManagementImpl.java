package de.pikerando.backend.dish.logic.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import de.pikerando.backend.dish.dataaccess.repo.api.DishRepository;
import de.pikerando.backend.dish.logic.api.DishManagement;
import de.pikerando.backend.dish.logic.api.DishMapper;
import de.pikerando.backend.general.sevice.model.DishTo;

/**
 * TODO ykharita This type ...
 *
 */

@ApplicationScoped
public class DishManagementImpl implements DishManagement {
  @Inject
  private DishRepository dishRepo;

  @Inject
  private DishMapper dishMapper;

  @Override
  public List<DishTo> ListDishesForRestaurant(Long restaurantId) {

    return this.dishMapper.toTolist(this.dishRepo.findAllByRestaurnatId(restaurantId));
  }

  @Override
  public DishTo findDishByDishId(Long dishId) {

    return this.dishMapper.toTO(this.dishRepo.findByDishId(dishId));
  }

}
