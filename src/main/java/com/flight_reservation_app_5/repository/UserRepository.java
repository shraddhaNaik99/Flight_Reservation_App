package com.flight_reservation_app_5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_reservation_app_5.entity.User;

public interface UserRepository extends JpaRepository<User , Long> {

	User findByEmail(String emailId);

}
