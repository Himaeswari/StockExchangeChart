package com.stock.stockexchange.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.stockexchange.model.Sector;


public interface SectorDao extends JpaRepository<Sector,Integer>{

}
