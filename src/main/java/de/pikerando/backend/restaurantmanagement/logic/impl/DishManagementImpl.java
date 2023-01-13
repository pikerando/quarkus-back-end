package de.pikerando.backend.restaurantmanagement.logic.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import de.pikerando.backend.general.sevice.model.DishTo;
import de.pikerando.backend.restaurantmanagement.dataaccess.repo.api.DishRepository;
import de.pikerando.backend.restaurantmanagement.logic.api.DishManagement;
import de.pikerando.backend.restaurantmanagement.logic.api.DishMapper;

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
  public DishTo findDishByDishId(Long dishId) {

    return this.dishMapper.toTO(this.dishRepo.findByDishId(dishId));
  }

}
