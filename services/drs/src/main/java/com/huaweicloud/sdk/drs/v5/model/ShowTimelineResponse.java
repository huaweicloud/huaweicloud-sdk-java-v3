package com.huaweicloud.sdk.drs.v5.model;

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
public class ShowTimelineResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timelines")

    private List<TimelineInfo> timelines = null;

    public ShowTimelineResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 总数。
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ShowTimelineResponse withTimelines(List<TimelineInfo> timelines) {
        this.timelines = timelines;
        return this;
    }

    public ShowTimelineResponse addTimelinesItem(TimelineInfo timelinesItem) {
        if (this.timelines == null) {
            this.timelines = new ArrayList<>();
        }
        this.timelines.add(timelinesItem);
        return this;
    }

    public ShowTimelineResponse withTimelines(Consumer<List<TimelineInfo>> timelinesSetter) {
        if (this.timelines == null) {
            this.timelines = new ArrayList<>();
        }
        timelinesSetter.accept(this.timelines);
        return this;
    }

    /**
     * 时间轴列表。
     * @return timelines
     */
    public List<TimelineInfo> getTimelines() {
        return timelines;
    }

    public void setTimelines(List<TimelineInfo> timelines) {
        this.timelines = timelines;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTimelineResponse that = (ShowTimelineResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.timelines, that.timelines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, timelines);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTimelineResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    timelines: ").append(toIndentedString(timelines)).append("\n");
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
