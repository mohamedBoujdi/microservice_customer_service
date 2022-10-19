package me.boujdi.customer_service.customer.service;

import me.boujdi.customer_service.customer.DTO.CustomerRequestDTO;
import me.boujdi.customer_service.customer.DTO.CustomerResponseDTO;
import me.boujdi.customer_service.customer.Mapper.CustomerMapper;
import me.boujdi.customer_service.customer.entity.Customer;
import me.boujdi.customer_service.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

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
       Customer customer = customerMapper.customerRequestDtoTOCustomer(customerRequestDTO);
       Customer savedCustomer=customerRepository.save(customer);
       CustomerResponseDTO customerResponseDTO=customerMapper.customerToCustomerResponseDTO(savedCustomer);
    return  customerResponseDTO;
    }

    @Override
    public CustomerResponseDTO getCustomer(String Id) {
        Customer customer=customerRepository.findById(Id).orElseThrow(()->new RuntimeException("customer not found"));
        CustomerResponseDTO customerResponseDTO=customerMapper.customerToCustomerResponseDTO(customer);
        return customerResponseDTO;
    }

    @Override
    public CustomerResponseDTO update(CustomerRequestDTO customerRequestDTO) {
        Customer customer=customerMapper.customerRequestDtoTOCustomer(customerRequestDTO);
        Customer updatedCustomer=customerRepository.save(customer);
        CustomerResponseDTO customerResponseDTO = customerMapper.customerToCustomerResponseDTO(updatedCustomer);
        return customerResponseDTO;
    }

    @Override
    public List<CustomerResponseDTO> listCustomers() {

        return customerRepository.findAll().stream()
                .map(customer -> customerMapper.customerToCustomerResponseDTO(customer))
                .collect(Collectors.toList());
    }
}
