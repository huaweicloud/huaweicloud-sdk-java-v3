package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TimingRangeConfigRequestInfo
 */
public class TimingRangeConfigRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_range")

    private String timeRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public TimingRangeConfigRequestInfo withTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    /**
     * **参数解释**: 自动关闭防护的时间段范围 **约束限制**: 不涉及 **取值范围**: 字符长度0-512位 **默认取值**: 不涉及 
     * @return timeRange
     */
    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public TimingRangeConfigRequestInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 自动关闭防护的时间段描述 **约束限制**: 不涉及 **取值范围**: 字符长度0-512位 **默认取值**: 不涉及 
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
        TimingRangeConfigRequestInfo that = (TimingRangeConfigRequestInfo) obj;
        return Objects.equals(this.timeRange, that.timeRange) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeRange, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimingRangeConfigRequestInfo {\n");
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
