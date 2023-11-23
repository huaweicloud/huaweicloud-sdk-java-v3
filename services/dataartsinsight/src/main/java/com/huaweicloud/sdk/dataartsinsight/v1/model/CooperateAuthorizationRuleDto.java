package com.huaweicloud.sdk.dataartsinsight.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 协同授权规则请求实体
 */
public class CooperateAuthorizationRuleDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_id")

    private String authId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_level")

    private String authLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authority")

    private String authority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    public CooperateAuthorizationRuleDto withAuthId(String authId) {
        this.authId = authId;
        return this;
    }

    /**
     * 授权主体id
     * @return authId
     */
    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    public CooperateAuthorizationRuleDto withAuthLevel(String authLevel) {
        this.authLevel = authLevel;
        return this;
    }

    /**
     * 授权主体级别。 user, group
     * @return authLevel
     */
    public String getAuthLevel() {
        return authLevel;
    }

    public void setAuthLevel(String authLevel) {
        this.authLevel = authLevel;
    }

    public CooperateAuthorizationRuleDto withAuthority(String authority) {
        this.authority = authority;
        return this;
    }

    /**
     * 权限点， edit, export, use, read
     * @return authority
     */
    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public CooperateAuthorizationRuleDto withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public CooperateAuthorizationRuleDto withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型，目前有datasource, dataset, dashboard, screen
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CooperateAuthorizationRuleDto that = (CooperateAuthorizationRuleDto) obj;
        return Objects.equals(this.authId, that.authId) && Objects.equals(this.authLevel, that.authLevel)
            && Objects.equals(this.authority, that.authority) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceType, that.resourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authId, authLevel, authority, resourceId, resourceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CooperateAuthorizationRuleDto {\n");
        sb.append("    authId: ").append(toIndentedString(authId)).append("\n");
        sb.append("    authLevel: ").append(toIndentedString(authLevel)).append("\n");
        sb.append("    authority: ").append(toIndentedString(authority)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
