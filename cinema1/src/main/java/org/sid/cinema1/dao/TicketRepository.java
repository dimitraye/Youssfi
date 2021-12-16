package org.sid.cinema1.dao;

import org.sid.cinema1.entities.TicketPlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TicketRepository extends JpaRepository<TicketPlace, Long>{

}
