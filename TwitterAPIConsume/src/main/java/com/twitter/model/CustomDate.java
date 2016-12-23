package com.twitter.model;

import java.sql.Time;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomDate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private DayOfWeek jour;
	private Month mois;
	private Year annee;
	private Time time;
	
	
	
	public CustomDate() {
		super();
	}

	public CustomDate(long id, DayOfWeek jour, Month mois, Year annee, Time time) {
		super();
		this.id = id;
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
		this.time = time;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public DayOfWeek getJour() {
		return jour;
	}

	public void setJour(DayOfWeek jour) {
		this.jour = jour;
	}

	public Month getMois() {
		return mois;
	}

	public void setMois(Month mois) {
		this.mois = mois;
	}

	public Year getAnnee() {
		return annee;
	}

	public void setAnnee(Year annee) {
		this.annee = annee;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	
	
	
	
	

}
