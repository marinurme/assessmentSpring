package com.example.assessmentSpring.business.order;

import com.example.assessmentSpring.business.customer.CustomerService;
import com.example.assessmentSpring.domain.customer.Customer;
import com.example.assessmentSpring.domain.order.Order;
import com.example.assessmentSpring.domain.order.OrderRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class OrderService {

    @Resource
    private OrderRepository orderRepository;

    @Resource
    private CustomerService customerService;
    public void createNewOrder(OrderDto order) {
        Customer customer = customerService.findCustomerBy(order.getCustomerId());
        Order newOrder = new Order(customer, order.getDateOfSubmission());
        orderRepository.save(newOrder);

    }
    public List<Order> findOrders(String date) {
        return orderRepository.findOrdersBy(date);

    }
}
