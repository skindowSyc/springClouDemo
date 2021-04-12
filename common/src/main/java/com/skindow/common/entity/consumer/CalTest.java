package com.skindow.common.entity.consumer;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-skindow-entity-CalTest")
@Data
@TableName(value = "cal_test")
public class CalTest implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "name")
    @ApiModelProperty(value = "")
    private String name;

    @TableField(value = "c_type")
    @ApiModelProperty(value = "")
    private Byte cType;

    @TableField(value = "c_value")
    @ApiModelProperty(value = "")
    private Long cValue;

    @TableField(value = "create_time")
    @ApiModelProperty(value = "")
    private Date createTime;

    private static final long serialVersionUID = 1L;
}