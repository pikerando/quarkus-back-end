package de.pikerando.backend.grouporder.logic.api;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import de.pikerando.backend.general.sevice.model.GroupOrderTo;
import de.pikerando.backend.grouporder.dataaccess.GroupOrder;

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
  @Mapping(target = "id", source = "groupOrderId")
  GroupOrderTo toTO(GroupOrder groupOrder);

  /**
   * @param groupOrderTo
   * @return GroupOrder that compatible with the database
   */
  @Mapping(target = "groupOrderId", source = "id")
  GroupOrder toEntity(GroupOrderTo groupOrderTo);

  /**
   * @param list
   * @return a list of GroupOrderTo
   */
  List<GroupOrderTo> toToList(List<GroupOrder> list);
}
