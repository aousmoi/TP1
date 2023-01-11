package fr.ensim.tp.info3.tp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.ensim.tp.info3.tp1.enums.TypeAnimal;
import fr.ensim.tp.info3.tp1.model.Chat;
import fr.ensim.tp.info3.tp1.model.Chien;
import fr.ensim.tp.info3.tp1.model.Zoo;

@SpringBootApplication
public class Tp1Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp1Application.class, args);
	}

}
