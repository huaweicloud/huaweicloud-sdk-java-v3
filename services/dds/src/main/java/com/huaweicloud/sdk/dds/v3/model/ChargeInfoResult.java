package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 付费方式信息，与请求参数相同。
 */
public class ChargeInfoResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    @JacksonXmlProperty(localName = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    @JacksonXmlProperty(localName = "period_type")

    private String periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    @JacksonXmlProperty(localName = "period_num")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_renew")

    @JacksonXmlProperty(localName = "is_auto_renew")

    private Boolean isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    @JacksonXmlProperty(localName = "is_auto_pay")

    private Boolean isAutoPay;

    public ChargeInfoResult withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 计费模式。 取值范围：   - prePaid：预付费，即包年/包月。   - postPaid：后付费，即按需付费。
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public ChargeInfoResult withPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 订购周期类型。 “charge_mode”为“prePaid”时生效，且为必选值。 取值范围：   - month：包月。   - year：包年。
     * @return periodType
     */
    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public ChargeInfoResult withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * “charge_mode”为“prePaid”时生效，且为必选值，指定订购的时间。 取值范围：   - 当“period_type”为“month”时，取值为1~9。   - 当“period_type”为“year”时，取值为1~3
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public ChargeInfoResult withIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 创建包周期实例时可指定，表示是否自动续订，续订的周期和原周期相同，且续订时会自动支付。 取值范围：   - true，表示自动续订。   - false，表示不自动续订，默认为该方式。
     * @return isAutoRenew
     */
    public Boolean getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public ChargeInfoResult withIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 创建包周期实例时可指定，表示是否自动从账户中支付，该字段不影响自动续订的支付方式。 取值范围：   - true，表示自动从账户中支付   - false，表示手动从账户中支付，默认为该支付方式。
     * @return isAutoPay
     */
    public Boolean getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChargeInfoResult chargeInfoResult = (ChargeInfoResult) o;
        return Objects.equals(this.chargeMode, chargeInfoResult.chargeMode)
            && Objects.equals(this.periodType, chargeInfoResult.periodType)
            && Objects.equals(this.periodNum, chargeInfoResult.periodNum)
            && Objects.equals(this.isAutoRenew, chargeInfoResult.isAutoRenew)
            && Objects.equals(this.isAutoPay, chargeInfoResult.isAutoPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargeMode, periodType, periodNum, isAutoRenew, isAutoPay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChargeInfoResult {\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
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
