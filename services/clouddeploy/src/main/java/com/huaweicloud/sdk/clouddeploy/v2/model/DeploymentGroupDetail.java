package com.huaweicloud.sdk.clouddeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 主机组详情响应体 */
public class DeploymentGroupDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private String updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_count")

    private Integer hostCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os")

    private String os;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_connection_test_switch")

    private Integer autoConnectionTestSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_cluster_id")

    private String slaveClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private UserInfo createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private UserInfo updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    private PermissionGroupDetail permission;

    public DeploymentGroupDetail withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /** 主机组id
     * 
     * @return groupId */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public DeploymentGroupDetail withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /** 创建时间
     * 
     * @return createdTime */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public DeploymentGroupDetail withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /** 修改时间
     * 
     * @return updatedTime */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public DeploymentGroupDetail withHostCount(Integer hostCount) {
        this.hostCount = hostCount;
        return this;
    }

    /** 组内主机数量，一个主机组内最多可添加200台主机 minimum: 0 maximum: 200
     * 
     * @return hostCount */
    public Integer getHostCount() {
        return hostCount;
    }

    public void setHostCount(Integer hostCount) {
        this.hostCount = hostCount;
    }

    public DeploymentGroupDetail withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /** devcloud项目名称
     * 
     * @return projectName */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public DeploymentGroupDetail withName(String name) {
        this.name = name;
        return this;
    }

    /** 主机组名
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeploymentGroupDetail withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /** 局点信息
     * 
     * @return regionName */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public DeploymentGroupDetail withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** devcloud项目id
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public DeploymentGroupDetail withOs(String os) {
        this.os = os;
        return this;
    }

    /** 操作系统：windows|linux
     * 
     * @return os */
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public DeploymentGroupDetail withAutoConnectionTestSwitch(Integer autoConnectionTestSwitch) {
        this.autoConnectionTestSwitch = autoConnectionTestSwitch;
        return this;
    }

    /** 自动连通性验证 0不执行 1每日 2每周
     * 
     * @return autoConnectionTestSwitch */
    public Integer getAutoConnectionTestSwitch() {
        return autoConnectionTestSwitch;
    }

    public void setAutoConnectionTestSwitch(Integer autoConnectionTestSwitch) {
        this.autoConnectionTestSwitch = autoConnectionTestSwitch;
    }

    public DeploymentGroupDetail withSlaveClusterId(String slaveClusterId) {
        this.slaveClusterId = slaveClusterId;
        return this;
    }

    /** slave集群id，默认为null时使用devcloud八爪鱼slave集群，用户自定义slave时为slave集群id
     * 
     * @return slaveClusterId */
    public String getSlaveClusterId() {
        return slaveClusterId;
    }

    public void setSlaveClusterId(String slaveClusterId) {
        this.slaveClusterId = slaveClusterId;
    }

    public DeploymentGroupDetail withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /** 用户昵称
     * 
     * @return nickName */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public DeploymentGroupDetail withCreatedBy(UserInfo createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public DeploymentGroupDetail withCreatedBy(Consumer<UserInfo> createdBySetter) {
        if (this.createdBy == null) {
            this.createdBy = new UserInfo();
            createdBySetter.accept(this.createdBy);
        }

        return this;
    }

    /** Get createdBy
     * 
     * @return createdBy */
    public UserInfo getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserInfo createdBy) {
        this.createdBy = createdBy;
    }

    public DeploymentGroupDetail withUpdateBy(UserInfo updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    public DeploymentGroupDetail withUpdateBy(Consumer<UserInfo> updateBySetter) {
        if (this.updateBy == null) {
            this.updateBy = new UserInfo();
            updateBySetter.accept(this.updateBy);
        }

        return this;
    }

    /** Get updateBy
     * 
     * @return updateBy */
    public UserInfo getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(UserInfo updateBy) {
        this.updateBy = updateBy;
    }

    public DeploymentGroupDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 描述
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DeploymentGroupDetail withPermission(PermissionGroupDetail permission) {
        this.permission = permission;
        return this;
    }

    public DeploymentGroupDetail withPermission(Consumer<PermissionGroupDetail> permissionSetter) {
        if (this.permission == null) {
            this.permission = new PermissionGroupDetail();
            permissionSetter.accept(this.permission);
        }

        return this;
    }

    /** Get permission
     * 
     * @return permission */
    public PermissionGroupDetail getPermission() {
        return permission;
    }

    public void setPermission(PermissionGroupDetail permission) {
        this.permission = permission;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeploymentGroupDetail deploymentGroupDetail = (DeploymentGroupDetail) o;
        return Objects.equals(this.groupId, deploymentGroupDetail.groupId)
            && Objects.equals(this.createdTime, deploymentGroupDetail.createdTime)
            && Objects.equals(this.updatedTime, deploymentGroupDetail.updatedTime)
            && Objects.equals(this.hostCount, deploymentGroupDetail.hostCount)
            && Objects.equals(this.projectName, deploymentGroupDetail.projectName)
            && Objects.equals(this.name, deploymentGroupDetail.name)
            && Objects.equals(this.regionName, deploymentGroupDetail.regionName)
            && Objects.equals(this.projectId, deploymentGroupDetail.projectId)
            && Objects.equals(this.os, deploymentGroupDetail.os)
            && Objects.equals(this.autoConnectionTestSwitch, deploymentGroupDetail.autoConnectionTestSwitch)
            && Objects.equals(this.slaveClusterId, deploymentGroupDetail.slaveClusterId)
            && Objects.equals(this.nickName, deploymentGroupDetail.nickName)
            && Objects.equals(this.createdBy, deploymentGroupDetail.createdBy)
            && Objects.equals(this.updateBy, deploymentGroupDetail.updateBy)
            && Objects.equals(this.description, deploymentGroupDetail.description)
            && Objects.equals(this.permission, deploymentGroupDetail.permission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId,
            createdTime,
            updatedTime,
            hostCount,
            projectName,
            name,
            regionName,
            projectId,
            os,
            autoConnectionTestSwitch,
            slaveClusterId,
            nickName,
            createdBy,
            updateBy,
            description,
            permission);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentGroupDetail {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    hostCount: ").append(toIndentedString(hostCount)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    autoConnectionTestSwitch: ").append(toIndentedString(autoConnectionTestSwitch)).append("\n");
        sb.append("    slaveClusterId: ").append(toIndentedString(slaveClusterId)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
