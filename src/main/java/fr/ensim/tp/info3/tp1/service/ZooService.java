package fr.ensim.tp.info3.tp1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.ensim.tp.info3.tp1.model.Secteur;
import fr.ensim.tp.info3.tp1.model.Zoo;

@Service
public class ZooService {

	Zoo zoo = new Zoo();
	
	
	public List<Secteur> getSecteursAnimaux() {
		return zoo.getSecteursAnimaux();
	}
}
