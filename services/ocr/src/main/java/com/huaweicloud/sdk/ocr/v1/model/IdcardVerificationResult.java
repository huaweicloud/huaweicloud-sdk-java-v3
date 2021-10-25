package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 校验信息。仅在输入参数return_verification为true时返回该字段。 */
public class IdcardVerificationResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_number")

    private Boolean validNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_birth")

    private Boolean validBirth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_sex")

    private Boolean validSex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_date")

    private Boolean validDate;

    public IdcardVerificationResult withValidNumber(Boolean validNumber) {
        this.validNumber = validNumber;
        return this;
    }

    /** 身份证号合法。校验规则为：将身份证号前17位数字分别乘以7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4,
     * 2，再求和，求和结果对11取模，取模结果作为数组[1,0,X,9,8,7,6,5,4,3,2]的下标，从里面取出一位结果，例如取模结果为0，则从数组里取出来的结果是1，最后判断从数组里面取出来的结果是否和身份证号最后一位是否一致。如果一致，代表身份证号合法，返回true，否则代表身份证号不合法，返回false。
     * 当身份证图片是背面时，默认是false。
     * 
     * @return validNumber */
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

    /** 身份证号与出生日期一致。出生日期和身份证号的第7位和第14位之间表示的出生日期是否一致。一致返回true，否则返回false。 当身份证图片是背面时，默认是false。
     * 
     * @return validBirth */
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

    /** 身份证号与性别一致。性别和身份证号的第17位表示的性别信息是否一致。身份证号的第17位如果为奇数表示男性，偶数表示女性。一致返回true，否则返回false。 当身份证图片是背面时，默认是false。
     * 
     * @return validSex */
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

    /** 当前日期在有效期内。当前日期在身份证有效期内返回true，否则返回false。 当身份证图片是正面时，默认是false。
     * 
     * @return validDate */
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
