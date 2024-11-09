package com.waste.webapp.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.waste.webapp.repositories.Waste14Repository;
import com.waste.webapp.repositories.WasteRepository;

@Controller
@RequestMapping("/wastes")
public class wasteController {

	@Autowired
	private WasteRepository wasteRepo;
	
	@Autowired
	private Waste14Repository waste14Repo;
	
	@GetMapping("/waste2018")
	public String getWastes(Model model) {
		var wastes = wasteRepo.findAll(Sort.by(Sort.Direction.ASC, "id"));
		model.addAttribute("wastes", wastes);

		return "wastes/waste2018";
	}
	
	@GetMapping("/waste2020")
	public String getWaste14(Model model) {
		var wastes = waste14Repo.findAll(Sort.by(Sort.Direction.ASC, "id"));
		model.addAttribute("wastes", wastes);
		
		return "wastes/waste2020";
	}
}
