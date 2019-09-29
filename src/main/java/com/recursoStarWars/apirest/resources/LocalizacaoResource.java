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
import com.recursoStarWars.apirest.service.LocalizacaoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("Api Rest SW")
@RestController
@RequestMapping("/api")
public class LocalizacaoResource {
	
	
	@Autowired
	LocalizacaoService localizacaoService;
	
	@ApiOperation("retorna a lista de localizações")
	@GetMapping("/localizacoes")
	public List<Localizacao> listaLocalizacoes(){
		return localizacaoService.listaLocalizacao();
	}
	
	@ApiOperation("Retorna um Localização")
	@GetMapping("/localizacao/{id}")
	public Localizacao getLocalizacao(@PathVariable long id) {
		return this.localizacaoService.getLocalizacao(id);
	}
	
	@ApiOperation("Cria uma nova Localização")
	@PostMapping("/localizacao/nova")
	public void novaLocalizacao(@RequestBody Localizacao localizacao) {
		this.localizacaoService.novaLocalizacao(localizacao);
	}
	
	@ApiOperation("Alterar uma localizacao")
	@PutMapping("/localizacao/{id}")
	public void updateLocalizacao(@RequestBody Localizacao localizacao, @PathVariable long id) {
		Localizacao loca = this.localizacaoService.getLocalizacao(id);
		this.localizacaoService.updateLocalizacao(localizacao);
	}
	
		
//	@ApiOperation("Mudar de localização")
//	@PutMapping("/Rebelde/{idRebelde}")
////	@PutMapping("/Rebelde/{idRebelde}/{longet}/{lat}/{nome}")
//	public void novaLocalizacao(@RequestBody Localizacao localizacao,
//			@PathVariable long idRebelde) {
//		Rebelde rebelde = this.rebeldeService.getRebelde(idRebelde);
//		localizacao = this.localizacaoService.getLocalizacao(rebelde.getLocalizaocao().getId());
//		System.out.println(localizacao.getId() + " - " 
//		+ localizacao.getLatitude() + " - " + localizacao.getLongitude());
//		localizacaoService.updateLocalizacao(localizacao);
//	}

}
