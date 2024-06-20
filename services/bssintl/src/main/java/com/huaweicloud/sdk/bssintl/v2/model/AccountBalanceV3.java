package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * AccountBalanceV3
 */
public class AccountBalanceV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_type")

    private Integer accountType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private BigDecimal amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "designated_amount")

    private BigDecimal designatedAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credit_amount")

    private BigDecimal creditAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

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
     * 账户类型。 1：余额2：信用5：奖励金7：保证金
     * @return accountType
     */
    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public AccountBalanceV3 withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 账户余额。
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public AccountBalanceV3 withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * 币种。 USD：美元。
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public AccountBalanceV3 withDesignatedAmount(BigDecimal designatedAmount) {
        this.designatedAmount = designatedAmount;
        return this;
    }

    /**
     * 专款专用余额。
     * @return designatedAmount
     */
    public BigDecimal getDesignatedAmount() {
        return designatedAmount;
    }

    public void setDesignatedAmount(BigDecimal designatedAmount) {
        this.designatedAmount = designatedAmount;
    }

    public AccountBalanceV3 withCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }

    /**
     * 总信用额度，仅信用账户存在该字段。
     * @return creditAmount
     */
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccountBalanceV3 that = (AccountBalanceV3) obj;
        return Objects.equals(this.accountId, that.accountId) && Objects.equals(this.accountType, that.accountType)
            && Objects.equals(this.amount, that.amount) && Objects.equals(this.currency, that.currency)
            && Objects.equals(this.designatedAmount, that.designatedAmount)
            && Objects.equals(this.creditAmount, that.creditAmount) && Objects.equals(this.measureId, that.measureId);
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
