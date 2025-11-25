package com.example.SpringOne.service;

import com.example.SpringOne.entity.Order;
import com.example.SpringOne.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository repo;

    public OrderService(OrderRepository repo) {
        this.repo = repo;
    }

    public Order createOrder(Order order) {
        return repo.save(order);
    }

    public Order getOrder(Long id) {
        return repo.findById(id).orElse(null);
    }

    public List<Order> getAllOrders() {
        return repo.findAll();
    }

    public Order updateOrder(Long id, Order order) {
        Order existing = repo.findById(id).orElse(null);

        if(existing == null) return null;

        existing.setCustomerName(order.getCustomerName());
        existing.setProductName(order.getProductName());
        existing.setQuantity(order.getQuantity());
        existing.setPrice(order.getPrice());
        existing.setStatus(order.getStatus());

        return repo.save(existing);
    }

    public void deleteOrder(Long id) {
        repo.deleteById(id);
    }

    public List<Order> getOrdersByStatus(String status){
        return repo.findByStatus(status);
    }

    public Order updateOrderStatus(Long id, String status) {
        Order order = repo.findById(id).orElse(null);

        if(order == null) return null;

        order.setStatus(status);

        return repo.save(order);
    }
}
