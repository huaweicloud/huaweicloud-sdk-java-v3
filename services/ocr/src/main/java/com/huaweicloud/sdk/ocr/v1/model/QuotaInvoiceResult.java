package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** QuotaInvoiceResult */
public class QuotaInvoiceResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private String amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Object confidence;

    public QuotaInvoiceResult withNumber(String number) {
        this.number = number;
        return this;
    }

    /** 发票号码。
     * 
     * @return number */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public QuotaInvoiceResult withCode(String code) {
        this.code = code;
        return this;
    }

    /** 发票代码。
     * 
     * @return code */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public QuotaInvoiceResult withLocation(String location) {
        this.location = location;
        return this;
    }

    /** 地址。
     * 
     * @return location */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public QuotaInvoiceResult withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    /** 发票金额。
     * 
     * @return amount */
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public QuotaInvoiceResult withConfidence(Object confidence) {
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
        QuotaInvoiceResult quotaInvoiceResult = (QuotaInvoiceResult) o;
        return Objects.equals(this.number, quotaInvoiceResult.number)
            && Objects.equals(this.code, quotaInvoiceResult.code)
            && Objects.equals(this.location, quotaInvoiceResult.location)
            && Objects.equals(this.amount, quotaInvoiceResult.amount)
            && Objects.equals(this.confidence, quotaInvoiceResult.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, code, location, amount, confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaInvoiceResult {\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
