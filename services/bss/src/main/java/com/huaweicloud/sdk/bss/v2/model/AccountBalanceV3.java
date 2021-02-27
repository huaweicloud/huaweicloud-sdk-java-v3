package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AccountBalanceV3
 */
public class AccountBalanceV3  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="account_id")
    
    private String accountId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="account_type")
    
    private Integer accountType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount")
    
    private Double amount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="currency")
    
    private String currency = "CNY";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="designated_amount")
    
    private Double designatedAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="credit_amount")
    
    private Double creditAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_id")
    
    private Integer measureId;

    public AccountBalanceV3 withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    


    /**
     * 账户标识。
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public AccountBalanceV3 withAccountType(Integer accountType) {
        this.accountType = accountType;
        return this;
    }

    


    /**
     * 账户类型。 1：余额2：信用5：奖励金
     * @return accountType
     */
    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public AccountBalanceV3 withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    


    /**
     * 账户余额。
     * @return amount
     */
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public AccountBalanceV3 withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    


    /**
     * 币种。 CNY：人民币。
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public AccountBalanceV3 withDesignatedAmount(Double designatedAmount) {
        this.designatedAmount = designatedAmount;
        return this;
    }

    


    /**
     * 专款专用余额。
     * @return designatedAmount
     */
    public Double getDesignatedAmount() {
        return designatedAmount;
    }

    public void setDesignatedAmount(Double designatedAmount) {
        this.designatedAmount = designatedAmount;
    }

    public AccountBalanceV3 withCreditAmount(Double creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }

    


    /**
     * 总信用额度，仅信用账户存在该字段。
     * @return creditAmount
     */
    public Double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public AccountBalanceV3 withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    


    /**
     * 度量单位。 1：元
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
        AccountBalanceV3 accountBalanceV3 = (AccountBalanceV3) o;
        return Objects.equals(this.accountId, accountBalanceV3.accountId) &&
            Objects.equals(this.accountType, accountBalanceV3.accountType) &&
            Objects.equals(this.amount, accountBalanceV3.amount) &&
            Objects.equals(this.currency, accountBalanceV3.currency) &&
            Objects.equals(this.designatedAmount, accountBalanceV3.designatedAmount) &&
            Objects.equals(this.creditAmount, accountBalanceV3.creditAmount) &&
            Objects.equals(this.measureId, accountBalanceV3.measureId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(accountId, accountType, amount, currency, designatedAmount, creditAmount, measureId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountBalanceV3 {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    designatedAmount: ").append(toIndentedString(designatedAmount)).append("\n");
        sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
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

