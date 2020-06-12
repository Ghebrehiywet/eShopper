package edu.miu.cs.cs425.eshopping.customvalidation;

import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.Email;

public class EmailValidator implements ConstraintValidator<ValidEmail, String> {
//    private BuyerService buyerService;
//
//    @Autowired
//    public EmailValidator(BuyerService buyerService) {
//        this.buyerService = buyerService;
//    }

    public EmailValidator() {
    }

    @Override
    public void initialize(ValidEmail constraintAnnotation) {
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {

        return validateEmail(email);
    }

    public boolean validateEmail(String email) {
//        Buyer buyer = null;
//
//        try {
//            buyer = buyerService.findByEmail(email);
//        } catch (Exception e) {
//
//        }
        return false;// buyer == null ? true : false;
    }
}
