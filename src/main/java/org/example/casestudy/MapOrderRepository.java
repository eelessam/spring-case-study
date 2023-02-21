package org.example.casestudy;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class MapOrderRepository implements OrderRepository {
    @Override
    public Order save(Order order) {
        return null;
    }

    @Override
    public Order update(Order order) {
        return null;
    }

    @Override
    public List<Order> findByStatus(OrderStatus status) {
        return null;
    }
}
