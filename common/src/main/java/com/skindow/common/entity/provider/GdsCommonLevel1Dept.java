package com.skindow.common.entity.provider;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
    * 事业群维度共性指标表
    */
@ApiModel(value="com-skindow-common-entity-GdsCommonLevel1Dept")
@Data
@TableName(value = "orange.gds_common_level1_dept")
public class GdsCommonLevel1Dept implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 数据更新日期
     */
    @TableField(value = "data_date")
    @ApiModelProperty(value="数据更新日期")
    private Date dataDate;

    /**
     * 到期年月
     */
    @TableField(value = "maturity_month")
    @ApiModelProperty(value="到期年月")
    private Date maturityMonth;

    /**
     * 事业群
     */
    @TableField(value = "acc_level1_dept_name")
    @ApiModelProperty(value="事业群")
    private String accLevel1DeptName;

    /**
     * 到期客户数
     */
    @TableField(value = "maturity_cust_discount")
    @ApiModelProperty(value="到期客户数")
    private Long maturityCustDiscount;

    /**
     * 续签客户数
     */
    @TableField(value = "renew_cust_discount")
    @ApiModelProperty(value="续签客户数")
    private Long renewCustDiscount;

    /**
     * 客户续签率
     */
    @TableField(value = "cust_rate")
    @ApiModelProperty(value="客户续签率")
    private Long custRate;

    /**
     * 到期金额（万）
     */
    @TableField(value = "maturity_amount_sum")
    @ApiModelProperty(value="到期金额（万）")
    private Long maturityAmountSum;

    /**
     * 续签金额（万）
     */
    @TableField(value = "renew_amount_sum")
    @ApiModelProperty(value="续签金额（万）")
    private Long renewAmountSum;

    /**
     * 金额续签率
     */
    @TableField(value = "amount_rate")
    @ApiModelProperty(value="金额续签率")
    private Long amountRate;

    /**
     * 个人到期客户数
     */
    @TableField(value = "per_maturity_cust_discount")
    @ApiModelProperty(value="个人到期客户数")
    private Long perMaturityCustDiscount;

    /**
     * 个人续签客户数
     */
    @TableField(value = "per_renew_cust_discount")
    @ApiModelProperty(value="个人续签客户数")
    private Long perRenewCustDiscount;

    /**
     * 个人客户续签率
     */
    @TableField(value = "per_cust_rate")
    @ApiModelProperty(value="个人客户续签率")
    private Long perCustRate;

    /**
     * 个人到期金额（万）
     */
    @TableField(value = "per_maturity_cust_sum")
    @ApiModelProperty(value="个人到期金额（万）")
    private Long perMaturityCustSum;

    /**
     * 个人续签金额（万）
     */
    @TableField(value = "per_renew_cust_dis_sum")
    @ApiModelProperty(value="个人续签金额（万）")
    private Long perRenewCustDisSum;

    /**
     * 个人金额续签率
     */
    @TableField(value = "per_amount_rate")
    @ApiModelProperty(value="个人金额续签率")
    private Long perAmountRate;

    /**
     * 机构到期客户数
     */
    @TableField(value = "company_maturity_cust_discount")
    @ApiModelProperty(value="机构到期客户数")
    private Long companyMaturityCustDiscount;

    /**
     * 机构续签客户数
     */
    @TableField(value = "company_renew_cust_discount")
    @ApiModelProperty(value="机构续签客户数")
    private Long companyRenewCustDiscount;

    /**
     * 机构客户续签率
     */
    @TableField(value = "company_cust_rate")
    @ApiModelProperty(value="机构客户续签率")
    private Long companyCustRate;

    /**
     * 机构到期金额（万）
     */
    @TableField(value = "company_maturity_amount_sum")
    @ApiModelProperty(value="机构到期金额（万）")
    private Long companyMaturityAmountSum;

    /**
     * 机构续签金额（万）
     */
    @TableField(value = "company_renew_amount_sum")
    @ApiModelProperty(value="机构续签金额（万）")
    private Long companyRenewAmountSum;

    /**
     * 机构金额续签率
     */
    @TableField(value = "company_amount_rate")
    @ApiModelProperty(value="机构金额续签率")
    private Long companyAmountRate;

    /**
     * 产品到期客户数
     */
    @TableField(value = "product_maturity_cust_discount")
    @ApiModelProperty(value="产品到期客户数")
    private Long productMaturityCustDiscount;

    /**
     * 产品续签客户数
     */
    @TableField(value = "product_renew_cust_discount")
    @ApiModelProperty(value="产品续签客户数")
    private Long productRenewCustDiscount;

    /**
     * 产品客户续签率
     */
    @TableField(value = "product_cust_rate")
    @ApiModelProperty(value="产品客户续签率")
    private Long productCustRate;

    /**
     * 产品到期金额（万）
     */
    @TableField(value = "product_maturity_amount_sum")
    @ApiModelProperty(value="产品到期金额（万）")
    private Long productMaturityAmountSum;

    /**
     * 产品续签金额（万）
     */
    @TableField(value = "product_renew_amount_sum")
    @ApiModelProperty(value="产品续签金额（万）")
    private Long productRenewAmountSum;

    /**
     * 产品金额续签率
     */
    @TableField(value = "product_amount_rate")
    @ApiModelProperty(value="产品金额续签率")
    private Long productAmountRate;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    @ApiModelProperty(value="更新时间")
    private Date updateTime;

    /**
     * 数据是否有效  0无效 1有效
     */
    @TableField(value = "record_status")
    @ApiModelProperty(value="数据是否有效  0无效 1有效")
    private Byte recordStatus;

    private static final long serialVersionUID = 1L;
}