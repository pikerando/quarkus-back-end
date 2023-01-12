package de.pikerando.backend.general.dataaccess;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * TODO ykharita This type ...
 *
 */
@MappedSuperclass
public abstract class ApplicationPersistenceEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  /**
   * @return id
   */
  public Long getId() {

    return this.id;
  }

}
