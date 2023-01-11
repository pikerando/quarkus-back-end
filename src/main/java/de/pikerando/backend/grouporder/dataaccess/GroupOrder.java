package de.pikerando.backend.grouporder.dataaccess;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import de.pikerando.backend.general.dataaccess.ApplicationPersistenceEntity;

@Entity
public class GroupOrder extends ApplicationPersistenceEntity {

  @GeneratedValue
  @Column(unique = true)
  private Long groupOrderId;

  private String name;

  private String creator;

  private Status status;

  private Float totalPrice;

  /**
   * @return totalPrice
   */
  public Float getTotalPrice() {

    return this.totalPrice;
  }

  /**
   * @param totalPrice new value of {@link #gettotalPrice}.
   */
  public void setTotalPrice(Float totalPrice) {

    this.totalPrice = totalPrice;
  }

  /**
   * @return creator
   */
  public String getCreator() {

    return this.creator;
  }

  /**
   * @param creator new value of {@link #getcreator}.
   */
  public void setCreator(String creator) {

    this.creator = creator;
  }

  /**
   * @return status
   */
  public Status getStatus() {

    return this.status;
  }

  /**
   * @param status new value of {@link #getstatus}.
   */
  public void setStatus(Status status) {

    this.status = status;
  }

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

  public String getName() {

    return this.name;
  }

  public void setName(String name) {

    this.name = name;
  }
}