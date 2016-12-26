package com.twitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twitter.model.Media;

@Repository
public interface MediaRepository extends JpaRepository<Media, Long> {

}
