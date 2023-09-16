package com.example.assessmentSpring.business.customer;

import com.example.assessmentSpring.business.customer.CustomerDto;
import com.example.assessmentSpring.domain.customer.Customer;
import com.example.assessmentSpring.domain.customer.CustomerMapper;
import com.example.assessmentSpring.domain.customer.CustomerRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Resource
    private CustomerRepository customerRepository;

    public void createNewCustomer(CustomerDto customer) {
        String fullName = customer.getFullName();
        String email = customer.getEmail();
        String telephone = customer.getTelephone();
        Customer newCustomer = new Customer(fullName, email, telephone);
        customerRepository.save(newCustomer);
    }
}
