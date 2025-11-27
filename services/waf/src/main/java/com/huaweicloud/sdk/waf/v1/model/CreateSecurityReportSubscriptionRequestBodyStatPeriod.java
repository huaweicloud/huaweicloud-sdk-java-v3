package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 统计周期，定义数据统计的时间范围区间 **约束限制：** begin_time 必须小于 end_time，且均为毫秒级时间戳 **默认取值：** 不涉及
 */
public class CreateSecurityReportSubscriptionRequestBodyStatPeriod {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private Long beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    public CreateSecurityReportSubscriptionRequestBodyStatPeriod withBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * **参数解释：** 开始时间，统计周期的起始时间点（毫秒级时间戳） **格式要求：** 符合Unix时间戳规范，精确到毫秒 **取值范围：** 1970-01-01 00:00:00 UTC至今的时间戳
     * @return beginTime
     */
    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public CreateSecurityReportSubscriptionRequestBodyStatPeriod withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释：** 结束时间，统计周期的终止时间点（毫秒级时间戳） **格式要求：** 符合Unix时间戳规范，精确到毫秒 **取值范围：** 大于begin_time且在1970-01-01 00:00:00 UTC至今的时间戳
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSecurityReportSubscriptionRequestBodyStatPeriod that =
            (CreateSecurityReportSubscriptionRequestBodyStatPeriod) obj;
        return Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beginTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecurityReportSubscriptionRequestBodyStatPeriod {\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
