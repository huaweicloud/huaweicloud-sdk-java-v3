package com.huaweicloud.sdk.cph.v1.model;

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
public class ListScheduledEventsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_events")

    private List<ListScheduledEventsResponseBodyScheduledEvents> scheduledEvents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private ListCloudPhoneServersModelOfferingsResponseBodyPageInfo pageInfo;

    public ListScheduledEventsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListScheduledEventsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 计划事件总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListScheduledEventsResponse withScheduledEvents(
        List<ListScheduledEventsResponseBodyScheduledEvents> scheduledEvents) {
        this.scheduledEvents = scheduledEvents;
        return this;
    }

    public ListScheduledEventsResponse addScheduledEventsItem(
        ListScheduledEventsResponseBodyScheduledEvents scheduledEventsItem) {
        if (this.scheduledEvents == null) {
            this.scheduledEvents = new ArrayList<>();
        }
        this.scheduledEvents.add(scheduledEventsItem);
        return this;
    }

    public ListScheduledEventsResponse withScheduledEvents(
        Consumer<List<ListScheduledEventsResponseBodyScheduledEvents>> scheduledEventsSetter) {
        if (this.scheduledEvents == null) {
            this.scheduledEvents = new ArrayList<>();
        }
        scheduledEventsSetter.accept(this.scheduledEvents);
        return this;
    }

    /**
     * 计划事件信息
     * @return scheduledEvents
     */
    public List<ListScheduledEventsResponseBodyScheduledEvents> getScheduledEvents() {
        return scheduledEvents;
    }

    public void setScheduledEvents(List<ListScheduledEventsResponseBodyScheduledEvents> scheduledEvents) {
        this.scheduledEvents = scheduledEvents;
    }

    public ListScheduledEventsResponse withPageInfo(ListCloudPhoneServersModelOfferingsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListScheduledEventsResponse withPageInfo(
        Consumer<ListCloudPhoneServersModelOfferingsResponseBodyPageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new ListCloudPhoneServersModelOfferingsResponseBodyPageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public ListCloudPhoneServersModelOfferingsResponseBodyPageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(ListCloudPhoneServersModelOfferingsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListScheduledEventsResponse that = (ListScheduledEventsResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.count, that.count)
            && Objects.equals(this.scheduledEvents, that.scheduledEvents)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, count, scheduledEvents, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScheduledEventsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    scheduledEvents: ").append(toIndentedString(scheduledEvents)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
