package com.example.odin.controller;


import com.example.odin.model.response.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OdinController {
    //done
    @GetMapping("/transactional/v1/portfolio/holdings")
    public OdinHoldingResponse getHoldings(){
        return new OdinHoldingResponse();
    }

    //done
    @PutMapping("/transactional/v1/portfolio/positions")
    public OdinBaseResponse doConvertPosition(){
        return new OdinBaseResponse();
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

    @DeleteMapping("/transactional/v1/orders/bracket/{exchange}/{order_id}")
    public OdinExitBracketOrderResponse exitBracketOrder(){
        return new OdinExitBracketOrderResponse();
    }
}
