package com.devonfw.app.groupordermangemnt.logic.imp;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import com.devonfw.app.groupordermangemnt.common.model.GroupOrderTo;
import com.devonfw.app.groupordermangemnt.dataaccess.repo.impl.GroupOrderRepositoryImpl;
import com.devonfw.app.groupordermangemnt.logic.api.GroupOrderMangment;
import com.devonfw.app.groupordermangemnt.logic.api.GroupOrderMapper;

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
