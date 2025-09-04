package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建更新分组请求体
 */
public class RolePermissionsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_ids")

    private List<String> jobIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_switch")

    private Boolean projectSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permissions")

    private List<JobRolePermission> permissions = null;

    public RolePermissionsRequestBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * CodeArts项目ID。获取方式请参考[获取CodeArts项目ID](https://support.huaweicloud.com/api-codeci/cloudbuild_03_0022.html)。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public RolePermissionsRequestBody withJobIds(List<String> jobIds) {
        this.jobIds = jobIds;
        return this;
    }

    public RolePermissionsRequestBody addJobIdsItem(String jobIdsItem) {
        if (this.jobIds == null) {
            this.jobIds = new ArrayList<>();
        }
        this.jobIds.add(jobIdsItem);
        return this;
    }

    public RolePermissionsRequestBody withJobIds(Consumer<List<String>> jobIdsSetter) {
        if (this.jobIds == null) {
            this.jobIds = new ArrayList<>();
        }
        jobIdsSetter.accept(this.jobIds);
        return this;
    }

    /**
     * 任务id集合
     * @return jobIds
     */
    public List<String> getJobIds() {
        return jobIds;
    }

    public void setJobIds(List<String> jobIds) {
        this.jobIds = jobIds;
    }

    public RolePermissionsRequestBody withProjectSwitch(Boolean projectSwitch) {
        this.projectSwitch = projectSwitch;
        return this;
    }

    /**
     * 是否同步最新项目权限
     * @return projectSwitch
     */
    public Boolean getProjectSwitch() {
        return projectSwitch;
    }

    public void setProjectSwitch(Boolean projectSwitch) {
        this.projectSwitch = projectSwitch;
    }

    public RolePermissionsRequestBody withPermissions(List<JobRolePermission> permissions) {
        this.permissions = permissions;
        return this;
    }

    public RolePermissionsRequestBody addPermissionsItem(JobRolePermission permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    public RolePermissionsRequestBody withPermissions(Consumer<List<JobRolePermission>> permissionsSetter) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        permissionsSetter.accept(this.permissions);
        return this;
    }

    /**
     * 角色权限信息
     * @return permissions
     */
    public List<JobRolePermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<JobRolePermission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RolePermissionsRequestBody that = (RolePermissionsRequestBody) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.jobIds, that.jobIds)
            && Objects.equals(this.projectSwitch, that.projectSwitch)
            && Objects.equals(this.permissions, that.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, jobIds, projectSwitch, permissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RolePermissionsRequestBody {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    jobIds: ").append(toIndentedString(jobIds)).append("\n");
        sb.append("    projectSwitch: ").append(toIndentedString(projectSwitch)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
