package de.pikerando.backend.dish.logic.api;

import java.util.List;

import de.pikerando.backend.general.sevice.model.DishTo;

/**
 * TODO ykharita This type ...
 *
 */
public interface DishManagement {
  /**
   * @param restaurantId
   * @return
   */
  List<DishTo> ListDishesForRestaurant(Long restaurantId);
}
