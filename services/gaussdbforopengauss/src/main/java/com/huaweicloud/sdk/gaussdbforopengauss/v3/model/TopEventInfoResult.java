package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TopEventInfoResult
 */
public class TopEventInfoResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    private String eventName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_time")

    private Long eventTime;

    public TopEventInfoResult withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * **参数解释**: 事件名。 **取值范围**: 不涉及。
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public TopEventInfoResult withEventTime(Long eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    /**
     * **参数解释**: 事件耗时（单位：微秒）。 **取值范围**: 不涉及。
     * @return eventTime
     */
    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TopEventInfoResult that = (TopEventInfoResult) obj;
        return Objects.equals(this.eventName, that.eventName) && Objects.equals(this.eventTime, that.eventTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName, eventTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopEventInfoResult {\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
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
