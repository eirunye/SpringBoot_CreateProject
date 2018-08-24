package com.eirunye.springboot.utils;


import com.eirunye.springboot.enums.ResultEnum;
import com.eirunye.springboot.model.Result;

/**
 * Author Eirunye
 * Created by on 2018/8/24.
 * Describe ResultUtil 返回结果封装
 */
public class ResultUtil {

    public static Result globalInfo(ResultEnum resultEnum, Object object) {
        Result result = new Result();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMsg());
        result.setData(object);
        return result;
    }

    public static  Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);

        return result;
    }

}
