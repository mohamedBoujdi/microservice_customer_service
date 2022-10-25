package me.boujdi.customer_service;

import me.boujdi.customer_service.customer.DTO.CustomerRequestDTO;
import me.boujdi.customer_service.customer.service.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient // Enable eureka client.
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerService customerService) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {

                customerService.save(new CustomerRequestDTO("76GY", "John", "xxxxxx@gmail.com"));
                customerService.save(new CustomerRequestDTO("57BK", "Farid", "YYYYY@gmail.com"));
                customerService.save(new CustomerRequestDTO("98JH", "Mohamed", "llaj@gmail.com"));
                customerService.save(new CustomerRequestDTO("45GH", "Ali", "ibdig@hotmail.com"));
                customerService.save(new CustomerRequestDTO("78JH", "Omar", "ycuud@mail.com"));
            }
        };
    }
}
