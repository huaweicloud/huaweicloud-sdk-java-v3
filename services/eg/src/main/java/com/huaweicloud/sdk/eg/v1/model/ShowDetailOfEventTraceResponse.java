package com.huaweicloud.sdk.eg.v1.model;

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
public class ShowDetailOfEventTraceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eventId")

    private String eventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eventSource")

    private String eventSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eventType")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receiveTime")

    private String receiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channelId")

    private String channelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channelName")

    private String channelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deliverList")

    private List<DeliverItem> deliverList = null;

    public ShowDetailOfEventTraceResponse withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * 事件ID
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public ShowDetailOfEventTraceResponse withEventSource(String eventSource) {
        this.eventSource = eventSource;
        return this;
    }

    /**
     * 事件源
     * @return eventSource
     */
    public String getEventSource() {
        return eventSource;
    }

    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    public ShowDetailOfEventTraceResponse withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public ShowDetailOfEventTraceResponse withReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime;
        return this;
    }

    /**
     * 接收时间
     * @return receiveTime
     */
    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime;
    }

    public ShowDetailOfEventTraceResponse withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * 通道ID
     * @return channelId
     */
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public ShowDetailOfEventTraceResponse withChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    /**
     * 通道名称
     * @return channelName
     */
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public ShowDetailOfEventTraceResponse withDeliverList(List<DeliverItem> deliverList) {
        this.deliverList = deliverList;
        return this;
    }

    public ShowDetailOfEventTraceResponse addDeliverListItem(DeliverItem deliverListItem) {
        if (this.deliverList == null) {
            this.deliverList = new ArrayList<>();
        }
        this.deliverList.add(deliverListItem);
        return this;
    }

    public ShowDetailOfEventTraceResponse withDeliverList(Consumer<List<DeliverItem>> deliverListSetter) {
        if (this.deliverList == null) {
            this.deliverList = new ArrayList<>();
        }
        deliverListSetter.accept(this.deliverList);
        return this;
    }

    /**
     * 事件投递列表
     * @return deliverList
     */
    public List<DeliverItem> getDeliverList() {
        return deliverList;
    }

    public void setDeliverList(List<DeliverItem> deliverList) {
        this.deliverList = deliverList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDetailOfEventTraceResponse showDetailOfEventTraceResponse = (ShowDetailOfEventTraceResponse) o;
        return Objects.equals(this.eventId, showDetailOfEventTraceResponse.eventId)
            && Objects.equals(this.eventSource, showDetailOfEventTraceResponse.eventSource)
            && Objects.equals(this.eventType, showDetailOfEventTraceResponse.eventType)
            && Objects.equals(this.receiveTime, showDetailOfEventTraceResponse.receiveTime)
            && Objects.equals(this.channelId, showDetailOfEventTraceResponse.channelId)
            && Objects.equals(this.channelName, showDetailOfEventTraceResponse.channelName)
            && Objects.equals(this.deliverList, showDetailOfEventTraceResponse.deliverList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, eventSource, eventType, receiveTime, channelId, channelName, deliverList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDetailOfEventTraceResponse {\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    receiveTime: ").append(toIndentedString(receiveTime)).append("\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
        sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
        sb.append("    deliverList: ").append(toIndentedString(deliverList)).append("\n");
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
