package ru.council.test.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class DcCatalog {
    private LocalDateTime lastUpdate;
    private DeliveryService deliveryService;
}
