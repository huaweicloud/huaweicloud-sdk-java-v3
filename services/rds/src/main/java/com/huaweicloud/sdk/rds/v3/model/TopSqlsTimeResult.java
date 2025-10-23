package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TopSqlsTimeResult
 */
public class TopSqlsTimeResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public TopSqlsTimeResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 对查询计算的二进制哈希值，用于标识具有类似逻辑的查询。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TopSqlsTimeResult withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 数据类型。取值范围： AvgWorkerTime 平均CPU开销 AvgDuration 平均执行耗时 TotalWorkerTime 总CPU开销 TotalDuration 总执行耗时
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public TopSqlsTimeResult withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 耗时时间，单位ms。
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
        TopSqlsTimeResult that = (TopSqlsTimeResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataType, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopSqlsTimeResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
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
