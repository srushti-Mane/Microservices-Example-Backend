package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Citizen;

@Repository
public interface CitizenRepo extends JpaRepository<Citizen, Integer> {

		List<Citizen> findAllByVaccinationCenter(int id);

	
}
