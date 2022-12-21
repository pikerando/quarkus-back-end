package com.devonfw.app.groupordermangemnt.dataaccess.repo.api;

import javax.enterprise.context.ApplicationScoped;

import com.devonfw.app.groupordermangemnt.dataaccess.GroupOrder;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

/**
 *
 *
 */
@ApplicationScoped
public interface GroupOrderRepository extends PanacheRepository<GroupOrder> {

}
