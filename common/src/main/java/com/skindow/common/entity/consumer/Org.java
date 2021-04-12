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

/**
    * 组织架构表
    */
@ApiModel(value="com-skindow-common-entity-Org")
@Data
@TableName(value = "orange.org")
public class Org implements Serializable {
    /**
     * 组织编码
     */
    @TableId(value = "code", type = IdType.INPUT)
    @ApiModelProperty(value="组织编码")
    private String code;

    /**
     * 上级组织编码
     */
    @TableField(value = "father_code")
    @ApiModelProperty(value="上级组织编码")
    private String fatherCode;

    /**
     * hr系统code
     */
    @TableField(value = "hr_code")
    @ApiModelProperty(value="hr系统code")
    private String hrCode;

    /**
     * 组织名称
     */
    @TableField(value = "name")
    @ApiModelProperty(value="组织名称")
    private String name;

    /**
     * 更新日期
     */
    @TableField(value = "ts")
    @ApiModelProperty(value="更新日期")
    private Date ts;

    /**
     * 组织状态
     */
    @TableField(value = "enable_state")
    @ApiModelProperty(value="组织状态")
    private String enableState;

    /**
     * 组织全称
     */
    @TableField(value = "dept_info")
    @ApiModelProperty(value="组织全称")
    private String deptInfo;

    /**
     * 组织分类
     */
    @TableField(value = "org_type")
    @ApiModelProperty(value="组织分类")
    private String orgType;

    /**
     * 部门分类
     */
    @TableField(value = "dept_type")
    @ApiModelProperty(value="部门分类")
    private String deptType;

    /**
     * 部门等级
     */
    @TableField(value = "dept_level")
    @ApiModelProperty(value="部门等级")
    private String deptLevel;

    /**
     * 部门负责人
     */
    @TableField(value = "principal")
    @ApiModelProperty(value="部门负责人")
    private String principal;

    /**
     * 助记码
     */
    @TableField(value = "mne_code")
    @ApiModelProperty(value="助记码")
    private String mneCode;

    /**
     * 简称
     */
    @TableField(value = "short_name")
    @ApiModelProperty(value="简称")
    private String shortName;

    /**
     * 所属公司
     */
    @TableField(value = "ssgs")
    @ApiModelProperty(value="所属公司")
    private String ssgs;

    /**
     * 级别 从0 开始
     */
    @TableField(value = "level")
    @ApiModelProperty(value="级别 从0 开始")
    private Integer level;

    /**
     * 部门等级
     */
    @TableField(value = "new_dept_level")
    @ApiModelProperty(value="部门等级")
    private Integer newDeptLevel;

    /**
     * 创建人
     */
    @TableField(value = "create_id")
    @ApiModelProperty(value="创建人")
    private String createId;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 更新人
     */
    @TableField(value = "update_id")
    @ApiModelProperty(value="更新人")
    private String updateId;

    /**
     * 更新日期
     */
    @TableField(value = "update_time")
    @ApiModelProperty(value="更新日期")
    private Date updateTime;

    /**
     * 状态
     */
    @TableField(value = "record_status")
    @ApiModelProperty(value="状态")
    private Byte recordStatus;

    private static final long serialVersionUID = 1L;
}