package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 索引使用过滤条件
 */
public class IndexUsageCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field")

    private String field;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_value")

    private Double minValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_value")

    private Double maxValue;

    public IndexUsageCondition withField(String field) {
        this.field = field;
        return this;
    }

    /**
     * 过滤字段
     * @return field
     */
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public IndexUsageCondition withMinValue(Double minValue) {
        this.minValue = minValue;
        return this;
    }

    /**
     * 最小值
     * @return minValue
     */
    public Double getMinValue() {
        return minValue;
    }

    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }

    public IndexUsageCondition withMaxValue(Double maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    /**
     * 最大值
     * @return maxValue
     */
    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IndexUsageCondition that = (IndexUsageCondition) obj;
        return Objects.equals(this.field, that.field) && Objects.equals(this.minValue, that.minValue)
            && Objects.equals(this.maxValue, that.maxValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field, minValue, maxValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndexUsageCondition {\n");
        sb.append("    field: ").append(toIndentedString(field)).append("\n");
        sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
        sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
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
