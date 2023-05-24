package com.bridgelabz.transaction.repository;

import com.bridgelabz.transaction.model.PassengerData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPassengerDataRepository extends JpaRepository<PassengerData,Long> {
}
