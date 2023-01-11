package fr.ensim.tp.info3.tp1.model;

import java.util.ArrayList;
import java.util.List;

import fr.ensim.tp.info3.tp1.enums.TypeAnimal;
import fr.ensim.tp.info3.tp1.exception.AnimalDansMauvaisSecteurException;
import fr.ensim.tp.info3.tp1.exception.LimiteVisiteurException;


public class Zoo {

	public int visiteurs;
	public List<Secteur> secteursAnimaux = new ArrayList<Secteur>(); 
	public static int NB_VISITEYR_MAX_PAR_SECTEUR = 15;
	

	public void ajouterSecteur(TypeAnimal typeAnimal) {
		Secteur secteur = new Secteur(typeAnimal);
		this.secteursAnimaux.add(secteur);
	}
	
	
	public void nouveauVisiteur() throws LimiteVisiteurException {
		if((this.visiteurs + 1) == getLimiteVisiteur()) {
			throw new LimiteVisiteurException();
		}
		this.visiteurs++;
	}
	
	public int getLimiteVisiteur() {
		return NB_VISITEYR_MAX_PAR_SECTEUR * secteursAnimaux.size() ;
	}
	

	public void nouvelAnimal(Animal animal) throws AnimalDansMauvaisSecteurException {
		for(Secteur secteur : secteursAnimaux) {
			if(secteur.typeAnimalDansSecteur.equals(animal.getTypeAnimal())) {
				secteur.ajouterAnimal(animal);
			}
		}
	}
	
	public int nombreAnimaux() {
		
		int nombreAnimaux = 0;
		for(Secteur secteur : secteursAnimaux) {
			nombreAnimaux += secteur.getNombreAnimaux();
		}
		return nombreAnimaux;
	}

	
	// Bonus
	public List<Secteur> getSecteursAnimaux() {
		return this.secteursAnimaux;
	}
	
	
	public Secteur getSecteurFromType(TypeAnimal typeAnimal) {		
		return secteursAnimaux.stream().filter(secteur -> secteur.obtenirType().equals(typeAnimal)).findFirst().orElse(null);
	}

}
