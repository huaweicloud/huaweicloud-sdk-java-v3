package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowTopicStatusRespQueues
 */
public class ShowTopicStatusRespQueues {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_offset")

    private Integer minOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_offset")

    private Integer maxOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_message_time")

    private Long lastMessageTime;

    public ShowTopicStatusRespQueues withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 队列ID。
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ShowTopicStatusRespQueues withMinOffset(Integer minOffset) {
        this.minOffset = minOffset;
        return this;
    }

    /**
     * 最小偏移量。
     * @return minOffset
     */
    public Integer getMinOffset() {
        return minOffset;
    }

    public void setMinOffset(Integer minOffset) {
        this.minOffset = minOffset;
    }

    public ShowTopicStatusRespQueues withMaxOffset(Integer maxOffset) {
        this.maxOffset = maxOffset;
        return this;
    }

    /**
     * 最大偏移量。
     * @return maxOffset
     */
    public Integer getMaxOffset() {
        return maxOffset;
    }

    public void setMaxOffset(Integer maxOffset) {
        this.maxOffset = maxOffset;
    }

    public ShowTopicStatusRespQueues withLastMessageTime(Long lastMessageTime) {
        this.lastMessageTime = lastMessageTime;
        return this;
    }

    /**
     * 最后一条消息的时间。
     * @return lastMessageTime
     */
    public Long getLastMessageTime() {
        return lastMessageTime;
    }

    public void setLastMessageTime(Long lastMessageTime) {
        this.lastMessageTime = lastMessageTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTopicStatusRespQueues showTopicStatusRespQueues = (ShowTopicStatusRespQueues) o;
        return Objects.equals(this.id, showTopicStatusRespQueues.id)
            && Objects.equals(this.minOffset, showTopicStatusRespQueues.minOffset)
            && Objects.equals(this.maxOffset, showTopicStatusRespQueues.maxOffset)
            && Objects.equals(this.lastMessageTime, showTopicStatusRespQueues.lastMessageTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, minOffset, maxOffset, lastMessageTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTopicStatusRespQueues {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    minOffset: ").append(toIndentedString(minOffset)).append("\n");
        sb.append("    maxOffset: ").append(toIndentedString(maxOffset)).append("\n");
        sb.append("    lastMessageTime: ").append(toIndentedString(lastMessageTime)).append("\n");
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
