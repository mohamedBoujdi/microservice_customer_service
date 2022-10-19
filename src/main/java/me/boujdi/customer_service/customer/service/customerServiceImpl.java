package me.boujdi.customer_service.customer.service;

import me.boujdi.customer_service.customer.DTO.CustomerRequestDTO;
import me.boujdi.customer_service.customer.DTO.CustomerResponseDTO;
import me.boujdi.customer_service.customer.Mapper.CustomerMapper;
import me.boujdi.customer_service.customer.entity.Customer;
import me.boujdi.customer_service.customer.repository.CustomerRepository;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class customerServiceImpl implements CustomerService{
     //@Autowired déprecier
    private CustomerRepository customerRepository;
    private  CustomerMapper customerMapper;

    public customerServiceImpl(CustomerRepository customerRepository,CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper=customerMapper;
    }

    @Override
    public CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO) {
       Customer customer = customerMapper.customerResponseDtoTOCustomer(customerRequestDTO);
       Customer savedCustomer=customerRepository.save(customer);
       CustomerResponseDTO customerResponseDTO=customerMapper.customerToCustomerResponseDTO(savedCustomer);
    return  customerResponseDTO;
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
