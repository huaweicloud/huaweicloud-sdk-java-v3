package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class IdcardFrontVerificationResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_number")

    private Boolean validNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_birth")

    private Boolean validBirth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_sex")

    private Boolean validSex;

    public IdcardFrontVerificationResult withValidNumber(Boolean validNumber) {
        this.validNumber = validNumber;
        return this;
    }

    /**
     * 身份证号规则校验是否通过。 - true：表示身份证号规则校验通过。 - false：表示身份证号规则校验不通过。 当识别结果为单页，身份证图片是国徽面时，默认是false。输入参数side为double_side时，该字典仅在front字段中存在。 仅在输入参数return_verification为true时，返回该字段。 
     * @return validNumber
     */
    public Boolean getValidNumber() {
        return validNumber;
    }

    public void setValidNumber(Boolean validNumber) {
        this.validNumber = validNumber;
    }

    public IdcardFrontVerificationResult withValidBirth(Boolean validBirth) {
        this.validBirth = validBirth;
        return this;
    }

    /**
     * 出生日期与身份证号所表示的出生日期是否一致。 - true：出生日期与身份证号所表示的出生日期一致。 - false：出生日期与身份证号所表示的出生日期不一致。 当识别结果为单页，身份证图片是国徽面，或者身份证号规则校验不通过时，默认是false。输入参数side为double_side时，该字段仅在front字典中存在。 仅在输入参数return_verification为true时，返回该字段。 
     * @return validBirth
     */
    public Boolean getValidBirth() {
        return validBirth;
    }

    public void setValidBirth(Boolean validBirth) {
        this.validBirth = validBirth;
    }

    public IdcardFrontVerificationResult withValidSex(Boolean validSex) {
        this.validSex = validSex;
        return this;
    }

    /**
     * 性别与身份证号所表示的性别信息是否一致。 -true：性别与身份证号所表示的性别信息一致 -false：性别与身份证号所表示的性别信息不一致。 当识别结果为单页，身份证图片是国徽面，或者身份证号规则校验不通过时，默认是false。输入参数side为double_side时，该字段仅在front字典中存在。 仅在输入参数return_verification为true时，返回该字段。 
     * @return validSex
     */
    public Boolean getValidSex() {
        return validSex;
    }

    public void setValidSex(Boolean validSex) {
        this.validSex = validSex;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdcardFrontVerificationResult that = (IdcardFrontVerificationResult) obj;
        return Objects.equals(this.validNumber, that.validNumber) && Objects.equals(this.validBirth, that.validBirth)
            && Objects.equals(this.validSex, that.validSex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(validNumber, validBirth, validSex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdcardFrontVerificationResult {\n");
        sb.append("    validNumber: ").append(toIndentedString(validNumber)).append("\n");
        sb.append("    validBirth: ").append(toIndentedString(validBirth)).append("\n");
        sb.append("    validSex: ").append(toIndentedString(validSex)).append("\n");
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
