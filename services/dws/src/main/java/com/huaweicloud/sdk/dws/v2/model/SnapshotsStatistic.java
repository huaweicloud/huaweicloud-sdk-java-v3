package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 快照统计信息。
 */
public class SnapshotsStatistic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private BigDecimal value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    public SnapshotsStatistic withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资源统计信息名称。 - storage.free：免费容量。 - storage.paid：付费容量。 - storage.used：已用容量。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SnapshotsStatistic withValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    /**
     * 资源统计信息值。
     * @return value
     */
    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public SnapshotsStatistic withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 资源统计信息单位。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SnapshotsStatistic snapshotsStatistic = (SnapshotsStatistic) o;
        return Objects.equals(this.name, snapshotsStatistic.name)
            && Objects.equals(this.value, snapshotsStatistic.value)
            && Objects.equals(this.unit, snapshotsStatistic.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnapshotsStatistic {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
