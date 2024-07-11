package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchUpdateApplicationPermissionsRequestBody
 */
public class BatchUpdateApplicationPermissionsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_ids")

    private List<String> applicationIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roles")

    private List<AppPermission> roles = null;

    public BatchUpdateApplicationPermissionsRequestBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public BatchUpdateApplicationPermissionsRequestBody withApplicationIds(List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }

    public BatchUpdateApplicationPermissionsRequestBody addApplicationIdsItem(String applicationIdsItem) {
        if (this.applicationIds == null) {
            this.applicationIds = new ArrayList<>();
        }
        this.applicationIds.add(applicationIdsItem);
        return this;
    }

    public BatchUpdateApplicationPermissionsRequestBody withApplicationIds(
        Consumer<List<String>> applicationIdsSetter) {
        if (this.applicationIds == null) {
            this.applicationIds = new ArrayList<>();
        }
        applicationIdsSetter.accept(this.applicationIds);
        return this;
    }

    /**
     * 应用列表
     * @return applicationIds
     */
    public List<String> getApplicationIds() {
        return applicationIds;
    }

    public void setApplicationIds(List<String> applicationIds) {
        this.applicationIds = applicationIds;
    }

    public BatchUpdateApplicationPermissionsRequestBody withRoles(List<AppPermission> roles) {
        this.roles = roles;
        return this;
    }

    public BatchUpdateApplicationPermissionsRequestBody addRolesItem(AppPermission rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public BatchUpdateApplicationPermissionsRequestBody withRoles(Consumer<List<AppPermission>> rolesSetter) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /**
     * 角色权限
     * @return roles
     */
    public List<AppPermission> getRoles() {
        return roles;
    }

    public void setRoles(List<AppPermission> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateApplicationPermissionsRequestBody that = (BatchUpdateApplicationPermissionsRequestBody) obj;
        return Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.applicationIds, that.applicationIds) && Objects.equals(this.roles, that.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, applicationIds, roles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateApplicationPermissionsRequestBody {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    applicationIds: ").append(toIndentedString(applicationIds)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
