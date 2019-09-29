package com.recursoStarWars.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recursoStarWars.apirest.model.Localizacao;
import com.recursoStarWars.apirest.model.Rebelde;
import com.recursoStarWars.apirest.service.LocalizacaoService;
import com.recursoStarWars.apirest.service.RebeldeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("Api Rest SW")
@RestController
@RequestMapping("/api")
public class RebeldeResource {

	@Autowired
	RebeldeService rebeldeService;

	@Autowired
	LocalizacaoService localizacaoService;


	@ApiOperation("Reportar rebelde traidor")
	@PostMapping("/rebelde/{id_rebelde_traidor}")
	public void setaRebeldeTraidor(@PathVariable long id_rebelde_traidor) {
		Rebelde rebelde = this.rebeldeService.getRebelde(id_rebelde_traidor);
		rebelde.setTraidor(true);
		this.rebeldeService.updateRebelde(rebelde);
	}
	
	@ApiOperation("retorna a lista de rebeldes")
	@GetMapping("/rebeldes")
	public List<Rebelde> listaRebeldes() {
		return rebeldeService.listaRebelde();
	}

	@ApiOperation("Adicionar um rebelde ")
	@PostMapping("/Rebelde/novo/")
	public void inserirRebelde(@RequestBody Rebelde rebelde) {
		this.rebeldeService.novoRebelde(rebelde);
	}

	@ApiOperation("Retorna um rebelde")
	@GetMapping("/Rebelde/{id}")
	public Rebelde getRebelde(@PathVariable long id) {
		return this.rebeldeService.getRebelde(id);
	}

	@ApiOperation("Alterar um rebelde")
	@PutMapping("/Rebelde/{id}")
	public void updateRebelde(@RequestBody Rebelde rebelde, @PathVariable long id) {
		Rebelde reb = this.rebeldeService.getRebelde(id);
		if (reb != null)
			this.rebeldeService.updateRebelde(rebelde);
	}

	@ApiOperation("Mudar de localização")
	@PutMapping("/Rebelde/{idRebelde}/localização")
	public void novaLocalizacao(@RequestBody Localizacao localizacao, @PathVariable long idRebelde) {

		Localizacao novolocal = localizacao;

		Rebelde rebelde = this.rebeldeService.getRebelde(idRebelde);
		if (localizacao.getId() == null) {
			novolocal = this.localizacaoService.getLocalizacao(rebelde.getLocalizacao().getId());
			novolocal.setLatitude(localizacao.getLatitude());
			novolocal.setLongitude(localizacao.getLongitude());
			novolocal.setNome(localizacao.getNome());
		}

		localizacaoService.updateLocalizacao(novolocal);
	}

}
