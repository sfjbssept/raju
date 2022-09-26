package com.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admin.entity.FlightDetails;

@Repository
public interface FlightDetailRepo extends JpaRepository<FlightDetails, Integer> {

}
