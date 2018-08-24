package com.eirunye.springboot.controller;

import com.eirunye.springboot.exception.EirunyeException;
import com.eirunye.springboot.model.EiBean;
import com.eirunye.springboot.model.Result;
import com.eirunye.springboot.service.EirunyeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author YRG
 * Created by on 2018/8/24.
 * Describe EirunyeController
 */

@RestController
@RequestMapping("/Eirunye") //设置请求的父级标签URI
public class EirunyeController {

    @Autowired
    EirunyeService eirunyeService;

    /**
     * 访问返回数据
     * @return Result<EiBean>
     * @throws Exception 出现异常处理
     */
    @GetMapping(value = "/bean")
    public Result<EiBean> getEiBeanData() throws Exception {

        return eirunyeService.getEiBeanData();
    }

}
