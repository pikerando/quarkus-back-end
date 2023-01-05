package de.pikerando.backend.restaurant.dataaccess;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import de.pikerando.backend.general.dataaccess.ApplicationPersistenceEntity;

@Entity
public class Restaurant extends ApplicationPersistenceEntity {

  @GeneratedValue
  @Column(unique = true)
  private Long restaurantId;

  private String name;

  /**
   * @return groupOrderId
   */

  public String getName() {

    return this.name;
  }

  /**
   * @return restaurantId
   */
  public Long getRestaurantId() {

    return this.restaurantId;
  }

  /**
   * @param restaurantId new value of {@link #getrestaurantId}.
   */
  public void setRestaurantId(Long restaurantId) {

    this.restaurantId = restaurantId;
  }

  public void setName(String name) {

    this.name = name;
  }
}