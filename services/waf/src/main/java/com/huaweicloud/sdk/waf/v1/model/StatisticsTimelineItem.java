package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 时间线 */
public class StatisticsTimelineItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeline")

    private List<TimeLineItem> timeline = null;

    public StatisticsTimelineItem withKey(String key) {
        this.key = key;
        return this;
    }

    /** 键值
     * 
     * @return key */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public StatisticsTimelineItem withTimeline(List<TimeLineItem> timeline) {
        this.timeline = timeline;
        return this;
    }

    public StatisticsTimelineItem addTimelineItem(TimeLineItem timelineItem) {
        if (this.timeline == null) {
            this.timeline = new ArrayList<>();
        }
        this.timeline.add(timelineItem);
        return this;
    }

    public StatisticsTimelineItem withTimeline(Consumer<List<TimeLineItem>> timelineSetter) {
        if (this.timeline == null) {
            this.timeline = new ArrayList<>();
        }
        timelineSetter.accept(this.timeline);
        return this;
    }

    /** 对应键值的时间线
     * 
     * @return timeline */
    public List<TimeLineItem> getTimeline() {
        return timeline;
    }

    public void setTimeline(List<TimeLineItem> timeline) {
        this.timeline = timeline;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StatisticsTimelineItem statisticsTimelineItem = (StatisticsTimelineItem) o;
        return Objects.equals(this.key, statisticsTimelineItem.key)
            && Objects.equals(this.timeline, statisticsTimelineItem.timeline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, timeline);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticsTimelineItem {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
