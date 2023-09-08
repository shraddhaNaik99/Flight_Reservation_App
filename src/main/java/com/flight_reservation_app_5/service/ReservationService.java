package com.flight_reservation_app_5.service;

import com.flight_reservation_app_5.dto.ReservationRequest;
import com.flight_reservation_app_5.entity.Reservation;

public interface ReservationService {

	Reservation bookFlight(ReservationRequest request);
}
