package com.bridgelabz.transaction.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name = "passenger_data")
public class PassengerData {

        @Id
        @GeneratedValue
        private Long passengerId;
        private String name;
        private String email;
        private String source;
        private String destination;
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
        private Date travelDate;
        private String pickupTime;
        private String arrivalTime;
        private double fare;
    }

