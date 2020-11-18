package com.ecocar.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecocar.DAO.CompanyRepository;
import com.ecocar.Entity.Company;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	@Override
	@Transactional
	public List<Company> findAll() {
		
		return companyRepository.findAll();
	}

	@Override
	@Transactional
	public Company findById(int theId) {
		
		Optional<Company> result = companyRepository.findById((int) theId);
		Company theCompany = null;
		if(result.isPresent()) {
			theCompany = result.get();
		}else {
			//we didn't find that company
			throw new RuntimeException("Did not find company with id: " + theId);
		}
		return theCompany;
	}

	@Override
	@Transactional
	public void save(Company theCompany) {
		
		companyRepository.save(theCompany);

	}

	@Override
	@Transactional
	public void deleteByID(int theId) {
		
		companyRepository.deleteById(theId);

	}

}
