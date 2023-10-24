package com.turkcell.orderservice.dtos.requests;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateOrderRequest {
    private String inventoryCode;
    private Integer amount;
}
