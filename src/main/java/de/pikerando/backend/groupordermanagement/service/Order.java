package de.pikerando.backend.groupordermanagement.service;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO ykharita This type ...
 *
 */
public class Order {
  private String restaurantName;

  private Long amount;

  private String orderer;

  private Float totalPrice;

  private List<String> order = new ArrayList<>();

  /**
   * @return restaurantName
   */
  public String getRestaurantName() {

    return this.restaurantName;
  }

  /**
   * @param restaurantName new value of {@link #getrestaurantName}.
   */
  public void setRestaurantName(String restaurantName) {

    this.restaurantName = restaurantName;
  }

  /**
   * @return amount
   */
  public Long getAmount() {

    return this.amount;
  }

  /**
   * @param amount new value of {@link #getamount}.
   */
  public void setAmount(Long amount) {

    this.amount = amount;
  }

  /**
   * @return orderer
   */
  public String getOrderer() {

    return this.orderer;
  }

  /**
   * @param orderer new value of {@link #getorderer}.
   */
  public void setOrderer(String orderer) {

    this.orderer = orderer;
  }

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
   * @return order
   */
  public List<String> getOrder() {

    return this.order;
  }

  /**
   * @param order new value of {@link #getorder}.
   */
  public void setOrder(List<String> order) {

    this.order = order;
  }

}
