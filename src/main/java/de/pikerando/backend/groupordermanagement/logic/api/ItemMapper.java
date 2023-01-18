package de.pikerando.backend.groupordermanagement.logic.api;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import de.pikerando.backend.general.sevice.model.ItemTo;
import de.pikerando.backend.groupordermanagement.dataaccess.entity.GroupOrder;
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
  @Mapping(target = "creator", source = "creator")
  @Mapping(target = "groupOrderId", source = "groupOrder.id")
  ItemTo toTO(Item item);

  @Mapping(target = "id", ignore = true)
  @Mapping(target = "dishName", source = "itemTo.dishName")
  @Mapping(target = "extras", source = "itemTo.extras")
  @Mapping(target = "price", source = "itemTo.price")
  @Mapping(target = "groupOrder", source = "groupOrder")
  @Mapping(target = "creator", source = "itemTo.creator")
  Item toEntity(ItemTo itemTo, GroupOrder groupOrder);

  List<ItemTo> toToList(List<Item> list);

}
