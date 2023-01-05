package de.pikerando.backend.restaurant.dataaccess.repo.api;

import de.pikerando.backend.restaurant.dataaccess.Restaurant;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

/**
 *
 *
 */
public interface RestaurantRepository extends PanacheRepository<Restaurant> {
  public Restaurant findByRestaurantId(Long restaurantId);
}
