package de.pikerando.backend.restaurantmanagement.dataaccess.repo.impl;

import javax.enterprise.context.ApplicationScoped;

import de.pikerando.backend.restaurantmanagement.dataaccess.entity.Restaurant;
import de.pikerando.backend.restaurantmanagement.dataaccess.repo.api.RestaurantRepository;

/***TODO ykharita This type...**/

@ApplicationScoped
public class RestaurantRepositoryImpl implements RestaurantRepository {

  @Override
  public Restaurant findByRestaurantId(Long restaurantId) {

    return find("restaurantId", restaurantId).firstResult();

  }

}
