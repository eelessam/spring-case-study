package org.example.casestudy;

import java.util.List;

public interface OrderRepository {

    Order save(Order order);

    Order update(Order order);

    List<Order> findByStatus(OrderStatus status);
}
