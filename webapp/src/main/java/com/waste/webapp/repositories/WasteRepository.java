package com.waste.webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waste.webapp.models.Waste;



public interface WasteRepository extends JpaRepository<Waste, Integer>{
	public Waste findByRecyclabesCollected(String recyclabesCollected);
}
