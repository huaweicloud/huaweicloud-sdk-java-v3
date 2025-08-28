package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TimingRangeConfigInfo
 */
public class TimingRangeConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_range")

    private String timeRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public TimingRangeConfigInfo withTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    /**
     * **参数解释**: 自动关闭防护的时间段范围 **取值范围**: 字符长度0-512位 
     * @return timeRange
     */
    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public TimingRangeConfigInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 自动关闭防护的时间段描述 **取值范围**: 字符长度0-512位 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimingRangeConfigInfo that = (TimingRangeConfigInfo) obj;
        return Objects.equals(this.timeRange, that.timeRange) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeRange, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimingRangeConfigInfo {\n");
        sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
