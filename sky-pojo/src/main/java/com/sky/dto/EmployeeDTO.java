package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel("添加员工时传递的数据模型")
public class EmployeeDTO implements Serializable {
    @ApiModelProperty("员工id")
    private Long id;

    @ApiModelProperty("昵称")
    private String username;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("电话")
    private String phone;

    @ApiModelProperty("性别")
    private String sex;

    @ApiModelProperty("身份证")
    private String idNumber;

}
