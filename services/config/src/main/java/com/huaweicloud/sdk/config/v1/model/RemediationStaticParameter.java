package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 合规规则修正执行的静态参数。
 */
public class RemediationStaticParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "var_key")

    private String varKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "var_value")

    private Object varValue;

    public RemediationStaticParameter withVarKey(String varKey) {
        this.varKey = varKey;
        return this;
    }

    /**
     * 参数名称。
     * @return varKey
     */
    public String getVarKey() {
        return varKey;
    }

    public void setVarKey(String varKey) {
        this.varKey = varKey;
    }

    public RemediationStaticParameter withVarValue(Object varValue) {
        this.varValue = varValue;
        return this;
    }

    /**
     * 参数的值。
     * @return varValue
     */
    public Object getVarValue() {
        return varValue;
    }

    public void setVarValue(Object varValue) {
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
        RemediationStaticParameter that = (RemediationStaticParameter) obj;
        return Objects.equals(this.varKey, that.varKey) && Objects.equals(this.varValue, that.varValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(varKey, varValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemediationStaticParameter {\n");
        sb.append("    varKey: ").append(toIndentedString(varKey)).append("\n");
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
