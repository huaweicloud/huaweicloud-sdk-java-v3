package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PolicyEventRsp
 */
public class PolicyEventRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    public PolicyEventRsp withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 事件产生时间
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public PolicyEventRsp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 事件名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PolicyEventRsp withEventType(String eventType) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyEventRsp that = (PolicyEventRsp) obj;
        return Objects.equals(this.time, that.time) && Objects.equals(this.name, that.name)
            && Objects.equals(this.eventType, that.eventType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, name, eventType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyEventRsp {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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
