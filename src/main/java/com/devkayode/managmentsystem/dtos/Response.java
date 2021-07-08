package com.devkayode.managmentsystem.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by oluwatobi ogunwuyi on 05/07/2021.
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response {

    private String code;
    private String message;
    private Object result;

}
