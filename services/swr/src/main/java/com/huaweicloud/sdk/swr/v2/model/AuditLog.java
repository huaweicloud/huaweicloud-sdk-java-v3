package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * AuditLog
 */
public class AuditLog {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private String operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private String resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "op_time")

    private OffsetDateTime opTime;

    public AuditLog withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * audit log ID
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AuditLog withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 操作(e.g., create, update, delete)
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public AuditLog withResourceType(String resourceType) {
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

    public AuditLog withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * 资源名称
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public AuditLog withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 用户ID
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public AuditLog withOpTime(OffsetDateTime opTime) {
        this.opTime = opTime;
        return this;
    }

    /**
     * 操作时间
     * @return opTime
     */
    public OffsetDateTime getOpTime() {
        return opTime;
    }

    public void setOpTime(OffsetDateTime opTime) {
        this.opTime = opTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuditLog that = (AuditLog) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.operation, that.operation)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.resource, that.resource)
            && Objects.equals(this.username, that.username) && Objects.equals(this.opTime, that.opTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, operation, resourceType, resource, username, opTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLog {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    opTime: ").append(toIndentedString(opTime)).append("\n");
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
