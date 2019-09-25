package com.minimall.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minimall.login.model.ClientsCredentials;
import com.minimall.login.repo.ClientsCredintialsRepo;

@RestController
@RequestMapping("/registration")
public class RegisterationController {

	@Autowired
	private ClientsCredintialsRepo clientsCredintialsRepo;

	@PostMapping("/create")
	public void createUser(@RequestBody ClientsCredentials clientsCredentials) {

		clientsCredintialsRepo.save(clientsCredentials);

	}
	
	@GetMapping("/get/all")
	public List<ClientsCredentials> getUsers(){
		
		return clientsCredintialsRepo.findAll();
	}
}
