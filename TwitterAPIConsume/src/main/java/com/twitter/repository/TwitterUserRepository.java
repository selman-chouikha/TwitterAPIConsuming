package com.twitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twitter.model.TwitterUser;


@Repository
public interface TwitterUserRepository extends JpaRepository<TwitterUser, Long> {

}
