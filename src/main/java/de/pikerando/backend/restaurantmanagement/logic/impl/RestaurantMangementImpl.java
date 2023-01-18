package de.pikerando.backend.restaurantmanagement.logic.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

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

    // TODO implement the limitaion
    return this.restaurantMapper.toTolist(this.restaurantRepo.findAll().list());
  }

  @Override
  public RestaurantTo getRestaurantById(Long restaurantId) {

    // TODO Auto-generated method stub
    Restaurant restaurant = this.restaurantRepo.findById(restaurantId);
    RestaurantTo restaurantTo = this.restaurantMapper.toTO(restaurant);
    restaurantTo.setMenu(this.dishMapper.toTolist(restaurant.getMenu()));
    return restaurantTo;
  }

  @Override
  public void createRestaurant(RestaurantTo restaurantTo) {

    this.restaurantRepo.persist(this.restaurantMapper.toEntity(restaurantTo));
  }

  @Override
  public void deleteRestaurant(Long restaurantId) {

    this.restaurantRepo.delete("id", restaurantId);

  }

  @Override
  public void updateRestaurant(RestaurantTo restaurantTo) {

    Restaurant restaurant = this.restaurantRepo.findById(restaurantTo.getId());
    restaurant.setName(restaurantTo.getName());

    this.restaurantRepo.persist(restaurant);

  }

}
