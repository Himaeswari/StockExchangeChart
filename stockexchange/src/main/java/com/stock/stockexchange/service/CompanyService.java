package com.stock.stockexchange.service;

import java.sql.SQLException;
import java.util.List;

import com.stock.stockexchange.model.Company;


public interface CompanyService {

	
	  public Company insertCompany(Company company) throws SQLException;
	  /* public Company updateCompany(Company company) throws SQLException;*/
		public List<Company> getCompanyList() throws SQLException, ClassNotFoundException;
		/*public Boolean validateUser(User user) throws SQLException;
		 public User insertUser(User user) throws SQLException;
		 
}*/
}
