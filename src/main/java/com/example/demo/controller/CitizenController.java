package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Citizen;
import com.example.demo.service.ICitizenService;

@RestController
@RequestMapping("/citizen")
public class CitizenController {



		@Autowired
		ICitizenService icitizenService;

		@RequestMapping("/test")
		public ResponseEntity<String> test() {
			return new ResponseEntity<>("hello", HttpStatus.OK);
		}

		@PostMapping("/add")
		public ResponseEntity<Citizen> add(@RequestBody Citizen citizen) {
			Citizen addedCitizen = icitizenService.add(citizen);
			return new ResponseEntity<>(addedCitizen, HttpStatus.OK);

		}

		@GetMapping("/get/{id}")
		public ResponseEntity<List> getallCitizen(@PathVariable int id){
			List<Citizen> listofCitizen = icitizenService.getallCitizen(id);
			//Response response = new Response("citizens displayed",listofCitizen);
		    return new ResponseEntity<>(listofCitizen,HttpStatus.OK);	
		}
		

//		@GetMapping("/allcitizens")
//		public ResponseEntity<Citizen> allcitizens(){
//			List<Citizen> listcitizen = icitizenService.getallCitizen();
//			Response response = new Response(listcitizen,"citizens displayed");
//			return new ResponseEntity<>(response,HttpStatus.OK);
//			
//		}
	}

