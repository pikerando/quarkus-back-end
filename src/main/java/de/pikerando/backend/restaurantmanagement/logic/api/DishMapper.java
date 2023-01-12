package de.pikerando.backend.restaurantmanagement.logic.api;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import de.pikerando.backend.general.sevice.model.DishTo;
import de.pikerando.backend.restaurantmanagement.dataaccess.entity.Dish;

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
  @Mapping(target = "name", source = "name")
  Dish toEntity(DishTo dishTo);

  /**
   * @param list of Dish
   * @return list of Dishto
   */
  List<DishTo> toTolist(List<Dish> list);

}
