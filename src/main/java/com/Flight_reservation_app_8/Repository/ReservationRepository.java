package com.Flight_reservation_app_8.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight_reservation_app_8.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
