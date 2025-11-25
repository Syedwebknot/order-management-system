package com.example.SpringOne.controller;

import com.example.SpringOne.entity.Order;
import com.example.SpringOne.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public Order createOrder(@RequestBody Order order){
        return service.createOrder(order);
    }

    // READ 1
    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Long id){
        return service.getOrder(id);
    }

    // READ ALL
    @GetMapping
    public List<Order> getAllOrders(){
        return service.getAllOrders();
    }

    // UPDATE FULL
    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable Long id, @RequestBody Order order){
        return service.updateOrder(id, order);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id){
        service.deleteOrder(id);
    }

    // EXTRA API 1: Update only status
    @PutMapping("/{id}/status")
    public Order updateStatus(@PathVariable Long id, @RequestParam String status){
        return service.updateOrderStatus(id, status);
    }

    // EXTRA API 2: Get orders by status
    @GetMapping("/status/{status}")
    public List<Order> getOrdersByStatus(@PathVariable String status){
        return service.getOrdersByStatus(status);
    }
}
