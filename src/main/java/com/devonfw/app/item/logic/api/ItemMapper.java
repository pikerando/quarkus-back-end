package com.devonfw.app.item.logic.api;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.devonfw.app.grouporder.common.model.ItemTo;
import com.devonfw.app.item.dataaccess.Item;

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
  Item toEntity(ItemTo itemto, String groupOrderId);

  List<ItemTo> toToList(List<Item> list);

}
