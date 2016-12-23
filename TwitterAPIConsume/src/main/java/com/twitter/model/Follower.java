package com.twitter.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Follower {
	
	@EmbeddedId
	FollowerPK primaryKey;

	public Follower() {
		super();
	}

	public Follower(FollowerPK primaryKey) {
		super();
		this.primaryKey = primaryKey;
	}

	public FollowerPK getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(FollowerPK primaryKey) {
		this.primaryKey = primaryKey;
	}
	
	
	
	

}
