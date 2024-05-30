package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StatisticSchema
 */
public class StatisticSchema {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "increase")

    private Integer increase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standard_coverage")

    private Double standardCoverage;

    public StatisticSchema withIncrease(Integer increase) {
        this.increase = increase;
        return this;
    }

    /**
     * 本月新增。
     * @return increase
     */
    public Integer getIncrease() {
        return increase;
    }

    public void setIncrease(Integer increase) {
        this.increase = increase;
    }

    public StatisticSchema withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总量。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public StatisticSchema withStandardCoverage(Double standardCoverage) {
        this.standardCoverage = standardCoverage;
        return this;
    }

    /**
     * 标准覆盖率。
     * @return standardCoverage
     */
    public Double getStandardCoverage() {
        return standardCoverage;
    }

    public void setStandardCoverage(Double standardCoverage) {
        this.standardCoverage = standardCoverage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatisticSchema that = (StatisticSchema) obj;
        return Objects.equals(this.increase, that.increase) && Objects.equals(this.total, that.total)
            && Objects.equals(this.standardCoverage, that.standardCoverage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(increase, total, standardCoverage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticSchema {\n");
        sb.append("    increase: ").append(toIndentedString(increase)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    standardCoverage: ").append(toIndentedString(standardCoverage)).append("\n");
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
