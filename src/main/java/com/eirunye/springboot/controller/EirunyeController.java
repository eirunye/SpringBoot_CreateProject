package com.eirunye.springboot.controller;

import com.eirunye.springboot.model.EiBean;
import com.eirunye.springboot.model.Result;
import com.eirunye.springboot.service.EirunyeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Author Eirunye
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
     *
     * @return JSON EiBean
     * @throws Exception 出现异常处理
     */
    @GetMapping(value = "/get/bean")//url===>http:localhost:8091/Eirunye/get/bean
    public Result<EiBean> getEiBeanData() throws Exception {

        return eirunyeService.getEiBeanData();
    }

    /**
     * GET请求
     * @param id
     * @return
     * @throws Exception
     */
    @GetMapping(value = "/get/hello/{id}") //url===>http:localhost:8091/Eirunye/get/hello/1
    public Result<EiBean> getEiBeanDataHello(@PathVariable("id") Integer id) throws Exception {
        return eirunyeService.getEiBeanDataHello(id);
    }

    @GetMapping(value = "/get/Params", params = {"name=hello", "age=20"})
//表示限制请求url==>http:localhost:8091/Eirunye/get/Params?name=hello&age=20
    public Result<EiBean> getEiBeanDataParams() {
        return eirunyeService.getEiBeanDataParams();
    }

    /**
     * GET请求
     * @param name
     * @param age
     * @return
     */
    @RequestMapping(value = "/get/Param", method = RequestMethod.GET)
    //url===>http:localhost:8091/Eirunye/get/Param?name=hello&age=12
    public Result<String> getEiBeanDataRequestMethod(@RequestParam("name") String name, @RequestParam("age") int age) {
        return eirunyeService.getEiBeanDataRequestMethod(name, age);
    }

    /**
     *  POST请求
     * @param eiBean
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/save/bean") //url===>http:localhost:8091/Eirunye/save/bean
    public Result<EiBean> saveEiBeanData(@Valid EiBean eiBean) throws Exception {

        return eirunyeService.saveEiBeanData(eiBean);
    }


    /**
     *  PUT请求
     * @param eiBean
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/put/eiBean", method = RequestMethod.PUT)//url===>http:localhost:8091/Eirunye/put/eiBean
    public Result<EiBean> putEiBeanData(@Valid EiBean eiBean) throws Exception{
        return eirunyeService.putEiBeanData(eiBean);
    }


    /**
     * PUT请求
     * @param id 参数id
     * @param name 用户名
     * @param age 年龄
     * @return JSON EiBean
     * @throws Exception
     */
    @PutMapping(value = "/put/Bean/{id}")//url===>http:localhost:8091/Eirunye/put/Bean/1
    public Result<EiBean>putBeanDataParams(@PathVariable("id")Integer id,@RequestParam("name") String name,@RequestParam("age")int age) throws Exception{
        EiBean eiBean = new EiBean();
        eiBean.setName(name);
        eiBean.setAge(age);
        eiBean.setId(id);

        return eirunyeService.putBeanDataParams(eiBean);
    }

    /**
     * DELETE 请求案例
     * @param eiBean 参数EiBean
     * @return JSON EiBean
     * @throws Exception 异常处理
     */
    @RequestMapping(value = "/delete/eiBean", method = RequestMethod.DELETE)//url===>http:localhost:8091/Eirunye/delete/eiBean
    public Result<EiBean> deleteEiBeanData(@Valid EiBean eiBean) throws Exception{
        return eirunyeService.putEiBeanData(eiBean);
    }

    /**
     * DELETE 请求案例
     * @param id id
     * @return JSON EiBean
     * @throws Exception 异常处理
     */
    @DeleteMapping(value = "/delete/Bean/{id}")//url===>http:localhost:8091/Eirunye/delete/Bean/1
    public Result<EiBean> deleteEiBeanDataById(@PathVariable("id")Integer id) throws Exception{
        return eirunyeService.deleteEiBeanDataById(id);
    }

    /**
     * HEAD 请求
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "head/Bean",method = RequestMethod.HEAD)
    public Result<EiBean> headEiBeanData() throws Exception{
        return eirunyeService.headEiBeanData();
    }

    ///....这里就设置常用的案例请求

}
