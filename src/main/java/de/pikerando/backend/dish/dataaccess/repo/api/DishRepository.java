package de.pikerando.backend.dish.dataaccess.repo.api;

import java.util.List;

import de.pikerando.backend.dish.dataaccess.Dish;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

/**
 * TODO ykharita This type ...
 *
 */
public interface DishRepository extends PanacheRepository<Dish> {

  List<Dish> findAllByRestaurnatId(Long restaurantId);
}
