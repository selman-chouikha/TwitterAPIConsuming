package com.twitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.twitter.model.CustomDate;

@Repository
public interface CustomDateRepository extends JpaRepository<CustomDate, Long>{
	
	
	@Modifying
	@Transactional(
			readOnly = false)
	CustomDate save(CustomDate customDate);
	
	@Modifying
	@Transactional(
			readOnly = false)
	void delete(Long id);

}
