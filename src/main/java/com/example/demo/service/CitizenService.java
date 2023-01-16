package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Citizen;
import com.example.demo.repo.CitizenRepo;
@Service
public class CitizenService implements ICitizenService {

		@Autowired
		CitizenRepo citizenRepo;


		@Override
		public List<Citizen> getallCitizen(int id) {
			List<Citizen> listofCitizen = citizenRepo.findAllByVaccinationCenter(id);
			return listofCitizen;
		}

		@Override
		public Citizen add(Citizen citizen) {
			citizenRepo.save(citizen);
			return citizen;
		}
}
