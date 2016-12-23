package com.twitter.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class FollowerPK implements Serializable {
	
	
	
	@ManyToOne(targetEntity=TwitterUser.class,cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="user_id",referencedColumnName = "user_id")
	private TwitterUser user;
	@ManyToOne(targetEntity=TwitterUser.class,cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="follower_id",referencedColumnName = "user_id")
	private TwitterUser follower;

   

    public FollowerPK() {
		super();
	}

	public FollowerPK(TwitterUser user, TwitterUser follower) {
		super();
		this.user = user;
		this.follower = follower;
	}

	public TwitterUser getUser() {
		return user;
	}

	public void setUser(TwitterUser user) {
		this.user = user;
	}

	public TwitterUser getFollower() {
		return follower;
	}

	public void setFollower(TwitterUser follower) {
		this.follower = follower;
	}

	public int hashCode() {
        return (int) user.hashCode() + follower.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof FollowerPK)) return false;
        FollowerPK pk = (FollowerPK) obj;
        return pk.user == user && pk.follower == follower;
    }

}
