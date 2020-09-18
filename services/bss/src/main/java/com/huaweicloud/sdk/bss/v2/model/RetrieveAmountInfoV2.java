package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RetrieveAmountInfoV2
 */
public class RetrieveAmountInfoV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="avail_retrieve_amount")
    
    private BigDecimal availRetrieveAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_id")
    
    private Integer measureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="currency")
    
    private String currency;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount")
    
    private BigDecimal amount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="credit_amount")
    
    private BigDecimal creditAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expire_time")
    
    private String expireTime;

    public RetrieveAmountInfoV2 withAvailRetrieveAmount(BigDecimal availRetrieveAmount) {
        this.availRetrieveAmount = availRetrieveAmount;
        return this;
    }

    


    /**
     * |参数名称：可回收的金额。| |参数的约束及描述：可回收的金额。|
     * @return availRetrieveAmount
     */
    public BigDecimal getAvailRetrieveAmount() {
        return availRetrieveAmount;
    }

    public void setAvailRetrieveAmount(BigDecimal availRetrieveAmount) {
        this.availRetrieveAmount = availRetrieveAmount;
    }

    public RetrieveAmountInfoV2 withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    


    /**
     * |参数名称：金额单位。1：元| |参数的约束及描述：金额单位。1：元|
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public RetrieveAmountInfoV2 withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    


    /**
     * |参数名称：币种。CNY：人民币USD：美金| |参数约束及描述：币种。CNY：人民币USD：美金|
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public RetrieveAmountInfoV2 withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    


    /**
     * |参数名称：账户余额（仅balance_type=信用账户时才有这个字段）。| |参数的约束及描述：账户余额（仅balance_type=信用账户时才有这个字段）。|
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public RetrieveAmountInfoV2 withCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }

    


    /**
     * |参数名称：信用额度（仅balance_type=信用账户时才有这个字段）。| |参数的约束及描述：信用额度（仅balance_type=信用账户时才有这个字段）。|
     * @return creditAmount
     */
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public RetrieveAmountInfoV2 withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    


    /**
     * |参数名称：信用额度过期时间。UTC时间，格式为：2016-03-28T14:45:38Z。如果查询信用账户可回收余额的查询结果没有失效时间，表示永久有效。| |参数约束及描述：信用额度过期时间。UTC时间，格式为：2016-03-28T14:45:38Z。如果查询信用账户可回收余额的查询结果没有失效时间，表示永久有效。|
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RetrieveAmountInfoV2 retrieveAmountInfoV2 = (RetrieveAmountInfoV2) o;
        return Objects.equals(this.availRetrieveAmount, retrieveAmountInfoV2.availRetrieveAmount) &&
            Objects.equals(this.measureId, retrieveAmountInfoV2.measureId) &&
            Objects.equals(this.currency, retrieveAmountInfoV2.currency) &&
            Objects.equals(this.amount, retrieveAmountInfoV2.amount) &&
            Objects.equals(this.creditAmount, retrieveAmountInfoV2.creditAmount) &&
            Objects.equals(this.expireTime, retrieveAmountInfoV2.expireTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(availRetrieveAmount, measureId, currency, amount, creditAmount, expireTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetrieveAmountInfoV2 {\n");
        sb.append("    availRetrieveAmount: ").append(toIndentedString(availRetrieveAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
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

