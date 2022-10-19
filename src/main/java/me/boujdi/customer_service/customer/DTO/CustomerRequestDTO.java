package me.boujdi.customer_service.customer.DTO;

import lombok.Data;
@Data
public class CustomerRequestDTO {
private String id;
private String name;
private String email;

    public CustomerRequestDTO(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
