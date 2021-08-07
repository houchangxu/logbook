package com.logbook.common.exception;

import lombok.Getter;

@Getter
public class BaseException extends RuntimeException{
    private final Integer errorCode;

    public BaseException(Integer code,String errorMsg){
        super(errorMsg);
        this.errorCode = code;
    }
}
