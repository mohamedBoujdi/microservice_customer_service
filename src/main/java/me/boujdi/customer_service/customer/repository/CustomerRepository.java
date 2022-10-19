package me.boujdi.customer_service.customer.repository;

import me.boujdi.customer_service.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {
}
