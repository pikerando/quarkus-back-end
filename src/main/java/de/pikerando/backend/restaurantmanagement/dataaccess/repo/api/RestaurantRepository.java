package de.pikerando.backend.restaurantmanagement.dataaccess.repo.api;

import de.pikerando.backend.restaurantmanagement.dataaccess.entity.Restaurant;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

/**
 *
 *
 */
public interface RestaurantRepository extends PanacheRepository<Restaurant> {
  public Restaurant findByRestaurantId(Long restaurantId);
}
