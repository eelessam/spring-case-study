package org.example.casestudy;


import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
class OrderService {

    private final OrderRepository repo;


    public Order addNewOrder(Order order) {
        return repo.save(order);
    }

    public Order updateOrderStatus(Order order) {
        if (order.getStatus() == OrderStatus.DELIVERED) {
            order.setTimeDelivered(LocalDateTime.now());
        }
        return repo.update(order);
    }

    public List<Order> findOrdersByStatus(OrderStatus status) {
        return repo.findByStatus(status);
    }
}
