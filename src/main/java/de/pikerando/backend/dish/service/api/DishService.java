package de.pikerando.backend.dish.service.api;

import java.util.List;

import de.pikerando.backend.general.sevice.model.DishTo;

public interface DishService {

  List<DishTo> listDishesForRestaurant(Long RestaurantId);
}
