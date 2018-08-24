package com.eirunye.springboot.exception;


import com.eirunye.springboot.enums.ResultEnum;

/**
 * Author Eirunye
 * Created by on 2018/8/24.
 * Describe ResultEnum
 */
public class EirunyeException extends RuntimeException {

    private Integer code;

    public EirunyeException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
