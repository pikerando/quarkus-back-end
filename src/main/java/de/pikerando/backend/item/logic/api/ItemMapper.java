package de.pikerando.backend.item.logic.api;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import de.pikerando.backend.general.sevice.model.ItemTo;
import de.pikerando.backend.item.dataaccess.Item;

/**
 * TODO ykharita This type ...
 *
 */
@Mapper(componentModel = "cdi")
public interface ItemMapper {
  @Mapping(target = "id", source = "itemId")
  @Mapping(target = "name", source = "name")
  ItemTo toTO(Item item);

  @Mapping(target = "itemId", source = "itemTo.id")
  @Mapping(target = "name", source = "itemTo.name")
  @Mapping(target = "groupOrderId", source = "itemTo.groupOrderId")
  Item toEntity(ItemTo itemTo);

  List<ItemTo> toToList(List<Item> list);

}
