package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowPartnerConsumptionQuotaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumption_quota")

    private String consumptionQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private String amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_amount")

    private String couponAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "due_amount")

    private String dueAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unbilled_amount")

    private String unbilledAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_consumption_quota")

    private String usedConsumptionQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    public ShowPartnerConsumptionQuotaResponse withConsumptionQuota(String consumptionQuota) {
        this.consumptionQuota = consumptionQuota;
        return this;
    }

    /**
     * |参数名称：总消费配额| |参数约束及描述：非必填|
     * @return consumptionQuota
     */
    public String getConsumptionQuota() {
        return consumptionQuota;
    }

    public void setConsumptionQuota(String consumptionQuota) {
        this.consumptionQuota = consumptionQuota;
    }

    public ShowPartnerConsumptionQuotaResponse withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * |参数名称：账户余额| |参数约束及描述：非必填|
     * @return amount
     */
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public ShowPartnerConsumptionQuotaResponse withCouponAmount(String couponAmount) {
        this.couponAmount = couponAmount;
        return this;
    }

    /**
     * |参数名称：代金券余额| |参数约束及描述：非必填|
     * @return couponAmount
     */
    public String getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(String couponAmount) {
        this.couponAmount = couponAmount;
    }

    public ShowPartnerConsumptionQuotaResponse withDueAmount(String dueAmount) {
        this.dueAmount = dueAmount;
        return this;
    }

    /**
     * |参数名称：应还金额| |参数约束及描述：非必填|
     * @return dueAmount
     */
    public String getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(String dueAmount) {
        this.dueAmount = dueAmount;
    }

    public ShowPartnerConsumptionQuotaResponse withUnbilledAmount(String unbilledAmount) {
        this.unbilledAmount = unbilledAmount;
        return this;
    }

    /**
     * |参数名称：未出账预估金额| |参数约束及描述：非必填|
     * @return unbilledAmount
     */
    public String getUnbilledAmount() {
        return unbilledAmount;
    }

    public void setUnbilledAmount(String unbilledAmount) {
        this.unbilledAmount = unbilledAmount;
    }

    public ShowPartnerConsumptionQuotaResponse withUsedConsumptionQuota(String usedConsumptionQuota) {
        this.usedConsumptionQuota = usedConsumptionQuota;
        return this;
    }

    /**
     * |参数名称：已使用消费配额| |参数约束及描述：非必填，used_consumption_quota = due_amount + unbilled_amount - amount - coupon_amount|
     * @return usedConsumptionQuota
     */
    public String getUsedConsumptionQuota() {
        return usedConsumptionQuota;
    }

    public void setUsedConsumptionQuota(String usedConsumptionQuota) {
        this.usedConsumptionQuota = usedConsumptionQuota;
    }

    public ShowPartnerConsumptionQuotaResponse withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * |参数名称：金额单位| |参数约束及描述：金额单位，1：元|
     * minimum: 1
     * maximum: 4
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public ShowPartnerConsumptionQuotaResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * |参数名称：货币单位| |参数约束及描述：货币单位 |
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPartnerConsumptionQuotaResponse that = (ShowPartnerConsumptionQuotaResponse) obj;
        return Objects.equals(this.consumptionQuota, that.consumptionQuota) && Objects.equals(this.amount, that.amount)
            && Objects.equals(this.couponAmount, that.couponAmount) && Objects.equals(this.dueAmount, that.dueAmount)
            && Objects.equals(this.unbilledAmount, that.unbilledAmount)
            && Objects.equals(this.usedConsumptionQuota, that.usedConsumptionQuota)
            && Objects.equals(this.measureId, that.measureId) && Objects.equals(this.currency, that.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consumptionQuota,
            amount,
            couponAmount,
            dueAmount,
            unbilledAmount,
            usedConsumptionQuota,
            measureId,
            currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPartnerConsumptionQuotaResponse {\n");
        sb.append("    consumptionQuota: ").append(toIndentedString(consumptionQuota)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    couponAmount: ").append(toIndentedString(couponAmount)).append("\n");
        sb.append("    dueAmount: ").append(toIndentedString(dueAmount)).append("\n");
        sb.append("    unbilledAmount: ").append(toIndentedString(unbilledAmount)).append("\n");
        sb.append("    usedConsumptionQuota: ").append(toIndentedString(usedConsumptionQuota)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
