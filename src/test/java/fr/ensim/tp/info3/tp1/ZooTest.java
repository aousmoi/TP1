package fr.ensim.tp.info3.tp1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import fr.ensim.tp.info3.tp1.enums.TypeAnimal;
import fr.ensim.tp.info3.tp1.exception.AnimalDansMauvaisSecteurException;
import fr.ensim.tp.info3.tp1.exception.LimiteVisiteurException;
import fr.ensim.tp.info3.tp1.model.Chat;
import fr.ensim.tp.info3.tp1.model.Chien;
import fr.ensim.tp.info3.tp1.model.Secteur;
import fr.ensim.tp.info3.tp1.model.Zoo;

public class ZooTest {

	@Test
	public void testNombreMaximumVisiteurs() {

		try {
			Zoo zooDeLaFlech = new Zoo();
			for (int i = 0; i < 16; i++) {
				zooDeLaFlech.nouveauVisiteur();
			}
		} catch (LimiteVisiteurException e) {
			assertTrue("Le nombre maximum de visiteurs atteint".equals(e.getMessage()));
		}
	}

	@Test
	public void testAnimalDansLeBonSecteur() {
		try {

			Zoo zooDeBeauvale = new Zoo();
			zooDeBeauvale.ajouterSecteur(TypeAnimal.CHIEN);
			Chien chien = new Chien("Snoopy");
			zooDeBeauvale.nouvelAnimal(chien);
	
			Secteur secteur_chiens =  zooDeBeauvale.getSecteurFromType(TypeAnimal.CHIEN);
			assertNotNull(secteur_chiens.getAnimauxDansSecteur().stream().filter(animal -> animal.equals(chien)).findFirst().orElse(null));			

		} catch (AnimalDansMauvaisSecteurException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testAnimalDansLeMauvaisSecteur() {

		try {
			Secteur SecteurDeschiens = new Secteur(TypeAnimal.CHIEN);
			Chat chat = new Chat("mimi");

			SecteurDeschiens.ajouterAnimal(chat);
		} catch (AnimalDansMauvaisSecteurException e) {
			assertEquals(e.getMessage(), "Animal est dans le mauvais sercteur");
		}

	}

}
