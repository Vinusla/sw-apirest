package com.recursoStarWars.apirest.service;

import java.util.List;

import com.recursoStarWars.apirest.model.Localizacao;

public interface LocalizacaoService {

	public List<Localizacao> listaLocalizacao();
	public Localizacao novaLocalizacao(Localizacao localizacao);
	public Localizacao getLocalizacao(long id);
	public void updateLocalizacao(Localizacao localizacao);
	
	
}
