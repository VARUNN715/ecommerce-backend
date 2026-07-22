package com.company.ecommerce.common.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
public class ApiResponse<T> {

    private boolean success;
    private String message;
    private T data;

    public ApiResponse(){
    }

    public ApiResponse(boolean success, String message, T data, LocalDateTime timestamp) {
        this.success = success;
        this.message = message;
        this.data = data;
    }


}
