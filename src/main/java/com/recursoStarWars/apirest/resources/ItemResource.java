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
import com.recursoStarWars.apirest.model.Item;
import com.recursoStarWars.apirest.service.InventarioService;
import com.recursoStarWars.apirest.service.ItemService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("Api Rest SW")
@RestController
@RequestMapping("/api")
public class ItemResource {

	@Autowired
	ItemService itemService;
	@Autowired
	InventarioService inventarioService;

	@ApiOperation("retorna a lista Itens")
	@GetMapping("/itens")
	public List<Item> listaItens() {
		return this.itemService.listaItens();
	}

	@ApiOperation("Adicionar um item e associar um inventário já existente no banco")
	@PostMapping("/Item/novo/inventario/{inventario_id}")
	public void inserirRebelde(@RequestBody Item item, @PathVariable Long inventario_id) {
		Inventario inventario = this.inventarioService.getInventario(inventario_id);
		inventario.adicionaItem(item);
		item.setInventario(inventario);
		
		this.itemService.novoItem(item);
	}

	@ApiOperation("Retorna um Item")
	@GetMapping("/Item/{id}")
	public Item getItem(@PathVariable long id) {
		return this.itemService.getItem(id);
	}

}
