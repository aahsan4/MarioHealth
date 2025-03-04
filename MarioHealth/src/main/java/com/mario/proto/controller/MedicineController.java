package com.mario.proto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mario.proto.data.Medicines;
import com.mario.proto.service.MedicinesService;

import java.util.List;

/**
 * Controller for Medicines
 */

@RestController
@RequestMapping("/medicines")
public class MedicineController {
	@Autowired
	private MedicinesService medicinesService;

	// Get All Medicines
	@GetMapping
	public List<Medicines> getAllMedicines() {
		return medicinesService.getAllMedicines();
	}

	// Get Medicines by Name
	@GetMapping("/{name}")
	public ResponseEntity<Medicines> getMedicineByName(@PathVariable String name) {
		return ResponseEntity.ok(medicinesService.getMedicineByName(name));
	}

	// Get Medicines by Manufacturer
	@GetMapping("/{manufacturer}")
	public List<Medicines> getMedicinesByManufacturer(@PathVariable String manufacturer) {
		return medicinesService.getMedicinesByManufacturer(manufacturer);
	}

	@GetMapping("/{type}")
	public List<Medicines> getMedicinesByType(@PathVariable String type) {
		return medicinesService.getMedicinesByType(type);
	}

}
