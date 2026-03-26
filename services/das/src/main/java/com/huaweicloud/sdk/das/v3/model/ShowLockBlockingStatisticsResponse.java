package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowLockBlockingStatisticsResponse extends SdkResponse {

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

    public ShowLockBlockingStatisticsResponse withLastDayCount(Long lastDayCount) {
        this.lastDayCount = lastDayCount;
        return this;
    }

    /**
     * 近1天锁阻塞总数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lastDayCount
     */
    public Long getLastDayCount() {
        return lastDayCount;
    }

    public void setLastDayCount(Long lastDayCount) {
        this.lastDayCount = lastDayCount;
    }

    public ShowLockBlockingStatisticsResponse withLastWeekCount(Long lastWeekCount) {
        this.lastWeekCount = lastWeekCount;
        return this;
    }

    /**
     * 近1周锁阻塞总数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lastWeekCount
     */
    public Long getLastWeekCount() {
        return lastWeekCount;
    }

    public void setLastWeekCount(Long lastWeekCount) {
        this.lastWeekCount = lastWeekCount;
    }

    public ShowLockBlockingStatisticsResponse withLastTwoWeekCount(Long lastTwoWeekCount) {
        this.lastTwoWeekCount = lastTwoWeekCount;
        return this;
    }

    /**
     * 近2周锁阻塞总数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lastTwoWeekCount
     */
    public Long getLastTwoWeekCount() {
        return lastTwoWeekCount;
    }

    public void setLastTwoWeekCount(Long lastTwoWeekCount) {
        this.lastTwoWeekCount = lastTwoWeekCount;
    }

    public ShowLockBlockingStatisticsResponse withLastMonthCount(Long lastMonthCount) {
        this.lastMonthCount = lastMonthCount;
        return this;
    }

    /**
     * 近1月锁阻塞总数
     * minimum: 0
     * maximum: 9223372036854775807
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
        ShowLockBlockingStatisticsResponse that = (ShowLockBlockingStatisticsResponse) obj;
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
        sb.append("class ShowLockBlockingStatisticsResponse {\n");
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
