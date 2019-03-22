package com.sunyard.demo_swagger.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Company: sunyard
 * @Author: Ouqiang
 * @CreateTime: 2018/12/19 15:27
 * @Description:
 */
@ApiModel(value = "User")
public class User {
    @ApiModelProperty(value = "username")
    private String usesrName;
    private String password;

    public String getUsesrName() {
        return usesrName;
    }

    public void setUsesrName(String usesrName) {
        this.usesrName = usesrName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
