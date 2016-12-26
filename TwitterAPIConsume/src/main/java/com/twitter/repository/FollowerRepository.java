package com.twitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twitter.model.Follower;
import com.twitter.model.FollowerPK;

@Repository
public interface FollowerRepository extends JpaRepository<Follower, FollowerPK> {

}
