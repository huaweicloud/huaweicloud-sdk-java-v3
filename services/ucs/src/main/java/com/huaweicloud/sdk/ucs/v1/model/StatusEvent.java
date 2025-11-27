package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StatusEvent
 */
public class StatusEvent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firstTimestamp")

    private String firstTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceKind")

    private String resourceKind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceName")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceNamespace")

    private String resourceNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public StatusEvent withFirstTimestamp(String firstTimestamp) {
        this.firstTimestamp = firstTimestamp;
        return this;
    }

    /**
     * 拦截事件首次发生时间
     * @return firstTimestamp
     */
    public String getFirstTimestamp() {
        return firstTimestamp;
    }

    public void setFirstTimestamp(String firstTimestamp) {
        this.firstTimestamp = firstTimestamp;
    }

    public StatusEvent withResourceKind(String resourceKind) {
        this.resourceKind = resourceKind;
        return this;
    }

    /**
     * 拦截事件资源类型
     * @return resourceKind
     */
    public String getResourceKind() {
        return resourceKind;
    }

    public void setResourceKind(String resourceKind) {
        this.resourceKind = resourceKind;
    }

    public StatusEvent withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 拦截事件资源名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public StatusEvent withResourceNamespace(String resourceNamespace) {
        this.resourceNamespace = resourceNamespace;
        return this;
    }

    /**
     * 拦截事件资源命名空间，如果没有则为空
     * @return resourceNamespace
     */
    public String getResourceNamespace() {
        return resourceNamespace;
    }

    public void setResourceNamespace(String resourceNamespace) {
        this.resourceNamespace = resourceNamespace;
    }

    public StatusEvent withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 拦截事件详细信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatusEvent that = (StatusEvent) obj;
        return Objects.equals(this.firstTimestamp, that.firstTimestamp)
            && Objects.equals(this.resourceKind, that.resourceKind)
            && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.resourceNamespace, that.resourceNamespace)
            && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstTimestamp, resourceKind, resourceName, resourceNamespace, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatusEvent {\n");
        sb.append("    firstTimestamp: ").append(toIndentedString(firstTimestamp)).append("\n");
        sb.append("    resourceKind: ").append(toIndentedString(resourceKind)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceNamespace: ").append(toIndentedString(resourceNamespace)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
