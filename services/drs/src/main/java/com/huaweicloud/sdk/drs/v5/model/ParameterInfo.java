package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 任务参数配置信息
 */
public class ParameterInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameter_name")

    private String parameterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameter_value")

    private String parameterValue;

    public ParameterInfo withParameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    /**
     * 参数名称，如：“applier_thread_num”，“read_task_num”等
     * @return parameterName
     */
    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public ParameterInfo withParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
        return this;
    }

    /**
     * 参数名称对应的参数值，如：“20”，“false”
     * @return parameterValue
     */
    public String getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ParameterInfo that = (ParameterInfo) obj;
        return Objects.equals(this.parameterName, that.parameterName)
            && Objects.equals(this.parameterValue, that.parameterValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameterName, parameterValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParameterInfo {\n");
        sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
        sb.append("    parameterValue: ").append(toIndentedString(parameterValue)).append("\n");
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
