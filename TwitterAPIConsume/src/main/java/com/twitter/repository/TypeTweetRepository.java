package com.twitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twitter.model.TypeTweet;


@Repository
public interface TypeTweetRepository extends JpaRepository<TypeTweet, Long> {

}
