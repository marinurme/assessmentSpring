package com.example.assessmentSpring.business.order;

import com.example.assessmentSpring.domain.order.OrderLine;
import com.example.assessmentSpring.domain.order.OrderLineRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderLineService {

    @Resource
    private OrderLineRepository orderLineRepository;

    public List<OrderLine> findOrdersBy(Integer productId) {
        return orderLineRepository.findOrdersBy(productId);
    }

    public List<OrderLine> findCustomerOrders(Integer customerId) {
        return orderLineRepository.findCustomerOrders(customerId);
    }


    public void updateOrderLineQuantity(Integer quantity, Integer orderId) {
        orderLineRepository.updateQuantityById(quantity,orderId);
    }
}
