package com.example.odin.model.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class OdinOrderBookResponse extends OdinBaseResponse {

    @JsonProperty("data")
    private List<OrderData> data = new ArrayList<>(
            List.of(
            new OrderData(
                            "1111","NSE",111,"111","1111","1111","cash","it","limit",100,10,110,100,"100","101","1000",10,"TCS","EQ","STK",
                                    "","100","",10,"20204-06-05","ddd","ddd","ddd",true,"11","1019",new BracketDetails(
                                    "111","11","111","121","125","130","1000","111","pending","D"
    ))
            )
            );

    @JsonProperty("metadata")
    private Metadata metadata = new Metadata(1000000010,1010101010,11111100,909090);

    @Getter
    @Setter
    @AllArgsConstructor
    public class OrderData {
        @JsonProperty("order_id")
        private String orderId;

        @JsonProperty("exchange")
        private String exchange;

        @JsonProperty("scrip_token")
        private int scripToken;

        @JsonProperty("exchange_order_no")
        private String exchangeOrderNo;

        @JsonProperty("status")
        private String status;

        @JsonProperty("error_reason")
        private String errorReason;

        @JsonProperty("transaction_type")
        private String transactionType;

        @JsonProperty("product_type")
        private String productType;

        @JsonProperty("order_type")
        private String orderType;

        @JsonProperty("total_quantity")
        private int totalQuantity;

        @JsonProperty("pending_quantity")
        private int pendingQuantity;

        @JsonProperty("traded_quantity")
        private int tradedQuantity;

        @JsonProperty("disclosed_quantity")
        private int disclosedQuantity;

        @JsonProperty("order_price")
        private String orderPrice;

        @JsonProperty("trigger_price")
        private String triggerPrice;

        @JsonProperty("validity")
        private String validity;

        @JsonProperty("validity_days")
        private int validityDays;

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

        @JsonProperty("market_lot")
        private int marketLot;

        @JsonProperty("order_timestamp")
        private String orderTimestamp;

        @JsonProperty("exchange_timestamp")
        private String exchangeTimestamp;

        @JsonProperty("initiated_by")
        private String initiatedBy;

        @JsonProperty("modified_by")
        private String modifiedBy;

        @JsonProperty("is_amo_order")
        private boolean isAmoOrder;

        @JsonProperty("gateway_order_id")
        private String gatewayOrderId;

        @JsonProperty("order_identifier")
        private String orderIdentifier;

        @JsonProperty("bracket_details")
        private BracketDetails bracketDetails;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public class BracketDetails {
        @JsonProperty("parent_order_id")
        private String parentOrderId;

        @JsonProperty("leg_indicator")
        private String legIndicator;

        @JsonProperty("stoploss_price")
        private String stopLossPrice;

        @JsonProperty("stoploss_trigger_price")
        private String stopLossTriggerPrice;

        @JsonProperty("profit_price")
        private String profitPrice;

        @JsonProperty("stoploss_jump_price")
        private String stopLossJumpPrice;

        @JsonProperty("ltp_jump_price")
        private String ltpJumpPrice;

        @JsonProperty("bo_order_id")
        private String boOrderId;

        @JsonProperty("bo_order_status")
        private String boOrderStatus;

        @JsonProperty("bo_modify_flag")
        private String boModifyFlag;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public class Metadata {
        @JsonProperty("total_records")
        private int totalRecords;

        @JsonProperty("all_records")
        private int allRecords;

        @JsonProperty("completed_records")
        private int completedRecords;

        @JsonProperty("open_records")
        private int openRecords;
    }
}
