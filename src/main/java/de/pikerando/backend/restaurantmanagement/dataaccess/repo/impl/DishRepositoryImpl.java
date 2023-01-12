package de.pikerando.backend.restaurantmanagement.dataaccess.repo.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import de.pikerando.backend.restaurantmanagement.dataaccess.entity.Dish;
import de.pikerando.backend.restaurantmanagement.dataaccess.repo.api.DishRepository;

/**
 * TODO ykharita This type ...
 *
 */
@ApplicationScoped
public class DishRepositoryImpl implements DishRepository {

  @Override
  public List<Dish> findAllByRestaurnatId(Long restaurantId) {

    return find("restaurantId", restaurantId).list();
  }

  @Override
  public Dish findByDishId(Long dishId) {

    return find("dishId", dishId).firstResult();
  }

}
