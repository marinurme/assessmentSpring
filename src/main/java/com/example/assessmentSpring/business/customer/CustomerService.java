package com.example.assessmentSpring.business.customer;

import com.example.assessmentSpring.domain.customer.Customer;
import com.example.assessmentSpring.domain.customer.CustomerRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Resource
    private CustomerRepository customerRepository;

    public void createNewCustomer(CustomerDto customer) {
        Customer newCustomer = new Customer(customer.getFullName(), customer.getEmail(), customer.getTelephone());
        customerRepository.save(newCustomer);
    }

    public Customer findCustomerBy(Integer customerId) {
        return customerRepository.getReferenceById(customerId);
    }
}
