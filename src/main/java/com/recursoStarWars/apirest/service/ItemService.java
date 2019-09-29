package com.recursoStarWars.apirest.service;

import java.util.List;

import com.recursoStarWars.apirest.model.Item;

public interface ItemService {


	public List<Item> listaItens();
	public void novoItem(Item item);
	public Item getItem(long id);
	//update item para quando houve a troca de itens
	
}
