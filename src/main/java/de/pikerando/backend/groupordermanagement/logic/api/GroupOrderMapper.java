package de.pikerando.backend.groupordermanagement.logic.api;

import java.util.List;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import de.pikerando.backend.general.sevice.model.GroupOrderTo;
import de.pikerando.backend.groupordermanagement.dataaccess.entity.GroupOrder;
import de.pikerando.backend.groupordermanagement.dataaccess.entity.Status;

/**
 * TODO ykharita This type ...
 *
 */
@Mapper(componentModel = "cdi")
public interface GroupOrderMapper {
  /**
   * @param groupOrder
   * @return GroupOrderTo
   */
  @Mapping(target = "id", source = "id")
  @Mapping(target = "status", source = "status")
  @Mapping(target = "creator", source = "creator")
  @Mapping(target = "totalPrice", source = "totalPrice")
  @Mapping(target = "restaurantId", source = "restaurantId")
  @Mapping(target = "name", source = "name")
  GroupOrderTo toTO(GroupOrder groupOrder);

  /**
   * @param groupOrderTo
   * @return GroupOrder that compatible with the database
   */

  @Mapping(target = "status", source = "status")
  @Mapping(target = "creator", source = "creator")
  @Mapping(target = "name", source = "name")
  @Mapping(target = "totalPrice", source = "totalPrice")
  @Mapping(target = "restaurantId", source = "restaurantId")
  // @Mapping(target = "id", source = "id")
  @Mapping(target = "id", ignore = true)
  GroupOrder toEntity(GroupOrderTo groupOrderTo);

  /**
   * @param list
   * @return a list of GroupOrderTo
   */
  List<GroupOrderTo> toToList(List<GroupOrder> list);

  @AfterMapping
  default void setDefaultValues(@MappingTarget GroupOrder groupOrder) {

    if (groupOrder.getStatus() == null) {
      groupOrder.setStatus(Status.OPEN);
    }
    if (groupOrder.getTotalPrice() == null) {
      groupOrder.setTotalPrice(0.00f);
    }
  }

}
