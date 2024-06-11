package com.example.odin.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class OdinHoldingResponse extends OdinBaseResponse {
    @JsonProperty("data")
    private List<HoldingData> data = new ArrayList<>(
            List.of(
            new HoldingData("IDIN0923j374N",new ArrayList<>(
                    List.of(
                            new SecurityInfo("NSE","111","TCS"),
                            new SecurityInfo("NSE","222","WIPRO")
                    )
            ), 1000,100,1000,100,"290","200","22","290","2000","200",200,"40000"
                        )));

    @Getter
    @Setter
    @AllArgsConstructor
    public static class HoldingData {
        @JsonProperty("isin")
        private String isin ;
        @JsonProperty("security_info")
        private List<SecurityInfo> securityInfo;
        @JsonProperty("total_free")
        private int totalFree ;
        @JsonProperty("dp_free")
        private int dpFree;
        @JsonProperty("pool_free")
        private int poolFree;
        @JsonProperty("t1_quantity")
        private int t1Quantity;
        @JsonProperty("average_price")
        private String averagePrice;
        @JsonProperty("last_price")
        private String lastPrice;
        @JsonProperty("pnl")
        private String pnl;
        @JsonProperty("current_value")
        private String currentValue;
        @JsonProperty("inv_value")
        private String investedValue;
        @JsonProperty("product")
        private String product ;
        @JsonProperty("collateral_quantity")
        private int collateralQuantity;
        @JsonProperty("collateral_value")
        private String collateralValue;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public static class SecurityInfo {
        @JsonProperty("exchange")
        private String exchange;
        @JsonProperty("scrip_token")
        private String scripToken;
        @JsonProperty("symbol")
        private String symbol;
    }
}