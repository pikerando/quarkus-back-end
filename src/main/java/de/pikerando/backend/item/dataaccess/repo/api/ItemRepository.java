package de.pikerando.backend.item.dataaccess.repo.api;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import de.pikerando.backend.item.dataaccess.Item;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

/**
 * TODO ykharita This type ...
 *
 */
@ApplicationScoped
public interface ItemRepository extends PanacheRepository<Item> {

  List<Item> findeByGroupOrderId(Long grouporderid);

  /**
   * @param id
   * @return
   */
  Item findByItemId(Long itemId);

}
