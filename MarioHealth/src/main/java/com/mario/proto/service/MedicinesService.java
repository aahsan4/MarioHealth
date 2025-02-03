package com.mario.proto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mario.proto.data.Medicines;
import com.mario.proto.repository.MedicinesRepository;

/**
 * Service For Medicines
 */

@Service
public class MedicinesService {

	@Autowired
	private final MedicinesRepository medicinesRepository;

	public MedicinesService(MedicinesRepository medicinesRepository) {
		super();
		this.medicinesRepository = medicinesRepository;
	}

	public Medicines getMedicineByName(String name) {
		return medicinesRepository.findByName(name);
	}

	public List<Medicines> getMedicinesByManufacturer(String manufacturer) {
		return medicinesRepository.findByManufacturer(manufacturer);
	}

	public List<Medicines> getAllMedicines() {
		return medicinesRepository.findAll();
	}

	public List<Medicines> getMedicinesByType(String type) {
		return medicinesRepository.findByType(type);	
	}

}
