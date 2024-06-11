package com.example.odin.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class OdinPositionResponse extends OdinBaseResponse {

    @JsonProperty("data")
    private List<PositionData> data = new ArrayList<>(
            List.of(
                    new PositionData("NSE","NSE",1111L,1111L,"IT","TCS","SO",1,100, 100,1000,100, 1000, "STK", "2024-07-28",
                            500,"CE",100,"1000","10000",0,"0","0",100,"10000","10000","0","0","0","200","100","100","100","daily")
            )
    );

    @Getter
    @Setter
    @AllArgsConstructor
    public static class PositionData {
        @JsonProperty("exchange")
        private String exchange;
        @JsonProperty("preferred_exchange")
        private String preferredExchange;
        @JsonProperty("scrip_token")
        private Long scripToken;
        @JsonProperty("preferred_scrip_token")
        private Long preferredScripToken;
        @JsonProperty("product_type")
        private String productType;
        @JsonProperty("symbol")
        private String symbol;
        @JsonProperty("series")
        private String series;
        @JsonProperty("market_lot")
        private int marketLot;
        @JsonProperty("gen_num")
        private int genNum;
        @JsonProperty("gen_den")
        private int genDen;
        @JsonProperty("price_num")
        private int priceNum;
        @JsonProperty("price_den")
        private int priceDen;
        @JsonProperty("reference_rate")
        private int referenceRate;
        @JsonProperty("instrument")
        private String instrument;
        @JsonProperty("expiry_date")
        private String expiryDate;
        @JsonProperty("strike_price")
        private int strikePrice;
        @JsonProperty("option_type")
        private String optionType;
        @JsonProperty("buy_quantity")
        private int buyQuantity;
        @JsonProperty("avg_buy_price")
        private String avgBuyPrice;
        @JsonProperty("buy_value")
        private String buyValue;
        @JsonProperty("sell_quantity")
        private int sellQuantity;
        @JsonProperty("avg_sell_price")
        private String avgSellPrice;
        @JsonProperty("sell_value")
        private String sellValue;
        @JsonProperty("net_quantity")
        private int netQuantity;
        @JsonProperty("net_price")
        private String netPrice;
        @JsonProperty("net_value")
        private String netValue;
        @JsonProperty("cf_buy_value")
        private String cfBuyValue;
        @JsonProperty("cf_sell_value")
        private String cfSellValue;
        @JsonProperty("cf_net_price")
        private String cfNetPrice;
        @JsonProperty("ltp")
        private String ltp;
        @JsonProperty("close_price")
        private String closePrice;
        @JsonProperty("multiplier")
        private String multiplier;
        @JsonProperty("mtm")
        private String mtm;
        @JsonProperty("daily_or_expiry")
        private String dailyOrExpiry;
    }
}
