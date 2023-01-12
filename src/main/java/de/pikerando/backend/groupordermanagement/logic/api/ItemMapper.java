package de.pikerando.backend.groupordermanagement.logic.api;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import de.pikerando.backend.general.sevice.model.ItemTo;
import de.pikerando.backend.groupordermanagement.dataaccess.entity.Item;

/**
 * TODO ykharita This type ...
 *
 */
@Mapper(componentModel = "cdi")
public interface ItemMapper {
  @Mapping(target = "id", source = "id")
  @Mapping(target = "extras", source = "extras")
  @Mapping(target = "price", source = "price")
  @Mapping(target = "dishName", source = "dishName")
  @Mapping(target = "groupOrderId", source = "groupOrderId")
  ItemTo toTO(Item item);

  @Mapping(target = "dishName", source = "itemTo.dishName")
  @Mapping(target = "groupOrderId", source = "itemTo.groupOrderId")
  @Mapping(target = "extras", source = "extras")
  @Mapping(target = "price", source = "price")
  @Mapping(target = "id", ignore = true)
  Item toEntity(ItemTo itemTo);

  List<ItemTo> toToList(List<Item> list);

}
