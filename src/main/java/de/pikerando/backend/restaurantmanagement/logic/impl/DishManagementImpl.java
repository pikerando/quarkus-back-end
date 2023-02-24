package de.pikerando.backend.restaurantmanagement.logic.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import de.pikerando.backend.general.sevice.model.DishTo;
import de.pikerando.backend.restaurantmanagement.dataaccess.entity.Dish;
import de.pikerando.backend.restaurantmanagement.dataaccess.entity.Restaurant;
import de.pikerando.backend.restaurantmanagement.dataaccess.repo.api.DishRepository;
import de.pikerando.backend.restaurantmanagement.dataaccess.repo.api.RestaurantRepository;
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
  private RestaurantRepository restaurantRepo;

  @Inject
  private DishMapper dishMapper;

  @Override
  public DishTo findDishByDishId(Long dishId) {

    return this.dishMapper.toTO(this.dishRepo.findById(dishId));
  }

  @Override
  public void creatDish(Long restaurantId, DishTo dishTo) {

    Restaurant restaurant = this.restaurantRepo.findById(restaurantId);
    this.dishRepo.persist(this.dishMapper.toEntity(dishTo, restaurant));

  }

  @Override
  public void deleteDish(Long dishId) {

    this.dishRepo.delete("id", dishId);

  }

  @Override
  public DishTo updateDish(Long dishId, DishTo dishTo) {

    Dish dish = this.dishRepo.findById(dishId);

    dish.setName(dishTo.getName());
    dish.setPrice(dishTo.getPrice());

    this.dishRepo.persist(dish);
    return this.dishMapper.toTO(dish);
  }

}
