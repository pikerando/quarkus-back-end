package de.pikerando.backend.item.dataaccess.repo.imp;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import de.pikerando.backend.item.dataaccess.Item;
import de.pikerando.backend.item.dataaccess.repo.api.ItemRepository;

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
