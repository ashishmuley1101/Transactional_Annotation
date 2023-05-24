package com.bridgelabz.transaction.controller;

import com.bridgelabz.transaction.dto.FlightBookingAcknowledgement;
import com.bridgelabz.transaction.dto.FlightBookingRequest;
import com.bridgelabz.transaction.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class FlightBookingController {

    @Autowired
    private FlightBookingService flightBookingService;


    @PostMapping("/flightTicket")
    public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request){
        return flightBookingService.bookFlightTicket(request);
    }

}
