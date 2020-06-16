package edu.miu.cs.cs425.eshopping.service;

import edu.miu.cs.cs425.eshopping.model.CouponPayment;

import java.util.List;

public interface CouponPaymentService {
    CouponPayment addPayment(CouponPayment payment);

    List<CouponPayment> getAll();

    List<CouponPayment> getAllByUserName(String username);

    CouponPayment getPayment(Long id);

    CouponPayment editPayment(CouponPayment payment);
}
