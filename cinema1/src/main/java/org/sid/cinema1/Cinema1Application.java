package org.sid.cinema1;

import org.sid.cinema1.entities.Film;
import org.sid.cinema1.entities.FilmProjection;
import org.sid.cinema1.entities.Place;
import org.sid.cinema1.entities.Salle;
import org.sid.cinema1.entities.Seance;
import org.sid.cinema1.entities.TicketPlace;
import org.sid.cinema1.entities.Ville;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Cinema1Application {

	public static void main(String[] args) {
		SpringApplication.run(Cinema1Application.class, args);
	}
		
}
