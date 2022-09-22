package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 会议总体数据的单个时间点数据。
 */
public class StatisticConferenceDataItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confCount")

    private String confCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confDuration")

    private String confDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attendeeCount")

    private String attendeeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confConcurrentUsedCount")

    private String confConcurrentUsedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conf24hCount")

    private String conf24hCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conf24hAttendeeCount")

    private String conf24hAttendeeCount;

    public StatisticConferenceDataItem withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 日期/月份，category = conference_info时有效。 小时，category = conference_hourly_info时有效。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public StatisticConferenceDataItem withConfCount(String confCount) {
        this.confCount = confCount;
        return this;
    }

    /**
     * 会议数(含VMR)。 category = conference_info时有效。
     * @return confCount
     */
    public String getConfCount() {
        return confCount;
    }

    public void setConfCount(String confCount) {
        this.confCount = confCount;
    }

    public StatisticConferenceDataItem withConfDuration(String confDuration) {
        this.confDuration = confDuration;
        return this;
    }

    /**
     * 会议时长(秒)(含VMR)。 category = conference_info时有效。
     * @return confDuration
     */
    public String getConfDuration() {
        return confDuration;
    }

    public void setConfDuration(String confDuration) {
        this.confDuration = confDuration;
    }

    public StatisticConferenceDataItem withAttendeeCount(String attendeeCount) {
        this.attendeeCount = attendeeCount;
        return this;
    }

    /**
     * 与会人次(含VMR)。 category = conference_info时有效。
     * @return attendeeCount
     */
    public String getAttendeeCount() {
        return attendeeCount;
    }

    public void setAttendeeCount(String attendeeCount) {
        this.attendeeCount = attendeeCount;
    }

    public StatisticConferenceDataItem withConfConcurrentUsedCount(String confConcurrentUsedCount) {
        this.confConcurrentUsedCount = confConcurrentUsedCount;
        return this;
    }

    /**
     * 并发会议使用数。 category = conference_info时有效。
     * @return confConcurrentUsedCount
     */
    public String getConfConcurrentUsedCount() {
        return confConcurrentUsedCount;
    }

    public void setConfConcurrentUsedCount(String confConcurrentUsedCount) {
        this.confConcurrentUsedCount = confConcurrentUsedCount;
    }

    public StatisticConferenceDataItem withConf24hCount(String conf24hCount) {
        this.conf24hCount = conf24hCount;
        return this;
    }

    /**
     * 小时单位会议数(含VMR)。 category = conference_hourly_info时有效。
     * @return conf24hCount
     */
    public String getConf24hCount() {
        return conf24hCount;
    }

    public void setConf24hCount(String conf24hCount) {
        this.conf24hCount = conf24hCount;
    }

    public StatisticConferenceDataItem withConf24hAttendeeCount(String conf24hAttendeeCount) {
        this.conf24hAttendeeCount = conf24hAttendeeCount;
        return this;
    }

    /**
     * 小时单位与会人次(含VMR)。 category = conference_hourly_info时有效。
     * @return conf24hAttendeeCount
     */
    public String getConf24hAttendeeCount() {
        return conf24hAttendeeCount;
    }

    public void setConf24hAttendeeCount(String conf24hAttendeeCount) {
        this.conf24hAttendeeCount = conf24hAttendeeCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StatisticConferenceDataItem statisticConferenceDataItem = (StatisticConferenceDataItem) o;
        return Objects.equals(this.time, statisticConferenceDataItem.time)
            && Objects.equals(this.confCount, statisticConferenceDataItem.confCount)
            && Objects.equals(this.confDuration, statisticConferenceDataItem.confDuration)
            && Objects.equals(this.attendeeCount, statisticConferenceDataItem.attendeeCount)
            && Objects.equals(this.confConcurrentUsedCount, statisticConferenceDataItem.confConcurrentUsedCount)
            && Objects.equals(this.conf24hCount, statisticConferenceDataItem.conf24hCount)
            && Objects.equals(this.conf24hAttendeeCount, statisticConferenceDataItem.conf24hAttendeeCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time,
            confCount,
            confDuration,
            attendeeCount,
            confConcurrentUsedCount,
            conf24hCount,
            conf24hAttendeeCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticConferenceDataItem {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    confCount: ").append(toIndentedString(confCount)).append("\n");
        sb.append("    confDuration: ").append(toIndentedString(confDuration)).append("\n");
        sb.append("    attendeeCount: ").append(toIndentedString(attendeeCount)).append("\n");
        sb.append("    confConcurrentUsedCount: ").append(toIndentedString(confConcurrentUsedCount)).append("\n");
        sb.append("    conf24hCount: ").append(toIndentedString(conf24hCount)).append("\n");
        sb.append("    conf24hAttendeeCount: ").append(toIndentedString(conf24hAttendeeCount)).append("\n");
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
