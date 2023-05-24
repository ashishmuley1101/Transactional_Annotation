package com.bridgelabz.transaction.repository;

import com.bridgelabz.transaction.model.PaymentData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPaymentDataRepository extends JpaRepository<PaymentData,String> {
}
