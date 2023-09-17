package com.example.assessmentSpring.business.order;

import com.example.assessmentSpring.business.customer.CustomerService;
import com.example.assessmentSpring.domain.customer.Customer;
import com.example.assessmentSpring.domain.order.*;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Resource
    private OrderRepository orderRepository;
    @Resource
    private CustomerService customerService;
    @Resource
    private OrderLineService orderLineService;
    @Resource
    private OrderLineMapper orderLineMapper;

    @Resource
    private OrderMapper orderMapper;

    public void createNewOrder(OrderDto order) {
        Customer customer = customerService.findCustomerBy(order.getCustomerId());
        Order newOrder = new Order(customer, order.getDateOfSubmission());
        orderRepository.save(newOrder);

    }
    public List<OrderDto> findOrders(String date) {
        List<Order> ordersBy = orderRepository.findOrdersBy(date);
        return orderMapper.toOrderDtos(ordersBy);
    }

    public List<OrderLineDto> findOrdersBy(Integer productId) {
        List<OrderLine> ordersBy = orderLineService.findOrdersBy(productId);
        return orderLineMapper.toOrderLineDtos(ordersBy);
    }

    public List<OrderLineDto> findCustomerOrders(Integer customerId) {
        List<OrderLine> customerOrders = orderLineService.findCustomerOrders(customerId);
       return orderLineMapper.toOrderLineDtos(customerOrders);
    }

    public void updateOrderLineQuantity(OrderLineDto request) {
        Integer orderId = request.getOrderId();
        Integer quantity = request.getQuantity();
        orderLineService.updateOrderLineQuantity(quantity,orderId);

    }
}
