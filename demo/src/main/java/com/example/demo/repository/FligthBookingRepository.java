package com.example.demo.repository;

import com.example.demo.model.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FligthBookingRepository extends JpaRepository<FlightBooking, Long> {
}
