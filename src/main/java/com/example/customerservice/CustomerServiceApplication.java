package com.example.customerservice;

import com.example.customerservice.entities.Customer;
import com.example.customerservice.repository.CustomerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepo customerRepo){
        return args -> {
            customerRepo.save(new Customer(null,"marouan","marouan@mail.ma"));
            customerRepo.save(new Customer(null,"marouan","marouan@mail.ma"));
            customerRepo.save(new Customer(null,"marouan","marouan@mail.ma"));
            customerRepo.save(new Customer(null,"marouan","marouan@mail.ma"));
            customerRepo.save(new Customer(null,"marouan","marouan@mail.ma"));
            customerRepo.findAll().forEach(data->{
                System.out.println(data.getEmail());
            });
        };
    }

}
