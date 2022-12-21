package com.devonfw.app.item.logic.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.devonfw.app.grouporder.common.model.ItemTo;
import com.devonfw.app.item.dataaccess.repo.api.ItemRepository;
import com.devonfw.app.item.logic.api.ItemMangment;
import com.devonfw.app.item.logic.api.ItemMapper;

/**
 * TODO ykharita This type ...
 *
 */
public class ItemMangmentImpl implements ItemMangment {

  @Inject
  ItemRepository itemRepo;

  @Inject
  ItemMapper itemMapper;

  @Transactional
  @Override
  public void createItem(String groupOrderId, ItemTo itemTo) {

    this.itemRepo.persist(this.itemMapper.toEntity(itemTo, groupOrderId));

  }

  /**
   * TODO: implement the query for search criteria
   */
  @Override
  public List<ItemTo> showGroupOrderById(String groupOrderId) {

    return this.itemMapper.toToList(this.itemRepo.findAll().list());
  }

}
