package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateGlobalVariableRequestBody
 */
public class UpdateGlobalVariableRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "var_value")

    private String varValue;

    public UpdateGlobalVariableRequestBody withVarValue(String varValue) {
        this.varValue = varValue;
        return this;
    }

    /**
     * 变量值
     * @return varValue
     */
    public String getVarValue() {
        return varValue;
    }

    public void setVarValue(String varValue) {
        this.varValue = varValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateGlobalVariableRequestBody that = (UpdateGlobalVariableRequestBody) obj;
        return Objects.equals(this.varValue, that.varValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(varValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGlobalVariableRequestBody {\n");
        sb.append("    varValue: ").append(toIndentedString(varValue)).append("\n");
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
