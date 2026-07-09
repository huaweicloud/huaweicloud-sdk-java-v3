package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PoolMonitorDataPoints
 */
public class PoolMonitorDataPoints {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Integer timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics")

    private List<PoolMonitorStatistics> statistics = null;

    public PoolMonitorDataPoints withTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * **参数解释**：指标数据时间戳，以毫秒为单位。 **取值范围**：不涉及。
     * @return timestamp
     */
    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public PoolMonitorDataPoints withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * **参数解释**：指标数据单位。 **取值范围**：可选值如下： - Percent：百分比。 - Megabytes：兆字节。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public PoolMonitorDataPoints withStatistics(List<PoolMonitorStatistics> statistics) {
        this.statistics = statistics;
        return this;
    }

    public PoolMonitorDataPoints addStatisticsItem(PoolMonitorStatistics statisticsItem) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        this.statistics.add(statisticsItem);
        return this;
    }

    public PoolMonitorDataPoints withStatistics(Consumer<List<PoolMonitorStatistics>> statisticsSetter) {
        if (this.statistics == null) {
            this.statistics = new ArrayList<>();
        }
        statisticsSetter.accept(this.statistics);
        return this;
    }

    /**
     * **参数解释**：指标数据值。
     * @return statistics
     */
    public List<PoolMonitorStatistics> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<PoolMonitorStatistics> statistics) {
        this.statistics = statistics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolMonitorDataPoints that = (PoolMonitorDataPoints) obj;
        return Objects.equals(this.timestamp, that.timestamp) && Objects.equals(this.unit, that.unit)
            && Objects.equals(this.statistics, that.statistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, unit, statistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolMonitorDataPoints {\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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
