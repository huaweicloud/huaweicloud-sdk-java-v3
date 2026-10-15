package com.huaweicloud.sdk.aidatalake.v2.model;

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
public class ListFlinkJobEventsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_events")

    private List<FlinkJobEvent> jobEvents = null;

    public ListFlinkJobEventsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**：作业事件总个数。 **取值范围**：0~2147483647。 
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListFlinkJobEventsResponse withJobEvents(List<FlinkJobEvent> jobEvents) {
        this.jobEvents = jobEvents;
        return this;
    }

    public ListFlinkJobEventsResponse addJobEventsItem(FlinkJobEvent jobEventsItem) {
        if (this.jobEvents == null) {
            this.jobEvents = new ArrayList<>();
        }
        this.jobEvents.add(jobEventsItem);
        return this;
    }

    public ListFlinkJobEventsResponse withJobEvents(Consumer<List<FlinkJobEvent>> jobEventsSetter) {
        if (this.jobEvents == null) {
            this.jobEvents = new ArrayList<>();
        }
        jobEventsSetter.accept(this.jobEvents);
        return this;
    }

    /**
     * **参数解释**：Flink作业事件列表。可显示0~1000个FlinkJobEvent对象。 
     * @return jobEvents
     */
    public List<FlinkJobEvent> getJobEvents() {
        return jobEvents;
    }

    public void setJobEvents(List<FlinkJobEvent> jobEvents) {
        this.jobEvents = jobEvents;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFlinkJobEventsResponse that = (ListFlinkJobEventsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.jobEvents, that.jobEvents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, jobEvents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlinkJobEventsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    jobEvents: ").append(toIndentedString(jobEvents)).append("\n");
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
