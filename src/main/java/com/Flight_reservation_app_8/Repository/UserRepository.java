package com.Flight_reservation_app_8.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight_reservation_app_8.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String emailId);
}
