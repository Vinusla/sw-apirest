package com.recursoStarWars.apirest.service;

import java.util.List;

import com.recursoStarWars.apirest.model.Inventario;

public interface InventarioService {


	public List<Inventario> listaInventario();
	public void novoInventario(Inventario inventario);
	public Inventario getInventario(long id);
	//update inventario para quando houve a troca de itens
	
}
