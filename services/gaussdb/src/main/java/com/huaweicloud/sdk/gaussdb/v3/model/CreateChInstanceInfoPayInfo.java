package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 计费信息。
 */
public class CreateChInstanceInfoPayInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pay_model")

    private String payModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private String periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_renew")

    private String isAutoRenew;

    public CreateChInstanceInfoPayInfo withPayModel(String payModel) {
        this.payModel = payModel;
        return this;
    }

    /**
     * 计费模式。默认0。 取值范围： - 0：按需计费 - 1：包周期
     * @return payModel
     */
    public String getPayModel() {
        return payModel;
    }

    public void setPayModel(String payModel) {
        this.payModel = payModel;
    }

    public CreateChInstanceInfoPayInfo withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 包周期计费ID。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public CreateChInstanceInfoPayInfo withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 包周期周期。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public CreateChInstanceInfoPayInfo withPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 包周期周期类型。 取值范围： - 2：包月 - 3：包年
     * @return periodType
     */
    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public CreateChInstanceInfoPayInfo withIsAutoRenew(String isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 包周期是否自动续费。 取值范围： - 1：自动续费 - 0：不自动续费
     * @return isAutoRenew
     */
    public String getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(String isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateChInstanceInfoPayInfo that = (CreateChInstanceInfoPayInfo) obj;
        return Objects.equals(this.payModel, that.payModel) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.period, that.period) && Objects.equals(this.periodType, that.periodType)
            && Objects.equals(this.isAutoRenew, that.isAutoRenew);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payModel, orderId, period, periodType, isAutoRenew);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateChInstanceInfoPayInfo {\n");
        sb.append("    payModel: ").append(toIndentedString(payModel)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
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
