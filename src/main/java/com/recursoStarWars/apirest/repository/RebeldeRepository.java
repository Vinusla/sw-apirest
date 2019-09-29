package com.recursoStarWars.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.recursoStarWars.apirest.model.Rebelde;

@Repository
public interface RebeldeRepository extends JpaRepository<Rebelde, Long> {
	
	Rebelde findById(long id);

}
