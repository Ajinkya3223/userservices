package com.example.userservice.User_microservice.exceptions;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiResponseMsg {
    private String message;
    private boolean success;
    private HttpStatus status;
}
