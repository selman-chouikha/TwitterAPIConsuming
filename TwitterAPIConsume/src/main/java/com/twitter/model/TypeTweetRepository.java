package com.twitter.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TypeTweetRepository extends JpaRepository<TypeTweet, Long> {

}
