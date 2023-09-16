package com.example.assessmentSpring.business.customer;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Resource
    private CustomerService customerService;

    @PostMapping("/create")
    @Operation(summary = "Creates new customer")
    public void createNewCustomer(@RequestBody CustomerDto customer){
        customerService.createNewCustomer(customer);
    }
}
