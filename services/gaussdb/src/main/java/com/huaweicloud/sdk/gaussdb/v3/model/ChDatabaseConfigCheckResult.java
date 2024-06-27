package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 库配置校验检查结果。
 */
public class ChDatabaseConfigCheckResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_name")

    private String paramName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_result")

    private String checkResult;

    public ChDatabaseConfigCheckResult withParamName(String paramName) {
        this.paramName = paramName;
        return this;
    }

    /**
     * 库同步配置参数名。
     * @return paramName
     */
    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public ChDatabaseConfigCheckResult withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 库同步配置参数值。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ChDatabaseConfigCheckResult withCheckResult(String checkResult) {
        this.checkResult = checkResult;
        return this;
    }

    /**
     * 校验结果。 取值范围： - success：成功 - fail：失败
     * @return checkResult
     */
    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChDatabaseConfigCheckResult that = (ChDatabaseConfigCheckResult) obj;
        return Objects.equals(this.paramName, that.paramName) && Objects.equals(this.value, that.value)
            && Objects.equals(this.checkResult, that.checkResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paramName, value, checkResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChDatabaseConfigCheckResult {\n");
        sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    checkResult: ").append(toIndentedString(checkResult)).append("\n");
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
