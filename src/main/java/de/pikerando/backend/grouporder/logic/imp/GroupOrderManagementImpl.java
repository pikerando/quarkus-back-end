package de.pikerando.backend.grouporder.logic.imp;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import de.pikerando.backend.general.sevice.model.GroupOrderTo;
import de.pikerando.backend.grouporder.dataaccess.GroupOrder;
import de.pikerando.backend.grouporder.dataaccess.Status;
import de.pikerando.backend.grouporder.dataaccess.repo.impl.GroupOrderRepositoryImpl;
import de.pikerando.backend.grouporder.logic.api.GroupOrderManagement;
import de.pikerando.backend.grouporder.logic.api.GroupOrderMapper;

/**
 * @author ykharita this class will contain the logic for the groupordermanagement. it will convert the entity to to and
 *         otherwise
 */
@ApplicationScoped
public class GroupOrderManagementImpl implements GroupOrderManagement {
  @Inject
  GroupOrderRepositoryImpl groupOrderRepo;

  @Inject
  GroupOrderMapper groupOrderMapper;

  @Override
  public List<GroupOrderTo> listGroupOrders(Integer limit) {

    return this.groupOrderMapper.toToList(this.groupOrderRepo.findAll().list());
  }

  @Transactional
  @Override
  public void createGroupOrder(GroupOrderTo groupOrderTo) {

    this.groupOrderRepo.persist(this.groupOrderMapper.toEntity(groupOrderTo));

  }

  @Override
  public void deleteGroupOrder(Long groupOrderId) {

    this.groupOrderRepo.delete("groupOrderId", groupOrderId);

  }

  @Override
  public GroupOrderTo updateStatusOfGroupOrder(Long groupOrderId) {

    GroupOrder order = this.groupOrderRepo.find("groupOrderId", groupOrderId).firstResult();

    if (order.getStatus() == Status.CLOSED) {
      order.setStatus(Status.OPEN);
    } else {
      order.setStatus(Status.CLOSED);
    }
    this.groupOrderRepo.persist(order);
    return this.groupOrderMapper.toTO(order);
  }

  @Override
  public void updateTotalPrice(Long groupOrderId, Float price) {

    GroupOrder order = this.groupOrderRepo.find("groupOrderId", groupOrderId).firstResult();
    if (order.getTotalPrice() != null) {
      order.setTotalPrice(price + order.getTotalPrice());
    } else {
      order.setTotalPrice(price);
    }

  }

}
