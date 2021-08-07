package com.logbook.constants;

import lombok.Getter;

@Getter
public enum ErrorCodeEnum {

    FILE_UPLOAD_FAIL(20000,"图片上传失败"),
    FILE_CANNOT_OVER_SIZE_10M(20001,"上传图片大小不能超过10M！");

    private Integer code;
    private String msg;

    ErrorCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
