package com.chaitu.games.controller;

import org.springframework.web.bind.annotation.RestController;

import com.chaitu.games.aggregator.RegistrationAggregator;
import com.chaitu.games.model.RegistrationModel;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
public class RegistrationController {
	
	@Autowired
	RegistrationAggregator regAggregator;
	
	@PostMapping
	public ResponseEntity<?> registerUser(@RequestBody RegistrationModel regInputData) {
		regAggregator.registerUser(regInputData);
		return null;
	}

}
