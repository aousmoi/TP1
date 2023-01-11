package fr.ensim.tp.info3.tp1.model;

import fr.ensim.tp.info3.tp1.enums.TypeAnimal;

public class Chien extends Animal{
	
	public Chien(String nomAnimal) {
		super(nomAnimal,TypeAnimal.CHIEN);
	}
	
	@Override
	public String getNomAnimal() {
		return "Le nom du chien est :" + super.getNomAnimal();
	}
}
