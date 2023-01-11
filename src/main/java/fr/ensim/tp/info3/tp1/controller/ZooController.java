package fr.ensim.tp.info3.tp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ensim.tp.info3.tp1.model.Secteur;
import fr.ensim.tp.info3.tp1.service.ZooService;

@RestController
public class ZooController {

	@Autowired
	ZooService zooService;

	@GetMapping(path = "/secteurs", produces = "application/json")
	public List<Secteur> getSecteursAnimaux() {
		return zooService.getSecteursAnimaux();
	}

}
