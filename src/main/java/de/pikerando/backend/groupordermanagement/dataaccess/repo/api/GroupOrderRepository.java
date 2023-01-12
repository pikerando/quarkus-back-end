package de.pikerando.backend.groupordermanagement.dataaccess.repo.api;

import javax.enterprise.context.ApplicationScoped;

import de.pikerando.backend.groupordermanagement.dataaccess.entity.GroupOrder;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

/**
 *
 *
 */
@ApplicationScoped
public interface GroupOrderRepository extends PanacheRepository<GroupOrder> {

}
