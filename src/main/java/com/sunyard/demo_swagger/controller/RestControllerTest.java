package com.sunyard.demo_swagger.controller;

import com.sunyard.demo_swagger.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;


/**
 * @Company: sunyard
 * @Author: Ouqiang
 * @CreateTime: 2018/12/19 9:44
 * @Description: swagger测试
 */
@Api(value="test", tags="测试接口模块")
@RestController
public class RestControllerTest {
    private static User user =new User();
    static {
        user.setUsesrName("雨花");
        user.setPassword("321412");
    }
    @ApiOperation(value = "接口说明",notes = "接口使用及实现说明")
//    @ApiImplicitParam(name = "param", value = "请求Param", dataType = "String")
    @GetMapping(value = "/hello/{pwd}")
    public Object hello(@PathVariable(value = "pwd") String param){
        user.setPassword(param);
        return user;

    }
    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @RequestMapping(value = "user", method = RequestMethod.POST)
    public Object add (@RequestBody User user){
        return user;
    }
}
