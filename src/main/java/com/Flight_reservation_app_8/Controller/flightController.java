package com.Flight_reservation_app_8.Controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.Flight_reservation_app_8.Repository.flightRepository;
import com.Flight_reservation_app_8.entity.flight;

@Controller
public class flightController {
	
	@Autowired
	private flightRepository flightRepo;
	
	@RequestMapping("/findFlights")
	public String findFlights(@RequestParam("from")String from,
			@RequestParam("to")String to, @RequestParam("departureDate") @DateTimeFormat(pattern="yyyy-MM-dd")Date departureDate,ModelMap modelMap) {
	List<flight>findFlights=flightRepo.findflights(from,to,departureDate);
	modelMap.addAttribute("findFlights",findFlights);
	//System.out.println(findFlights);
		return "displayflights";
		
	}
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId,ModelMap modelMap) {
		Optional<flight>findById=flightRepo.findById(flightId);
		flight flight = findById.get();
		System.out.println(flight.getId());
		System.out.println(flight.getArrivalCity());
		System.out.println(flight.getDepartureCity());
		System.out.println(flight.getFlightNumber());
	System.out.println(flight.getOperatingAirlines());
		return "showReservation";

	}
}
