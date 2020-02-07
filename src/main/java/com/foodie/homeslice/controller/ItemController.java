package com.foodie.homeslice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodie.homeslice.dto.ItemsResponseDto;
import com.foodie.homeslice.service.ItemService;



@RestController
@RequestMapping("/homeslice")
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	@GetMapping("/items")
	public ItemsResponseDto getAllItems(){
		itemService.getAllItems();
		ItemsResponseDto resposne = new ItemsResponseDto();
		resposne.setStatusCode(HttpStatus.OK.value());
		resposne.setMessage("List of Items available right now");
		return resposne;
	}
	

}
