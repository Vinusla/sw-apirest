package com.recursoStarWars.apirest.service.implementacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recursoStarWars.apirest.model.Inventario;
import com.recursoStarWars.apirest.model.Item;
import com.recursoStarWars.apirest.model.Localizacao;
import com.recursoStarWars.apirest.model.Rebelde;
import com.recursoStarWars.apirest.repository.InventarioRepository;
import com.recursoStarWars.apirest.repository.ItemRepository;
import com.recursoStarWars.apirest.repository.LocalizacaoRepository;
import com.recursoStarWars.apirest.repository.RebeldeRepository;
import com.recursoStarWars.apirest.service.RebeldeService;

@Service
public class RebeldeServiceImplementacao implements RebeldeService {

	@Autowired
	RebeldeRepository rebeldeRepository;
	@Autowired
	LocalizacaoRepository localizacaoRepository;
	@Autowired
	InventarioRepository inventarioRepository;
	
	@Override
	public List<Rebelde> listaRebelde() {
		return this.rebeldeRepository.findAll();
	}

	@Override
	public void novoRebelde(Rebelde rebelde) {
		this.rebeldeRepository.save(rebelde);

	}

	@Override
	public Rebelde getRebelde(long id) {
		return this.rebeldeRepository.findById(id);
	}

	@Override
	public void novaLocalizacao(long idRebelde, String novaLatitude, String novaLongitude, String novoNome) {
		
		
		
	}

	@Override
	public void updateRebelde(Rebelde rebelde) {
		this.rebeldeRepository.save(rebelde);
		
	}
	
	
	

}
