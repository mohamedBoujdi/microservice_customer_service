package me.boujdi.customer_service.customer.DTO;

import lombok.Data;

import java.io.Serializable;

@Data
public class CustomerRequestDTO implements Serializable {
 private String id;
 private String name;
 private String email;

 public CustomerRequestDTO(String id, String name, String email) {
    this.id    = id;
    this.name  = name;
    this.email = email;

 }
}
