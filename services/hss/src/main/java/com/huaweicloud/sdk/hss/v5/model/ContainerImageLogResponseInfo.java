package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 容器镜像使用日志信息
 */
public class ContainerImageLogResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    private String eventName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_id")

    private String eventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_ip")

    private String sourceIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Long time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    public ContainerImageLogResponseInfo withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ContainerImageLogResponseInfo withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ContainerImageLogResponseInfo withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * 事件名称
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public ContainerImageLogResponseInfo withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * 事件id
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public ContainerImageLogResponseInfo withEventType(String eventType) {
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

    public ContainerImageLogResponseInfo withSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }

    /**
     * 触发事件的源ip
     * @return sourceIp
     */
    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public ContainerImageLogResponseInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 触发事件的用户
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ContainerImageLogResponseInfo withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * 日志产生的时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public ContainerImageLogResponseInfo withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 日志内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContainerImageLogResponseInfo that = (ContainerImageLogResponseInfo) obj;
        return Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.eventName, that.eventName)
            && Objects.equals(this.eventId, that.eventId) && Objects.equals(this.eventType, that.eventType)
            && Objects.equals(this.sourceIp, that.sourceIp) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.time, that.time) && Objects.equals(this.content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(resourceName, resourceType, eventName, eventId, eventType, sourceIp, userName, time, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerImageLogResponseInfo {\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
