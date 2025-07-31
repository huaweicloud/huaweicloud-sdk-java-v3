package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 容器内运行命令的日志信息
 */
public class ContainerCmdLogResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Long time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmd")

    private String cmd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_pid")

    private Integer processPid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_process_pid")

    private Integer parentProcessPid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_path")

    private String parentPath;

    public ContainerCmdLogResponseInfo withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ContainerCmdLogResponseInfo withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群id
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ContainerCmdLogResponseInfo withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * 集群类型，包含以下几种： - cce: cce集群 - ali: 阿里云集群 - tencent: 腾讯云集群 - azure: 微软云集群 - aws: 亚马逊集群 - self_built_hw: 华为云自建集群 - self_built_idc: IDC自建集群
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public ContainerCmdLogResponseInfo withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * 日志产生的时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public ContainerCmdLogResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 主机ID
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ContainerCmdLogResponseInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 主机名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ContainerCmdLogResponseInfo withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 容器所在主机的私网ip
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public ContainerCmdLogResponseInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 主机ip
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public ContainerCmdLogResponseInfo withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * 产生日志的容器名称
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public ContainerCmdLogResponseInfo withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * 产生日志的容器id
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public ContainerCmdLogResponseInfo withCmd(String cmd) {
        this.cmd = cmd;
        return this;
    }

    /**
     * 执行的命令
     * @return cmd
     */
    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public ContainerCmdLogResponseInfo withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 命令行对应的进程路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ContainerCmdLogResponseInfo withProcessPid(Integer processPid) {
        this.processPid = processPid;
        return this;
    }

    /**
     * 命令行对应的进程pid
     * minimum: 0
     * maximum: 10000000
     * @return processPid
     */
    public Integer getProcessPid() {
        return processPid;
    }

    public void setProcessPid(Integer processPid) {
        this.processPid = processPid;
    }

    public ContainerCmdLogResponseInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 执行命令的用户
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ContainerCmdLogResponseInfo withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 执行命令的用户所属用户组
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ContainerCmdLogResponseInfo withParentProcessPid(Integer parentProcessPid) {
        this.parentProcessPid = parentProcessPid;
        return this;
    }

    /**
     * 父进程pid
     * minimum: 0
     * maximum: 10000000
     * @return parentProcessPid
     */
    public Integer getParentProcessPid() {
        return parentProcessPid;
    }

    public void setParentProcessPid(Integer parentProcessPid) {
        this.parentProcessPid = parentProcessPid;
    }

    public ContainerCmdLogResponseInfo withParentPath(String parentPath) {
        this.parentPath = parentPath;
        return this;
    }

    /**
     * 父进程路径
     * @return parentPath
     */
    public String getParentPath() {
        return parentPath;
    }

    public void setParentPath(String parentPath) {
        this.parentPath = parentPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContainerCmdLogResponseInfo that = (ContainerCmdLogResponseInfo) obj;
        return Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.clusterType, that.clusterType) && Objects.equals(this.time, that.time)
            && Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.privateIp, that.privateIp) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.containerName, that.containerName)
            && Objects.equals(this.containerId, that.containerId) && Objects.equals(this.cmd, that.cmd)
            && Objects.equals(this.path, that.path) && Objects.equals(this.processPid, that.processPid)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.parentProcessPid, that.parentProcessPid)
            && Objects.equals(this.parentPath, that.parentPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterName,
            clusterId,
            clusterType,
            time,
            hostId,
            hostName,
            privateIp,
            publicIp,
            containerName,
            containerId,
            cmd,
            path,
            processPid,
            userName,
            groupName,
            parentProcessPid,
            parentPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerCmdLogResponseInfo {\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    processPid: ").append(toIndentedString(processPid)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    parentProcessPid: ").append(toIndentedString(parentProcessPid)).append("\n");
        sb.append("    parentPath: ").append(toIndentedString(parentPath)).append("\n");
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
