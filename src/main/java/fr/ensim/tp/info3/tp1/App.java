package fr.ensim.tp.info3.tp1;

import java.net.InetSocketAddress;

import fr.ensim.tp.info3.tp1.enums.TypeAnimal;
import fr.ensim.tp.info3.tp1.model.Chat;
import fr.ensim.tp.info3.tp1.model.Chien;
import fr.ensim.tp.info3.tp1.model.Zoo;


public class App {

	public static void main(String[] args) {
		

		try {
			
			Zoo monZoo = new Zoo();
			monZoo.ajouterSecteur(TypeAnimal.CHAT);
			monZoo.ajouterSecteur(TypeAnimal.CHIEN);
			
			Chien chien = new Chien("snopy");
			Chat chat = new Chat("caty");
			
			monZoo.nouvelAnimal(chien);
			monZoo.nouvelAnimal(chat);
			
			monZoo.nouveauVisiteur();
			monZoo.nouveauVisiteur();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
