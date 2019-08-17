package com.stock.stockexchange.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.stockexchange.dao.StockDao;
import com.stock.stockexchange.model.Stock;

@Service
public class StockServiceImpl implements StockService {
	@Autowired
	private StockDao stockDao;

	@Override
	public Stock insertStock(Stock stock) throws SQLException {
		
		stockDao.save(stock);
		return null;
	}

	@Override
	public List<Stock> getStockList() throws SQLException {
		
		return stockDao.findAll();
	}

	



}
