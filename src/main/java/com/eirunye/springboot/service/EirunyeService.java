package com.eirunye.springboot.service;

import com.eirunye.springboot.enums.ResultEnum;
import com.eirunye.springboot.exception.EirunyeException;
import com.eirunye.springboot.model.EiBean;
import com.eirunye.springboot.model.Result;
import com.eirunye.springboot.utils.ResultUtil;
import org.springframework.stereotype.Service;

/**
 * Author Eirunye
 * Created by on 2018/8/24.
 * Describe EirunyeService 处理逻辑在这里，例如；操作数据库，网络请求等等
 */
@Service  //@Service 用于标注业务层组件：将当前类注册为Spring的Bean
public class EirunyeService {

    /**
     * @return Result<EiBean>
     * @throws EirunyeException 异常处理
     */
    public Result<EiBean> getEiBeanData() throws EirunyeException{
        EiBean eiBean = new EiBean();
        eiBean.setName("Eirunye");
        eiBean.setAge(19);
        eiBean.setHobby("Java Spring Boot");
        return ResultUtil.globalInfo(ResultEnum.SUCCESS,eiBean);
    }
}
