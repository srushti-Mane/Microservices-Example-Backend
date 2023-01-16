package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Citizen {

	    @Id
		@GeneratedValue(strategy = 	GenerationType.AUTO)
		int Id;
		String name;
		int vaccinationCenter;

		public int getId() {
			return Id;
		}

		public void setId(int id) {
			Id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getVaccinationCenter() {
			return vaccinationCenter;
		}

		public void setVaccinationCenter(int vaccinationCenter) {
			this.vaccinationCenter = vaccinationCenter;
		}

	}

