package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoAverageInfoList
 */
public class SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoAverageInfoList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeline")

    private List<SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoTimeline> timeline = null;

    public SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoAverageInfoList withKey(
        String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 统计维度标识（如ACCESS表示访问类统计）。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoAverageInfoList withTimeline(
        List<SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoTimeline> timeline) {
        this.timeline = timeline;
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoAverageInfoList addTimelineItem(
        SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoTimeline timelineItem) {
        if (this.timeline == null) {
            this.timeline = new ArrayList<>();
        }
        this.timeline.add(timelineItem);
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoAverageInfoList withTimeline(
        Consumer<List<SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoTimeline>> timelineSetter) {
        if (this.timeline == null) {
            this.timeline = new ArrayList<>();
        }
        timelineSetter.accept(this.timeline);
        return this;
    }

    /**
     * **参数解释：** 时间线数据，按时间顺序排列的平均QPS值。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return timeline
     */
    public List<SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoTimeline> getTimeline() {
        return timeline;
    }

    public void setTimeline(
        List<SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoTimeline> timeline) {
        this.timeline = timeline;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoAverageInfoList that =
            (SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoAverageInfoList) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.timeline, that.timeline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, timeline);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(
            "class SecurityReportContentResponseReportContentSubscriptionInfoQpsStatisticsInfoAverageInfoList {\n");
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
