package com.huaweicloud.sdk.dataartsinsight.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAuthedRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_level")

    private String authLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_authed")

    private Boolean filterAuthed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Workspace-Id")

    private String xWorkspaceId;

    public ListAuthedRequest withAuthLevel(String authLevel) {
        this.authLevel = authLevel;
        return this;
    }

    /**
     * 授权主体级别。 • user：用户 • group：用户组
     * @return authLevel
     */
    public String getAuthLevel() {
        return authLevel;
    }

    public void setAuthLevel(String authLevel) {
        this.authLevel = authLevel;
    }

    public ListAuthedRequest withFilterAuthed(Boolean filterAuthed) {
        this.filterAuthed = filterAuthed;
        return this;
    }

    /**
     * 是否过滤已经授权的实体，默认true，仅显示授权用户和用户组信息。 预留字段。
     * @return filterAuthed
     */
    public Boolean getFilterAuthed() {
        return filterAuthed;
    }

    public void setFilterAuthed(Boolean filterAuthed) {
        this.filterAuthed = filterAuthed;
    }

    public ListAuthedRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListAuthedRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型： • datasource：数据源 • dataset：数据集 • dashboard：仪表板 • screen：大屏
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ListAuthedRequest withXWorkspaceId(String xWorkspaceId) {
        this.xWorkspaceId = xWorkspaceId;
        return this;
    }

    /**
     * 工作空间ID，即控制台的项目ID。
     * @return xWorkspaceId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Workspace-Id")
    public String getXWorkspaceId() {
        return xWorkspaceId;
    }

    public void setXWorkspaceId(String xWorkspaceId) {
        this.xWorkspaceId = xWorkspaceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuthedRequest that = (ListAuthedRequest) obj;
        return Objects.equals(this.authLevel, that.authLevel) && Objects.equals(this.filterAuthed, that.filterAuthed)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.xWorkspaceId, that.xWorkspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authLevel, filterAuthed, resourceId, resourceType, xWorkspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuthedRequest {\n");
        sb.append("    authLevel: ").append(toIndentedString(authLevel)).append("\n");
        sb.append("    filterAuthed: ").append(toIndentedString(filterAuthed)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    xWorkspaceId: ").append(toIndentedString(xWorkspaceId)).append("\n");
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
