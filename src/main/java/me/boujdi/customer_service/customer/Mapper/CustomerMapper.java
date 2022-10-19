package me.boujdi.customer_service.customer.Mapper;

import me.boujdi.customer_service.customer.DTO.CustomerRequestDTO;
import me.boujdi.customer_service.customer.DTO.CustomerResponseDTO;
import me.boujdi.customer_service.customer.entity.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" )
public interface CustomerMapper {
    CustomerResponseDTO customerToCustomerResponseDTO(Customer customer);
    Customer customerRequestDtoTOCustomer(CustomerRequestDTO customerRequestDTO);
}
