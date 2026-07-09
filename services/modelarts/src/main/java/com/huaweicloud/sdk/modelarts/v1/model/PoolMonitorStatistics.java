package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PoolMonitorStatistics
 */
public class PoolMonitorStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistic")

    private String statistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Float value;

    public PoolMonitorStatistics withStatistic(String statistic) {
        this.statistic = statistic;
        return this;
    }

    /**
     * **参数解释**：资源池监控信息在指定时间粒度下的统计方式。 **取值范围**：可选值如下： - maximum：最大值统计，默认值。 - minimum：最小值统计。 - sum：求和统计。 - average：平均值统计。 - sampleCount：采样统计。
     * @return statistic
     */
    public String getStatistic() {
        return statistic;
    }

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    public PoolMonitorStatistics withValue(Float value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**：指标数据的值，值为-1时表示无该指标数据。 **取值范围**：不涉及。
     * @return value
     */
    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
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
        PoolMonitorStatistics that = (PoolMonitorStatistics) obj;
        return Objects.equals(this.statistic, that.statistic) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statistic, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolMonitorStatistics {\n");
        sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
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
