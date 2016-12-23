package com.twitter.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TwitterUser {
	
	@Id
	@Column(name = "user_id")
	private long id;
	private String name;
	private String screenName;
	private String description;
	private String location;
	private String url;
	
	@ManyToOne(targetEntity=CustomDate.class,cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn
	private CustomDate date;

	public TwitterUser() {
		super();
	}

	public TwitterUser(long id, String name, String screenName, String description, String location, String url,
			CustomDate date) {
		super();
		this.id = id;
		this.name = name;
		this.screenName = screenName;
		this.description = description;
		this.location = location;
		this.url = url;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public CustomDate getDate() {
		return date;
	}

	public void setDate(CustomDate date) {
		this.date = date;
	}
	
	

}
