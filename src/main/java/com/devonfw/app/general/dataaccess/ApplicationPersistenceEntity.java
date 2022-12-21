package com.devonfw.app.general.dataaccess;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * TODO ykharita This type ...
 *
 */
@MappedSuperclass
public abstract class ApplicationPersistenceEntity {
  @Id
  @GeneratedValue()
  private Long id;

  /**
   * @return id
   */
  public Long getId() {

    return this.id;
  }
}
