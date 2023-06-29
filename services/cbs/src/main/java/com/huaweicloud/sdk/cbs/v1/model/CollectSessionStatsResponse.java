package com.huaweicloud.sdk.cbs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CollectSessionStatsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private String interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private SessionStatsTotal total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intervals")

    private List<SessionStatsIntervals> intervals = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startutc")

    private Long startutc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endutc")

    private Long endutc;

    public CollectSessionStatsResponse withInterval(String interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 统计周期目前支持year、month、week、day。
     * @return interval
     */
    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public CollectSessionStatsResponse withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 所在时区，默认为\"utc\"。例如：中国东八区为\"+08:00\"；美国西五区为\"-05:00\"。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public CollectSessionStatsResponse withTotal(SessionStatsTotal total) {
        this.total = total;
        return this;
    }

    public CollectSessionStatsResponse withTotal(Consumer<SessionStatsTotal> totalSetter) {
        if (this.total == null) {
            this.total = new SessionStatsTotal();
            totalSetter.accept(this.total);
        }

        return this;
    }

    /**
     * Get total
     * @return total
     */
    public SessionStatsTotal getTotal() {
        return total;
    }

    public void setTotal(SessionStatsTotal total) {
        this.total = total;
    }

    public CollectSessionStatsResponse withIntervals(List<SessionStatsIntervals> intervals) {
        this.intervals = intervals;
        return this;
    }

    public CollectSessionStatsResponse addIntervalsItem(SessionStatsIntervals intervalsItem) {
        if (this.intervals == null) {
            this.intervals = new ArrayList<>();
        }
        this.intervals.add(intervalsItem);
        return this;
    }

    public CollectSessionStatsResponse withIntervals(Consumer<List<SessionStatsIntervals>> intervalsSetter) {
        if (this.intervals == null) {
            this.intervals = new ArrayList<>();
        }
        intervalsSetter.accept(this.intervals);
        return this;
    }

    /**
     * 会话间隔统计数据。
     * @return intervals
     */
    public List<SessionStatsIntervals> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<SessionStatsIntervals> intervals) {
        this.intervals = intervals;
    }

    public CollectSessionStatsResponse withStartutc(Long startutc) {
        this.startutc = startutc;
        return this;
    }

    /**
     * 统计开始的utc时间。
     * @return startutc
     */
    public Long getStartutc() {
        return startutc;
    }

    public void setStartutc(Long startutc) {
        this.startutc = startutc;
    }

    public CollectSessionStatsResponse withEndutc(Long endutc) {
        this.endutc = endutc;
        return this;
    }

    /**
     * 统计结束的utc时间。
     * @return endutc
     */
    public Long getEndutc() {
        return endutc;
    }

    public void setEndutc(Long endutc) {
        this.endutc = endutc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CollectSessionStatsResponse that = (CollectSessionStatsResponse) obj;
        return Objects.equals(this.interval, that.interval) && Objects.equals(this.timeZone, that.timeZone)
            && Objects.equals(this.total, that.total) && Objects.equals(this.intervals, that.intervals)
            && Objects.equals(this.startutc, that.startutc) && Objects.equals(this.endutc, that.endutc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interval, timeZone, total, intervals, startutc, endutc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectSessionStatsResponse {\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
        sb.append("    startutc: ").append(toIndentedString(startutc)).append("\n");
        sb.append("    endutc: ").append(toIndentedString(endutc)).append("\n");
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
