package edu.miu.cs.cs425.eshopping.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;


@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class Seller {
    @Id
    @GeneratedValue
    private Long serllerId;


    @NotBlank
    private String fullName;

    @Valid
    @Embedded
    private PhoneNumber phoneNumber;

    @NotBlank
    @Email
    private String email;

//    @ManyToMany(mappedBy = "seller")
//    private List<Buyer> buyer;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_Id")
    @Valid
    private User user;

    public Long getSerllerId() {
        return serllerId;
    }

    public void setSerllerId(Long serllerId) {
        this.serllerId = serllerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
