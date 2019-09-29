package com.recursoStarWars.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recursoStarWars.apirest.model.Inventario;
import com.recursoStarWars.apirest.service.InventarioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("Api Rest SW")
@RestController
@RequestMapping("/api")
public class InventarioResource {
	
	@Autowired
	InventarioService inventarioService;
	
	
	@ApiOperation("retorna a lista Inventários")
	@GetMapping("/inventarios")
	public List<Inventario> listaInventario(){
		return this.inventarioService.listaInventario();
	}
	
	@ApiOperation("Adicionar um Inventario")
	@PostMapping("/Inventario/novo")
	public void inserirInventario(@RequestBody Inventario inventario){
			
		this.inventarioService.novoInventario(inventario);
	}
	
	@ApiOperation("Retorna um Inventário")
	@GetMapping("/Inventario/{id}")
	public Inventario getInventario(@PathVariable long id) {
		return this.inventarioService.getInventario(id);
	}

}
