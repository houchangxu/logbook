package com.logbook.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> {

    private T data;

    private Integer errorCode;

    private String errorMessage;

    public Response(T data) {
        this.data = data;
    }

    public static <T> Response ofSuccess(T data){
        return new Response(data);
    }

    public static <T> Response ofFailure(Integer errorCode, String errorMessage){
        return new Response(null,errorCode,errorMessage);
    }
}
