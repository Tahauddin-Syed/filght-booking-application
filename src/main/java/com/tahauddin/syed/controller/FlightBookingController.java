package com.tahauddin.syed.controller;

import com.tahauddin.syed.dto.FlightBookingDTO;
import com.tahauddin.syed.dto.FlightBookingRequest;
import com.tahauddin.syed.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class FlightBookingController {

    @Autowired
    private FlightBookingService flightBookingService;

    @PostMapping("/book/flight")
    public ResponseEntity<FlightBookingDTO> bookFlightTickets(
            @Valid @RequestBody FlightBookingRequest flightBookingRequest) throws Exception {
        try{
            FlightBookingDTO flightBookingDTO = flightBookingService.bookFlight(flightBookingRequest);
            return new ResponseEntity<>(flightBookingDTO, HttpStatus.CREATED);
        } catch (MethodArgumentNotValidException e) {
            throw e;
        }
    }

}
