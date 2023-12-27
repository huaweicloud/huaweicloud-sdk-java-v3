package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ReportLiveEventReq
 */
public class ReportLiveEventReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    private List<LiveEvent> events = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_config")

    private ReviewConfig reviewConfig;

    public ReportLiveEventReq withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 事件条目数。
     * minimum: 1
     * maximum: 1000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ReportLiveEventReq withEvents(List<LiveEvent> events) {
        this.events = events;
        return this;
    }

    public ReportLiveEventReq addEventsItem(LiveEvent eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public ReportLiveEventReq withEvents(Consumer<List<LiveEvent>> eventsSetter) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * 事件内容。
     * @return events
     */
    public List<LiveEvent> getEvents() {
        return events;
    }

    public void setEvents(List<LiveEvent> events) {
        this.events = events;
    }

    public ReportLiveEventReq withReviewConfig(ReviewConfig reviewConfig) {
        this.reviewConfig = reviewConfig;
        return this;
    }

    public ReportLiveEventReq withReviewConfig(Consumer<ReviewConfig> reviewConfigSetter) {
        if (this.reviewConfig == null) {
            this.reviewConfig = new ReviewConfig();
            reviewConfigSetter.accept(this.reviewConfig);
        }

        return this;
    }

    /**
     * Get reviewConfig
     * @return reviewConfig
     */
    public ReviewConfig getReviewConfig() {
        return reviewConfig;
    }

    public void setReviewConfig(ReviewConfig reviewConfig) {
        this.reviewConfig = reviewConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReportLiveEventReq that = (ReportLiveEventReq) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.events, that.events)
            && Objects.equals(this.reviewConfig, that.reviewConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, events, reviewConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportLiveEventReq {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    reviewConfig: ").append(toIndentedString(reviewConfig)).append("\n");
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
