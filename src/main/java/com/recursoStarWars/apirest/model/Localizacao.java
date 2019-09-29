package com.recursoStarWars.apirest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Localizacao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String latitude;
	private String longitude;
	private String nome;// nome da galáxia da base que ele faz parte

//	@OneToOne
//	private Rebelde rebelde;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	public Rebelde getRebelde() {
//		return rebelde;
//	}
//
//	public void setRebelde(Rebelde rebelde) {
//		this.rebelde = rebelde;
//	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
