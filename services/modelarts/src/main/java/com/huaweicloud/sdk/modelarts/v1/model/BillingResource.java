package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BillingResource
 */
public class BillingResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit_num")

    private Integer unitNum;

    public BillingResource withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释：** 计费码。 **取值范围：** 不涉及。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BillingResource withUnitNum(Integer unitNum) {
        this.unitNum = unitNum;
        return this;
    }

    /**
     * **参数解释：** 计费单元。 **取值范围：** 不涉及。
     * @return unitNum
     */
    public Integer getUnitNum() {
        return unitNum;
    }

    public void setUnitNum(Integer unitNum) {
        this.unitNum = unitNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BillingResource that = (BillingResource) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.unitNum, that.unitNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, unitNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingResource {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    unitNum: ").append(toIndentedString(unitNum)).append("\n");
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
