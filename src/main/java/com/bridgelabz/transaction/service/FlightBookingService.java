package com.bridgelabz.transaction.service;

import com.bridgelabz.transaction.dto.FlightBookingAcknowledgement;
import com.bridgelabz.transaction.dto.FlightBookingRequest;
import com.bridgelabz.transaction.model.PassengerData;
import com.bridgelabz.transaction.model.PaymentData;
import com.bridgelabz.transaction.repository.IPassengerDataRepository;
import com.bridgelabz.transaction.repository.IPaymentDataRepository;
import com.bridgelabz.transaction.utils.PaymentUtils;
import net.moznion.random.string.RandomStringGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.UUID;

@Service
public class FlightBookingService {


    @Autowired
    private IPassengerDataRepository passengerDataRepository;
    @Autowired
    private IPaymentDataRepository paymentDataRepository;

    public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) {

        PassengerData passengerData = request.getPassengerdata();
        System.out.println(passengerData);
        passengerData = passengerDataRepository.save(passengerData);


        PaymentData paymentData = request.getPaymentData();
        System.out.println(paymentData);
        paymentData.setPassengerId(passengerData.getPassengerId());
        paymentData.setAmount(passengerData.getFare());

        PaymentUtils.validateCreditLimit(paymentData.getAccountNo(), passengerData.getFare());


        paymentDataRepository.save(paymentData);
        String randomCode = new RandomStringGenerator(12).toString();
        return new FlightBookingAcknowledgement("SUCCESS", passengerData.getFare(),randomCode , passengerData);

    }
}
