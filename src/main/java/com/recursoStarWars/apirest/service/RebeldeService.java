package com.recursoStarWars.apirest.service;

import java.util.List;

import com.recursoStarWars.apirest.model.Inventario;
import com.recursoStarWars.apirest.model.Item;
import com.recursoStarWars.apirest.model.Localizacao;
import com.recursoStarWars.apirest.model.Rebelde;

public interface RebeldeService {

	public List<Rebelde> listaRebelde();
	public void novoRebelde(Rebelde rebelde);
	public Rebelde getRebelde(long id);
	public void novaLocalizacao(long idRebelde, String novaLatitude, String novaLogitude, String novoNome);
	public void updateRebelde(Rebelde rebelde);
	
}
