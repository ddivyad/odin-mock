package com.example.odin.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class OdinTradeBookResponse extends OdinBasesResponse {

    @JsonProperty("data")
    private List<OrderData> data = new ArrayList<>(
            List.of(
                    new OrderData("111","NSE",111,"111","1111","cash","it","limit",100,"1000","TCS","EQ","STK","2028-04-10","100","","2024-06-05","dddd","dddd","xxx")
            )
    );

    @JsonProperty("metadata")
    private Metadata metadata = new Metadata(10000000);

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class OrderData {
        @JsonProperty("order_id")
        private String orderId;

        @JsonProperty("exchange")
        private String exchange;

        @JsonProperty("scrip_token")
        private int scripToken;

        @JsonProperty("trade_no")
        private String tradeNo;

        @JsonProperty("exchange_order_no")
        private String exchangeOrderNo;

        @JsonProperty("transaction_type")
        private String transactionType;

        @JsonProperty("product_type")
        private String productType;

        @JsonProperty("order_type")
        private String orderType;

        @JsonProperty("trade_quantity")
        private int tradeQuantity;

        @JsonProperty("trade_price")
        private String tradePrice;

        @JsonProperty("symbol")
        private String symbol;

        @JsonProperty("series")
        private String series;

        @JsonProperty("instrument")
        private String instrument;

        @JsonProperty("expiry_date")
        private String expiryDate;

        @JsonProperty("strike_price")
        private String strikePrice;

        @JsonProperty("option_type")
        private String optionType;

        @JsonProperty("trade_timestamp")
        private String tradeTimestamp;

        @JsonProperty("initiated_by")
        private String initiatedBy;

        @JsonProperty("modified_by")
        private String modifiedBy;

        @JsonProperty("order_identifier")
        private String orderIdentifier;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public class Metadata {
        @JsonProperty("total_records")
        private int totalRecords;
    }
}
