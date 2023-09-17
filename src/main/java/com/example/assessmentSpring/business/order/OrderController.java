package com.example.assessmentSpring.business.order;

import com.example.assessmentSpring.domain.order.OrderLineDto;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @PostMapping("/create/order")
    @Operation(summary = "Creates new order")
    public void createNewOrder(@RequestBody OrderDto order){
        orderService.createNewOrder(order);

    }

    @GetMapping("find/orders")
    @Operation(summary = "Finds orders by date")
    public List<OrderDto> findOrders(@RequestParam String date){
        return orderService.findOrders(date);
    }

    @GetMapping("find/orders/product")
    @Operation(summary = "Finds orders by product")
    public List<OrderLineDto> findOrdersBy(@RequestParam Integer productId) {
        return orderService.findOrdersBy(productId);
    }

    @GetMapping("find/orders/customer")
    @Operation(summary = "Finds orders by customer")
    public List<OrderLineDto> findCustomerOrders(@RequestParam Integer customerId){
       return orderService.findCustomerOrders(customerId);
    }

    @PutMapping("change/quantity")
    @Operation(summary = "Change quantity of products in an order line")
    public void updateOrderLineQuantity(@RequestBody OrderLineDto request){
        orderService.updateOrderLineQuantity(request);
    }
}


