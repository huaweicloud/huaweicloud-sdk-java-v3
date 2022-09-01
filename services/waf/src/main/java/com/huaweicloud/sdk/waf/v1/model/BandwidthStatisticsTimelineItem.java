package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 不同键值对应的时间线
 */
public class BandwidthStatisticsTimelineItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    @JacksonXmlProperty(localName = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeline")

    @JacksonXmlProperty(localName = "timeline")

    private List<TimeLineItem> timeline = null;

    public BandwidthStatisticsTimelineItem withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 键值，包括带宽（BANDWIDTH）、入带宽（IN_BANDWIDTH）以及出带宽（OUT_BANDWIDTH）
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public BandwidthStatisticsTimelineItem withTimeline(List<TimeLineItem> timeline) {
        this.timeline = timeline;
        return this;
    }

    public BandwidthStatisticsTimelineItem addTimelineItem(TimeLineItem timelineItem) {
        if (this.timeline == null) {
            this.timeline = new ArrayList<>();
        }
        this.timeline.add(timelineItem);
        return this;
    }

    public BandwidthStatisticsTimelineItem withTimeline(Consumer<List<TimeLineItem>> timelineSetter) {
        if (this.timeline == null) {
            this.timeline = new ArrayList<>();
        }
        timelineSetter.accept(this.timeline);
        return this;
    }

    /**
     * 对应键值的时间线统计数据
     * @return timeline
     */
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
        BandwidthStatisticsTimelineItem bandwidthStatisticsTimelineItem = (BandwidthStatisticsTimelineItem) o;
        return Objects.equals(this.key, bandwidthStatisticsTimelineItem.key)
            && Objects.equals(this.timeline, bandwidthStatisticsTimelineItem.timeline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, timeline);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BandwidthStatisticsTimelineItem {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
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
