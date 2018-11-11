package com.chaitu.games.controller;

import java.text.ParseException;
import java.util.Optional;

import org.json.JSONObject;
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
			if (savedCustDao != null) {
				return new ResponseEntity<Object>(savedCustDao, HttpStatus.OK);
			} else {
				return new ResponseEntity<Object>(savedCustDao, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		} catch (ParseException e) {
			e.printStackTrace();
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping(value = "/isUserEnrolled")
	public ResponseEntity<?> isUserEnrolled(@RequestBody RegistrationModel regInputData) {
		try {
			Optional<CustomerDao> isUserEnrolled = regAggregator.isUserEnrolled(regInputData);
			JSONObject json = new JSONObject();
			if (!isUserEnrolled.isPresent()) {
				json.put("userRegistered", false);
			} else {
				json.put("userRegistered", true);
			}
			return new ResponseEntity<JSONObject>(json, HttpStatus.OK);
		} catch (Exception exception) {
			exception.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
