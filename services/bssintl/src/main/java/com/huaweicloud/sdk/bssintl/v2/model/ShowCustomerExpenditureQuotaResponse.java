package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowCustomerExpenditureQuotaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "granting_amount")

    private BigDecimal grantingAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "granting_amount_used")

    private BigDecimal grantingAmountUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percentage_granting_amount_used")

    private BigDecimal percentageGrantingAmountUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    public ShowCustomerExpenditureQuotaResponse withGrantingAmount(BigDecimal grantingAmount) {
        this.grantingAmount = grantingAmount;
        return this;
    }

    /**
     * |参数名称：消费配额| |参数约束及描述：当前授予额度，消费配额。|
     * @return grantingAmount
     */
    public BigDecimal getGrantingAmount() {
        return grantingAmount;
    }

    public void setGrantingAmount(BigDecimal grantingAmount) {
        this.grantingAmount = grantingAmount;
    }

    public ShowCustomerExpenditureQuotaResponse withGrantingAmountUsed(BigDecimal grantingAmountUsed) {
        this.grantingAmountUsed = grantingAmountUsed;
        return this;
    }

    /**
     * |参数名称：已使用消费配额| |参数约束及描述：已使用消费配额。|
     * @return grantingAmountUsed
     */
    public BigDecimal getGrantingAmountUsed() {
        return grantingAmountUsed;
    }

    public void setGrantingAmountUsed(BigDecimal grantingAmountUsed) {
        this.grantingAmountUsed = grantingAmountUsed;
    }

    public ShowCustomerExpenditureQuotaResponse withPercentageGrantingAmountUsed(
        BigDecimal percentageGrantingAmountUsed) {
        this.percentageGrantingAmountUsed = percentageGrantingAmountUsed;
        return this;
    }

    /**
     * |参数名称：已使用消费配额占比| |参数约束及描述：已使用消费配额占比。|
     * @return percentageGrantingAmountUsed
     */
    public BigDecimal getPercentageGrantingAmountUsed() {
        return percentageGrantingAmountUsed;
    }

    public void setPercentageGrantingAmountUsed(BigDecimal percentageGrantingAmountUsed) {
        this.percentageGrantingAmountUsed = percentageGrantingAmountUsed;
    }

    public ShowCustomerExpenditureQuotaResponse withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * |参数名称：金额的度量单位。| |参数约束及描述：1：元|
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public ShowCustomerExpenditureQuotaResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * |参数名称：币种。| |参数约束及描述：货币单位，USD：美元。|
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
        ShowCustomerExpenditureQuotaResponse that = (ShowCustomerExpenditureQuotaResponse) obj;
        return Objects.equals(this.grantingAmount, that.grantingAmount)
            && Objects.equals(this.grantingAmountUsed, that.grantingAmountUsed)
            && Objects.equals(this.percentageGrantingAmountUsed, that.percentageGrantingAmountUsed)
            && Objects.equals(this.measureId, that.measureId) && Objects.equals(this.currency, that.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grantingAmount, grantingAmountUsed, percentageGrantingAmountUsed, measureId, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCustomerExpenditureQuotaResponse {\n");
        sb.append("    grantingAmount: ").append(toIndentedString(grantingAmount)).append("\n");
        sb.append("    grantingAmountUsed: ").append(toIndentedString(grantingAmountUsed)).append("\n");
        sb.append("    percentageGrantingAmountUsed: ")
            .append(toIndentedString(percentageGrantingAmountUsed))
            .append("\n");
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
