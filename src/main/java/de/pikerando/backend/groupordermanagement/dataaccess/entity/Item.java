package de.pikerando.backend.groupordermanagement.dataaccess.entity;

import javax.persistence.Entity;

import de.pikerando.backend.general.dataaccess.ApplicationPersistenceEntity;

/**
 * TODO ykharita This type ...
 *
 */

@Entity
public class Item extends ApplicationPersistenceEntity {

  private Long groupOrderId;

  private String dishName;

  private Float price;

  private String extras;

  /**
   * @return groupOrderId
   */
  public Long getGroupOrderId() {

    return this.groupOrderId;
  }

  /**
   * @param groupOrderId new value of {@link #getgroupOrderId}.
   */
  public void setGroupOrderId(Long groupOrderId) {

    this.groupOrderId = groupOrderId;
  }

  /**
   * @return dishName
   */
  public String getDishName() {

    return this.dishName;
  }

  /**
   * @param dishName new value of {@link #getdishName}.
   */
  public void setDishName(String dishName) {

    this.dishName = dishName;
  }

  /**
   * @return price
   */
  public Float getPrice() {

    return this.price;
  }

  /**
   * @param price new value of {@link #getprice}.
   */
  public void setPrice(Float price) {

    this.price = price;
  }

  /**
   * @return extras
   */
  public String getExtras() {

    return this.extras;
  }

  /**
   * @param extras new value of {@link #getextras}.
   */
  public void setExtras(String extras) {

    this.extras = extras;
  }

}
