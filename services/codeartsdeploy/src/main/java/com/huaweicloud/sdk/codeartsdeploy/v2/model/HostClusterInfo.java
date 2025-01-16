package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 主机集群信息
 */
public class HostClusterInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_count")

    private Integer hostCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os")

    private String os;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_cluster_id")

    private String slaveClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    private PermissionClusterDetail permission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_count")

    private Integer envCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_proxy_mode")

    private Integer isProxyMode;

    public HostClusterInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 主机集群id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HostClusterInfo withHostCount(Integer hostCount) {
        this.hostCount = hostCount;
        return this;
    }

    /**
     * 集群内主机数量，一个主机集群内最多可添加200台主机
     * minimum: 0
     * maximum: 200
     * @return hostCount
     */
    public Integer getHostCount() {
        return hostCount;
    }

    public void setHostCount(Integer hostCount) {
        this.hostCount = hostCount;
    }

    public HostClusterInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 主机集群名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HostClusterInfo withProjectId(String projectId) {
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

    public HostClusterInfo withOs(String os) {
        this.os = os;
        return this;
    }

    /**
     * 操作系统：windows|linux
     * @return os
     */
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public HostClusterInfo withSlaveClusterId(String slaveClusterId) {
        this.slaveClusterId = slaveClusterId;
        return this;
    }

    /**
     * slave集群id，默认为null时使用默认slave集群，用户自定义slave时为slave集群id
     * @return slaveClusterId
     */
    public String getSlaveClusterId() {
        return slaveClusterId;
    }

    public void setSlaveClusterId(String slaveClusterId) {
        this.slaveClusterId = slaveClusterId;
    }

    public HostClusterInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HostClusterInfo withPermission(PermissionClusterDetail permission) {
        this.permission = permission;
        return this;
    }

    public HostClusterInfo withPermission(Consumer<PermissionClusterDetail> permissionSetter) {
        if (this.permission == null) {
            this.permission = new PermissionClusterDetail();
            permissionSetter.accept(this.permission);
        }

        return this;
    }

    /**
     * Get permission
     * @return permission
     */
    public PermissionClusterDetail getPermission() {
        return permission;
    }

    public void setPermission(PermissionClusterDetail permission) {
        this.permission = permission;
    }

    public HostClusterInfo withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 创建人名称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public HostClusterInfo withEnvCount(Integer envCount) {
        this.envCount = envCount;
        return this;
    }

    /**
     * 环境数量
     * @return envCount
     */
    public Integer getEnvCount() {
        return envCount;
    }

    public void setEnvCount(Integer envCount) {
        this.envCount = envCount;
    }

    public HostClusterInfo withIsProxyMode(Integer isProxyMode) {
        this.isProxyMode = isProxyMode;
        return this;
    }

    /**
     * 主机集群是否为代理机接入模式， 1：是 0：否
     * @return isProxyMode
     */
    public Integer getIsProxyMode() {
        return isProxyMode;
    }

    public void setIsProxyMode(Integer isProxyMode) {
        this.isProxyMode = isProxyMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostClusterInfo that = (HostClusterInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.hostCount, that.hostCount)
            && Objects.equals(this.name, that.name) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.os, that.os) && Objects.equals(this.slaveClusterId, that.slaveClusterId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.permission, that.permission)
            && Objects.equals(this.nickName, that.nickName) && Objects.equals(this.envCount, that.envCount)
            && Objects.equals(this.isProxyMode, that.isProxyMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            hostCount,
            name,
            projectId,
            os,
            slaveClusterId,
            description,
            permission,
            nickName,
            envCount,
            isProxyMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostClusterInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    hostCount: ").append(toIndentedString(hostCount)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    slaveClusterId: ").append(toIndentedString(slaveClusterId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    envCount: ").append(toIndentedString(envCount)).append("\n");
        sb.append("    isProxyMode: ").append(toIndentedString(isProxyMode)).append("\n");
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
