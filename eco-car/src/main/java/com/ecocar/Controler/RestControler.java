package com.ecocar.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.ecocar.Entity.Company;
import com.ecocar.Service.CompanyService;

@RestController
@RequestMapping("/api")
public class RestControler {

	
	     @Autowired
		 private CompanyService companyService;
	     
			
		    @GetMapping("/companies")
		    public List<Company> findAll(){
		    	return companyService.findAll();
		    }
		    
		    @GetMapping("/companies/{companyId}")
		    public Company getCompany(@PathVariable int companyId) {
		    	Company theCompany = companyService.findById(companyId);
		    	if(theCompany == null) {
		    		throw new RuntimeException("company id is not found " + companyId);
		    	}
		    	return theCompany;
		    }
		    
		    @PostMapping("/companies")
		    public Company addEmployee(@RequestBody Company theCompany) {
		    	theCompany.setId(0);
		    	companyService.save(theCompany);
		    	return theCompany;
		    }
		    
		    @PutMapping("/companies/update")
		    public @ResponseBody String updateCompany(@RequestBody Company theCompany) {
		       companyService.save(theCompany);
		       String response = "Updated " + theCompany.getName() + " with id: " + theCompany.getId();
		        return response; 
		        }
		    
		    @DeleteMapping("/companies/{companyId}")
		    public String deleteEmployee(@PathVariable int companyId) {
		    	Company theCompany = companyService.findById(companyId);
		    	if(theCompany == null) {
		    		throw new RuntimeException("Companyy id not found- " + companyId);
		    	}
		        companyService.deleteByID(companyId);
		    	return "Deleted company id - " + companyId;
		    }
}	    
