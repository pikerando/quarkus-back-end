package de.pikerando.backend.groupordermanagement.dataaccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import de.pikerando.backend.general.dataaccess.ApplicationPersistenceEntity;

/**
 * TODO ykharita This type ...
 *
 */

@Entity
public class Item extends ApplicationPersistenceEntity {

  @ManyToOne
  @JoinColumn(name = "groupOrderId")
  private GroupOrder groupOrder;

  private String dishName;

  @Column(name = "price", columnDefinition = "float default 0.00", precision = 5, scale = 2)
  private Float price;

  private String extras;

  /**
   * @return groupOrder
   */
  public GroupOrder getGroupOrder() {

    return this.groupOrder;
  }

  /**
   * @param groupOrder new value of {@link #getgroupOrder}.
   */
  public void setGroupOrder(GroupOrder groupOrder) {

    this.groupOrder = groupOrder;
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
