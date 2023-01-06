package de.pikerando.backend.dish.service.api;

import de.pikerando.backend.general.sevice.model.DishTo;

/**
 * @author ykharita the Api for service the item
 *
 */
public interface DishToItemService {
  /**
   * @param dishId
   * @return
   */
  DishTo getDishByDishId(Long dishId);
}
