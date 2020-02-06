package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Item;
import com.example.demo.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {
	private ItemRepository itemRepository;

	 @Autowired
	public ItemServiceImpl(ItemRepository itemRepository) {
		super();
		itemRepository = this.itemRepository;
	}

	@Override
	@Transactional
	public List<Item> getAllItem() {
		// TODO Auto-generated method stub
		return itemRepository.findAll();
	}

	@Override
	@Transactional
	public Item createItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepository.insert(item);
	}

	@Override
	public void deleteItemById(Integer ItemId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Item> findByitemName(String Name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> findByitemPrice(String Price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> findByAuthorAndBookName(String Name, String Price) {
		// TODO Auto-generated method stub
		return null;
	}
}
