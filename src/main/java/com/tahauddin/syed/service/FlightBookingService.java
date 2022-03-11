package com.tahauddin.syed.service;

import com.tahauddin.syed.dto.FlightBookingDTO;
import com.tahauddin.syed.dto.FlightBookingRequest;
import com.tahauddin.syed.repo.PassengerInfoRepo;
import com.tahauddin.syed.repo.PaymentInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.UUID;

@Service
public class FlightBookingService {

    @Autowired
    private PassengerInfoRepo passengerInfoRepo;

    @Autowired
    private PaymentInfoRepo paymentInfoRepo;

    @Transactional
    public FlightBookingDTO bookFlight( FlightBookingRequest flightBookingRequest) throws MethodArgumentNotValidException {

        passengerInfoRepo.save(flightBookingRequest.getPassengerInfo());
        paymentInfoRepo.save(flightBookingRequest.getPaymentInfo());
        return FlightBookingDTO.builder()
                .id(UUID.randomUUID().toString())
                .username("abc")
                .email("abc@xyz.com")
                .source("London")
                .destination("New York")
                .fare("500")
                .build();
    }
}
