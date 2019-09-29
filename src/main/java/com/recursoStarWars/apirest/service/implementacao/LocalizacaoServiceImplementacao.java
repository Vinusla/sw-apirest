package com.recursoStarWars.apirest.service.implementacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recursoStarWars.apirest.model.Localizacao;
import com.recursoStarWars.apirest.repository.LocalizacaoRepository;
import com.recursoStarWars.apirest.service.LocalizacaoService;

@Service
public class LocalizacaoServiceImplementacao implements LocalizacaoService {

	@Autowired
	LocalizacaoRepository localizacaoRepository;

	@Override
	public List<Localizacao> listaLocalizacao() {
		return this.localizacaoRepository.findAll();
	}

	@Override
	public Localizacao novaLocalizacao(Localizacao localizacao) {
		return this.localizacaoRepository.save(localizacao);

	}

	@Override
	public Localizacao getLocalizacao(long id) {

		return this.localizacaoRepository.findById(id);
	}

	@Override
	public void updateLocalizacao(Localizacao localizacao) {	
		this.localizacaoRepository.save(localizacao);
	}

}
