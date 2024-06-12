package com.example.odin.controller;


import com.example.odin.model.response.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OdinController {
    //done
    @GetMapping("/transactional/v1/portfolio/holdings")
    public OdinHoldingResponse getHoldings(){
        return new OdinHoldingResponse();
    }

    //done
    @PutMapping("/transactional/v1/portfolio/positions")
    public OdinBasesResponse doConvertPosition(){
        return new OdinBasesResponse();
    }

    //done
    @GetMapping("/transactional/v1/portfolio/positions/{type}")
    public OdinPositionResponse positionBook(){
        return new OdinPositionResponse();
    }

    //done
    @GetMapping("/transactional/v1/trades")
    public OdinTradeBookResponse tradeBook(){
        return new OdinTradeBookResponse();
    }

    //done
    @GetMapping("/transactional/v1/orders/{order_id}")
    public OdinOrderHistoryResponse orderHistory(){
        return new OdinOrderHistoryResponse();
    }

    //done
    @GetMapping("/transactional/v1/orders")
    public OdinOrderBookResponse orderBook(){
        return new OdinOrderBookResponse();
    }

    //done
    @DeleteMapping("/transactional/v1/orders/bracket/{exchange}/{order_id}")
    public OdinExitBracketOrderResponse exitBracketOrder(){
        return new OdinExitBracketOrderResponse();
    }

    //done
    @PostMapping("/transactional/v1/orders/regular")
    public ResponseEntity<OdinBaseResponse> placeOrder(@RequestBody OdinPlaceOrderRequest request) {
        return new ResponseEntity<>(OdinBaseResponse.builder()
                .status("success")
                .code("s-101")
                .message("Order Entry Sent to OMS")
                .data(OdinPlaceOrderResponse.builder().orderId("NWSYF00005>3").build())
                .build(), HttpStatus.OK);
    }

    //done
    @DeleteMapping("/transactional/v1/orders/regular/{exchange}/{order_id}")
    public ResponseEntity<OdinBaseResponse> cancelOrder(@PathVariable String exchange, @PathVariable String order_id) {
        return new ResponseEntity<>(OdinBaseResponse.builder()
                .status("success")
                .code("s-101")
                .message("Order Cancellation Sent to OMS")
                .data(OdinCancelOrderResponse.builder().orderId("NWSYF00005>3").build())
                .build(), HttpStatus.OK);
    }

    //done
    @PutMapping("/transactional/v1/orders/regular/{exchange}/{order_id}")
    public ResponseEntity<OdinBaseResponse> modifyOrder(@RequestBody OdinModifyOrderRequest request, @PathVariable String exchange, @PathVariable String order_id) {
        return new ResponseEntity<>(OdinBaseResponse.builder()
                .status("success")
                .code("s-101")
                .message("Order Modification Sent to OMS")
                .data(OdinModifyOrderResponse.builder().orderId("NWSYF00005>3").build())
                .build(), HttpStatus.OK);
    }

    //done
    @PostMapping("/transactional/v1/orders/bracket")
    public ResponseEntity<OdinBaseResponse> placeBracketOrder(@RequestBody OdinPlaceBracketOrderRequest request) {
        return new ResponseEntity<>(OdinBaseResponse.builder()
                .status("success")
                .code("s-101")
                .message("Order Entry Sent to OMS")
                .data(OdinPlaceBracketOrderResponse.builder().orderId("NWSYF00005>3").build())
                .build(), HttpStatus.OK);
    }

    @PostMapping("/authentication/v1/user/session")
    public ResponseEntity<OdinBaseResponse> login(@RequestBody OdinLoginRequest request) {
        return new ResponseEntity<>(
                OdinBaseResponse.builder()
                        .status("success")
                        .code("s-101")
                        .message("User logged in Successfully.")
                        .data(OdinLoginResponse.builder()
                                .registerToken("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJDdXN0b21lcklkIjoiMTQwNCIsInVzZXJJZCI6IkFQSVRFU1QiLCJncm91cElkIjoiSE8iLCJ1ZGlkIjoiYTFiMjNjZDRlNWY2Zzc4aCIsInNvdXJjZSI6Ik1PQklMRUFQSSIsIm9jVG9rZW4iOiIweDAxNDUzOTg0RDlCMzdEQTAyNzVGRDhCOERGM0ZCMiIsImV4cCI6MTY2MzY4NjAyMSwiaWF0IjoxNjYzNjg1MTIxfQ.kNSl7ZNuNetTg0qhcnk24jMGm193P_M8WQtE4kOPnDQ")
                                .ptnType("TOTP_OPT")
                                .mpinEnabled(true)
                                .fingerprintEnabled(true)
                                .totpEnabled(false)
                                .build()
                        )
                        .build(),
                HttpStatus.OK
        );
    }
}
