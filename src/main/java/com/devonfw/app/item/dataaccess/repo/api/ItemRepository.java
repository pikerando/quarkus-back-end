package com.devonfw.app.item.dataaccess.repo.api;

import javax.enterprise.context.ApplicationScoped;

import com.devonfw.app.item.dataaccess.Item;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

/**
 * TODO ykharita This type ...
 *
 */
@ApplicationScoped
public interface ItemRepository extends PanacheRepository<Item> {

}
