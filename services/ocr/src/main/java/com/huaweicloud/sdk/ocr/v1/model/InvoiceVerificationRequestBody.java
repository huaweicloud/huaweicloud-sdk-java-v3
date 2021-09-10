package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class InvoiceVerificationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_code")

    private String checkCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtotal_amount")

    private String subtotalAmount;

    public InvoiceVerificationRequestBody withCode(String code) {
        this.code = code;
        return this;
    }

    /** 发票代码
     * 
     * @return code */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public InvoiceVerificationRequestBody withNumber(String number) {
        this.number = number;
        return this;
    }

    /** 发票号码
     * 
     * @return number */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public InvoiceVerificationRequestBody withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /** 发票日期格式YYYY-MM-DD
     * 
     * @return issueDate */
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public InvoiceVerificationRequestBody withCheckCode(String checkCode) {
        this.checkCode = checkCode;
        return this;
    }

    /** 校验码后六位 发票种类为增值税普通发票、增值税电子普通发票、增值税普通发票（卷式）、增值税电子普通发票（通行费）、区块链电子发票时此项不可为空（区块链电子发票验真时，填写的是5位校验码）
     * 
     * @return checkCode */
    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public InvoiceVerificationRequestBody withSubtotalAmount(String subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
        return this;
    }

    /** 合计金额（不含税） 1.发票种类为增值税专用发票、增值税电子专用发票、机动车销售统一发票、二手车销售统一发票、区块链电子发票时不可为空；
     * 2.增值税专用发票、增值税电子专用发票、机动车销售统一发票、区块链电子发票填写发票合计金额（不含税），二手车发票填写发票车价合计
     * 
     * @return subtotalAmount */
    public String getSubtotalAmount() {
        return subtotalAmount;
    }

    public void setSubtotalAmount(String subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InvoiceVerificationRequestBody invoiceVerificationRequestBody = (InvoiceVerificationRequestBody) o;
        return Objects.equals(this.code, invoiceVerificationRequestBody.code)
            && Objects.equals(this.number, invoiceVerificationRequestBody.number)
            && Objects.equals(this.issueDate, invoiceVerificationRequestBody.issueDate)
            && Objects.equals(this.checkCode, invoiceVerificationRequestBody.checkCode)
            && Objects.equals(this.subtotalAmount, invoiceVerificationRequestBody.subtotalAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, number, issueDate, checkCode, subtotalAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvoiceVerificationRequestBody {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    checkCode: ").append(toIndentedString(checkCode)).append("\n");
        sb.append("    subtotalAmount: ").append(toIndentedString(subtotalAmount)).append("\n");
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
