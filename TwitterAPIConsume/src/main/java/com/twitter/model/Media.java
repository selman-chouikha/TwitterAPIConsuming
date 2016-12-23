package com.twitter.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Media {
	
	@Id
	private String lien;
	private String type;
	public Media() {
		super();
	}
	public Media(String lien, String type) {
		super();
		this.lien = lien;
		this.type = type;
	}
	public String getLien() {
		return lien;
	}
	public void setLien(String lien) {
		this.lien = lien;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
