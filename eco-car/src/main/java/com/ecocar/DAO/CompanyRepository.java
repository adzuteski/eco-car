package com.ecocar.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecocar.Entity.Company;

//@CrossOrigin("http://localhost:4200")
@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
