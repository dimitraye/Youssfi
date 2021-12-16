package org.sid.cinema1.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class TicketPlace {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Long id;
	private double prix;
	private String nomClient;
	private int codePayement;
	private boolean reservee;
	@ManyToOne
	private Place place;
	@ManyToOne
	private FilmProjection filmProjection;
	
}
