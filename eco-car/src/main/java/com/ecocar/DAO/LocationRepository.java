package com.ecocar.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecocar.Entity.Location;
//@CrossOrigin("http://localhost:4200")
@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
