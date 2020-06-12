package edu.miu.cs.cs425.eshopping.model;


import edu.miu.cs.cs425.eshopping.customvalidation.ValidEmail;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull(groups = {ValidationGroups.UpdateValidation.class})
    private Long id;
    @Size(min = 4, max = 100, message = "{Size.validation}", groups = {ValidationGroups.CreateValidation.class, ValidationGroups.UpdateValidation.class})
    private String firstName;
    @Size(min = 4, max = 100, message = "{Size.validation}", groups = {ValidationGroups.CreateValidation.class, ValidationGroups.UpdateValidation.class})
    private String lastName;

    @Email(message = "{email.validation}", groups = {ValidationGroups.CreateValidation.class, ValidationGroups.UpdateValidation.class})
    @ValidEmail(message = "{email.customerValidation}", groups = {ValidationGroups.CreateValidation.class})
    private String email;
    private Integer coupons = 0;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_Id")
    @Valid
    private User user;
/*
    @ManyToMany
    @JoinTable (name="Follower")
    private List<Seller> seller;*/

    @OneToMany(mappedBy = "buyer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviews;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCoupons() {
        return coupons;
    }

    public void setCoupons(Integer coupons) {
        this.coupons = coupons;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
