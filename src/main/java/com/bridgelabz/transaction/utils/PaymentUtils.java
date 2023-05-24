package com.bridgelabz.transaction.utils;

import com.bridgelabz.transaction.exception.PaymentBalanceException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {

    private static Map<String, Double> paymentMap = new HashMap<>();

    static {
        paymentMap.put("account1", 15000.0);
        paymentMap.put("account2", 10000.0);
        paymentMap.put("account3", 7000.0);
        paymentMap.put("account4", 4000.0);
    }


    public static boolean validateCreditLimit(String accountNo, double paidAmount) {
        if (paidAmount > paymentMap.get(accountNo)) {
            throw new PaymentBalanceException("Insufficient Balance...!");
        } else {
            return true;
        }
    }
}
