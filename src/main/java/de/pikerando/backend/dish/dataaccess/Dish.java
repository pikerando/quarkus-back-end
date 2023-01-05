package de.pikerando.backend.dish.dataaccess;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import de.pikerando.backend.general.dataaccess.ApplicationPersistenceEntity;

/**
 * TODO ykharita This type ...
 *
 */
@Entity
public class Dish extends ApplicationPersistenceEntity {

  @GeneratedValue
  @Column(unique = true)
  private Long dishId;

  private Long restaurantId;

  private String name;

  private Float price;

  /**
   * @return price
   */
  public float getPrice() {

    return this.price;
  }

  /**
   * @param price new value of {@link #getprice}.
   */
  public void setPrice(float price) {

    this.price = price;
  }

  /**
   * @return dishId
   */
  public Long getDishId() {

    return this.dishId;
  }

  /**
   * @param dishId new value of {@link #getdishId}.
   */
  public void setDishId(Long dishId) {

    this.dishId = dishId;
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

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

}
