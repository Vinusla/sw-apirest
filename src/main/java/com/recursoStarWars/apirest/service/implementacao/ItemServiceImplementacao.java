package com.recursoStarWars.apirest.service.implementacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recursoStarWars.apirest.model.Item;
import com.recursoStarWars.apirest.repository.ItemRepository;
import com.recursoStarWars.apirest.service.ItemService;

@Service
public class ItemServiceImplementacao implements ItemService {

	@Autowired
	ItemRepository itemRepository;
	
	@Override
	public List<Item> listaItens() {
		
		return this.itemRepository.findAll();
	}

	@Override
	public void novoItem(Item item) {
		this.itemRepository.save(item);
		
	}

	@Override
	public Item getItem(long id) {
		
		return this.itemRepository.findByid(id);
	}



}
