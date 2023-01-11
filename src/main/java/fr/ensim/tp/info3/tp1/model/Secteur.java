package fr.ensim.tp.info3.tp1.model;

import java.util.ArrayList;
import java.util.List;

import fr.ensim.tp.info3.tp1.enums.TypeAnimal;
import fr.ensim.tp.info3.tp1.exception.AnimalDansMauvaisSecteurException;

public class Secteur {
	
	public TypeAnimal typeAnimalDansSecteur;
	private List<Animal> animauxDansSecteur = new ArrayList<Animal>();
	
	
	public Secteur(TypeAnimal typeAnimal) {
		this.typeAnimalDansSecteur = typeAnimal;
	}

	public void ajouterAnimal(Animal animal) throws AnimalDansMauvaisSecteurException {
		if(animal.typeAnimal != typeAnimalDansSecteur) {
			throw new AnimalDansMauvaisSecteurException();
		}
		this.animauxDansSecteur.add(animal);
	}
	
	public int getNombreAnimaux() {
		return animauxDansSecteur.size();	
	}
	
	public TypeAnimal obtenirType() {
		return this.typeAnimalDansSecteur;
	}
	
	// Bonus
	public List<Animal> getAnimauxDansSecteur() {
		return this.animauxDansSecteur;
	}
}
