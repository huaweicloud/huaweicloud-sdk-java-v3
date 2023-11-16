package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TriggerMetadataList
 */
public class TriggerMetadataList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_name")

    private String triggerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private String triggerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_data")

    private String eventData;

    public TriggerMetadataList withTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }

    /**
     * 触发名称
     * @return triggerName
     */
    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public TriggerMetadataList withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * 触发器类型
     * @return triggerType
     */
    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public TriggerMetadataList withEventType(String eventType) {
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

    public TriggerMetadataList withEventData(String eventData) {
        this.eventData = eventData;
        return this;
    }

    /**
     * 事件数据
     * @return eventData
     */
    public String getEventData() {
        return eventData;
    }

    public void setEventData(String eventData) {
        this.eventData = eventData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TriggerMetadataList that = (TriggerMetadataList) obj;
        return Objects.equals(this.triggerName, that.triggerName) && Objects.equals(this.triggerType, that.triggerType)
            && Objects.equals(this.eventType, that.eventType) && Objects.equals(this.eventData, that.eventData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(triggerName, triggerType, eventType, eventData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TriggerMetadataList {\n");
        sb.append("    triggerName: ").append(toIndentedString(triggerName)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    eventData: ").append(toIndentedString(eventData)).append("\n");
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
