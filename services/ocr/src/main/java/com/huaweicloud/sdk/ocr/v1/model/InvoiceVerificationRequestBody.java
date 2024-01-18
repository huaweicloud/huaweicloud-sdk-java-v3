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

    /**
     * 发票代码。发票种类为全电发票时，该参数须为空字符串。
     * @return code
     */
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

    /**
     * 发票号码
     * @return number
     */
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

    /**
     * 发票日期格式YYYY-MM-DD
     * @return issueDate
     */
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

    /**
     * 校验码后六位。 - 以下种类发票，参数不可为空    增值税普通发票、增值税电子普通发票、增值税普通发票（卷式）、增值税电子普通发票（通行费）、区块链电子发票。  - 区块链电子发票需要填写5位校验码。 
     * @return checkCode
     */
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

    /**
     * 合计金额。和票据上的金额的有效数字保持一致，例如票据上的金额为88.00，则需要输入字符串为“88.00”，才能验真成功。如果输入“88”或“88.0”可能会产生\"result_code\": \"1010\", \" Parameter error.\"报错。  发票种类为全电发票时，该参数须为价税合计金额，其他票种使用不含税合计金额。  - 以下种类发票，参数不可为空    增值税专用发票、增值税电子专用发票、机动车销售统一发票、二手车销售统一发票、区块链电子发票、全电发票。  - 填写发票合计金额（不含税）    增值税专用发票、增值税电子专用发票、机动车销售统一发票、区块链电子发票。  - 二手车发票需要填写发票车价合计金额 
     * @return subtotalAmount
     */
    public String getSubtotalAmount() {
        return subtotalAmount;
    }

    public void setSubtotalAmount(String subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InvoiceVerificationRequestBody that = (InvoiceVerificationRequestBody) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.number, that.number)
            && Objects.equals(this.issueDate, that.issueDate) && Objects.equals(this.checkCode, that.checkCode)
            && Objects.equals(this.subtotalAmount, that.subtotalAmount);
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
