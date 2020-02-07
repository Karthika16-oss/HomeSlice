package com.foodie.homeslice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodie.homeslice.dto.PreferenceRequestDto;
import com.foodie.homeslice.dto.ResponseDto;
import com.foodie.homeslice.service.PreferenceService;

@RestController
@RequestMapping("/customers")
public class PreferenceController {
	
	@Autowired
	private PreferenceService preferenceService;
	
	ResponseDto responseDto =null;
	
	@PostMapping("/{customerId}/preferences")
	public ResponseEntity<ResponseDto> addPreference(@PathVariable Long customerId,@RequestBody PreferenceRequestDto preferenceRequestDto) {
		responseDto=preferenceService.addPreference(customerId,preferenceRequestDto);
		return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
	}
	
	

}
