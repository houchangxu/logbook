package com.logbook.common.exception;

import com.logbook.constants.ErrorCodeEnum;

public class RequestException extends BaseException{

    private ErrorCodeEnum errorCodeEnum;
    public RequestException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getCode(), errorCodeEnum.getMsg());
    }
}
