package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户最后查找趋势
 */
public class UserSeekTrend {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_day_user_seek_count")

    private Long lastDayUserSeekCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_week_user_seek_count")

    private Long lastWeekUserSeekCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_two_week_user_seek_count")

    private Long lastTwoWeekUserSeekCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_month_user_seek_count")

    private Long lastMonthUserSeekCount;

    public UserSeekTrend withLastDayUserSeekCount(Long lastDayUserSeekCount) {
        this.lastDayUserSeekCount = lastDayUserSeekCount;
        return this;
    }

    /**
     * 近1天用户访问条数
     * @return lastDayUserSeekCount
     */
    public Long getLastDayUserSeekCount() {
        return lastDayUserSeekCount;
    }

    public void setLastDayUserSeekCount(Long lastDayUserSeekCount) {
        this.lastDayUserSeekCount = lastDayUserSeekCount;
    }

    public UserSeekTrend withLastWeekUserSeekCount(Long lastWeekUserSeekCount) {
        this.lastWeekUserSeekCount = lastWeekUserSeekCount;
        return this;
    }

    /**
     * 近1周用户访问条数
     * @return lastWeekUserSeekCount
     */
    public Long getLastWeekUserSeekCount() {
        return lastWeekUserSeekCount;
    }

    public void setLastWeekUserSeekCount(Long lastWeekUserSeekCount) {
        this.lastWeekUserSeekCount = lastWeekUserSeekCount;
    }

    public UserSeekTrend withLastTwoWeekUserSeekCount(Long lastTwoWeekUserSeekCount) {
        this.lastTwoWeekUserSeekCount = lastTwoWeekUserSeekCount;
        return this;
    }

    /**
     * 近2周用户访问条数
     * @return lastTwoWeekUserSeekCount
     */
    public Long getLastTwoWeekUserSeekCount() {
        return lastTwoWeekUserSeekCount;
    }

    public void setLastTwoWeekUserSeekCount(Long lastTwoWeekUserSeekCount) {
        this.lastTwoWeekUserSeekCount = lastTwoWeekUserSeekCount;
    }

    public UserSeekTrend withLastMonthUserSeekCount(Long lastMonthUserSeekCount) {
        this.lastMonthUserSeekCount = lastMonthUserSeekCount;
        return this;
    }

    /**
     * 近1月用户访问条数
     * @return lastMonthUserSeekCount
     */
    public Long getLastMonthUserSeekCount() {
        return lastMonthUserSeekCount;
    }

    public void setLastMonthUserSeekCount(Long lastMonthUserSeekCount) {
        this.lastMonthUserSeekCount = lastMonthUserSeekCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserSeekTrend that = (UserSeekTrend) obj;
        return Objects.equals(this.lastDayUserSeekCount, that.lastDayUserSeekCount)
            && Objects.equals(this.lastWeekUserSeekCount, that.lastWeekUserSeekCount)
            && Objects.equals(this.lastTwoWeekUserSeekCount, that.lastTwoWeekUserSeekCount)
            && Objects.equals(this.lastMonthUserSeekCount, that.lastMonthUserSeekCount);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(lastDayUserSeekCount, lastWeekUserSeekCount, lastTwoWeekUserSeekCount, lastMonthUserSeekCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserSeekTrend {\n");
        sb.append("    lastDayUserSeekCount: ").append(toIndentedString(lastDayUserSeekCount)).append("\n");
        sb.append("    lastWeekUserSeekCount: ").append(toIndentedString(lastWeekUserSeekCount)).append("\n");
        sb.append("    lastTwoWeekUserSeekCount: ").append(toIndentedString(lastTwoWeekUserSeekCount)).append("\n");
        sb.append("    lastMonthUserSeekCount: ").append(toIndentedString(lastMonthUserSeekCount)).append("\n");
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
