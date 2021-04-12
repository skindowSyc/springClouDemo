package com.skindow.common.entity.consumer;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * 预计到期客户表
    */
@ApiModel(value="com-skindow-common-entity-BdsExpectedDueCustomer")
@Data
@TableName(value = "orange.bds_expected_due_customer")
public class BdsExpectedDueCustomer implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 数据日期
     */
    @TableField(value = "data_date")
    @ApiModelProperty(value="数据日期")
    private Date dataDate;

    /**
     * 统一客户编号
     */
    @TableField(value = "customer_no")
    @ApiModelProperty(value="统一客户编号")
    private Long customerNo;

    /**
     * 客户姓名
     */
    @TableField(value = "cust_name")
    @ApiModelProperty(value="客户姓名")
    private String custName;

    /**
     * 客户类型
     */
    @TableField(value = "cust_type")
    @ApiModelProperty(value="客户类型")
    private String custType;

    /**
     * 到期金额(万元)
     */
    @TableField(value = "maturity_amount")
    @ApiModelProperty(value="到期金额(万元)")
    private BigDecimal maturityAmount;

    /**
     * 到账确认日期
     */
    @TableField(value = "confirm_date_time")
    @ApiModelProperty(value="到账确认日期")
    private Date confirmDateTime;

    /**
     * 项目编号
     */
    @TableField(value = "project_code")
    @ApiModelProperty(value="项目编号")
    private String projectCode;

    /**
     * 项目名称
     */
    @TableField(value = "project_name")
    @ApiModelProperty(value="项目名称")
    private String projectName;

    /**
     * 项目投资方向：债权投资；证券投资；股权投资；海外投资；其他
     */
    @TableField(value = "invest_direction")
    @ApiModelProperty(value="项目投资方向：债权投资；证券投资；股权投资；海外投资；其他")
    private String investDirection;

    /**
     * 项目成立时间
     */
    @TableField(value = "project_establish_date")
    @ApiModelProperty(value="项目成立时间")
    private Date projectEstablishDate;

    /**
     * 到期日
     */
    @TableField(value = "project_end_date")
    @ApiModelProperty(value="到期日")
    private Date projectEndDate;

    /**
     * 成交理顾工号
     */
    @TableField(value = "employee_code")
    @ApiModelProperty(value="成交理顾工号")
    private String employeeCode;

    /**
     * 成交理顾姓名
     */
    @TableField(value = "employee_name")
    @ApiModelProperty(value="成交理顾姓名")
    private String employeeName;

    /**
     * 理顾在职状态（在职/离职）
     */
    @TableField(value = "enable_state")
    @ApiModelProperty(value="理顾在职状态（在职/离职）")
    private String enableState;

    /**
     * 在职理顾工号
     */
    @TableField(value = "employee_code_onjob")
    @ApiModelProperty(value="在职理顾工号")
    private String employeeCodeOnjob;

    /**
     * 在职理顾姓名
     */
    @TableField(value = "employee_name_onjob")
    @ApiModelProperty(value="在职理顾姓名")
    private String employeeNameOnjob;

    /**
     * 事业群
     */
    @TableField(value = "acc_level1_dept_name")
    @ApiModelProperty(value="事业群")
    private String accLevel1DeptName;

    /**
     * 事业部
     */
    @TableField(value = "acc_level2_dept_name")
    @ApiModelProperty(value="事业部")
    private String accLevel2DeptName;

    /**
     * 营业部
     */
    @TableField(value = "acc_level3_dept_name")
    @ApiModelProperty(value="营业部")
    private String accLevel3DeptName;

    /**
     * 部门所在城市
     */
    @TableField(value = "acc_dept_city")
    @ApiModelProperty(value="部门所在城市")
    private String accDeptCity;

    /**
     * 数据来源
     */
    @TableField(value = "data_source")
    @ApiModelProperty(value="数据来源")
    private String dataSource;

    /**
     * 创建日期
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建日期")
    private Date createTime;

    /**
     * 更新日期
     */
    @TableField(value = "update_time")
    @ApiModelProperty(value="更新日期")
    private Date updateTime;

    /**
     * 数据是否有效  0无效 1有效
     */
    @TableField(value = "record_status")
    @ApiModelProperty(value="数据是否有效  0无效 1有效")
    private Byte recordStatus;

    private static final long serialVersionUID = 1L;
}