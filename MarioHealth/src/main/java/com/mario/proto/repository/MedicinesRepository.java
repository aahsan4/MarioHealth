package com.mario.proto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mario.proto.data.Medicines;

/**
 * Repository for Medicines
 */

@Repository
public interface MedicinesRepository extends JpaRepository<Medicines, Long> {

	Medicines findByName(String name);

	List<Medicines> findByManufacturer(String manufacturer);

	List<Medicines> findByType(String type);

}
