package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 包周期集群相关参数订购包周期集群时使用。
 */
public class PayInfoBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payModel")

    private Integer payModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private Integer period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoRenew")

    private Integer isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoPay")

    private Integer isAutoPay;

    public PayInfoBody withPayModel(Integer payModel) {
        this.payModel = payModel;
        return this;
    }

    /**
     * 订购周期类型。 - 2: 包月。 - 3: 包年。
     * @return payModel
     */
    public Integer getPayModel() {
        return payModel;
    }

    public void setPayModel(Integer payModel) {
        this.payModel = payModel;
    }

    public PayInfoBody withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * 订购周期数。 - 若payModel为2，则有效值为1-9。 - 若payModel为3，则有效值为1-3。
     * @return period
     */
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public PayInfoBody withIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 是否自动续订，为空时表示不自动续订。 - 1: 自动续订。 - 2：不自动续订（默认）。
     * @return isAutoRenew
     */
    public Integer getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public PayInfoBody withIsAutoPay(Integer isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     *  是否自动支付。下单订购后，是否自动从客户的华为云账户中支付，而不需要客户手动去进行支付。该参数适用于包周期集群。    - 1: 是（会自动选择折扣和优惠券进行优惠，然后自动从客户华为云账户中支付），自动支付失败后会生成订单成功(该订单应付金额是优惠后金额)、但订单状态为“待支付”，等待客户手动支付(手动支付时，客户还可以修改系统自动选择的折扣和优惠券)。   - 0: 否（需要客户手动去支付，客户可以选择折扣和优惠券）。默认值为“0”。
     * @return isAutoPay
     */
    public Integer getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Integer isAutoPay) {
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
        PayInfoBody payInfoBody = (PayInfoBody) o;
        return Objects.equals(this.payModel, payInfoBody.payModel) && Objects.equals(this.period, payInfoBody.period)
            && Objects.equals(this.isAutoRenew, payInfoBody.isAutoRenew)
            && Objects.equals(this.isAutoPay, payInfoBody.isAutoPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payModel, period, isAutoRenew, isAutoPay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PayInfoBody {\n");
        sb.append("    payModel: ").append(toIndentedString(payModel)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
