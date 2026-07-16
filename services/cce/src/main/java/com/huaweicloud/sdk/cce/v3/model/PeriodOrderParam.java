package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PeriodOrderParam
 */
public class PeriodOrderParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoPay")

    private Boolean isAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoRenew")

    private Boolean isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodNum")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodType")

    private String periodType;

    public PeriodOrderParam withIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * **参数解释**： 是否自动支付订单费用 **约束限制**： 不涉及 **取值范围**： - true：自动支付 - false：手动支付 **默认取值**： false
     * @return isAutoPay
     */
    public Boolean getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public PeriodOrderParam withIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * **参数解释**： 是否自动续费 **约束限制**： 不涉及 **取值范围**： - true：自动续费 - false：不自动续费 **默认取值**： false
     * @return isAutoRenew
     */
    public Boolean getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public PeriodOrderParam withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * **参数解释**： 包周期时间长度，不同局点、不同产品规格支持的范围可能不同，大部分局点支持：1-9月，1-3年，具体以接口返回为准。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public PeriodOrderParam withPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * **参数解释**： 包周期单位 **约束限制**： 不涉及 **取值范围**： - \"month\"：月 - \"year\"：年 **默认取值**： 不涉及
     * @return periodType
     */
    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PeriodOrderParam that = (PeriodOrderParam) obj;
        return Objects.equals(this.isAutoPay, that.isAutoPay) && Objects.equals(this.isAutoRenew, that.isAutoRenew)
            && Objects.equals(this.periodNum, that.periodNum) && Objects.equals(this.periodType, that.periodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAutoPay, isAutoRenew, periodNum, periodType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PeriodOrderParam {\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
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
