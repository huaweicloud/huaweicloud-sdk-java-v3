package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListRolesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_pattern")

    private String rolePattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reverse_page")

    private Boolean reversePage;

    public ListRolesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListRolesRequest withRolePattern(String rolePattern) {
        this.rolePattern = rolePattern;
        return this;
    }

    /**
     * 模糊匹配角色名称
     * @return rolePattern
     */
    public String getRolePattern() {
        return rolePattern;
    }

    public void setRolePattern(String rolePattern) {
        this.rolePattern = rolePattern;
    }

    public ListRolesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 返回的条目数量
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

    public ListRolesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 查询的起始记录ID
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListRolesRequest withReversePage(Boolean reversePage) {
        this.reversePage = reversePage;
        return this;
    }

    /**
     * 是否查询上一页
     * @return reversePage
     */
    public Boolean getReversePage() {
        return reversePage;
    }

    public void setReversePage(Boolean reversePage) {
        this.reversePage = reversePage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRolesRequest listRolesRequest = (ListRolesRequest) o;
        return Objects.equals(this.instanceId, listRolesRequest.instanceId)
            && Objects.equals(this.rolePattern, listRolesRequest.rolePattern)
            && Objects.equals(this.limit, listRolesRequest.limit)
            && Objects.equals(this.marker, listRolesRequest.marker)
            && Objects.equals(this.reversePage, listRolesRequest.reversePage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, rolePattern, limit, marker, reversePage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRolesRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    rolePattern: ").append(toIndentedString(rolePattern)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    reversePage: ").append(toIndentedString(reversePage)).append("\n");
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
