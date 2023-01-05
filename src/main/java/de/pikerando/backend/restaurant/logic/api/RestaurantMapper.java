package de.pikerando.backend.restaurant.logic.api;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import de.pikerando.backend.general.sevice.model.RestaurantTo;
import de.pikerando.backend.restaurant.dataaccess.Restaurant;

/**
 * TODO ykharita This type ...
 *
 */
@Mapper(componentModel = "cdi")
public interface RestaurantMapper {

  @Mapping(target = "id", source = "restaurantId")
  @Mapping(target = "name", source = "name")
  RestaurantTo toTO(Restaurant restaurant);

  @Mapping(target = "restaurantId", source = "restaurantTo.id")
  @Mapping(target = "name", source = "restaurantTo.name")
  Restaurant toEntity(RestaurantTo restaurantTo);

  List<RestaurantTo> toTolist(List<Restaurant> list);
}
