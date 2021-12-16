
package org.sid.cinema1.service;
//Initialiser les données dans la db pour faire des test
import java.util.stream.Stream;

import org.sid.cinema1.dao.CategoryRepository;
import org.sid.cinema1.dao.CinemaRepository;
import org.sid.cinema1.dao.FilmProjectionRepository;
import org.sid.cinema1.dao.FilmRepository;
import org.sid.cinema1.dao.PlaceRepository;
import org.sid.cinema1.dao.SalleRepository;
import org.sid.cinema1.dao.SeanceRepository;
import org.sid.cinema1.dao.TicketRepository;
import org.sid.cinema1.dao.VilleRepository;
import org.sid.cinema1.entities.Cinema;
import org.sid.cinema1.entities.Salle;
import org.sid.cinema1.entities.Ville;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CinemaInitImpl implements ICinema1InitService{

	@Autowired
	private VilleRepository villeRepository;
	@Autowired
	private CinemaRepository cinemaRepository;
	@Autowired
	private SalleRepository salleRepository;
	@Autowired
	private PlaceRepository placeRepository;
	@Autowired
	private TicketRepository ticketRepository;
	@Autowired
	private FilmProjectionRepository filmProjectionRepository;
	@Autowired
	private FilmRepository filmRepository;
	@Autowired
	private SeanceRepository seanceRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	
	
	
	@Override
	public void intVilles() {
		// TODO Auto-generated method stub
		Stream.of("Casablanca", "Marakech", "Rabat", "Tanger").forEach(nameVille->{
			Ville ville = new Ville();
			ville.setName(nameVille);
			villeRepository.save(ville);
		});
		
	}

	@Override
	public void initCinemas() {
		// TODO Auto-generated method stub
		villeRepository.findAll().forEach(v->{
			Stream.of("MegaRama","IMAX", "FOUNNOUN", "CHAHRAZAD", "DAOULIZ")
			.forEach(nameCinema->{
				Cinema cinema = new Cinema();
				cinema.setName(nameCinema);
				cinema.setNombreSalles(3+(int)(Math.random()*7));
				cinema.setVille(v);
			});
		});		
	}

	@Override
	public void initSalles() {
		// TODO Auto-generated method stub
		cinemaRepository.findAll().forEach(cinema->{
			for(int i=0; i<	cinema.getNombreSalles();i++) {
				Salle salle = new Salle();
				salle.setName("Salle "+(i+1));
				salle.setCinema(cinema);
				salle.setNombrePlaces(15+(int)(Math.random()*20));
				
			}
		});
		
	}

	@Override
	public void initPlaces() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initSeances() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initCategories() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initFilms() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initProjections() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initTickets() {
		// TODO Auto-generated method stub
		
	}

}