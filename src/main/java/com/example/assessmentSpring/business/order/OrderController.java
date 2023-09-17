package com.example.assessmentSpring.business.order;

import com.example.assessmentSpring.domain.order.Order;
import jakarta.annotation.Resource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @PostMapping("/create/order")
    public void createNewOrder(@RequestBody OrderDto order){
        orderService.createNewOrder(order);

    }

    @GetMapping("find/orders")
    public List<Order> findOrders(@RequestParam String date){
        return orderService.findOrders(date);
    }

}
