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
    public Result<EiBean> getEiBeanData() throws EirunyeException {
        EiBean eiBean = new EiBean();
        eiBean.setName("Eirunye");
        eiBean.setAge(19);
        eiBean.setHobby("Java Spring Boot");
        return ResultUtil.globalInfo(ResultEnum.SUCCESS, eiBean);
    }

    /**
     * 插入数据
     *
     * @param eiBean 实体
     * @return JSON 实体
     */
    public Result<EiBean> saveEiBeanData(EiBean eiBean) throws Exception {
        if (eiBean == null) throw new EirunyeException(ResultEnum.UNKNOWN_ERROR);
        //JPA插入数据
        return ResultUtil.globalInfo(ResultEnum.SUCCESS, eiBean);
    }

    public Result<EiBean> putEiBeanData(EiBean eiBean) throws Exception {
        if (eiBean == null) throw new EirunyeException(ResultEnum.UNKNOWN_ERROR);
        //Put操作
        return ResultUtil.globalInfo(ResultEnum.SUCCESS, eiBean);
    }

    public Result<EiBean> getEiBeanDataHello(Integer id) {
        if (id == null) throw new EirunyeException(ResultEnum.UNKNOWN_ERROR);
        EiBean eiBean = new EiBean();
        eiBean.setId(1);
        eiBean.setName("eirunye");
        eiBean.setAge(1);
        eiBean.setHobby("Spring Boot");
        return ResultUtil.globalInfo(ResultEnum.SUCCESS, eiBean);
    }

    public Result<EiBean> getEiBeanDataParams() {
        EiBean eiBean = new EiBean();
        eiBean.setId(2);
        eiBean.setName("eirunye1");
        eiBean.setAge(2);
        eiBean.setHobby("Spring Boot");
        return ResultUtil.globalInfo(ResultEnum.SUCCESS, eiBean);
    }

    public Result<String> getEiBeanDataRequestMethod(String name, int age) {
        EiBean eiBean = new EiBean();
        eiBean.setId(2);
        eiBean.setName(name);
        eiBean.setAge(age);
        eiBean.setHobby("Spring");
        return ResultUtil.globalInfo(ResultEnum.SUCCESS, eiBean);
    }

    public Result<EiBean> putBeanDataParams(EiBean eiBean) {
        if (eiBean == null) throw new EirunyeException(ResultEnum.UNKNOWN_ERROR);
        //JPA插入数据
        return ResultUtil.globalInfo(ResultEnum.SUCCESS, eiBean);
    }

    public Result<EiBean> deleteEiBeanDataById(Integer id) {
        EiBean eiBean = new EiBean();
        eiBean.setId(3);
        eiBean.setName("xiaoming");
        eiBean.setAge(3);
        eiBean.setHobby("Spring");
        return ResultUtil.globalInfo(ResultEnum.SUCCESS, eiBean);
    }

    public Result<EiBean> headEiBeanData() {
        EiBean eiBean = new EiBean();
        eiBean.setId(4);
        eiBean.setName("xiaoming1");
        eiBean.setAge(4);
        eiBean.setHobby("SpringMVC");
        return ResultUtil.globalInfo(ResultEnum.SUCCESS, eiBean);
    }
}
