package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：描述Flink事件信息。 
 */
public class FlinkJobEvent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_id")

    private String eventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    private String eventName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_message")

    private String eventMessage;

    public FlinkJobEvent withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * **参数解释**：运行事件ID。 **取值范围**：UUIDv7格式，固定36位，由英文小写字母、数字及中划线组成。 
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public FlinkJobEvent withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：事件创建时间戳。 **取值范围**：0~4102416000000，13位毫秒时间戳。 
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public FlinkJobEvent withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * **参数解释**：运行事件名称。 **取值范围**：1~128个字符。 
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public FlinkJobEvent withEventMessage(String eventMessage) {
        this.eventMessage = eventMessage;
        return this;
    }

    /**
     * **参数解释**：运行事件信息。 **取值范围**：0~1024个字符。 
     * @return eventMessage
     */
    public String getEventMessage() {
        return eventMessage;
    }

    public void setEventMessage(String eventMessage) {
        this.eventMessage = eventMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlinkJobEvent that = (FlinkJobEvent) obj;
        return Objects.equals(this.eventId, that.eventId) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.eventName, that.eventName) && Objects.equals(this.eventMessage, that.eventMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, createTime, eventName, eventMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlinkJobEvent {\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    eventMessage: ").append(toIndentedString(eventMessage)).append("\n");
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
