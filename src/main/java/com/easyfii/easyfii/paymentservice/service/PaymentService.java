package com.easyfii.easyfii.paymentservice.service;

import com.easyfii.easyfii.paymentservice.entity.Payment;
import com.easyfii.easyfii.paymentservice.repo.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment processPayment(Payment payment) {
        payment.setPaymentStatus("PENDING");
        // Simulate external payment gateway call
        payment.setPaymentStatus("SUCCESS"); // Assume payment succeeded
        return paymentRepository.save(payment);
    }

    public Payment getPaymentDetails(Long paymentId) {
        return paymentRepository.findById(paymentId)
                .orElseThrow(() -> new RuntimeException("Payment not found!"));
    }
}

