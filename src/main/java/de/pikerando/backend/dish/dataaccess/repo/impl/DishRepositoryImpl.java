package de.pikerando.backend.dish.dataaccess.repo.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import de.pikerando.backend.dish.dataaccess.Dish;
import de.pikerando.backend.dish.dataaccess.repo.api.DishRepository;

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

}
