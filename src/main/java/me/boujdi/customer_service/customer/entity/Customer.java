package me.boujdi.customer_service.customer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    private String id;
    private String name;
    private String email;
    /*private String password;
    private String phone;
    private String address;
    private String city;
    private String country;
    private String zipCode;
    private String role;
    private String state;
    private String image;
    private String token;
    private String tokenExpirationDate;
    private String createdAt;
    private String updatedAt;
    private Boolean active;
    private Integer age;*/
    
}
