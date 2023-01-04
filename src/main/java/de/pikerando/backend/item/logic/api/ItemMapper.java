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

  @Mapping(target = "itemId", source = "itemto.id")
  @Mapping(target = "name", source = "itemto.name")
  @Mapping(target = "groupOrderId", source = "groupOrderId")
  Item toEntity(Long groupOrderId, ItemTo itemto);

  List<ItemTo> toToList(List<Item> list);

}
