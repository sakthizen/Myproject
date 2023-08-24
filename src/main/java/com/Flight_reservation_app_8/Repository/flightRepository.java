package com.Flight_reservation_app_8.Repository;



import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Flight_reservation_app_8.entity.flight;

public interface flightRepository extends JpaRepository<flight, Long> {
	@Query("from flight where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture")
	List<flight> findflights(@Param("departureCity") String from, @Param("arrivalCity") String to,@Param("dateOfDeparture") Date departureDate);
 	
}
