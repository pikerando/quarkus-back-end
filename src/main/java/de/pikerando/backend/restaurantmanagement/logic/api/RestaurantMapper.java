package de.pikerando.backend.restaurantmanagement.logic.api;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import de.pikerando.backend.general.sevice.model.RestaurantTo;
import de.pikerando.backend.restaurantmanagement.dataaccess.entity.Restaurant;

/**
 * TODO ykharita This type ...
 *
 */
@Mapper(componentModel = "cdi")
public interface RestaurantMapper {

  @Mapping(target = "id", source = "id")
  @Mapping(target = "name", source = "name")
  RestaurantTo toTO(Restaurant restaurant);

  @Mapping(target = "id", ignore = true)
  @Mapping(target = "name", source = "name")
  Restaurant toEntity(RestaurantTo restaurantTo);

  List<RestaurantTo> toTolist(List<Restaurant> list);

  // @AfterMapping
  // default void mapMenu(Restaurant restaurant, @MappingTarget RestaurantTo restaurantTo) {
  //
  // List<Dish> dishes = restaurant.getMenu();
  // List<DishTo> dishesTo = dishes.stream().map(dishMapper::toTO).collect(Collectors.toList());
  // restaurantTo.setMenu(dishesTo);
  // }

}
