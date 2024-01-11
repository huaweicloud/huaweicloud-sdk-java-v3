package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class IdcardBackVerificationResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_date")

    private Boolean validDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_validity_period")

    private Boolean validValidityPeriod;

    public IdcardBackVerificationResult withValidDate(Boolean validDate) {
        this.validDate = validDate;
        return this;
    }

    /**
     * 当前日期是否在有效期内。 - true：表示当前日期在有效期内。 - false：表示当前日期不在有效期内。 当识别结果为单页，身份证图片是人像面时，默认是false。输入参数side为double_side时，该字段仅在back字典中存在。 仅在输入参数return_verification为true时，返回该字段。 
     * @return validDate
     */
    public Boolean getValidDate() {
        return validDate;
    }

    public void setValidDate(Boolean validDate) {
        this.validDate = validDate;
    }

    public IdcardBackVerificationResult withValidValidityPeriod(Boolean validValidityPeriod) {
        this.validValidityPeriod = validValidityPeriod;
        return this;
    }

    /**
     * 身份证有效日期是否合法。 - true：表示身份证的有效日期合法 - false：表示身份证有效日期非法 当识别结果为单页，身份证图片是人像面时，默认是false。输入参数side为double_side时，该字段仅在back字典中存在。 仅在输入参数return_verification为true时，返回该字段。 
     * @return validValidityPeriod
     */
    public Boolean getValidValidityPeriod() {
        return validValidityPeriod;
    }

    public void setValidValidityPeriod(Boolean validValidityPeriod) {
        this.validValidityPeriod = validValidityPeriod;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdcardBackVerificationResult that = (IdcardBackVerificationResult) obj;
        return Objects.equals(this.validDate, that.validDate)
            && Objects.equals(this.validValidityPeriod, that.validValidityPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(validDate, validValidityPeriod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdcardBackVerificationResult {\n");
        sb.append("    validDate: ").append(toIndentedString(validDate)).append("\n");
        sb.append("    validValidityPeriod: ").append(toIndentedString(validValidityPeriod)).append("\n");
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
