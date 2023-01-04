package de.pikerando.backend.grouporder.logic.imp;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import de.pikerando.backend.grouporder.dataaccess.repo.impl.GroupOrderRepositoryImpl;
import de.pikerando.backend.grouporder.logic.api.GroupOrderMangment;
import de.pikerando.backend.grouporder.logic.api.GroupOrderMapper;
import de.pikerando.backend.grouporder.sevice.model.GroupOrderTo;

/**
 * @author ykharita this class will contain the logic for the groupordermangment. it will convert the entity to to and
 *         otherwise
 */
@ApplicationScoped
public class GroupOrderMangmentImpl implements GroupOrderMangment {
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

}
