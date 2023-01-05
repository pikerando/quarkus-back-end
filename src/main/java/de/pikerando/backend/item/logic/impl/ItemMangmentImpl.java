package de.pikerando.backend.item.logic.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import de.pikerando.backend.general.sevice.model.ItemTo;
import de.pikerando.backend.item.dataaccess.repo.api.ItemRepository;
import de.pikerando.backend.item.logic.api.ItemMangment;
import de.pikerando.backend.item.logic.api.ItemMapper;

/**
 * TODO ykharita This type ...
 *
 */
@ApplicationScoped
public class ItemMangmentImpl implements ItemMangment {

  @Inject
  private ItemRepository itemRepo;

  @Inject
  private ItemMapper itemMapper;

  @Transactional
  @Override
  public void createItem(Long groupOrderId, ItemTo itemTo) {

    this.itemRepo.persist(this.itemMapper.toEntity(groupOrderId, itemTo));

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
