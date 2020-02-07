package com.foodie.homeslice.service;

import com.foodie.homeslice.dto.PreferenceRequestDto;
import com.foodie.homeslice.dto.ResponseDto;

public interface PreferenceService {

	ResponseDto addPreference(Long customerId, PreferenceRequestDto preferenceRequestDto);

}
