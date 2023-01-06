package de.pikerando.backend.item.logic.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import de.pikerando.backend.general.sevice.model.ItemTo;
import de.pikerando.backend.item.dataaccess.repo.api.ItemRepository;
import de.pikerando.backend.item.logic.api.ItemManagement;
import de.pikerando.backend.item.logic.api.ItemMapper;

/**
 * TODO ykharita This type ...
 *
 */
@ApplicationScoped
public class ItemManagementImpl implements ItemManagement {

  @Inject
  private ItemRepository itemRepo;

  @Inject
  private ItemMapper itemMapper;

  @Transactional
  @Override
  public void createItem(ItemTo itemTo) {

    this.itemRepo.persist(this.itemMapper.toEntity(itemTo));

  }

  /**
   * TODO: implement the query for search criteria
   */
  @Override
  public List<ItemTo> listItemsOfGroupOrder(Long groupOrderId) {

    return this.itemMapper.toToList(this.itemRepo.findeByGroupOrderId(groupOrderId));
  }

  @Override
  public void deleteItem(Long itemId) {

    this.itemRepo.deleteItem(itemId);

  }

}
