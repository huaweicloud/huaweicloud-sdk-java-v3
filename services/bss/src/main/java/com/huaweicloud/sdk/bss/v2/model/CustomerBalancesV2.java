package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CustomerBalancesV2
 */
public class CustomerBalancesV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount")
    
    private BigDecimal amount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="currency")
    
    private String currency;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="debt_amount")
    
    private BigDecimal debtAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_id")
    
    private Integer measureId;

    public CustomerBalancesV2 withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    


    /**
     * |参数名称：客户可用总额度。| |参数约束及描述： 客户可用总额度。|
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public CustomerBalancesV2 withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    


    /**
     * |参数名称：币种。| |参数约束及描述：币种。|
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public CustomerBalancesV2 withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * |参数名称：客户的客户ID。| |参数约束及描述：客户的客户ID。|
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public CustomerBalancesV2 withDebtAmount(BigDecimal debtAmount) {
        this.debtAmount = debtAmount;
        return this;
    }

    


    /**
     * |参数名称：客户欠款总额度。| |参数约束及描述： 客户欠款总额度。|
     * @return debtAmount
     */
    public BigDecimal getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(BigDecimal debtAmount) {
        this.debtAmount = debtAmount;
    }

    public CustomerBalancesV2 withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    


    /**
     * |参数名称：度量单位：1：元；2：角；3：分。| |参数的约束及描述：度量单位：1：元；2：角；3：分。|
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomerBalancesV2 customerBalancesV2 = (CustomerBalancesV2) o;
        return Objects.equals(this.amount, customerBalancesV2.amount) &&
            Objects.equals(this.currency, customerBalancesV2.currency) &&
            Objects.equals(this.customerId, customerBalancesV2.customerId) &&
            Objects.equals(this.debtAmount, customerBalancesV2.debtAmount) &&
            Objects.equals(this.measureId, customerBalancesV2.measureId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(amount, currency, customerId, debtAmount, measureId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerBalancesV2 {\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    debtAmount: ").append(toIndentedString(debtAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
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

