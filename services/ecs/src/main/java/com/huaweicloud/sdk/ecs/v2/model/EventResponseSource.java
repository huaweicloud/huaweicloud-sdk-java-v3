package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EventResponseSource
 */
public class EventResponseSource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_scheduled_event_id")

    private String hostScheduledEventId;

    public EventResponseSource withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 计划事件来源类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public EventResponseSource withHostScheduledEventId(String hostScheduledEventId) {
        this.hostScheduledEventId = hostScheduledEventId;
        return this;
    }

    /**
     * 主机计划事件ID
     * @return hostScheduledEventId
     */
    public String getHostScheduledEventId() {
        return hostScheduledEventId;
    }

    public void setHostScheduledEventId(String hostScheduledEventId) {
        this.hostScheduledEventId = hostScheduledEventId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventResponseSource that = (EventResponseSource) obj;
        return Objects.equals(this.type, that.type)
            && Objects.equals(this.hostScheduledEventId, that.hostScheduledEventId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, hostScheduledEventId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventResponseSource {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    hostScheduledEventId: ").append(toIndentedString(hostScheduledEventId)).append("\n");
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
