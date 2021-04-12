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

/**
 * 事业群维度指标
 */
@ApiModel(value="com-skindow-common-entity-GdsLevel1Index")
@Data
@TableName(value = "orange.gds_level1_index")
public class GdsLevel1Index implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 日期
     */
    @TableField(value = "dt")
    @ApiModelProperty(value="日期")
    private Integer dt;

    /**
     * 事业群
     */
    @TableField(value = "acc_level1_dept_name")
    @ApiModelProperty(value="事业群")
    private String accLevel1DeptName;

    /**
     * 考核人数
     */
    @TableField(value = "check_num")
    @ApiModelProperty(value="考核人数")
    private Integer checkNum;

    /**
     * 出单人数
     */
    @TableField(value = "achieved_num")
    @ApiModelProperty(value="出单人数")
    private Integer achievedNum;

    /**
     * 出单率
     */
    @TableField(value = "delivery_rate")
    @ApiModelProperty(value="出单率")
    private BigDecimal deliveryRate;


    /**
     * 管干考核人数
     */
    @TableField(value = "manage_emp_check_num")
    @ApiModelProperty(value="管干考核人数")
    private Integer manageEmpCheckNum;

    /**
     * 管干的司龄矩阵达成人数
     */
    @TableField(value = "manage_emp_achieved_num")
    @ApiModelProperty(value="管干的司龄矩阵达成人数")
    private Integer manageEmpAchievedNum;

    /**
     * 管干的司龄矩阵达标率
     */
    @TableField(value = "manage_emp_age_goal_rate")
    @ApiModelProperty(value="管干的司龄矩阵达标率")
    private BigDecimal manageEmpAgeGoalRate;

    /**
     * 精英
     */
    @TableField(value = "elite_emp_achieved_num")
    @ApiModelProperty(value="精英")
    private Integer eliteEmpAchievedNum;

    /**
     * 精英占比
     */
    @TableField(value = "elite_emp_rate")
    @ApiModelProperty(value="精英占比")
    private BigDecimal eliteEmpRate;

    /**
     * 长尾
     */
    @TableField(value = "tail_emp_achieved_num")
    @ApiModelProperty(value="长尾")
    private Integer tailEmpAchievedNum;

    /**
     * 长尾占比
     */
    @TableField(value = "tail_emp_rate")
    @ApiModelProperty(value="长尾占比")
    private BigDecimal tailEmpRate;

    /**
     * 大众
     */
    @TableField(value = "mass_emp_achieved_num")
    @ApiModelProperty(value="大众")
    private Integer massEmpAchievedNum;

    /**
     * 大众占比
     */
    @TableField(value = "mass_emp_rate")
    @ApiModelProperty(value="大众占比")
    private BigDecimal massEmpRate;

    /**
     * 管干出单人数
     */
    @TableField(value = "manage_emp_cadres_achieved_num")
    @ApiModelProperty(value="管干出单人数")
    private Integer manageEmpCadresAchievedNum;

    /**
     * 管干出单率
     */
    @TableField(value = "manage_emp_cadres_rate")
    @ApiModelProperty(value="管干出单率")
    private BigDecimal manageEmpCadresRate;

    /**
     * 私募出单人数
     */
    @TableField(value = "pri_achieved_num")
    @ApiModelProperty(value="私募出单人数")
    private Integer priAchievedNum;

    /**
     * 私募出单率
     */
    @TableField(value = "pri_delivery_rate")
    @ApiModelProperty(value="私募出单率")
    private BigDecimal priDeliveryRate;

    /**
     * 公募出单人数
     */
    @TableField(value = "pub_achieved_num")
    @ApiModelProperty(value="公募出单人数")
    private Integer pubAchievedNum;

    /**
     * 公募出单率
     */
    @TableField(value = "pub_delivery_rate")
    @ApiModelProperty(value="公募出单率")
    private BigDecimal pubDeliveryRate;

    /**
     * 保险出单人数(标准业绩)
     */
    @TableField(value = "ins_achieved_num")
    @ApiModelProperty(value="保险出单人数(标准业绩)")
    private Integer insAchievedNum;

    /**
     * 保险出单率(标准业绩)
     */
    @TableField(value = "ins_delivery_rate")
    @ApiModelProperty(value="保险出单率(标准业绩)")
    private BigDecimal insDeliveryRate;

    /**
     * 保险出单人数(标准保费)
     */
    @TableField(value = "policy_amount_achieved_num")
    @ApiModelProperty(value="保险出单人数(标准保费)")
    private Integer policyAmountAchievedNum;

    /**
     * 保险出单率(标准保费)
     */
    @TableField(value = "policy_amount_delivery_rate")
    @ApiModelProperty(value="保险出单率(标准保费)")
    private BigDecimal policyAmountDeliveryRate;

    /**
     * 权益类出单人数
     */
    @TableField(value = "equity_achieve_num")
    @ApiModelProperty(value="权益类出单人数")
    private Integer equityAchieveNum;

    /**
     * 权益类出单率
     */
    @TableField(value = "equity_delivery_rate")
    @ApiModelProperty(value="权益类出单率")
    private BigDecimal equityDeliveryRate;

    /**
     * 私募权益出单人数
     */
    @TableField(value = "pri_equity_achieve_num")
    @ApiModelProperty(value="私募权益出单人数")
    private Integer priEquityAchieveNum;

    /**
     * 私募权益出单率
     */
    @TableField(value = "pri_equity_delivery_rate")
    @ApiModelProperty(value="私募权益出单率")
    private BigDecimal priEquityDeliveryRate;

    /**
     * 定融出单人数
     */
    @TableField(value = "jjs_achieve_num")
    @ApiModelProperty(value="定融出单人数")
    private Integer jjsAchieveNum;

    /**
     * 定融出单率
     */
    @TableField(value = "jjs_delivery_rate")
    @ApiModelProperty(value="定融出单率")
    private BigDecimal jjsDeliveryRate;

    /**
     * 长久期出单人数
     */
    @TableField(value = "ljjs_achieve_num")
    @ApiModelProperty(value="长久期出单人数")
    private Integer ljjsAchieveNum;

    /**
     * 长久期出单率
     */
    @TableField(value = "ljjs_delivery_rate")
    @ApiModelProperty(value="长久期出单率")
    private BigDecimal ljjsDeliveryRate;

    /**
     * 保险参与人数
     */
    @TableField(value = "policy_part_num")
    @ApiModelProperty(value="保险参与人数")
    private Integer policyPartNum;

    /**
     * 保险参与率
     */
    @TableField(value = "policy_part_rate")
    @ApiModelProperty(value="保险参与率")
    private BigDecimal policyPartRate;

    /**
     * 公募参与人数
     */
    @TableField(value = "pub_part_num")
    @ApiModelProperty(value="公募参与人数")
    private Integer pubPartNum;

    /**
     * 公募参与率
     */
    @TableField(value = "pub_part_rate")
    @ApiModelProperty(value="公募参与率")
    private BigDecimal pubPartRate;

    /**
     * 营销前线人数
     */
    @TableField(value = "marketing_emp_front")
    @ApiModelProperty(value="营销前线人数")
    private Integer marketingEmpFront;

    /**
     * 营销后线人数
     */
    @TableField(value = "marketing_emp_background")
    @ApiModelProperty(value="营销后线人数")
    private Integer marketingEmpBackground;

    /**
     * 营销中线人数
     */
    @TableField(value = "marketing_emp_mid")
    @ApiModelProperty(value="营销中线人数")
    private Integer marketingEmpMid;

    /**
     * 营销人数
     */
    @TableField(value = "marketing_emp")
    @ApiModelProperty(value="营销人数")
    private Integer marketingEmp;

    /**
     * 本年营销前线入职人数
     */
    @TableField(value = "marketing_new_emp_year")
    @ApiModelProperty(value="本年营销前线入职人数")
    private Integer marketingNewEmpYear;

    /**
     * 本月营销前线入职人数
     */
    @TableField(value = "marketing_new_emp_mon")
    @ApiModelProperty(value="本月营销前线入职人数")
    private Integer marketingNewEmpMon;

    /**
     * 本周营销前线入职人数
     */
    @TableField(value = "marketing_new_emp_week")
    @ApiModelProperty(value="本周营销前线入职人数")
    private Integer marketingNewEmpWeek;

    /**
     * 本年营销前线离职人数
     */
    @TableField(value = "marketing_sep_emp_year")
    @ApiModelProperty(value="本年营销前线离职人数")
    private Integer marketingSepEmpYear;

    /**
     * 本月营销前线离职人数
     */
    @TableField(value = "marketing_sep_emp_mon")
    @ApiModelProperty(value="本月营销前线离职人数")
    private Integer marketingSepEmpMon;

    /**
     * 本周营销前线离职人数
     */
    @TableField(value = "marketing_sep_emp_week")
    @ApiModelProperty(value="本周营销前线离职人数")
    private Integer marketingSepEmpWeek;

    /**
     * 年度营销前线净增人数
     */
    @TableField(value = "marketing_net_inc_emp_year")
    @ApiModelProperty(value="年度营销前线净增人数")
    private Integer marketingNetIncEmpYear;

    /**
     * 月度营销前线净增人数
     */
    @TableField(value = "marketing_net_inc_emp_mon")
    @ApiModelProperty(value="月度营销前线净增人数")
    private Integer marketingNetIncEmpMon;

    /**
     * 本年前线入职人数-普通
     */
    @TableField(value = "marketing_new_emp_ord")
    @ApiModelProperty(value="本年前线入职人数-普通")
    private Integer marketingNewEmpOrd;

    /**
     * 本年前线入职人数-理顾-A类
     */
    @TableField(value = "marketing_new_emp_A")
    @ApiModelProperty(value="本年前线入职人数-理顾-A类")
    private Integer marketingNewEmpA;

    /**
     * 本年前线入职人数-理顾-B类
     */
    @TableField(value = "marketing_new_emp_B")
    @ApiModelProperty(value="本年前线入职人数-理顾-B类")
    private Integer marketingNewEmpB;

    /**
     * 本年前线入职人数-理顾-C类
     */
    @TableField(value = "marketing_new_emp_C")
    @ApiModelProperty(value="本年前线入职人数-理顾-C类")
    private Integer marketingNewEmpC;

    /**
     * 本年前线入职人数-理顾-S类
     */
    @TableField(value = "marketing_new_emp_S")
    @ApiModelProperty(value="本年前线入职人数-理顾-S类")
    private Integer marketingNewEmpS;

    /**
     * 本年前线入职人数-私享-S类
     */
    @TableField(value = "marketing_new_emp_sis")
    @ApiModelProperty(value="本年前线入职人数-私享-S类")
    private Integer marketingNewEmpSis;

    /**
     * 本年前线入职人数-团队
     */
    @TableField(value = "marketing_new_emp_team")
    @ApiModelProperty(value="本年前线入职人数-团队")
    private Integer marketingNewEmpTeam;

    /**
     * 本年前线入职人数-营业部
     */
    @TableField(value = "marketing_new_emp_depart")
    @ApiModelProperty(value="本年前线入职人数-营业部")
    private Integer marketingNewEmpDepart;

    /**
     * 本年前线入职人数-后台
     */
    @TableField(value = "marketing_new_emp_")
    @ApiModelProperty(value="本年前线入职人数-后台")
    private Integer marketingNewEmp;

    /**
     * 本月出单笔数
     */
    @TableField(value = "trans_num_mon")
    @ApiModelProperty(value="本月出单笔数")
    private Integer transNumMon;

    /**
     * 本月私募出单笔数
     */
    @TableField(value = "pri_trans_num_mon")
    @ApiModelProperty(value="本月私募出单笔数")
    private Integer priTransNumMon;

    /**
     * 本月公募出单笔数
     */
    @TableField(value = "pub_trans_num_mon")
    @ApiModelProperty(value="本月公募出单笔数")
    private Integer pubTransNumMon;

    /**
     * 本月人均产能
     */
    @TableField(value = "issue_amount_per_emp/mon")
    @ApiModelProperty(value="本月人均产能")
    private Integer issueAmountPerEmpMon;

    /**
     * 本年标准保费
     */
    @TableField(value = "policy_amount_year")
    @ApiModelProperty(value="本年标准保费")
    private BigDecimal policyAmountYear;

    /**
     * 本年私募权益业绩
     */
    @TableField(value = "equity_amount_year")
    @ApiModelProperty(value="本年私募权益业绩")
    private BigDecimal equityAmountYear;

    /**
     * 本年发行规模
     */
    @TableField(value = "issue_amount_year")
    @ApiModelProperty(value="本年发行规模")
    private BigDecimal issueAmountYear;

    /**
     * 本年标准业绩
     */
    @TableField(value = "achieve_amount_year")
    @ApiModelProperty(value="本年标准业绩")
    private BigDecimal achieveAmountYear;

    /**
     * 本年月均标准保费
     */
    @TableField(value = "policy_amount_aver_mon")
    @ApiModelProperty(value="本年月均标准保费")
    private BigDecimal policyAmountAverMon;

    /**
     * 本年月均私募权益业绩
     */
    @TableField(value = "equity_amount_aver_mon")
    @ApiModelProperty(value="本年月均私募权益业绩")
    private BigDecimal equityAmountAverMon;

    /**
     * 本年月均发行规模
     */
    @TableField(value = "issue_amount_aver_mon")
    @ApiModelProperty(value="本年月均发行规模")
    private BigDecimal issueAmountAverMon;

    /**
     * 本年月均标准业绩
     */
    @TableField(value = "achieve_amount_aver_mon")
    @ApiModelProperty(value="本年月均标准业绩")
    private BigDecimal achieveAmountAverMon;

    /**
     * 本月标准保费
     */
    @TableField(value = "policy_amount_mon")
    @ApiModelProperty(value="本月标准保费")
    private BigDecimal policyAmountMon;

    /**
     * 本月私募权益业绩
     */
    @TableField(value = "equity_amount_mon")
    @ApiModelProperty(value="本月私募权益业绩")
    private BigDecimal equityAmountMon;

    /**
     * 本月发行规模
     */
    @TableField(value = "issue_amount_mon")
    @ApiModelProperty(value="本月发行规模")
    private BigDecimal issueAmountMon;

    /**
     * 本月标准业绩
     */
    @TableField(value = "achieve_amount_mon")
    @ApiModelProperty(value="本月标准业绩")
    private BigDecimal achieveAmountMon;

    /**
     * 本月日均标准保费
     */
    @TableField(value = "policy_amount_aver_mon_of_day")
    @ApiModelProperty(value="本月日均标准保费")
    private BigDecimal policyAmountAverMonOfDay;

    /**
     * 本月日均私募权益业绩
     */
    @TableField(value = "equity_amount_aver_mon_of_day")
    @ApiModelProperty(value="本月日均私募权益业绩")
    private BigDecimal equityAmountAverMonOfDay;

    /**
     * 本月日均发行规模
     */
    @TableField(value = "issue_amount_aver_mon_of_day")
    @ApiModelProperty(value="本月日均发行规模")
    private BigDecimal issueAmountAverMonOfDay;

    /**
     * 本月日均标准业绩
     */
    @TableField(value = "achieve_amount_aver_mon_of_day")
    @ApiModelProperty(value="本月日均标准业绩")
    private BigDecimal achieveAmountAverMonOfDay;

    /**
     * 本周标准保费
     */
    @TableField(value = "policy_amount_week")
    @ApiModelProperty(value="本周标准保费")
    private BigDecimal policyAmountWeek;

    /**
     * 本周私募权益业绩
     */
    @TableField(value = "equity_amount_week")
    @ApiModelProperty(value="本周私募权益业绩")
    private BigDecimal equityAmountWeek;

    /**
     * 本周发行规模
     */
    @TableField(value = "issue_amount_week")
    @ApiModelProperty(value="本周发行规模")
    private BigDecimal issueAmountWeek;

    /**
     * 本周标准业绩
     */
    @TableField(value = "achieve_amount_week")
    @ApiModelProperty(value="本周标准业绩")
    private BigDecimal achieveAmountWeek;

    /**
     * 本周日均标准保费
     */
    @TableField(value = "policy_amount_aver_week")
    @ApiModelProperty(value="本周日均标准保费")
    private BigDecimal policyAmountAverWeek;

    /**
     * 本周日均私募权益业绩
     */
    @TableField(value = "equity_amount_aver_week")
    @ApiModelProperty(value="本周日均私募权益业绩")
    private BigDecimal equityAmountAverWeek;

    /**
     * 本周日均发行规模
     */
    @TableField(value = "issue_amount_aver_week")
    @ApiModelProperty(value="本周日均发行规模")
    private BigDecimal issueAmountAverWeek;

    /**
     * 本周日均标准业绩
     */
    @TableField(value = "achieve_amount_aver_week")
    @ApiModelProperty(value="本周日均标准业绩")
    private BigDecimal achieveAmountAverWeek;

    /**
     * 本年公募发行规模
     */
    @TableField(value = "pub_issue_amount_year")
    @ApiModelProperty(value="本年公募发行规模")
    private BigDecimal pubIssueAmountYear;

    /**
     * 本年公募货币发行规模
     */
    @TableField(value = "pub_cur_issue_amount_year")
    @ApiModelProperty(value="本年公募货币发行规模")
    private BigDecimal pubCurIssueAmountYear;

    /**
     * 本年公募非货币发行规模
     */
    @TableField(value = "pub_noncur_issue_amount_year")
    @ApiModelProperty(value="本年公募非货币发行规模")
    private BigDecimal pubNoncurIssueAmountYear;

    /**
     * 本年私募发行规模
     */
    @TableField(value = "pri_issue_amount_year")
    @ApiModelProperty(value="本年私募发行规模")
    private BigDecimal priIssueAmountYear;

    /**
     * 本年债权投资发行规模
     */
    @TableField(value = "credit_issue_amount_yeard")
    @ApiModelProperty(value="本年债权投资发行规模")
    private BigDecimal creditIssueAmountYeard;

    /**
     * 本年证券投资发行规模
     */
    @TableField(value = "securities_issue_amount_year")
    @ApiModelProperty(value="本年证券投资发行规模")
    private BigDecimal securitiesIssueAmountYear;

    /**
     * 本年股权投资发行规模
     */
    @TableField(value = "equity_issue_amount_year")
    @ApiModelProperty(value="本年股权投资发行规模")
    private BigDecimal equityIssueAmountYear;

    /**
     * 本年海外投资发行规模
     */
    @TableField(value = "overseas_issue_amount_year")
    @ApiModelProperty(value="本年海外投资发行规模")
    private BigDecimal overseasIssueAmountYear;

    /**
     * 本年其他投资
     */
    @TableField(value = "other_issue_amount_year")
    @ApiModelProperty(value="本年其他投资")
    private BigDecimal otherIssueAmountYear;

    /**
     * 本年传统固收发行规模
     */
    @TableField(value = "fixed_income_issue_amount_year")
    @ApiModelProperty(value="本年传统固收发行规模")
    private BigDecimal fixedIncomeIssueAmountYear;

    /**
     * 本年现金管理发行规模
     */
    @TableField(value = "cash_issue_amount_year")
    @ApiModelProperty(value="本年现金管理发行规模")
    private BigDecimal cashIssueAmountYear;

    /**
     * 本年jjs发行规模
     */
    @TableField(value = "jjs_issue_amount_year")
    @ApiModelProperty(value="本年jjs发行规模")
    private BigDecimal jjsIssueAmountYear;

    /**
     * 本年外采信托发行规模
     */
    @TableField(value = "`foreign_trust_fund _issue_amount_year`")
    @ApiModelProperty(value="本年外采信托发行规模")
    private BigDecimal foreignTrustFundIssueAmountYear;

    /**
     * 本年中融系列发行规模
     */
    @TableField(value = "ZRT_issue_amount_year")
    @ApiModelProperty(value="本年中融系列发行规模")
    private BigDecimal zrtIssueAmountYear;

    /**
     * 本年其他信托发行规模
     */
    @TableField(value = "QTT_issue_amount_year")
    @ApiModelProperty(value="本年其他信托发行规模")
    private BigDecimal qttIssueAmountYear;

    /**
     * 本年公募标准业绩
     */
    @TableField(value = "pub_achieve_amount_year")
    @ApiModelProperty(value="本年公募标准业绩")
    private BigDecimal pubAchieveAmountYear;

    /**
     * 本年公募货币标准业绩
     */
    @TableField(value = "pub_cur_achieve_amount_year")
    @ApiModelProperty(value="本年公募货币标准业绩")
    private BigDecimal pubCurAchieveAmountYear;

    /**
     * 本年公募非货币标准业绩
     */
    @TableField(value = "pub_noncur_achieve_amount_year")
    @ApiModelProperty(value="本年公募非货币标准业绩")
    private BigDecimal pubNoncurAchieveAmountYear;

    /**
     * 本年私募标准业绩
     */
    @TableField(value = "pri_achieve_amount_year")
    @ApiModelProperty(value="本年私募标准业绩")
    private BigDecimal priAchieveAmountYear;

    /**
     * 本年债权投资标准业绩
     */
    @TableField(value = "credit_achieve_amount_year")
    @ApiModelProperty(value="本年债权投资标准业绩")
    private BigDecimal creditAchieveAmountYear;

    /**
     * 本年证券投资标准业绩
     */
    @TableField(value = "securities_achieve_amount_year")
    @ApiModelProperty(value="本年证券投资标准业绩")
    private BigDecimal securitiesAchieveAmountYear;

    /**
     * 本年股权投资标准业绩
     */
    @TableField(value = "equity_achieve_amount_year")
    @ApiModelProperty(value="本年股权投资标准业绩")
    private BigDecimal equityAchieveAmountYear;

    /**
     * 本年海外投资标准业绩
     */
    @TableField(value = "overseas_achieve_amount_year")
    @ApiModelProperty(value="本年海外投资标准业绩")
    private BigDecimal overseasAchieveAmountYear;

    /**
     * 本年其他投资
     */
    @TableField(value = "other_achieve_amount_year")
    @ApiModelProperty(value="本年其他投资")
    private BigDecimal otherAchieveAmountYear;

    /**
     * 本年传统固收标准业绩
     */
    @TableField(value = "fixed_income_achieve_amount_year")
    @ApiModelProperty(value="本年传统固收标准业绩")
    private BigDecimal fixedIncomeAchieveAmountYear;

    /**
     * 本年现金管理标准业绩
     */
    @TableField(value = "cash_achieve_amount_year")
    @ApiModelProperty(value="本年现金管理标准业绩")
    private BigDecimal cashAchieveAmountYear;

    /**
     * 本年jjs标准业绩
     */
    @TableField(value = "jjs_achieve_amount_year")
    @ApiModelProperty(value="本年jjs标准业绩")
    private BigDecimal jjsAchieveAmountYear;

    /**
     * 本年外采信托标准业绩
     */
    @TableField(value = "`foreign_trust_fund _achieve_amount_year`")
    @ApiModelProperty(value="本年外采信托标准业绩")
    private BigDecimal foreignTrustFundAchieveAmountYear;

    /**
     * 本年中融系列标准业绩
     */
    @TableField(value = "ZRT_achieve_amount_year")
    @ApiModelProperty(value="本年中融系列标准业绩")
    private BigDecimal zrtAchieveAmountYear;

    /**
     * 本年其他信托标准业绩
     */
    @TableField(value = "QTT_achieve_amount_year")
    @ApiModelProperty(value="本年其他信托标准业绩")
    private BigDecimal qttAchieveAmountYear;

    /**
     * 本月公募发行规模
     */
    @TableField(value = "pub_issue_amount_mon")
    @ApiModelProperty(value="本月公募发行规模")
    private BigDecimal pubIssueAmountMon;

    /**
     * 本月公募货币发行规模
     */
    @TableField(value = "pub_cur_issue_amount_mon")
    @ApiModelProperty(value="本月公募货币发行规模")
    private BigDecimal pubCurIssueAmountMon;

    /**
     * 本月公募非货币发行规模
     */
    @TableField(value = "pub_noncur_issue_amount_mon")
    @ApiModelProperty(value="本月公募非货币发行规模")
    private BigDecimal pubNoncurIssueAmountMon;

    /**
     * 本月私募发行规模
     */
    @TableField(value = "pri_issue_amount_mon")
    @ApiModelProperty(value="本月私募发行规模")
    private BigDecimal priIssueAmountMon;

    /**
     * 本月债权投资发行规模
     */
    @TableField(value = "credit_issue_amount_mon")
    @ApiModelProperty(value="本月债权投资发行规模")
    private BigDecimal creditIssueAmountMon;

    /**
     * 本月证券投资发行规模
     */
    @TableField(value = "securities_issue_amount_mon")
    @ApiModelProperty(value="本月证券投资发行规模")
    private BigDecimal securitiesIssueAmountMon;

    /**
     * 本月股权投资发行规模
     */
    @TableField(value = "equity_issue_amount_mon")
    @ApiModelProperty(value="本月股权投资发行规模")
    private BigDecimal equityIssueAmountMon;

    /**
     * 本月海外投资发行规模
     */
    @TableField(value = "overseas_issue_amount_mon")
    @ApiModelProperty(value="本月海外投资发行规模")
    private BigDecimal overseasIssueAmountMon;

    /**
     * 本月其他投资
     */
    @TableField(value = "other_issue_amount_mon")
    @ApiModelProperty(value="本月其他投资")
    private BigDecimal otherIssueAmountMon;

    /**
     * 本月传统固收发行规模
     */
    @TableField(value = "fixed_income_issue_amount_mon")
    @ApiModelProperty(value="本月传统固收发行规模")
    private BigDecimal fixedIncomeIssueAmountMon;

    /**
     * 本月现金管理发行规模
     */
    @TableField(value = "cash_issue_amount_mon")
    @ApiModelProperty(value="本月现金管理发行规模")
    private BigDecimal cashIssueAmountMon;

    /**
     * 本月jjs发行规模
     */
    @TableField(value = "jjs_issue_amount_mon")
    @ApiModelProperty(value="本月jjs发行规模")
    private BigDecimal jjsIssueAmountMon;

    /**
     * 本月外采信托发行规模
     */
    @TableField(value = "`foreign_trust_fund _issue_amount_mon`")
    @ApiModelProperty(value="本月外采信托发行规模")
    private BigDecimal foreignTrustFundIssueAmountMon;

    /**
     * 本月中融系列发行规模
     */
    @TableField(value = "ZRT_issue_amount_mon")
    @ApiModelProperty(value="本月中融系列发行规模")
    private BigDecimal zrtIssueAmountMon;

    /**
     * 本月其他信托发行规模
     */
    @TableField(value = "QTT_issue_amount_mon")
    @ApiModelProperty(value="本月其他信托发行规模")
    private BigDecimal qttIssueAmountMon;

    /**
     * 本月公募标准业绩
     */
    @TableField(value = "pub_achieve_amount_mon")
    @ApiModelProperty(value="本月公募标准业绩")
    private BigDecimal pubAchieveAmountMon;

    /**
     * 本月公募货币标准业绩
     */
    @TableField(value = "pub_cur_achieve_amount_mon")
    @ApiModelProperty(value="本月公募货币标准业绩")
    private BigDecimal pubCurAchieveAmountMon;

    /**
     * 本月公募非货币标准业绩
     */
    @TableField(value = "pub_noncur_achieve_amount_mon")
    @ApiModelProperty(value="本月公募非货币标准业绩")
    private BigDecimal pubNoncurAchieveAmountMon;

    /**
     * 本月私募标准业绩
     */
    @TableField(value = "pri_achieve_amount_mon")
    @ApiModelProperty(value="本月私募标准业绩")
    private BigDecimal priAchieveAmountMon;

    /**
     * 本月债权投资标准业绩
     */
    @TableField(value = "credit_achieve_amount_mon")
    @ApiModelProperty(value="本月债权投资标准业绩")
    private BigDecimal creditAchieveAmountMon;

    /**
     * 本月证券投资标准业绩
     */
    @TableField(value = "securities_achieve_amount_mon")
    @ApiModelProperty(value="本月证券投资标准业绩")
    private BigDecimal securitiesAchieveAmountMon;

    /**
     * 本月股权投资标准业绩
     */
    @TableField(value = "equity_achieve_amount_mon")
    @ApiModelProperty(value="本月股权投资标准业绩")
    private BigDecimal equityAchieveAmountMon;

    /**
     * 本月海外投资标准业绩
     */
    @TableField(value = "overseas_achieve_amount_mon")
    @ApiModelProperty(value="本月海外投资标准业绩")
    private BigDecimal overseasAchieveAmountMon;

    /**
     * 本月其他投资
     */
    @TableField(value = "other_achieve_amount_mon")
    @ApiModelProperty(value="本月其他投资")
    private BigDecimal otherAchieveAmountMon;

    /**
     * 本月传统固收标准业绩
     */
    @TableField(value = "fixed_income_achieve_amount_mon")
    @ApiModelProperty(value="本月传统固收标准业绩")
    private BigDecimal fixedIncomeAchieveAmountMon;

    /**
     * 本月现金管理标准业绩
     */
    @TableField(value = "cash_achieve_amount_mon")
    @ApiModelProperty(value="本月现金管理标准业绩")
    private BigDecimal cashAchieveAmountMon;

    /**
     * 本月jjs标准业绩
     */
    @TableField(value = "jjs_achieve_amount_mon")
    @ApiModelProperty(value="本月jjs标准业绩")
    private BigDecimal jjsAchieveAmountMon;

    /**
     * 本月外采信托标准业绩
     */
    @TableField(value = "`foreign_trust_fund _achieve_amount_mon`")
    @ApiModelProperty(value="本月外采信托标准业绩")
    private BigDecimal foreignTrustFundAchieveAmountMon;

    /**
     * 本月中融系列标准业绩
     */
    @TableField(value = "ZRT_achieve_amount_mon")
    @ApiModelProperty(value="本月中融系列标准业绩")
    private BigDecimal zrtAchieveAmountMon;

    /**
     * 本月其他信托标准业绩
     */
    @TableField(value = "QTT_achieve_amount_mon")
    @ApiModelProperty(value="本月其他信托标准业绩")
    private BigDecimal qttAchieveAmountMon;

    /**
     * 本周公募发行规模
     */
    @TableField(value = "pub_issue_amount_week")
    @ApiModelProperty(value="本周公募发行规模")
    private BigDecimal pubIssueAmountWeek;

    /**
     * 本周公募货币发行规模
     */
    @TableField(value = "pub_cur_issue_amount_week")
    @ApiModelProperty(value="本周公募货币发行规模")
    private BigDecimal pubCurIssueAmountWeek;

    /**
     * 本周公募非货币发行规模
     */
    @TableField(value = "pub_noncur_issue_amount_week")
    @ApiModelProperty(value="本周公募非货币发行规模")
    private BigDecimal pubNoncurIssueAmountWeek;

    /**
     * 本周私募发行规模
     */
    @TableField(value = "pri_issue_amount_week")
    @ApiModelProperty(value="本周私募发行规模")
    private BigDecimal priIssueAmountWeek;

    /**
     * 本周债权投资发行规模
     */
    @TableField(value = "credit_issue_amount_week")
    @ApiModelProperty(value="本周债权投资发行规模")
    private BigDecimal creditIssueAmountWeek;

    /**
     * 本周证券投资发行规模
     */
    @TableField(value = "securities_issue_amount_week")
    @ApiModelProperty(value="本周证券投资发行规模")
    private BigDecimal securitiesIssueAmountWeek;

    /**
     * 本周股权投资发行规模
     */
    @TableField(value = "equity_issue_amount_week")
    @ApiModelProperty(value="本周股权投资发行规模")
    private BigDecimal equityIssueAmountWeek;

    /**
     * 本周海外投资发行规模
     */
    @TableField(value = "overseas_issue_amount_week")
    @ApiModelProperty(value="本周海外投资发行规模")
    private BigDecimal overseasIssueAmountWeek;

    /**
     * 本周其他投资
     */
    @TableField(value = "other_issue_amount_week")
    @ApiModelProperty(value="本周其他投资")
    private BigDecimal otherIssueAmountWeek;

    /**
     * 本周传统固收发行规模
     */
    @TableField(value = "fixed_income_issue_amount_week")
    @ApiModelProperty(value="本周传统固收发行规模")
    private BigDecimal fixedIncomeIssueAmountWeek;

    /**
     * 本周现金管理发行规模
     */
    @TableField(value = "cash_issue_amount_week")
    @ApiModelProperty(value="本周现金管理发行规模")
    private BigDecimal cashIssueAmountWeek;

    /**
     * 本周jjs发行规模
     */
    @TableField(value = "jjs_issue_amount_week")
    @ApiModelProperty(value="本周jjs发行规模")
    private BigDecimal jjsIssueAmountWeek;

    /**
     * 本周外采信托发行规模
     */
    @TableField(value = "`foreign_trust_fund _issue_amount_week`")
    @ApiModelProperty(value="本周外采信托发行规模")
    private BigDecimal foreignTrustFundIssueAmountWeek;

    /**
     * 本周中融系列发行规模
     */
    @TableField(value = "ZRT_issue_amount_week")
    @ApiModelProperty(value="本周中融系列发行规模")
    private BigDecimal zrtIssueAmountWeek;

    /**
     * 本周其他信托发行规模
     */
    @TableField(value = "QTT_issue_amount_week")
    @ApiModelProperty(value="本周其他信托发行规模")
    private BigDecimal qttIssueAmountWeek;

    /**
     * 本周公募标准业绩
     */
    @TableField(value = "pub_achieve_amount_week")
    @ApiModelProperty(value="本周公募标准业绩")
    private BigDecimal pubAchieveAmountWeek;

    /**
     * 本周公募货币标准业绩
     */
    @TableField(value = "pub_cur_achieve_amount_week")
    @ApiModelProperty(value="本周公募货币标准业绩")
    private BigDecimal pubCurAchieveAmountWeek;

    /**
     * 本周公募非货币标准业绩
     */
    @TableField(value = "pub_noncur_achieve_amount_week")
    @ApiModelProperty(value="本周公募非货币标准业绩")
    private BigDecimal pubNoncurAchieveAmountWeek;

    /**
     * 本周私募标准业绩
     */
    @TableField(value = "pri_achieve_amount_week")
    @ApiModelProperty(value="本周私募标准业绩")
    private BigDecimal priAchieveAmountWeek;

    /**
     * 本周债权投资标准业绩
     */
    @TableField(value = "credit_achieve_amount_week")
    @ApiModelProperty(value="本周债权投资标准业绩")
    private BigDecimal creditAchieveAmountWeek;

    /**
     * 本周证券投资标准业绩
     */
    @TableField(value = "securities_achieve_amount_week")
    @ApiModelProperty(value="本周证券投资标准业绩")
    private BigDecimal securitiesAchieveAmountWeek;

    /**
     * 本周股权投资标准业绩
     */
    @TableField(value = "equity_achieve_amount_week")
    @ApiModelProperty(value="本周股权投资标准业绩")
    private BigDecimal equityAchieveAmountWeek;

    /**
     * 本周海外投资标准业绩
     */
    @TableField(value = "overseas_achieve_amount_week")
    @ApiModelProperty(value="本周海外投资标准业绩")
    private BigDecimal overseasAchieveAmountWeek;

    /**
     * 本周其他投资
     */
    @TableField(value = "other_achieve_amount_week")
    @ApiModelProperty(value="本周其他投资")
    private BigDecimal otherAchieveAmountWeek;

    /**
     * 本周传统固收标准业绩
     */
    @TableField(value = "fixed_income_achieve_amount_week")
    @ApiModelProperty(value="本周传统固收标准业绩")
    private BigDecimal fixedIncomeAchieveAmountWeek;

    /**
     * 本周现金管理标准业绩
     */
    @TableField(value = "cash_achieve_amount_week")
    @ApiModelProperty(value="本周现金管理标准业绩")
    private BigDecimal cashAchieveAmountWeek;

    /**
     * 本周jjs标准业绩
     */
    @TableField(value = "jjs_achieve_amount_week")
    @ApiModelProperty(value="本周jjs标准业绩")
    private BigDecimal jjsAchieveAmountWeek;

    /**
     * 本周外采信托标准业绩
     */
    @TableField(value = "`foreign_trust_fund _achieve_amount_week`")
    @ApiModelProperty(value="本周外采信托标准业绩")
    private BigDecimal foreignTrustFundAchieveAmountWeek;

    /**
     * 本周中融系列标准业绩
     */
    @TableField(value = "ZRT_achieve_amount_week")
    @ApiModelProperty(value="本周中融系列标准业绩")
    private BigDecimal zrtAchieveAmountWeek;

    /**
     * 本周其他信托标准业绩
     */
    @TableField(value = "QTT_achieve_amount_week")
    @ApiModelProperty(value="本周其他信托标准业绩")
    private BigDecimal qttAchieveAmountWeek;

    private static final long serialVersionUID = 1L;
}