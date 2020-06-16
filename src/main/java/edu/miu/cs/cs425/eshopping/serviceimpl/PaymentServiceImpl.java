package edu.miu.cs.cs425.eshopping.serviceimpl;

import edu.miu.cs.cs425.eshopping.model.Payment;
import edu.miu.cs.cs425.eshopping.repository.PaymentRepository;
import edu.miu.cs.cs425.eshopping.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Payment addPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public List<Payment> getAll() {
        Iterable<Payment> paymentIterable = paymentRepository.findAll();
        List<Payment> payments = new ArrayList<>();
        paymentIterable.forEach(payments::add);
        return payments;
    }

    @Override
    public List<Payment> getAllByUserName(String username) {
        Iterable<Payment> paymentIterable = paymentRepository.findAll();

        List<Payment> payments = new ArrayList<>();
        paymentIterable.forEach(payments::add);

        return payments.stream()
                //.filter(payment -> payment.getCartItem().getBuyer().getEmail() == username)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Payment getPayment(Long id) {
        Optional<Payment> payment = paymentRepository.findById(id);
        if (!payment.isPresent()) {
            // a cusmtom excepttion has to be thrown
            System.out.println("Payment not found");
            //throw new Exception("Payment not found");
        }
        return payment.get();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Payment editPayment(Payment payment) {
        Payment updatedPayment = paymentRepository.save(payment);
        return updatedPayment;
    }
}
