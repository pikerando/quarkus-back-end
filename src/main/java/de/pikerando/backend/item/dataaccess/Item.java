package de.pikerando.backend.item.dataaccess;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import de.pikerando.backend.general.dataaccess.ApplicationPersistenceEntity;

/**
 * TODO ykharita This type ...
 *
 */

@Entity
public class Item extends ApplicationPersistenceEntity {

  @GeneratedValue
  @Column(unique = true)
  private Long itemId;

  private Long groupOrderId;

  private String name;

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

  /**
   * @return groupOrderId
   */
  public Long getGroupOrderId() {

    return this.groupOrderId;
  }

  public void setGroupOrderId(Long groupOrderId) {

    this.groupOrderId = groupOrderId;
  }

  public String getName() {

    return this.name;
  }

  public void setName(String name) {

    this.name = name;
  }
}
