package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class BankcardResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bank_name")

    private String bankName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "card_number")

    private String cardNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiry_date")

    private String expiryDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Object confidence;

    public BankcardResult withBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }

    /** 发卡行。
     * 
     * @return bankName */
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public BankcardResult withCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    /** 银行卡号。
     * 
     * @return cardNumber */
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public BankcardResult withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /** 有效期开始日期。
     * 
     * @return issueDate */
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public BankcardResult withExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /** 有效期截止日期。
     * 
     * @return expiryDate */
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public BankcardResult withType(String type) {
        this.type = type;
        return this;
    }

    /** 银行卡类别，如：储蓄卡，信用卡。
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BankcardResult withConfidence(Object confidence) {
        this.confidence = confidence;
        return this;
    }

    /** 相关字段的置信度信息，置信度越大，表示本次识别的对应字段的可靠性越高，在统计意义上，置信度越大，准确率越高。 置信度由算法给出，不直接等价于对应字段的准确率。
     * 
     * @return confidence */
    public Object getConfidence() {
        return confidence;
    }

    public void setConfidence(Object confidence) {
        this.confidence = confidence;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankcardResult bankcardResult = (BankcardResult) o;
        return Objects.equals(this.bankName, bankcardResult.bankName)
            && Objects.equals(this.cardNumber, bankcardResult.cardNumber)
            && Objects.equals(this.issueDate, bankcardResult.issueDate)
            && Objects.equals(this.expiryDate, bankcardResult.expiryDate)
            && Objects.equals(this.type, bankcardResult.type)
            && Objects.equals(this.confidence, bankcardResult.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankName, cardNumber, issueDate, expiryDate, type, confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BankcardResult {\n");
        sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
        sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
