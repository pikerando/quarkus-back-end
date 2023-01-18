package de.pikerando.backend.restaurantmanagement.logic.api;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import de.pikerando.backend.general.sevice.model.DishTo;
import de.pikerando.backend.restaurantmanagement.dataaccess.entity.Dish;
import de.pikerando.backend.restaurantmanagement.dataaccess.entity.Restaurant;

/**
 * TODO ykharita This type ...
 *
 */
@Mapper(componentModel = "cdi")
public interface DishMapper {

  /**
   * @param Dish entity
   * @return DishTO
   */
  @Mapping(target = "id", source = "id")
  @Mapping(target = "name", source = "name")
  @Mapping(target = "price", source = "price")
  DishTo toTO(Dish dish);

  /**
   * @param Dishto
   * @return Dish entity
   */
  @Mapping(target = "id", ignore = true)
  @Mapping(target = "name", source = "dishTo.name")
  Dish toEntity(DishTo dishTo);

  /**
   * @param dishTo
   * @param restaurant
   * @return dish entity
   */
  @Mapping(target = "id", ignore = true)
  @Mapping(target = "name", source = "dishTo.name")
  @Mapping(target = "price", source = "dishTo.price")
  @Mapping(target = "restaurant", source = "restaurant")
  Dish toEntity(DishTo dishTo, Restaurant restaurant);

  /**
   * @param list of Dish
   * @return list of Dishto
   */
  List<DishTo> toTolist(List<Dish> list);

}
