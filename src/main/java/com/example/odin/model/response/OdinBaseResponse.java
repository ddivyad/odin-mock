package com.example.odin.model.response;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
@Getter
@Setter
@Builder
@JsonPropertyOrder({"status", "code", "message","data"})
public class OdinBaseResponse {
    private String status;
    private String code;
    private String message;
    private Object data;
}