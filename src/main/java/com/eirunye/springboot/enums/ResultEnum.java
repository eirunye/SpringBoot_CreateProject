package com.eirunye.springboot.enums;

/**
 * Author Eirunye
 * Created by on 2018/8/24.
 * Describe ResultEnum
 */
public enum ResultEnum {

    UNKNOWN_ERROR(-1, "UNKNOW ERROR"),//返回失败
    SUCCESS(0, "SUCEESSS"), ///返回成功
    ;


    private Integer code; //返回码 0表示成功，1表示失败，-1未知错误
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
