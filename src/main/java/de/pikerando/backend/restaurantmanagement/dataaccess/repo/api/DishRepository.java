package de.pikerando.backend.restaurantmanagement.dataaccess.repo.api;

import java.util.List;

import de.pikerando.backend.restaurantmanagement.dataaccess.entity.Dish;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

/**
 * TODO ykharita This type ...
 *
 */
public interface DishRepository extends PanacheRepository<Dish> {

  List<Dish> findAllByRestaurnatId(Long restaurantId);

  Dish findByDishId(Long dishId);
}