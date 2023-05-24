package com.bridgelabz.transaction.dto;

import com.bridgelabz.transaction.model.PassengerData;
import com.bridgelabz.transaction.model.PaymentData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

    private PassengerData passengerdata;

    private PaymentData paymentData;
}
