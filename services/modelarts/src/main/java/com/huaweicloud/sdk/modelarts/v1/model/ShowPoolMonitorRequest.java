package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowPoolMonitorRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_name")

    private String poolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_range")

    private String timeRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics")

    private String statistics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    public ShowPoolMonitorRequest withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * **参数解释**：资源池的ID，取值自资源池详情的metadata.name字段。 **约束限制**：不涉及。 **取值范围**：只能以小写字母开头，数字、中划线组成，不能以中划线结尾，且长度为[36-63]个字符。 **默认取值**：不涉及。
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public ShowPoolMonitorRequest withTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    /**
     * **参数解释**：查询资源池监控信息的时间范围，格式为startTimeInMillis.endTimeInMillis.durationInMinutes。其中，startTimeInMillis表示查询的开始时间，格式为UTC毫秒，如果指定为-1，服务端将按(endTimeInMillis - durationInMinutes * 60 * 1000)计算开始时间。endTimeInMillis表示查询的结束时间，格式为UTC毫秒，如果指定为-1，服务端将按(startTimeInMillis + durationInMinutes * 60 * 1000)计算结束时间，如果计算出的结束时间大于当前系统时间，则使用当前系统时间。durationInMinutes表示查询时间的跨度分钟数。 取值范围大于0并且小于等于(endTimeInMillis - startTimeInMillis) / (60 * 1000) - 1。当开始时间与结束时间都设置为-1时，系统会将结束时间设置为当前时间UTC毫秒值，并按(endTimeInMillis - durationInMinutes * 60 * 1000)计算开始时间。如：-1.-1.60(表示最近60分钟)。 **约束限制**：单次请求中，查询时长与周期需要满足以下条件: durationInMinutes * 60 / period <= 1440。 **取值范围**：不涉及。 **默认取值**：-1.-1.60。  查询时间范围，默认值“-1.-1.60”。格式为startTimeInMillis.endTimeInMillis.durationInMinutes，参数解释： - startTimeInMillis: 查询的开始时间，格式为UTC毫秒，如果指定为-1，服务端将按(endTimeInMillis - durationInMinutes * 60 * 1000)计算开始时间 - endTimeInMillis: 查询的结束时间，格式为UTC毫秒，如果指定为-1，服务端将按(startTimeInMillis + durationInMinutes * 60 * 1000)计算结束时间，如果计算出的结束时间大于当前系统时间，则使用当前系统时间 - durationInMinutes：查询时间的跨度分钟数。 取值范围大于0并且小于等于(endTimeInMillis - startTimeInMillis) / (60 * 1000) - 1 当开始时间与结束时间都设置为-1时，系统会将结束时间设置为当前时间UTC毫秒值，并按(endTimeInMillis - durationInMinutes * 60 * 1000)计算开始时间。如：-1.-1.60(表示最近60分钟)约束：单次请求中，查询时长与周期需要满足以下条件: durationInMinutes * 60 / period <= 1440。
     * @return timeRange
     */
    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public ShowPoolMonitorRequest withStatistics(String statistics) {
        this.statistics = statistics;
        return this;
    }

    /**
     * **参数解释**：资源池监控信息在指定时间粒度下的统计方式。 **约束限制**：不涉及。 **取值范围**：可选值如下： - maximum：最大值统计，默认值。 - minimum：最小值统计。 - sum：求和统计。 - average：平均值统计。 - sampleCount：采样统计。 **默认取值**：maximum。
     * @return statistics
     */
    public String getStatistics() {
        return statistics;
    }

    public void setStatistics(String statistics) {
        this.statistics = statistics;
    }

    public ShowPoolMonitorRequest withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * **参数解释**：查询资源池监控信息的时间粒度，以秒为单位。 **约束限制**：不涉及。 **取值范围**：可选值如下： - 60：粒度为1分钟，默认值。 - 300：粒度为5分钟。 - 900：粒度为15分钟。 - 3600：粒度为1小时。 **默认取值**：60。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPoolMonitorRequest that = (ShowPoolMonitorRequest) obj;
        return Objects.equals(this.poolName, that.poolName) && Objects.equals(this.timeRange, that.timeRange)
            && Objects.equals(this.statistics, that.statistics) && Objects.equals(this.period, that.period);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolName, timeRange, statistics, period);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPoolMonitorRequest {\n");
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
        sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
        sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
