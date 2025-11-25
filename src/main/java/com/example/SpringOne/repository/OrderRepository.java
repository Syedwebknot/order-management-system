package com.example.SpringOne.repository;

import com.example.SpringOne.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByStatus(String status);

}
