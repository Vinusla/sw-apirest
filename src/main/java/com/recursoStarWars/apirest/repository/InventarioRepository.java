package com.recursoStarWars.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.recursoStarWars.apirest.model.Inventario;

//usado para realizar persistencia do banco, pois o jparepository contém os métdos de persistência
@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Long>{
	
	Inventario findByid(long id);

}
