package edu.miu.cs.cs425.eshopping.service;

import edu.miu.cs.cs425.eshopping.model.Payment;

import java.util.List;

public interface PaymentService {
    Payment addPayment(Payment payment);

    List<Payment> getAll();

    List<Payment> getAllByUserName(String username);

    Payment getPayment(Long id);

    Payment editPayment(Payment payment);
}
