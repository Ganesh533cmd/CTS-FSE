package com.example.demo;

import java.util.List;

public interface ItemService {
	public List<Item> getAllItem();
	public Item createItem(Item item);
	public void deleteItemById(Integer ItemId);
	public void deleteAll();
	public List<Item> findByitemName(String Name);
	public List<Item> findByitemPrice(String Price);
	public List<Item> findByAuthorAndBookName(String Name, String Price);

}
