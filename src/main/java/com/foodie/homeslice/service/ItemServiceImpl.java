package com.foodie.homeslice.service;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodie.homeslice.entity.Item;
import com.foodie.homeslice.exception.NoItemAvailableException;
import com.foodie.homeslice.repository.CategoryRepository;
import com.foodie.homeslice.repository.ItemRepository;
@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	ItemRepository itemRepository;

	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public List<Item> getAllItems() {
		List<Item> items = itemRepository.findAll();
		if(items.isEmpty()) {
			throw new NoItemAvailableException("");
		}
		items.forEach(item-> 
		{
		com.foodie.homeslice.entity.Category category=categoryRepository.findById(item.getCategoryId()).get();
		
		});
		return items;
	}
	
	
	

}
