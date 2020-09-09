package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AccountBalanceV2
 */
public class AccountBalanceV2  {



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
    @JsonProperty(value="credit_amount")
    
    private Double creditAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="currency")
    
    private String currency = "CNY";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="designated_amount")
    
    private Double designatedAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_id")
    
    private Integer measureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="memo")
    
    private String memo;

    public AccountBalanceV2 withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    


    /**
     * |参数名称：账户标识。| |参数约束及描述：账户标识。|
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public AccountBalanceV2 withAccountType(Integer accountType) {
        this.accountType = accountType;
        return this;
    }

    


    /**
     * |参数名称：账户类型：1：余额2：信用5：奖励7：保证金8：可拨款| |参数的约束及描述：账户类型：1：余额2：信用5：奖励7：保证金8：可拨款|
     * @return accountType
     */
    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public AccountBalanceV2 withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    


    /**
     * |参数名称：余额。| |参数的约束及描述：余额。|
     * @return amount
     */
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public AccountBalanceV2 withCreditAmount(Double creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }

    


    /**
     * |参数名称：总信用额度。只有账户类型是2:信用的时候才有该字段| |参数的约束及描述：总信用额度。只有账户类型是2:信用的时候才有该字段|
     * @return creditAmount
     */
    public Double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public AccountBalanceV2 withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    


    /**
     * |参数名称：币种。当前固定为CNY。| |参数约束及描述：币种。当前固定为CNY。|
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public AccountBalanceV2 withDesignatedAmount(Double designatedAmount) {
        this.designatedAmount = designatedAmount;
        return this;
    }

    


    /**
     * |参数名称：专款专用余额。| |参数的约束及描述：专款专用余额。|
     * @return designatedAmount
     */
    public Double getDesignatedAmount() {
        return designatedAmount;
    }

    public void setDesignatedAmount(Double designatedAmount) {
        this.designatedAmount = designatedAmount;
    }

    public AccountBalanceV2 withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    


    /**
     * |参数名称：度量单位。1：元。| |参数的约束及描述：度量单位。1：元。|
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public AccountBalanceV2 withMemo(String memo) {
        this.memo = memo;
        return this;
    }

    


    /**
     * |参数名称：备注。| |参数约束及描述：备注。|
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountBalanceV2 accountBalanceV2 = (AccountBalanceV2) o;
        return Objects.equals(this.accountId, accountBalanceV2.accountId) &&
            Objects.equals(this.accountType, accountBalanceV2.accountType) &&
            Objects.equals(this.amount, accountBalanceV2.amount) &&
            Objects.equals(this.creditAmount, accountBalanceV2.creditAmount) &&
            Objects.equals(this.currency, accountBalanceV2.currency) &&
            Objects.equals(this.designatedAmount, accountBalanceV2.designatedAmount) &&
            Objects.equals(this.measureId, accountBalanceV2.measureId) &&
            Objects.equals(this.memo, accountBalanceV2.memo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(accountId, accountType, amount, creditAmount, currency, designatedAmount, measureId, memo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountBalanceV2 {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    designatedAmount: ").append(toIndentedString(designatedAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
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

