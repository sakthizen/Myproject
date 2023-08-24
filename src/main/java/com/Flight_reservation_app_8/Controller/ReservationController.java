package com.Flight_reservation_app_8.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReservationController {

	@RequestMapping("/completeReservation")
	public String completeReservation() {
		
		return "";
	}
}
