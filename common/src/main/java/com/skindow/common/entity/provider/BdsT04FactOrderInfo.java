package com.skindow.common.entity.provider;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
    * 公共交易事实表
    */
@ApiModel(value="com-skindow-common-entity-BdsT04FactOrderInfo")
@Data
@TableName(value = "orange.bds_t04_fact_order_Info")
public class BdsT04FactOrderInfo implements Serializable {
    /**
     * 代理主键
     */
    @TableId(value = "order_fact_key", type = IdType.INPUT)
    @ApiModelProperty(value="代理主键")
    private Long orderFactKey;

    /**
     * 交易来源系统
     */
    @TableField(value = "order_source_system")
    @ApiModelProperty(value="交易来源系统")
    private String orderSourceSystem;

    /**
     * 交易编号
     */
    @TableField(value = "reserve_no")
    @ApiModelProperty(value="交易编号")
    private String reserveNo;

    /**
     * 产品代理键
     */
    @TableField(value = "product_info_key")
    @ApiModelProperty(value="产品代理键")
    private Long productInfoKey;

    /**
     * 营销项目代理建
     */
    @TableField(value = "project_info_key")
    @ApiModelProperty(value="营销项目代理建")
    private Long projectInfoKey;

    /**
     * 预约日期代理键
     */
    @TableField(value = "reserve_date_key")
    @ApiModelProperty(value="预约日期代理键")
    private Integer reserveDateKey;

    /**
     * 预约时间
     */
    @TableField(value = "reserve_date_time")
    @ApiModelProperty(value="预约时间")
    private Date reserveDateTime;

    /**
     * 排队成功日期代理键
     */
    @TableField(value = "lineup_success_date_key")
    @ApiModelProperty(value="排队成功日期代理键")
    private Integer lineupSuccessDateKey;

    /**
     * 排队成功时间
     */
    @TableField(value = "lineup_success_time")
    @ApiModelProperty(value="排队成功时间")
    private Date lineupSuccessTime;

    /**
     * 最新到账日期代理键
     */
    @TableField(value = "account_date_key")
    @ApiModelProperty(value="最新到账日期代理键")
    private Integer accountDateKey;

    /**
     * 最新到账时间
     */
    @TableField(value = "account_time")
    @ApiModelProperty(value="最新到账时间")
    private Date accountTime;

    /**
     * 预约成功日期代理键
     */
    @TableField(value = "reserve_success_date_key")
    @ApiModelProperty(value="预约成功日期代理键")
    private Integer reserveSuccessDateKey;

    /**
     * 预约成功时间
     */
    @TableField(value = "reserve_success_time")
    @ApiModelProperty(value="预约成功时间")
    private Date reserveSuccessTime;

    /**
     * 确认日期代理键
     */
    @TableField(value = "confirm_date_key")
    @ApiModelProperty(value="确认日期代理键")
    private Integer confirmDateKey;

    /**
     * 确认时间
     */
    @TableField(value = "confirm_time")
    @ApiModelProperty(value="确认时间")
    private Date confirmTime;

    /**
     * 撤销日期代理键
     */
    @TableField(value = "cancle_date_key")
    @ApiModelProperty(value="撤销日期代理键")
    private Integer cancleDateKey;

    /**
     * 撤销时间
     */
    @TableField(value = "cancle_time")
    @ApiModelProperty(value="撤销时间")
    private Date cancleTime;

    /**
     * 投资客户代理键
     */
    @TableField(value = "customer_info_key")
    @ApiModelProperty(value="投资客户代理键")
    private Long customerInfoKey;

    /**
     * 成交理顾代理键
     */
    @TableField(value = "employee_info_key")
    @ApiModelProperty(value="成交理顾代理键")
    private Long employeeInfoKey;

    /**
     * 成交理顾销售组织代理键
     */
    @TableField(value = "emp_sales_organ_info_key")
    @ApiModelProperty(value="成交理顾销售组织代理键")
    private Long empSalesOrganInfoKey;

    /**
     * 预约币种代理键
     */
    @TableField(value = "reserve_currency_key")
    @ApiModelProperty(value="预约币种代理键")
    private Short reserveCurrencyKey;

    /**
     * 预约金额
     */
    @TableField(value = "reserve_amount")
    @ApiModelProperty(value="预约金额")
    private BigDecimal reserveAmount;

    /**
     * 交易手续费率
     */
    @TableField(value = "purchase_fee_rate")
    @ApiModelProperty(value="交易手续费率")
    private BigDecimal purchaseFeeRate;

    /**
     * 交易手续费
     */
    @TableField(value = "purchase_fee")
    @ApiModelProperty(value="交易手续费")
    private BigDecimal purchaseFee;

    /**
     * 到账金额
     */
    @TableField(value = "account_money")
    @ApiModelProperty(value="到账金额")
    private BigDecimal accountMoney;

    /**
     * 确认金额
     */
    @TableField(value = "confirm_amount")
    @ApiModelProperty(value="确认金额")
    private BigDecimal confirmAmount;

    /**
     * 业绩比较基准
     */
    @TableField(value = "comparison_benchmark")
    @ApiModelProperty(value="业绩比较基准")
    private BigDecimal comparisonBenchmark;

    /**
     * 本位币代理键
     */
    @TableField(value = "base_currency_key")
    @ApiModelProperty(value="本位币代理键")
    private Short baseCurrencyKey;

    /**
     * 本位币预约金额
     */
    @TableField(value = "base_cur_reserve_amount")
    @ApiModelProperty(value="本位币预约金额")
    private BigDecimal baseCurReserveAmount;

    /**
     * 本位币交易手续费
     */
    @TableField(value = "base_purchase_fee")
    @ApiModelProperty(value="本位币交易手续费")
    private BigDecimal basePurchaseFee;

    /**
     * 本位币到账金额
     */
    @TableField(value = "base_account_money")
    @ApiModelProperty(value="本位币到账金额")
    private BigDecimal baseAccountMoney;

    /**
     * 本位币确认金额
     */
    @TableField(value = "base_confirm_amount")
    @ApiModelProperty(value="本位币确认金额")
    private BigDecimal baseConfirmAmount;

    /**
     * 汇率
     */
    @TableField(value = "exchange_rate")
    @ApiModelProperty(value="汇率")
    private BigDecimal exchangeRate;

    /**
     * 业绩折算系数
     */
    @TableField(value = "achieve_rate")
    @ApiModelProperty(value="业绩折算系数")
    private BigDecimal achieveRate;

    /**
     * 标准业绩
     */
    @TableField(value = "base_achieve_amount")
    @ApiModelProperty(value="标准业绩")
    private BigDecimal baseAchieveAmount;

    /**
     * 津贴系数
     */
    @TableField(value = "subsidy_rate")
    @ApiModelProperty(value="津贴系数")
    private BigDecimal subsidyRate;

    /**
     * 津贴金额
     */
    @TableField(value = "base_subsidy_amount_rmb")
    @ApiModelProperty(value="津贴金额")
    private BigDecimal baseSubsidyAmountRmb;

    /**
     * 权益系数
     */
    @TableField(value = "equity_rate")
    @ApiModelProperty(value="权益系数")
    private BigDecimal equityRate;

    /**
     * 权益业绩
     */
    @TableField(value = "equity_achieve_amount")
    @ApiModelProperty(value="权益业绩")
    private BigDecimal equityAchieveAmount;

    /**
     * 公共交易状态代理键
     */
    @TableField(value = "trans_status_key")
    @ApiModelProperty(value="公共交易状态代理键")
    private String transStatusKey;

    /**
     * 公共到账状态代理键
     */
    @TableField(value = "trans_amount_status_key")
    @ApiModelProperty(value="公共到账状态代理键")
    private String transAmountStatusKey;

    /**
     * 公共交易确认状态代理键
     */
    @TableField(value = "trans_check_status_key")
    @ApiModelProperty(value="公共交易确认状态代理键")
    private String transCheckStatusKey;

    /**
     * 插入审计维代理键
     */
    @TableField(value = "insert_audit_key")
    @ApiModelProperty(value="插入审计维代理键")
    private Integer insertAuditKey;

    /**
     * 更新审计维代建
     */
    @TableField(value = "update_audit_key")
    @ApiModelProperty(value="更新审计维代建")
    private Integer updateAuditKey;

    /**
     * 数据创建时间
     */
    @TableField(value = "record_create_time")
    @ApiModelProperty(value="数据创建时间")
    private Date recordCreateTime;

    /**
     * 数据修改时间
     */
    @TableField(value = "record_update_time")
    @ApiModelProperty(value="数据修改时间")
    private Date recordUpdateTime;

    /**
     * 是否有效 0-无效，1-有效
     */
    @TableField(value = "record_status")
    @ApiModelProperty(value="是否有效 0-无效，1-有效")
    private Byte recordStatus;

    /**
     * 交易类型代理键
     */
    @TableField(value = "trans_type_key")
    @ApiModelProperty(value="交易类型代理键")
    private String transTypeKey;

    /**
     * 客户编号
     */
    @TableField(value = "customer_no")
    @ApiModelProperty(value="客户编号")
    private Long customerNo;

    /**
     * 成交理顾编号
     */
    @TableField(value = "emp_code")
    @ApiModelProperty(value="成交理顾编号")
    private String empCode;

    /**
     * 中岩ta产品code
     */
    @TableField(value = "qy_ta_fundcode")
    @ApiModelProperty(value="中岩ta产品code")
    private String qyTaFundcode;

    /**
     * 0  未更新    1已更新
     */
    @TableField(value = "qy_status")
    @ApiModelProperty(value="0  未更新    1已更新")
    private Boolean qyStatus;

    /**
     * 0 稳金   1代销  2直销
     */
    @TableField(value = "sale_model")
    @ApiModelProperty(value="0 稳金   1代销  2直销")
    private Boolean saleModel;

    /**
     * 多金产品code
     */
    @TableField(value = "dj_fund_code")
    @ApiModelProperty(value="多金产品code")
    private String djFundCode;

    /**
     * 未持仓标识
     */
    @TableField(value = "no_deal_flag")
    @ApiModelProperty(value="未持仓标识")
    private Byte noDealFlag;

    private static final long serialVersionUID = 1L;
}