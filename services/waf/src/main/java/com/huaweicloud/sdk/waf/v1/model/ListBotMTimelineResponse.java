package com.huaweicloud.sdk.waf.v1.model;

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
public class ListBotMTimelineResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_span")

    private Long timeSpan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timelines")

    private List<BotRequestTimeline> timelines = null;

    public ListBotMTimelineResponse withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释：** 统计开始时间 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListBotMTimelineResponse withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释：** 统计结束时间 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListBotMTimelineResponse withTimeSpan(Long timeSpan) {
        this.timeSpan = timeSpan;
        return this;
    }

    /**
     * **参数解释：** 时间间隔（如1h表示每小时） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return timeSpan
     */
    public Long getTimeSpan() {
        return timeSpan;
    }

    public void setTimeSpan(Long timeSpan) {
        this.timeSpan = timeSpan;
    }

    public ListBotMTimelineResponse withTimelines(List<BotRequestTimeline> timelines) {
        this.timelines = timelines;
        return this;
    }

    public ListBotMTimelineResponse addTimelinesItem(BotRequestTimeline timelinesItem) {
        if (this.timelines == null) {
            this.timelines = new ArrayList<>();
        }
        this.timelines.add(timelinesItem);
        return this;
    }

    public ListBotMTimelineResponse withTimelines(Consumer<List<BotRequestTimeline>> timelinesSetter) {
        if (this.timelines == null) {
            this.timelines = new ArrayList<>();
        }
        timelinesSetter.accept(this.timelines);
        return this;
    }

    /**
     * Get timelines
     * @return timelines
     */
    public List<BotRequestTimeline> getTimelines() {
        return timelines;
    }

    public void setTimelines(List<BotRequestTimeline> timelines) {
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
        ListBotMTimelineResponse that = (ListBotMTimelineResponse) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.timeSpan, that.timeSpan) && Objects.equals(this.timelines, that.timelines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, timeSpan, timelines);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBotMTimelineResponse {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    timeSpan: ").append(toIndentedString(timeSpan)).append("\n");
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
