package com.ecocar.Service;

import java.util.List;

import com.ecocar.Entity.Company;

public interface CompanyService {

	
	public List<Company> findAll();
    public Company findById(int theId);
    public void save(Company theCompany);
    public void deleteByID(int theId);	
}
