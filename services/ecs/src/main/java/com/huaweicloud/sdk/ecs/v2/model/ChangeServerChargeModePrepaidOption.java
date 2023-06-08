package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ChangeServerChargeModePrepaidOption
 */
public class ChangeServerChargeModePrepaidOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_data_disks")

    private Boolean includeDataDisks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_publicips")

    private Boolean includePublicips;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private String periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private String periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_pay")

    private Boolean autoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_renew")

    private Boolean autoRenew;

    public ChangeServerChargeModePrepaidOption withIncludeDataDisks(Boolean includeDataDisks) {
        this.includeDataDisks = includeDataDisks;
        return this;
    }

    /**
     * 是否连同支持的按需数据盘一起转为包周期。 当参数为true，包括按需非共享的数据盘，不包括共享云硬盘，DSS和DESS硬盘 默认值为false
     * @return includeDataDisks
     */
    public Boolean getIncludeDataDisks() {
        return includeDataDisks;
    }

    public void setIncludeDataDisks(Boolean includeDataDisks) {
        this.includeDataDisks = includeDataDisks;
    }

    public ChangeServerChargeModePrepaidOption withIncludePublicips(Boolean includePublicips) {
        this.includePublicips = includePublicips;
        return this;
    }

    /**
     * 是否连同弹性公网IP一起转为包周期 只有“独享”、“按带宽计费”的弹性公网IP才可以转换为包周期计费模式 默认值为false
     * @return includePublicips
     */
    public Boolean getIncludePublicips() {
        return includePublicips;
    }

    public void setIncludePublicips(Boolean includePublicips) {
        this.includePublicips = includePublicips;
    }

    public ChangeServerChargeModePrepaidOption withPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 订购周期类型，取值范围： month-月 year-年
     * @return periodType
     */
    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public ChangeServerChargeModePrepaidOption withPeriodNum(String periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 订购周期的周期数。 取值范围： period_type=month时，取值范围为[1,9]。 period_type=year时，取值范围为[1,3]。
     * @return periodNum
     */
    public String getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(String periodNum) {
        this.periodNum = periodNum;
    }

    public ChangeServerChargeModePrepaidOption withAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }

    /**
     * 是否自动支付。 true：自动支付，需要确保账户余额充足，如果余额不足则会生成异常订单，只能作废此订单 false：只生成订单不扣费 默认值为false
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return autoPay;
    }

    public void setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
    }

    public ChangeServerChargeModePrepaidOption withAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /**
     * 是否自动续费。默认值：false
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return autoRenew;
    }

    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeServerChargeModePrepaidOption changeServerChargeModePrepaidOption =
            (ChangeServerChargeModePrepaidOption) o;
        return Objects.equals(this.includeDataDisks, changeServerChargeModePrepaidOption.includeDataDisks)
            && Objects.equals(this.includePublicips, changeServerChargeModePrepaidOption.includePublicips)
            && Objects.equals(this.periodType, changeServerChargeModePrepaidOption.periodType)
            && Objects.equals(this.periodNum, changeServerChargeModePrepaidOption.periodNum)
            && Objects.equals(this.autoPay, changeServerChargeModePrepaidOption.autoPay)
            && Objects.equals(this.autoRenew, changeServerChargeModePrepaidOption.autoRenew);
    }

    @Override
    public int hashCode() {
        return Objects.hash(includeDataDisks, includePublicips, periodType, periodNum, autoPay, autoRenew);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeServerChargeModePrepaidOption {\n");
        sb.append("    includeDataDisks: ").append(toIndentedString(includeDataDisks)).append("\n");
        sb.append("    includePublicips: ").append(toIndentedString(includePublicips)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    autoPay: ").append(toIndentedString(autoPay)).append("\n");
        sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
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
