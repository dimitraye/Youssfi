package org.sid.cinema1.dao;

import org.sid.cinema1.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource 
public interface CategoryRepository extends JpaRepository<Categorie, Long>{

}
