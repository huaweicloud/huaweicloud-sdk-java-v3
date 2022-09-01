package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 校验信息。仅在输入参数return_verification为true时，返回该字段，该字段包含valid_number、valid_birth、valid_sex和valid_date的校验信息。
 */
public class IdcardVerificationResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_number")

    @JacksonXmlProperty(localName = "valid_number")

    private Boolean validNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_birth")

    @JacksonXmlProperty(localName = "valid_birth")

    private Boolean validBirth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_sex")

    @JacksonXmlProperty(localName = "valid_sex")

    private Boolean validSex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_date")

    @JacksonXmlProperty(localName = "valid_date")

    private Boolean validDate;

    public IdcardVerificationResult withValidNumber(Boolean validNumber) {
        this.validNumber = validNumber;
        return this;
    }

    /**
     * 身份证号规则校验是否通过。“true”表示身份证号规则校验通过，“false”表示身份证号规则校验不通过。当身份证图片是国徽面时，默认是false。仅在输入参数return_verification为true时，返回该字段。 
     * @return validNumber
     */
    public Boolean getValidNumber() {
        return validNumber;
    }

    public void setValidNumber(Boolean validNumber) {
        this.validNumber = validNumber;
    }

    public IdcardVerificationResult withValidBirth(Boolean validBirth) {
        this.validBirth = validBirth;
        return this;
    }

    /**
     * 出生日期与身份证号所表示的出生日期是否一致。“true”表示一致，“false”表示不一致。当身份证图片是国徽面，或者身份证号规则校验不通过时，默认是false。仅在输入参数return_verification为true时，返回该字段。 
     * @return validBirth
     */
    public Boolean getValidBirth() {
        return validBirth;
    }

    public void setValidBirth(Boolean validBirth) {
        this.validBirth = validBirth;
    }

    public IdcardVerificationResult withValidSex(Boolean validSex) {
        this.validSex = validSex;
        return this;
    }

    /**
     * 性别与身份证号所表示的性别信息是否一致。“true”表示一致，“false”表示不一致。当身份证图片是国徽面，或者身份证号规则校验不通过时，默认是false。仅在输入参数return_verification为true时，返回该字段。 
     * @return validSex
     */
    public Boolean getValidSex() {
        return validSex;
    }

    public void setValidSex(Boolean validSex) {
        this.validSex = validSex;
    }

    public IdcardVerificationResult withValidDate(Boolean validDate) {
        this.validDate = validDate;
        return this;
    }

    /**
     * 当前日期是否在有效期内。“true”表示当前日期在有效期内，“false”表示当前日期不在有效期内。当身份证图片是人像面时，默认是false。仅在输入参数return_verification为true时，返回该字段。 
     * @return validDate
     */
    public Boolean getValidDate() {
        return validDate;
    }

    public void setValidDate(Boolean validDate) {
        this.validDate = validDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdcardVerificationResult idcardVerificationResult = (IdcardVerificationResult) o;
        return Objects.equals(this.validNumber, idcardVerificationResult.validNumber)
            && Objects.equals(this.validBirth, idcardVerificationResult.validBirth)
            && Objects.equals(this.validSex, idcardVerificationResult.validSex)
            && Objects.equals(this.validDate, idcardVerificationResult.validDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(validNumber, validBirth, validSex, validDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdcardVerificationResult {\n");
        sb.append("    validNumber: ").append(toIndentedString(validNumber)).append("\n");
        sb.append("    validBirth: ").append(toIndentedString(validBirth)).append("\n");
        sb.append("    validSex: ").append(toIndentedString(validSex)).append("\n");
        sb.append("    validDate: ").append(toIndentedString(validDate)).append("\n");
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
