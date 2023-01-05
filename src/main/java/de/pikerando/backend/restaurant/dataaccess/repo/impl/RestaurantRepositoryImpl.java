package de.pikerando.backend.restaurant.dataaccess.repo.impl;

import javax.enterprise.context.ApplicationScoped;

import de.pikerando.backend.restaurant.dataaccess.Restaurant;
import de.pikerando.backend.restaurant.dataaccess.repo.api.RestaurantRepository;

/***TODO ykharita This type...**/

@ApplicationScoped
public class RestaurantRepositoryImpl implements RestaurantRepository {

  @Override
  public Restaurant findByRestaurantId(Long restaurantId) {

    return find("restaurantId", restaurantId).firstResult();

  }

}
