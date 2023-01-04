package de.pikerando.backend.grouporder.dataaccess.repo.api;

import javax.enterprise.context.ApplicationScoped;

import de.pikerando.backend.grouporder.dataaccess.GroupOrder;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

/**
 *
 *
 */
@ApplicationScoped
public interface GroupOrderRepository extends PanacheRepository<GroupOrder> {

}
