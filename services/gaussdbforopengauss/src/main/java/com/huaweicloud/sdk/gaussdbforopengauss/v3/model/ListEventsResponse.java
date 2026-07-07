package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListEventsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inquiring_count")

    private Integer inquiringCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_count")

    private Integer scheduleCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executing_count")

    private Integer executingCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_count")

    private Integer failedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    private List<ScheduleEventInfoResult> events = null;

    public ListEventsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**: 事件总数。 **取值范围**: 不涉及。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListEventsResponse withInquiringCount(Integer inquiringCount) {
        this.inquiringCount = inquiringCount;
        return this;
    }

    /**
     * **参数解释**: 待授权的事件数。 **取值范围**: 不涉及。
     * @return inquiringCount
     */
    public Integer getInquiringCount() {
        return inquiringCount;
    }

    public void setInquiringCount(Integer inquiringCount) {
        this.inquiringCount = inquiringCount;
    }

    public ListEventsResponse withScheduleCount(Integer scheduleCount) {
        this.scheduleCount = scheduleCount;
        return this;
    }

    /**
     * **参数解释**: 待执行的事件数。 **取值范围**: 不涉及。
     * @return scheduleCount
     */
    public Integer getScheduleCount() {
        return scheduleCount;
    }

    public void setScheduleCount(Integer scheduleCount) {
        this.scheduleCount = scheduleCount;
    }

    public ListEventsResponse withExecutingCount(Integer executingCount) {
        this.executingCount = executingCount;
        return this;
    }

    /**
     * **参数解释**: 正在执行的事件数。 **取值范围**: 不涉及。
     * @return executingCount
     */
    public Integer getExecutingCount() {
        return executingCount;
    }

    public void setExecutingCount(Integer executingCount) {
        this.executingCount = executingCount;
    }

    public ListEventsResponse withFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }

    /**
     * **参数解释**: 执行失败的事件数。 **取值范围**: 不涉及。
     * @return failedCount
     */
    public Integer getFailedCount() {
        return failedCount;
    }

    public void setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
    }

    public ListEventsResponse withEvents(List<ScheduleEventInfoResult> events) {
        this.events = events;
        return this;
    }

    public ListEventsResponse addEventsItem(ScheduleEventInfoResult eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public ListEventsResponse withEvents(Consumer<List<ScheduleEventInfoResult>> eventsSetter) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * **参数解释**: 事件详情列表。
     * @return events
     */
    public List<ScheduleEventInfoResult> getEvents() {
        return events;
    }

    public void setEvents(List<ScheduleEventInfoResult> events) {
        this.events = events;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEventsResponse that = (ListEventsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.inquiringCount, that.inquiringCount)
            && Objects.equals(this.scheduleCount, that.scheduleCount)
            && Objects.equals(this.executingCount, that.executingCount)
            && Objects.equals(this.failedCount, that.failedCount) && Objects.equals(this.events, that.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, inquiringCount, scheduleCount, executingCount, failedCount, events);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    inquiringCount: ").append(toIndentedString(inquiringCount)).append("\n");
        sb.append("    scheduleCount: ").append(toIndentedString(scheduleCount)).append("\n");
        sb.append("    executingCount: ").append(toIndentedString(executingCount)).append("\n");
        sb.append("    failedCount: ").append(toIndentedString(failedCount)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
