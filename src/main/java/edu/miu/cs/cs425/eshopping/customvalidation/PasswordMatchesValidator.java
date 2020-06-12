package edu.miu.cs.cs425.eshopping.customvalidation;


import edu.miu.cs.cs425.eshopping.model.User;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {
    //private BuyerService buyerService;


    @Override
    public void initialize(PasswordMatches constraintAnnotation) {
    }

    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context) {
        User user = (User) obj;
        boolean isValid = user.getPassword().equals(user.getMatchingPassword());
        if (!isValid) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate())
                    .addPropertyNode("matchingPassword").addConstraintViolation();
        }

        return isValid;
    }


}