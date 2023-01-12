package de.pikerando.backend.restaurantmanagement.logic.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import de.pikerando.backend.general.sevice.model.RestaurantTo;
import de.pikerando.backend.restaurantmanagement.dataaccess.repo.api.RestaurantRepository;
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

  @Override
  public List<RestaurantTo> listRestaurants(Integer limit) {

    // TODO implement the limitaion
    return this.restaurantMapper.toTolist(this.restaurantRepo.findAll().list());
  }

  @Override
  public RestaurantTo getRestaurantById(Long restaurantId) {

    // TODO Auto-generated method stub
    return this.restaurantMapper.toTO(this.restaurantRepo.findById(restaurantId));
  }

}
