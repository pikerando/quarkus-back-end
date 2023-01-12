package de.pikerando.backend.groupordermanagement.dataaccess.repo.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import de.pikerando.backend.groupordermanagement.dataaccess.entity.Item;
import de.pikerando.backend.groupordermanagement.dataaccess.repo.api.ItemRepository;

/**
 *
 *
 */
@ApplicationScoped
public class ItemRepositoryImpl implements ItemRepository {

  @Override
  public List<Item> findeByGroupOrderId(Long grouporderid) {

    return list("groupOrderId", grouporderid);
  }

  @Override
  public Item findByItemId(Long itemId) {

    return find("itemId", itemId).firstResult();
  }

}
