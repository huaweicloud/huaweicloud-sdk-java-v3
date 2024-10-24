package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 包含权限集详细信息的对象
 */
public class PermissionSetDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private Long createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_set_id")

    private String permissionSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relay_state")

    private String relayState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_duration")

    private String sessionDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_urn")

    private String permissionUrn;

    public PermissionSetDto withCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * 权限集的创建时间
     * @return createdDate
     */
    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public PermissionSetDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 权限集的描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PermissionSetDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 权限集的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PermissionSetDto withPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
        return this;
    }

    /**
     * 权限集的唯一标识
     * @return permissionSetId
     */
    public String getPermissionSetId() {
        return permissionSetId;
    }

    public void setPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
    }

    public PermissionSetDto withRelayState(String relayState) {
        this.relayState = relayState;
        return this;
    }

    /**
     * 用于在联合身份验证过程中重定向应用程序中的用户
     * @return relayState
     */
    public String getRelayState() {
        return relayState;
    }

    public void setRelayState(String relayState) {
        this.relayState = relayState;
    }

    public PermissionSetDto withSessionDuration(String sessionDuration) {
        this.sessionDuration = sessionDuration;
        return this;
    }

    /**
     * 应用程序用户会话在ISO-8601标准中有效的时间长度
     * @return sessionDuration
     */
    public String getSessionDuration() {
        return sessionDuration;
    }

    public void setSessionDuration(String sessionDuration) {
        this.sessionDuration = sessionDuration;
    }

    public PermissionSetDto withPermissionUrn(String permissionUrn) {
        this.permissionUrn = permissionUrn;
        return this;
    }

    /**
     * 权限集的统一资源名称（URN）
     * @return permissionUrn
     */
    public String getPermissionUrn() {
        return permissionUrn;
    }

    public void setPermissionUrn(String permissionUrn) {
        this.permissionUrn = permissionUrn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PermissionSetDto that = (PermissionSetDto) obj;
        return Objects.equals(this.createdDate, that.createdDate) && Objects.equals(this.description, that.description)
            && Objects.equals(this.name, that.name) && Objects.equals(this.permissionSetId, that.permissionSetId)
            && Objects.equals(this.relayState, that.relayState)
            && Objects.equals(this.sessionDuration, that.sessionDuration)
            && Objects.equals(this.permissionUrn, that.permissionUrn);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(createdDate, description, name, permissionSetId, relayState, sessionDuration, permissionUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionSetDto {\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    permissionSetId: ").append(toIndentedString(permissionSetId)).append("\n");
        sb.append("    relayState: ").append(toIndentedString(relayState)).append("\n");
        sb.append("    sessionDuration: ").append(toIndentedString(sessionDuration)).append("\n");
        sb.append("    permissionUrn: ").append(toIndentedString(permissionUrn)).append("\n");
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
