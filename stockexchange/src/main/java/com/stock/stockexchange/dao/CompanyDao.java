package com.stock.stockexchange.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.stockexchange.model.Company;

public interface CompanyDao extends JpaRepository<Company,Integer> {

}
