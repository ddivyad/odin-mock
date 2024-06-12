package com.example.odin.model.response;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonPropertyOrder({"status", "code", "message"})
public class OdinBasesResponse {
    private String status = "success";
    private String code = "200";
    private String message = "Success";
}