package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 进程主机统计信息
 */
public class ProcessesHostResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash")

    private String hash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "launch_params")

    private String launchParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "launch_time")

    private Long launchTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_path")

    private String processPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_pid")

    private Integer processPid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_permission")

    private String runPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    public ProcessesHostResponseInfo withHash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * 文件hash
     * @return hash
     */
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public ProcessesHostResponseInfo withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * 主机ip
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public ProcessesHostResponseInfo withHostName(String hostName) {
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

    public ProcessesHostResponseInfo withLaunchParams(String launchParams) {
        this.launchParams = launchParams;
        return this;
    }

    /**
     * 启动参数
     * @return launchParams
     */
    public String getLaunchParams() {
        return launchParams;
    }

    public void setLaunchParams(String launchParams) {
        this.launchParams = launchParams;
    }

    public ProcessesHostResponseInfo withLaunchTime(Long launchTime) {
        this.launchTime = launchTime;
        return this;
    }

    /**
     * 启动时间
     * minimum: 0
     * maximum: 4070880000000
     * @return launchTime
     */
    public Long getLaunchTime() {
        return launchTime;
    }

    public void setLaunchTime(Long launchTime) {
        this.launchTime = launchTime;
    }

    public ProcessesHostResponseInfo withProcessPath(String processPath) {
        this.processPath = processPath;
        return this;
    }

    /**
     * 进程路径
     * @return processPath
     */
    public String getProcessPath() {
        return processPath;
    }

    public void setProcessPath(String processPath) {
        this.processPath = processPath;
    }

    public ProcessesHostResponseInfo withProcessPid(Integer processPid) {
        this.processPid = processPid;
        return this;
    }

    /**
     * 进程pid
     * minimum: 0
     * maximum: 65535
     * @return processPid
     */
    public Integer getProcessPid() {
        return processPid;
    }

    public void setProcessPid(Integer processPid) {
        this.processPid = processPid;
    }

    public ProcessesHostResponseInfo withRunPermission(String runPermission) {
        this.runPermission = runPermission;
        return this;
    }

    /**
     * 文件权限
     * @return runPermission
     */
    public String getRunPermission() {
        return runPermission;
    }

    public void setRunPermission(String runPermission) {
        this.runPermission = runPermission;
    }

    public ProcessesHostResponseInfo withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * 容器id
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public ProcessesHostResponseInfo withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * 容器名称
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProcessesHostResponseInfo that = (ProcessesHostResponseInfo) obj;
        return Objects.equals(this.hash, that.hash) && Objects.equals(this.hostIp, that.hostIp)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.launchParams, that.launchParams)
            && Objects.equals(this.launchTime, that.launchTime) && Objects.equals(this.processPath, that.processPath)
            && Objects.equals(this.processPid, that.processPid)
            && Objects.equals(this.runPermission, that.runPermission)
            && Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.containerName, that.containerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hash,
            hostIp,
            hostName,
            launchParams,
            launchTime,
            processPath,
            processPid,
            runPermission,
            containerId,
            containerName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessesHostResponseInfo {\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    launchParams: ").append(toIndentedString(launchParams)).append("\n");
        sb.append("    launchTime: ").append(toIndentedString(launchTime)).append("\n");
        sb.append("    processPath: ").append(toIndentedString(processPath)).append("\n");
        sb.append("    processPid: ").append(toIndentedString(processPid)).append("\n");
        sb.append("    runPermission: ").append(toIndentedString(runPermission)).append("\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
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
