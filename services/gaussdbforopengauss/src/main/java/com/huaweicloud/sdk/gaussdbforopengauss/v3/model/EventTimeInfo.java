package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EventTimeInfo
 */
public class EventTimeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    private List<TopEventInfoResult> events = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "left_time")

    private Long leftTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_time")

    private Long otherTime;

    public EventTimeInfo withEvents(List<TopEventInfoResult> events) {
        this.events = events;
        return this;
    }

    public EventTimeInfo addEventsItem(TopEventInfoResult eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public EventTimeInfo withEvents(Consumer<List<TopEventInfoResult>> eventsSetter) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * **参数解释**: TOP5事件耗时信息列表。
     * @return events
     */
    public List<TopEventInfoResult> getEvents() {
        return events;
    }

    public void setEvents(List<TopEventInfoResult> events) {
        this.events = events;
    }

    public EventTimeInfo withLeftTime(Long leftTime) {
        this.leftTime = leftTime;
        return this;
    }

    /**
     * **参数解释**: 其余事件耗时（单位：微秒）。 **取值范围**: 不涉及。
     * @return leftTime
     */
    public Long getLeftTime() {
        return leftTime;
    }

    public void setLeftTime(Long leftTime) {
        this.leftTime = leftTime;
    }

    public EventTimeInfo withOtherTime(Long otherTime) {
        this.otherTime = otherTime;
        return this;
    }

    /**
     * **参数解释**: 事件外耗时（单位：微秒）。 **取值范围**: 不涉及。
     * @return otherTime
     */
    public Long getOtherTime() {
        return otherTime;
    }

    public void setOtherTime(Long otherTime) {
        this.otherTime = otherTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventTimeInfo that = (EventTimeInfo) obj;
        return Objects.equals(this.events, that.events) && Objects.equals(this.leftTime, that.leftTime)
            && Objects.equals(this.otherTime, that.otherTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(events, leftTime, otherTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventTimeInfo {\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    leftTime: ").append(toIndentedString(leftTime)).append("\n");
        sb.append("    otherTime: ").append(toIndentedString(otherTime)).append("\n");
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
