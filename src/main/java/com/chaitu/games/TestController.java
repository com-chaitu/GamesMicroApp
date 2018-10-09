package com.chaitu.games;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.chaitu.games.*;

@RestController
public class TestController {
	
	@Autowired
	CustomerRepository custRepo;
	
	@GetMapping("/testc")
	public String testMethod(){
		return "This is chaitu's microservice";
	}
	
	@PostMapping("/testc")
	public String testPostMethod(){
		List<Customer> list = custRepo.findAll();
		
		return "This is chaitu's microservice";
		
	}

}
