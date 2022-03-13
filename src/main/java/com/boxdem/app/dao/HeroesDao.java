package com.boxdem.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boxdem.app.entity.HeroeEntity;

public interface HeroesDao extends JpaRepository<HeroeEntity, Long>{
	
	

}
