package de.pikerando.backend.restaurantmanagement.dataaccess.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import de.pikerando.backend.general.dataaccess.ApplicationPersistenceEntity;

@Entity
public class Restaurant extends ApplicationPersistenceEntity {

  private String name;

  @OneToMany(mappedBy = "restaurant", fetch = FetchType.LAZY)
  private List<Dish> menu;

  /**
   * @return groupOrderId
   */

  public String getName() {

    return this.name;
  }

  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return menu
   */
  public List<Dish> getMenu() {

    return this.menu;
  }
}