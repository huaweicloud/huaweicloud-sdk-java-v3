package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 进程信息
 */
public class ProcessResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_path")

    private String processPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "launch_params")

    private String launchParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "launch_time")

    private Long launchTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_permission")

    private String runPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_pid")

    private Integer processPid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_process_pid")

    private Integer parentProcessPid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_process_name")

    private String parentProcessName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash")

    private String hash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_id")

    private String podId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_name")

    private String podName;

    public ProcessResponseInfo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * **参数解释**: 主机上安装的杀毒Agent的唯一标识ID，用于关联主机与杀毒服务 **取值范围**: 字符长度1-64位 
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public ProcessResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**： 服务器（主机）的唯一标识ID **取值范围**： 字符长度1-64位 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ProcessResponseInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 服务器名称 **取值范围**: 字符长度1-256位 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ProcessResponseInfo withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * **参数解释**: 服务器IP **取值范围**: 字符长度1-128位 
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public ProcessResponseInfo withProcessPath(String processPath) {
        this.processPath = processPath;
        return this;
    }

    /**
     * **参数解释**： 进程路径 **取值范围**： 字符长度1-256位 
     * @return processPath
     */
    public String getProcessPath() {
        return processPath;
    }

    public void setProcessPath(String processPath) {
        this.processPath = processPath;
    }

    public ProcessResponseInfo withLaunchParams(String launchParams) {
        this.launchParams = launchParams;
        return this;
    }

    /**
     * **参数解释** 进程启动参数 **取值范围** 字符长度1-256位 
     * @return launchParams
     */
    public String getLaunchParams() {
        return launchParams;
    }

    public void setLaunchParams(String launchParams) {
        this.launchParams = launchParams;
    }

    public ProcessResponseInfo withLaunchTime(Long launchTime) {
        this.launchTime = launchTime;
        return this;
    }

    /**
     * **参数解释**: 进程启动时间 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return launchTime
     */
    public Long getLaunchTime() {
        return launchTime;
    }

    public void setLaunchTime(Long launchTime) {
        this.launchTime = launchTime;
    }

    public ProcessResponseInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**: 用户名 **取值范围**: 字符长度1-64位 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ProcessResponseInfo withRunPermission(String runPermission) {
        this.runPermission = runPermission;
        return this;
    }

    /**
     * **参数解释** 运行权限，对应mode **取值范围** 字符长度1-256位 
     * @return runPermission
     */
    public String getRunPermission() {
        return runPermission;
    }

    public void setRunPermission(String runPermission) {
        this.runPermission = runPermission;
    }

    public ProcessResponseInfo withProcessPid(Integer processPid) {
        this.processPid = processPid;
        return this;
    }

    /**
     * **参数解释**： 进程ID **取值范围**： 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return processPid
     */
    public Integer getProcessPid() {
        return processPid;
    }

    public void setProcessPid(Integer processPid) {
        this.processPid = processPid;
    }

    public ProcessResponseInfo withParentProcessPid(Integer parentProcessPid) {
        this.parentProcessPid = parentProcessPid;
        return this;
    }

    /**
     * **参数解释**: 父进程id **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return parentProcessPid
     */
    public Integer getParentProcessPid() {
        return parentProcessPid;
    }

    public void setParentProcessPid(Integer parentProcessPid) {
        this.parentProcessPid = parentProcessPid;
    }

    public ProcessResponseInfo withParentProcessName(String parentProcessName) {
        this.parentProcessName = parentProcessName;
        return this;
    }

    /**
     * **参数解释** 父进程名称 **取值范围** 字符长度1-256位 
     * @return parentProcessName
     */
    public String getParentProcessName() {
        return parentProcessName;
    }

    public void setParentProcessName(String parentProcessName) {
        this.parentProcessName = parentProcessName;
    }

    public ProcessResponseInfo withHash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * **参数解释** 文件hash **取值范围** 字符长度1-256位 
     * @return hash
     */
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public ProcessResponseInfo withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * **参数解释**: 容器ID **取值范围**: 字符长度1-128位 
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public ProcessResponseInfo withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * **参数解释**： 容器实例名称 **取值范围**： 字符长度1-256位 
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public ProcessResponseInfo withPodId(String podId) {
        this.podId = podId;
        return this;
    }

    /**
     * **参数解释** Pod ID **取值范围** 字符长度1-128位 
     * @return podId
     */
    public String getPodId() {
        return podId;
    }

    public void setPodId(String podId) {
        this.podId = podId;
    }

    public ProcessResponseInfo withPodName(String podName) {
        this.podName = podName;
        return this;
    }

    /**
     * **参数解释** Pod名称 **取值范围** 字符长度1-256位 
     * @return podName
     */
    public String getPodName() {
        return podName;
    }

    public void setPodName(String podName) {
        this.podName = podName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProcessResponseInfo that = (ProcessResponseInfo) obj;
        return Objects.equals(this.agentId, that.agentId) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.hostIp, that.hostIp)
            && Objects.equals(this.processPath, that.processPath)
            && Objects.equals(this.launchParams, that.launchParams) && Objects.equals(this.launchTime, that.launchTime)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.runPermission, that.runPermission)
            && Objects.equals(this.processPid, that.processPid)
            && Objects.equals(this.parentProcessPid, that.parentProcessPid)
            && Objects.equals(this.parentProcessName, that.parentProcessName) && Objects.equals(this.hash, that.hash)
            && Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.containerName, that.containerName) && Objects.equals(this.podId, that.podId)
            && Objects.equals(this.podName, that.podName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId,
            hostId,
            hostName,
            hostIp,
            processPath,
            launchParams,
            launchTime,
            userName,
            runPermission,
            processPid,
            parentProcessPid,
            parentProcessName,
            hash,
            containerId,
            containerName,
            podId,
            podName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessResponseInfo {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    processPath: ").append(toIndentedString(processPath)).append("\n");
        sb.append("    launchParams: ").append(toIndentedString(launchParams)).append("\n");
        sb.append("    launchTime: ").append(toIndentedString(launchTime)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    runPermission: ").append(toIndentedString(runPermission)).append("\n");
        sb.append("    processPid: ").append(toIndentedString(processPid)).append("\n");
        sb.append("    parentProcessPid: ").append(toIndentedString(parentProcessPid)).append("\n");
        sb.append("    parentProcessName: ").append(toIndentedString(parentProcessName)).append("\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    podId: ").append(toIndentedString(podId)).append("\n");
        sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
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
