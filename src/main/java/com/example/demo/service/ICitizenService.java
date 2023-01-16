package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Citizen;

public interface ICitizenService {

public Citizen add(Citizen citizen);
	
	public List<Citizen> getallCitizen(int id);
}
