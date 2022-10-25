package me.boujdi.customer_service.customer.web;

import me.boujdi.customer_service.customer.DTO.CustomerRequestDTO;
import me.boujdi.customer_service.customer.DTO.CustomerResponseDTO;
import me.boujdi.customer_service.customer.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/Api")
public class ControllerRestApi {
private CustomerService customerService;

public ControllerRestApi(CustomerService customerService) {
    this.customerService = customerService;
}
@GetMapping(path = "/customers")
public ResponseEntity<List<CustomerResponseDTO>> allCustomers(){
    return new ResponseEntity<>(customerService.listCustomers(), HttpStatus.OK);
}
@GetMapping(path = "/customers/{id}")
public ResponseEntity<CustomerResponseDTO> getCustomer(@PathVariable(name = "id") String customerID){
    return new ResponseEntity<>(customerService.getCustomer(customerID), HttpStatus.OK);
}
@PostMapping(path = "/customer/add")
public ResponseEntity<CustomerResponseDTO> save(@RequestBody CustomerRequestDTO customerRequestDTO){
    customerRequestDTO.setId(UUID.randomUUID().toString());
    CustomerResponseDTO  saved = customerService.save(customerRequestDTO);
    return new ResponseEntity<>(saved,HttpStatus.CREATED);
}
@PutMapping(path = "/customers/up/{id}")
public ResponseEntity<CustomerResponseDTO> updateCustomer(@PathVariable(name = "id") String id, @RequestBody CustomerRequestDTO customerRequestDTO) {
    customerRequestDTO.setId(id);
    CustomerResponseDTO updated = customerService.update(customerRequestDTO);
    return new ResponseEntity<>(updated, HttpStatus.OK);
}
@DeleteMapping(path = "/customers/d/{id}")
public ResponseEntity<Void> deleteCustomer(@PathVariable(name = "id") String id){
    customerService.deleteCustomer(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}


}
