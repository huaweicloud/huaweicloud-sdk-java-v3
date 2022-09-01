package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 告警历史额外字段，仅针对事件监控告警场景所产生的告警历史信息。
 */
public class AdditionalInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    @JacksonXmlProperty(localName = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    @JacksonXmlProperty(localName = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_id")

    @JacksonXmlProperty(localName = "event_id")

    private String eventId;

    public AdditionalInfo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 该条告警历史对应的资源ID；如：22d98f6c-16d2-4c2d-b424-50e79d82838f。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public AdditionalInfo withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 该条告警历史对应的资源名称；如：ECS-Test01。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public AdditionalInfo withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * 该条告警历史对应的事件监控ID，资源所产生的事件；如：ev16031292300990kKN8p17J。
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdditionalInfo additionalInfo = (AdditionalInfo) o;
        return Objects.equals(this.resourceId, additionalInfo.resourceId)
            && Objects.equals(this.resourceName, additionalInfo.resourceName)
            && Objects.equals(this.eventId, additionalInfo.eventId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resourceName, eventId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdditionalInfo {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
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
