package com.devonfw.app.grouporder.dataaccess;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import com.devonfw.app.general.dataaccess.ApplicationPersistenceEntity;

@Entity
public class GroupOrder extends ApplicationPersistenceEntity {

  @GeneratedValue
  private Long groupOrderId;

  private String name;

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