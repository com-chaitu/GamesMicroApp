package com.chaitu.games.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chaitu.games.aggregator.RegistrationAggregator;
import com.chaitu.games.dao.CustomerDao;
import com.chaitu.games.model.RegistrationModel;

@RestController
public class RegistrationController {

	@Autowired
	RegistrationAggregator regAggregator;

	@PostMapping(value = "/registerUser")
	public ResponseEntity<?> registerUser(@RequestBody RegistrationModel regInputData) {
		try {
			CustomerDao savedCustDao = regAggregator.registerUser(regInputData);
			return new ResponseEntity<Object>(savedCustDao, HttpStatus.OK);
		} catch (ParseException e) {
			e.printStackTrace();
			return new ResponseEntity<Object>(HttpStatus.CONFLICT);
		}
	}
	
	@PostMapping(value = "/setupPwd")
	public ResponseEntity<?> setupPwd(@RequestBody RegistrationModel regInputData) {
		if (regAggregator.savePassword(regInputData)) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
	}

}
