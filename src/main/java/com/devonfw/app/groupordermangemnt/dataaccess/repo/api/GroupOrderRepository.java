package com.devonfw.app.groupordermangemnt.dataaccess.repo.api;

import com.devonfw.app.groupordermangemnt.dataaccess.GroupOrder;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

/**
 * creat for the crud operation using spring src : https://quarkus.io/guides/spring-data-jpa
 *
 */

public interface GroupOrderRepository extends PanacheRepository<GroupOrder> {

}
