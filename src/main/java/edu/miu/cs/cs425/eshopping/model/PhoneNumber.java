package edu.miu.cs.cs425.eshopping.model;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;
@Embeddable
public class PhoneNumber {

    //@NotBlank
    private String areaCode;
    //@NotBlank
    private String phoneNumber;

    @Override
    public String toString() {
        return areaCode + " " + phoneNumber;
    }

}
