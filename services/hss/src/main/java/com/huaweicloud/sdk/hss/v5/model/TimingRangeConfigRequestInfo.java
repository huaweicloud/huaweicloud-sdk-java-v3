package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 自动关闭防护时间段
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
     * **参数解释**: 自动关闭防护的时间段范围，开始时间与结束之间用中划线相连，如15:00-15:30。 **约束限制**: 每个时间段最短不能少于5分钟。多个时间段之间不允许重叠，且两段时间间隔必须大于5分钟（时间00:00和23:59特例除外）。 **取值范围**: 字符长度0-20位 **默认取值**: 不涉及 
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
     * **参数解释**: 自动关闭防护的时间段描述 **约束限制**: 不涉及 **取值范围**: 字符长度0-20位 **默认取值**: 不涉及 
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
