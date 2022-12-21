package com.devonfw.app.item.dataaccess;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import com.devonfw.app.general.dataaccess.ApplicationPersistenceEntity;

/**
 * TODO ykharita This type ...
 *
 */

@Entity
public class Item extends ApplicationPersistenceEntity {

  /**
   * @return itemId
   */
  public Long getItemId() {

    return this.itemId;
  }

  /**
   * @param itemId new value of {@link #getitemId}.
   */
  public void setItemId(Long itemId) {

    this.itemId = itemId;
  }

  private Long GroupOrderId;

  @GeneratedValue
  private Long itemId;

  private String name;

  /**
   * @return groupOrderId
   */
  public Long getGroupOrderId() {

    return this.GroupOrderId;
  }

  public void setGroupOrderId(Long groupOrderId) {

    this.GroupOrderId = groupOrderId;
  }

  public String getName() {

    return this.name;
  }

  public void setName(String name) {

    this.name = name;
  }
}
