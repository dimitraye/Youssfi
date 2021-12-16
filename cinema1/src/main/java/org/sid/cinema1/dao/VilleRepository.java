package org.sid.cinema1.dao;

import org.sid.cinema1.entities.Categorie;
import org.sid.cinema1.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VilleRepository extends JpaRepository<Ville, Long>{
	

}
