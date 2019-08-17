package com.stock.stockexchange.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.stockexchange.model.Stock;

public interface StockDao extends JpaRepository<Stock,Integer>{

}
