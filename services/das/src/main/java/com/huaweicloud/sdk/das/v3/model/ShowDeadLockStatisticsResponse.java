package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDeadLockStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_day_count")

    private Long lastDayCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_week_count")

    private Long lastWeekCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_two_week_count")

    private Long lastTwoWeekCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_month_count")

    private Long lastMonthCount;

    public ShowDeadLockStatisticsResponse withLastDayCount(Long lastDayCount) {
        this.lastDayCount = lastDayCount;
        return this;
    }

    /**
     * 近1天死锁/锁阻塞总数
     * @return lastDayCount
     */
    public Long getLastDayCount() {
        return lastDayCount;
    }

    public void setLastDayCount(Long lastDayCount) {
        this.lastDayCount = lastDayCount;
    }

    public ShowDeadLockStatisticsResponse withLastWeekCount(Long lastWeekCount) {
        this.lastWeekCount = lastWeekCount;
        return this;
    }

    /**
     * 近1周死锁/锁阻塞总数
     * @return lastWeekCount
     */
    public Long getLastWeekCount() {
        return lastWeekCount;
    }

    public void setLastWeekCount(Long lastWeekCount) {
        this.lastWeekCount = lastWeekCount;
    }

    public ShowDeadLockStatisticsResponse withLastTwoWeekCount(Long lastTwoWeekCount) {
        this.lastTwoWeekCount = lastTwoWeekCount;
        return this;
    }

    /**
     * 近2周死锁/锁阻塞总数
     * @return lastTwoWeekCount
     */
    public Long getLastTwoWeekCount() {
        return lastTwoWeekCount;
    }

    public void setLastTwoWeekCount(Long lastTwoWeekCount) {
        this.lastTwoWeekCount = lastTwoWeekCount;
    }

    public ShowDeadLockStatisticsResponse withLastMonthCount(Long lastMonthCount) {
        this.lastMonthCount = lastMonthCount;
        return this;
    }

    /**
     * 近1月死锁/锁阻塞总数
     * @return lastMonthCount
     */
    public Long getLastMonthCount() {
        return lastMonthCount;
    }

    public void setLastMonthCount(Long lastMonthCount) {
        this.lastMonthCount = lastMonthCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDeadLockStatisticsResponse that = (ShowDeadLockStatisticsResponse) obj;
        return Objects.equals(this.lastDayCount, that.lastDayCount)
            && Objects.equals(this.lastWeekCount, that.lastWeekCount)
            && Objects.equals(this.lastTwoWeekCount, that.lastTwoWeekCount)
            && Objects.equals(this.lastMonthCount, that.lastMonthCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastDayCount, lastWeekCount, lastTwoWeekCount, lastMonthCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeadLockStatisticsResponse {\n");
        sb.append("    lastDayCount: ").append(toIndentedString(lastDayCount)).append("\n");
        sb.append("    lastWeekCount: ").append(toIndentedString(lastWeekCount)).append("\n");
        sb.append("    lastTwoWeekCount: ").append(toIndentedString(lastTwoWeekCount)).append("\n");
        sb.append("    lastMonthCount: ").append(toIndentedString(lastMonthCount)).append("\n");
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
