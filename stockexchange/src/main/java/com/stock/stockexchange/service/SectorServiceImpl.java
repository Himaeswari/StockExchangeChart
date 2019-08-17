package com.stock.stockexchange.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.stockexchange.dao.SectorDao;
import com.stock.stockexchange.model.Sector;


@Service
public class SectorServiceImpl implements SectorService{


	@Autowired
	private SectorDao sectorDao;
	
	@Override
	public List<Sector> fetchSector() throws SQLException {
		System.out.println("asdfg  "+sectorDao.findAll());
		return sectorDao.findAll();
	}

}
