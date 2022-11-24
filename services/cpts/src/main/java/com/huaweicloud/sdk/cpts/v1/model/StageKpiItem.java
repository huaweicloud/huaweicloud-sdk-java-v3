package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StageKpiItem
 */
public class StageKpiItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comparison")

    private String comparison;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Integer value;

    public StageKpiItem withComparison(String comparison) {
        this.comparison = comparison;
        return this;
    }

    /**
     * 比较符
     * @return comparison
     */
    public String getComparison() {
        return comparison;
    }

    public void setComparison(String comparison) {
        this.comparison = comparison;
    }

    public StageKpiItem withValue(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * 比较值
     * @return value
     */
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StageKpiItem stageKpiItem = (StageKpiItem) o;
        return Objects.equals(this.comparison, stageKpiItem.comparison)
            && Objects.equals(this.value, stageKpiItem.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comparison, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StageKpiItem {\n");
        sb.append("    comparison: ").append(toIndentedString(comparison)).append("\n");
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
