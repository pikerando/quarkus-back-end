package de.pikerando.backend.restaurantmanagement.logic.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import de.pikerando.backend.general.sevice.model.RestaurantTo;
import de.pikerando.backend.restaurantmanagement.dataaccess.entity.Restaurant;
import de.pikerando.backend.restaurantmanagement.dataaccess.repo.api.RestaurantRepository;
import de.pikerando.backend.restaurantmanagement.logic.api.DishMapper;
import de.pikerando.backend.restaurantmanagement.logic.api.RestaurantManagement;
import de.pikerando.backend.restaurantmanagement.logic.api.RestaurantMapper;

/**
 * TODO ykharita This type ...
 *
 */
@ApplicationScoped
public class RestaurantMangementImpl implements RestaurantManagement {

  @Inject
  private RestaurantRepository restaurantRepo;

  @Inject
  private RestaurantMapper restaurantMapper;

  @Inject
  private DishMapper dishMapper;

  @Override
  public List<RestaurantTo> listRestaurants(Integer limit) {

    return this.restaurantMapper.toTolist(this.restaurantRepo.findAll().list());
  }

  @Override
  public RestaurantTo getRestaurantById(Long restaurantId) {

    Restaurant restaurant = this.restaurantRepo.findById(restaurantId);
    RestaurantTo restaurantTo = this.restaurantMapper.toTO(restaurant);
    restaurantTo.setMenu(this.dishMapper.toTolist(restaurant.getMenu()));
    return restaurantTo;
  }

  @Override
  @Transactional
  public RestaurantTo createRestaurant(RestaurantTo restaurantTo) {

    Restaurant r = this.restaurantMapper.toEntity(restaurantTo);

    this.restaurantRepo.persist(r);
    return this.restaurantMapper.toTO(r);
  }

  @Override
  public void deleteRestaurant(Long restaurantId) {

    this.restaurantRepo.delete("id", restaurantId);

  }

  @Override
  public RestaurantTo updateRestaurant(Long restaurantId, RestaurantTo restaurantTo) {

    Restaurant restaurant = this.restaurantRepo.findById(restaurantId);
    restaurant.setName(restaurantTo.getName());

    this.restaurantRepo.persist(restaurant);
    return this.restaurantMapper.toTO(restaurant);
  }

}
