package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OperationalTaskConfiguration
 */
public class OperationalTaskConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel_min")

    private Integer parallelMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel_max")

    private Integer parallelMax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "small_cu_rows_limit")

    private Integer smallCuRowsLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "small_cu_percentage")

    private Double smallCuPercentage;

    public OperationalTaskConfiguration withParallelMin(Integer parallelMin) {
        this.parallelMin = parallelMin;
        return this;
    }

    /**
     * **参数解释**： 用户表VacuumFull运维任务最小并发数。 **约束限制**： 不涉及。 **取值范围**： 1~24 **默认取值**： 不涉及。
     * @return parallelMin
     */
    public Integer getParallelMin() {
        return parallelMin;
    }

    public void setParallelMin(Integer parallelMin) {
        this.parallelMin = parallelMin;
    }

    public OperationalTaskConfiguration withParallelMax(Integer parallelMax) {
        this.parallelMax = parallelMax;
        return this;
    }

    /**
     * **参数解释**： 用户表VacuumFull运维任务最大并发数。 **约束限制**： 不涉及。 **取值范围**： 1~24 **默认取值**： 不涉及。
     * @return parallelMax
     */
    public Integer getParallelMax() {
        return parallelMax;
    }

    public void setParallelMax(Integer parallelMax) {
        this.parallelMax = parallelMax;
    }

    public OperationalTaskConfiguration withSmallCuRowsLimit(Integer smallCuRowsLimit) {
        this.smallCuRowsLimit = smallCuRowsLimit;
        return this;
    }

    /**
     * **参数解释**： 小CU阈值。 **约束限制**： 不涉及。 **取值范围**： 0~1000。 **默认取值**： 不涉及。
     * @return smallCuRowsLimit
     */
    public Integer getSmallCuRowsLimit() {
        return smallCuRowsLimit;
    }

    public void setSmallCuRowsLimit(Integer smallCuRowsLimit) {
        this.smallCuRowsLimit = smallCuRowsLimit;
    }

    public OperationalTaskConfiguration withSmallCuPercentage(Double smallCuPercentage) {
        this.smallCuPercentage = smallCuPercentage;
        return this;
    }

    /**
     * **参数解释**： 小CU占比。 **约束限制**： 不涉及。 **取值范围**： 0.01~99.99。 **默认取值**： 不涉及。
     * @return smallCuPercentage
     */
    public Double getSmallCuPercentage() {
        return smallCuPercentage;
    }

    public void setSmallCuPercentage(Double smallCuPercentage) {
        this.smallCuPercentage = smallCuPercentage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperationalTaskConfiguration that = (OperationalTaskConfiguration) obj;
        return Objects.equals(this.parallelMin, that.parallelMin) && Objects.equals(this.parallelMax, that.parallelMax)
            && Objects.equals(this.smallCuRowsLimit, that.smallCuRowsLimit)
            && Objects.equals(this.smallCuPercentage, that.smallCuPercentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parallelMin, parallelMax, smallCuRowsLimit, smallCuPercentage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperationalTaskConfiguration {\n");
        sb.append("    parallelMin: ").append(toIndentedString(parallelMin)).append("\n");
        sb.append("    parallelMax: ").append(toIndentedString(parallelMax)).append("\n");
        sb.append("    smallCuRowsLimit: ").append(toIndentedString(smallCuRowsLimit)).append("\n");
        sb.append("    smallCuPercentage: ").append(toIndentedString(smallCuPercentage)).append("\n");
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
