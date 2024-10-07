package com.example.state.demo.request_response;
import lombok.Builder;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StateResponse {
    private String id;
    private String name;
    private String code;
}