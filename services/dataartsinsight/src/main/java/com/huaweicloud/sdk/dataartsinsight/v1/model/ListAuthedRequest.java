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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_name")

    private String authName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

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

    public ListAuthedRequest withAuthName(String authName) {
        this.authName = authName;
        return this;
    }

    /**
     * 授权主体名称
     * @return authName
     */
    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public ListAuthedRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页大小
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAuthedRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量
     * minimum: 0
     * maximum: 1000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAuthedRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * asc: 升序， desc: 降序
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
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
            && Objects.equals(this.xWorkspaceId, that.xWorkspaceId) && Objects.equals(this.authName, that.authName)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.sortDir, that.sortDir);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(authLevel, filterAuthed, resourceId, resourceType, xWorkspaceId, authName, limit, offset, sortDir);
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
        sb.append("    authName: ").append(toIndentedString(authName)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
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
