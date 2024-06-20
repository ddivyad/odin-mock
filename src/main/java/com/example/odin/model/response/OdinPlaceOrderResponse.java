package com.example.odin.model.response;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class OdinPlaceOrderResponse {
    private String orderId;

}