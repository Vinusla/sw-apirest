package com.recursoStarWars.apirest.service.implementacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recursoStarWars.apirest.model.Inventario;
import com.recursoStarWars.apirest.model.Localizacao;
import com.recursoStarWars.apirest.model.Rebelde;
import com.recursoStarWars.apirest.repository.InventarioRepository;
import com.recursoStarWars.apirest.repository.LocalizacaoRepository;
import com.recursoStarWars.apirest.repository.RebeldeRepository;
import com.recursoStarWars.apirest.service.InventarioService;
import com.recursoStarWars.apirest.service.RebeldeService;

@Service
public class InventarioServiceImplementacao implements InventarioService {

	@Autowired
	InventarioRepository inventarioRepository;

	@Override
	public List<Inventario> listaInventario() {

		return this.inventarioRepository.findAll();
	}

	@Override
	public void novoInventario(Inventario inventario) {
		this.inventarioRepository.save(inventario);

	}

	@Override
	public Inventario getInventario(long id) {

		return this.inventarioRepository.findByid(id);
	}

}
