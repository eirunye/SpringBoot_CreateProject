package com.eirunye.springboot.handle;

import com.eirunye.springboot.exception.EirunyeException;
import com.eirunye.springboot.model.Result;
import com.eirunye.springboot.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author Eirunye
 * Created by on 2018/8/24.
 * Describe EirunyeHandle 处理异常
 */
@ControllerAdvice
public class EirunyeHandle {

    private final static Logger logger = LoggerFactory.getLogger(EirunyeHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if (e instanceof EirunyeException){
            EirunyeException eirunyeException = (EirunyeException) e;
            return ResultUtil.error(eirunyeException.getCode(),eirunyeException.getMessage());
        } else {
            logger.error("系统异常{}",e);
            return ResultUtil.error(-1,"UN KNOW ERROR");
        }


    }
}
