package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 库配置列表。
 */
public class ChDatabaseConfigsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_name")

    private String paramName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public ChDatabaseConfigsInfo withParamName(String paramName) {
        this.paramName = paramName;
        return this;
    }

    /**
     * 库同步配置参数名。可通过“查询ClickHouse数据同步的库参数配置”接口查询。
     * @return paramName
     */
    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public ChDatabaseConfigsInfo withValue(String value) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChDatabaseConfigsInfo that = (ChDatabaseConfigsInfo) obj;
        return Objects.equals(this.paramName, that.paramName) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paramName, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChDatabaseConfigsInfo {\n");
        sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
