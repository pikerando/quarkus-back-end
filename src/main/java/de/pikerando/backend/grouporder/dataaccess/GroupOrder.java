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