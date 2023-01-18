package de.pikerando.backend.groupordermanagement.dataaccess.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ColumnDefault;

import de.pikerando.backend.general.dataaccess.ApplicationPersistenceEntity;

@Entity
public class GroupOrder extends ApplicationPersistenceEntity {

  /**
   * @return items
   */
  public List<Item> getItems() {

    return this.items;
  }

  /**
   * @param items new value of {@link #getitems}.
   */
  public void setItems(List<Item> items) {

    this.items = items;
  }

  private String name;

  private Long RestaurantId;

  private String creator;

  @Enumerated(EnumType.ORDINAL)
  @ColumnDefault("0")
  @Column(nullable = false)
  private Status status;

  @Column(name = "totalPrice", columnDefinition = "float default 0.00", precision = 5, scale = 2)
  private Float totalPrice;

  @OneToMany(mappedBy = "groupOrder", cascade = CascadeType.ALL)
  private List<Item> items;

  /**
   * @return restaurantId
   */
  public Long getRestaurantId() {

    return this.RestaurantId;
  }

  /**
   * @param restaurantId new value of {@link #getrestaurantId}.
   */
  public void setRestaurantId(Long restaurantId) {

    this.RestaurantId = restaurantId;
  }

  // @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  // @JoinColumn(name = "groupOrderid")
  // private List<Item> items = new ArrayList<>();

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

  public String getName() {

    return this.name;
  }

  public void setName(String name) {

    this.name = name;
  }
}