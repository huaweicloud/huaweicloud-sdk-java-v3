package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * **参数解释**：资源池指标信息。 
 */
public class ComputeMetric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compute_name")

    private String computeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compute_value")

    private BigDecimal computeValue;

    public ComputeMetric withComputeName(String computeName) {
        this.computeName = computeName;
        return this;
    }

    /**
     * **参数解释**：资源池名称。 **取值范围**：长度为1~63个字符。 
     * @return computeName
     */
    public String getComputeName() {
        return computeName;
    }

    public void setComputeName(String computeName) {
        this.computeName = computeName;
    }

    public ComputeMetric withComputeValue(BigDecimal computeValue) {
        this.computeValue = computeValue;
        return this;
    }

    /**
     * **参数解释**：资源池指标值。 **取值范围**：0~100。 
     * @return computeValue
     */
    public BigDecimal getComputeValue() {
        return computeValue;
    }

    public void setComputeValue(BigDecimal computeValue) {
        this.computeValue = computeValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComputeMetric that = (ComputeMetric) obj;
        return Objects.equals(this.computeName, that.computeName)
            && Objects.equals(this.computeValue, that.computeValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(computeName, computeValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComputeMetric {\n");
        sb.append("    computeName: ").append(toIndentedString(computeName)).append("\n");
        sb.append("    computeValue: ").append(toIndentedString(computeValue)).append("\n");
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
