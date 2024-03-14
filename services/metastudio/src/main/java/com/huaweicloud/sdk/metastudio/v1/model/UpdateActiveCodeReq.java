package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改激活码请求。
 */
public class UpdateActiveCodeReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_period")

    private Integer validPeriod;

    public UpdateActiveCodeReq withValidPeriod(Integer validPeriod) {
        this.validPeriod = validPeriod;
        return this;
    }

    /**
     * 有效天数（0表示长期有效）。
     * minimum: 0
     * maximum: 65535
     * @return validPeriod
     */
    public Integer getValidPeriod() {
        return validPeriod;
    }

    public void setValidPeriod(Integer validPeriod) {
        this.validPeriod = validPeriod;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateActiveCodeReq that = (UpdateActiveCodeReq) obj;
        return Objects.equals(this.validPeriod, that.validPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(validPeriod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateActiveCodeReq {\n");
        sb.append("    validPeriod: ").append(toIndentedString(validPeriod)).append("\n");
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
