package com.twitter.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Tweet {
	
	@Id
	private long id;
	private int nbOfLikes;
	private String text;
	private String type; //Type text,jpg,gif..
	
	@ManyToOne(targetEntity=CustomDate.class,cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn
	private CustomDate date;
	
	@ManyToOne(targetEntity=Media.class,cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn
	private Media lien;
	
	@ManyToOne(targetEntity=TypeTweet.class,cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn
	private TypeTweet typeTweet;

	public Tweet() {
		super();
	}

	public Tweet(long id, int nbOfLikes, String text, String type, CustomDate date, Media lien, TypeTweet typeTweet) {
		super();
		this.id = id;
		this.nbOfLikes = nbOfLikes;
		this.text = text;
		this.type = type;
		this.date = date;
		this.lien = lien;
		this.typeTweet = typeTweet;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNbOfLikes() {
		return nbOfLikes;
	}

	public void setNbOfLikes(int nbOfLikes) {
		this.nbOfLikes = nbOfLikes;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public CustomDate getDate() {
		return date;
	}

	public void setDate(CustomDate date) {
		this.date = date;
	}

	public Media getLien() {
		return lien;
	}

	public void setLien(Media lien) {
		this.lien = lien;
	}

	public TypeTweet getTypeTweet() {
		return typeTweet;
	}

	public void setTypeTweet(TypeTweet typeTweet) {
		this.typeTweet = typeTweet;
	}
	

}
