package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * EnvVariableBase
 */
public class EnvVariableBase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_value")

    @JacksonXmlProperty(localName = "variable_value")

    private String variableValue;

    public EnvVariableBase withVariableValue(String variableValue) {
        this.variableValue = variableValue;
        return this;
    }

    /**
     * 变量值支持英文字母、数字、英文格式的下划线、中划线，斜线（/）、点、冒号，1 ~ 255个字符。
     * @return variableValue
     */
    public String getVariableValue() {
        return variableValue;
    }

    public void setVariableValue(String variableValue) {
        this.variableValue = variableValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvVariableBase envVariableBase = (EnvVariableBase) o;
        return Objects.equals(this.variableValue, envVariableBase.variableValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variableValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvVariableBase {\n");
        sb.append("    variableValue: ").append(toIndentedString(variableValue)).append("\n");
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
