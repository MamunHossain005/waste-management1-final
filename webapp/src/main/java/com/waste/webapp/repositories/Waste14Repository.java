package com.waste.webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waste.webapp.models.Waste14;


public interface Waste14Repository extends JpaRepository<Waste14, Integer>{
	public Waste14 findByArea(String area);
}
