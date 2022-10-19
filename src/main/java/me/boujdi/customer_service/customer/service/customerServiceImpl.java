package me.boujdi.customer_service.customer.service;

import me.boujdi.customer_service.customer.DTO.CustomerRequestDTO;
import me.boujdi.customer_service.customer.DTO.CustomerResponseDTO;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class customerServiceImpl implements CustomerService{
    @Override
    public CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO) {
        return null;
    }

    @Override
    public CustomerResponseDTO getCustomer(String Id) {
        return null;
    }

    @Override
    public CustomerResponseDTO update(CustomerRequestDTO customerRequestDTO) {
        return null;
    }

    @Override
    public CustomerResponseDTO listCustomers() {
        return null;
    }
}
