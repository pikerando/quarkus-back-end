package de.pikerando.backend.restaurantmanagement.dataaccess.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import de.pikerando.backend.general.dataaccess.ApplicationPersistenceEntity;

/**
 * TODO ykharita This type ...
 *
 */
@Entity
public class Dish extends ApplicationPersistenceEntity {

  @ManyToOne
  @JoinColumn(name = "restaurantId")
  private Restaurant restaurant;

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
   * @return restaurant
   */
  public Restaurant getRestaurant() {

    return this.restaurant;
  }

  /**
   * @param restaurant new value of {@link #getrestaurant}.
   */
  public void setRestaurant(Restaurant restaurant) {

    this.restaurant = restaurant;
  }

  /**
   * @param price new value of {@link #getprice}.
   */
  public void setPrice(Float price) {

    this.price = price;
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
