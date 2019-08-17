package com.stock.stockexchange.service;

import java.sql.SQLException;
import java.util.List;

import com.stock.stockexchange.model.Sector;
import com.stock.stockexchange.model.Stock;

public interface SectorService {

	 public List<Sector> fetchSector() throws SQLException;
}
