package me.boujdi.customer_service.customer.service;


import me.boujdi.customer_service.customer.DTO.CustomerRequestDTO;
import me.boujdi.customer_service.customer.DTO.CustomerResponseDTO;
import org.springframework.stereotype.Service;

public interface CustomerService {
    CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO);
    CustomerResponseDTO getCustomer(String Id);
    CustomerResponseDTO update(CustomerRequestDTO customerRequestDTO);
    CustomerResponseDTO listCustomers();
}
