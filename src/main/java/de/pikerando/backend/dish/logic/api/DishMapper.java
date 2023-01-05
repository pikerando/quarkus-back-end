package de.pikerando.backend.dish.logic.api;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import de.pikerando.backend.dish.dataaccess.Dish;
import de.pikerando.backend.general.sevice.model.DishTo;

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
  @Mapping(target = "id", source = "dishId")
  @Mapping(target = "name", source = "name")
  @Mapping(target = "price", source = "price")
  DishTo toTO(Dish dish);

  /**
   * @param Dishto
   * @return Dish entity
   */
  @Mapping(target = "dishId", source = "dishTo.id")
  @Mapping(target = "name", source = "dishTo.name")
  Dish toEntity(DishTo dishTo);

  /**
   * @param list of Dish
   * @return list of Dishto
   */
  List<DishTo> toTolist(List<Dish> list);

}
