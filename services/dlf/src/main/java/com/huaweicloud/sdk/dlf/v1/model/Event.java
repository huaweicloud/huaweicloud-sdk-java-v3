package com.huaweicloud.sdk.dlf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Event
 */
public class Event {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eventType")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel")

    private String channel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failPolicy")

    private String failPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concurrent")

    private Integer concurrent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readPolicy")

    private String readPolicy;

    public Event withEventType(String eventType) {
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

    public Event withChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /**
     * DIS通道名称
     * @return channel
     */
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Event withFailPolicy(String failPolicy) {
        this.failPolicy = failPolicy;
        return this;
    }

    /**
     * 执行失败处理策略
     * @return failPolicy
     */
    public String getFailPolicy() {
        return failPolicy;
    }

    public void setFailPolicy(String failPolicy) {
        this.failPolicy = failPolicy;
    }

    public Event withConcurrent(Integer concurrent) {
        this.concurrent = concurrent;
        return this;
    }

    /**
     * 调度并发数
     * @return concurrent
     */
    public Integer getConcurrent() {
        return concurrent;
    }

    public void setConcurrent(Integer concurrent) {
        this.concurrent = concurrent;
    }

    public Event withReadPolicy(String readPolicy) {
        this.readPolicy = readPolicy;
        return this;
    }

    /**
     * 读取策略
     * @return readPolicy
     */
    public String getReadPolicy() {
        return readPolicy;
    }

    public void setReadPolicy(String readPolicy) {
        this.readPolicy = readPolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Event event = (Event) o;
        return Objects.equals(this.eventType, event.eventType) && Objects.equals(this.channel, event.channel)
            && Objects.equals(this.failPolicy, event.failPolicy) && Objects.equals(this.concurrent, event.concurrent)
            && Objects.equals(this.readPolicy, event.readPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventType, channel, failPolicy, concurrent, readPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Event {\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    failPolicy: ").append(toIndentedString(failPolicy)).append("\n");
        sb.append("    concurrent: ").append(toIndentedString(concurrent)).append("\n");
        sb.append("    readPolicy: ").append(toIndentedString(readPolicy)).append("\n");
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
