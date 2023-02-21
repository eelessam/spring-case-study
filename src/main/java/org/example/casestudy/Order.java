package org.example.casestudy;

import java.time.LocalDateTime;
import java.util.List;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
class Order {

    long orderNumber;
    int tableNumber;
    List<String> meals;
    OrderStatus status;
    LocalDateTime timeTaken;
    LocalDateTime timeDelivered;
}
