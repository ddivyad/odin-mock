package com.example.odin.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class OdinModifyOrderResponse {
    private String orderId;
}