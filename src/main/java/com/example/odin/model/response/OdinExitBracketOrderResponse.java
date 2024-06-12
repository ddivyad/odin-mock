package com.example.odin.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OdinExitBracketOrderResponse extends OdinBasesResponse {
    private ExitBracketOrderData data = new ExitBracketOrderData("11110");

    @Getter
    @Setter
    @AllArgsConstructor
    public class ExitBracketOrderData {
        private String orderId;
    }
}
