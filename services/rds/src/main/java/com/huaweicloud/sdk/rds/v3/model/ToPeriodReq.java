package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RDS实例按需转包周期请求
 */
public class ToPeriodReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private String periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_pay_policy")

    private String autoPayPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_renew_policy")

    private String autoRenewPolicy;

    public ToPeriodReq withPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 周期类型。MONTH：月；YEAR：年
     * @return periodType
     */
    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public ToPeriodReq withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 周期数。
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public ToPeriodReq withAutoPayPolicy(String autoPayPolicy) {
        this.autoPayPolicy = autoPayPolicy;
        return this;
    }

    /**
     * 是否自动支付。YES：自动扣费；NO：手动支付（默认）
     * @return autoPayPolicy
     */
    public String getAutoPayPolicy() {
        return autoPayPolicy;
    }

    public void setAutoPayPolicy(String autoPayPolicy) {
        this.autoPayPolicy = autoPayPolicy;
    }

    public ToPeriodReq withAutoRenewPolicy(String autoRenewPolicy) {
        this.autoRenewPolicy = autoRenewPolicy;
        return this;
    }

    /**
     * 是否到期自动续期。YES：自动续费；NO：不自动续费（默认）
     * @return autoRenewPolicy
     */
    public String getAutoRenewPolicy() {
        return autoRenewPolicy;
    }

    public void setAutoRenewPolicy(String autoRenewPolicy) {
        this.autoRenewPolicy = autoRenewPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ToPeriodReq that = (ToPeriodReq) obj;
        return Objects.equals(this.periodType, that.periodType) && Objects.equals(this.periodNum, that.periodNum)
            && Objects.equals(this.autoPayPolicy, that.autoPayPolicy)
            && Objects.equals(this.autoRenewPolicy, that.autoRenewPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodType, periodNum, autoPayPolicy, autoRenewPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ToPeriodReq {\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    autoPayPolicy: ").append(toIndentedString(autoPayPolicy)).append("\n");
        sb.append("    autoRenewPolicy: ").append(toIndentedString(autoRenewPolicy)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
