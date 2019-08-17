package com.stock.stockexchange.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.stock.stockexchange.dao.CompanyDao;
import com.stock.stockexchange.model.Company;


@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDao companyDao;
	
	@Override
	public Company insertCompany(Company company) throws SQLException {
	    companyDao.save(company);
		return null;
	}
	
	/*
	
	@Override
	public User insertUser(User user) throws SQLException {
	    companyDao.insertUser(user);
		return null;
	}

	@Override
	public Company updateCompany(Company company) throws SQLException{
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public List<Company> getCompanyList() throws SQLException, ClassNotFoundException {
		return companyDao.findAll();
	}
	
	/*@Override
	public Boolean validateUser(User user) throws SQLException
	{
		
		
	  boolean check=companyDao.validateUser(user);
	  System.out.println("hi "+check);
	  return check;
	}



	@Override
	public Stock insertStock(Stock stock) throws SQLException {
		// TODO Auto-generated method stub
		return companyDao.insertStock(stock);
	}



	@Override
	public List<Stock> getStockList() throws SQLException {
		// TODO Auto-generated method stub
		return companyDao.getStockList();
	}*/

}

