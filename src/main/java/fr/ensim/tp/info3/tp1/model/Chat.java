package fr.ensim.tp.info3.tp1.model;

import fr.ensim.tp.info3.tp1.enums.TypeAnimal;

public class Chat extends Animal {

	public Chat(String nomAnimal) {
		super(nomAnimal, TypeAnimal.CHAT);
	}
	
	@Override
	public String getNomAnimal() {
		return "Le nom du chat est :" + super.getNomAnimal();
	}
	
}
