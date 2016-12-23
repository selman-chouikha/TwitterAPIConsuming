package com.twitter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypeTweet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private TweetType type;
	public TypeTweet() {
		super();
	}
	public TypeTweet(long id, TweetType type) {
		super();
		this.id = id;
		this.type = type;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public TweetType getType() {
		return type;
	}
	public void setType(TweetType type) {
		this.type = type;
	}
	

}
