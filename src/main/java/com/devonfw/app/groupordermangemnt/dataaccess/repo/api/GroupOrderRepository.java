package com.devonfw.app.groupordermangemnt.dataaccess.repo.api;

import org.springframework.data.repository.CrudRepository;

import com.devonfw.app.groupordermangemnt.dataaccess.GroupOrder;

/**
 * creat for the crud operation using spring src : https://quarkus.io/guides/spring-data-jpa
 *
 */
public interface GroupOrderRepository extends CrudRepository<GroupOrder, Long> {

}
