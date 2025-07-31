package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * WebAppAndServiceResponseInfo
 */
public class WebAppAndServiceResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalogue")

    private String catalogue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_path")

    private String installPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_path")

    private String configPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private Integer uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gid")

    private Integer gid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ctime")

    private Long ctime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mtime")

    private Long mtime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "atime")

    private Long atime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pid")

    private Integer pid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proc_path")

    private String procPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_time")

    private Long recordTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    public WebAppAndServiceResponseInfo withCatalogue(String catalogue) {
        this.catalogue = catalogue;
        return this;
    }

    /**
     * 资产指纹种类
     * @return catalogue
     */
    public String getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(String catalogue) {
        this.catalogue = catalogue;
    }

    public WebAppAndServiceResponseInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资产指纹名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebAppAndServiceResponseInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 资产指纹-数据库-版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public WebAppAndServiceResponseInfo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * agent_id
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public WebAppAndServiceResponseInfo withInstallPath(String installPath) {
        this.installPath = installPath;
        return this;
    }

    /**
     * install_path
     * @return installPath
     */
    public String getInstallPath() {
        return installPath;
    }

    public void setInstallPath(String installPath) {
        this.installPath = installPath;
    }

    public WebAppAndServiceResponseInfo withConfigPath(String configPath) {
        this.configPath = configPath;
        return this;
    }

    /**
     * config_path 配置文件路径
     * @return configPath
     */
    public String getConfigPath() {
        return configPath;
    }

    public void setConfigPath(String configPath) {
        this.configPath = configPath;
    }

    public WebAppAndServiceResponseInfo withUid(Integer uid) {
        this.uid = uid;
        return this;
    }

    /**
     * uid
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public WebAppAndServiceResponseInfo withGid(Integer gid) {
        this.gid = gid;
        return this;
    }

    /**
     * gid
     * @return gid
     */
    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public WebAppAndServiceResponseInfo withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * mode
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public WebAppAndServiceResponseInfo withCtime(Long ctime) {
        this.ctime = ctime;
        return this;
    }

    /**
     * ctime
     * @return ctime
     */
    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    public WebAppAndServiceResponseInfo withMtime(Long mtime) {
        this.mtime = mtime;
        return this;
    }

    /**
     * mtime
     * @return mtime
     */
    public Long getMtime() {
        return mtime;
    }

    public void setMtime(Long mtime) {
        this.mtime = mtime;
    }

    public WebAppAndServiceResponseInfo withAtime(Long atime) {
        this.atime = atime;
        return this;
    }

    /**
     * atime
     * @return atime
     */
    public Long getAtime() {
        return atime;
    }

    public void setAtime(Long atime) {
        this.atime = atime;
    }

    public WebAppAndServiceResponseInfo withPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    /**
     * pid
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public WebAppAndServiceResponseInfo withProcPath(String procPath) {
        this.procPath = procPath;
        return this;
    }

    /**
     * proc_path
     * @return procPath
     */
    public String getProcPath() {
        return procPath;
    }

    public void setProcPath(String procPath) {
        this.procPath = procPath;
    }

    public WebAppAndServiceResponseInfo withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * container_id
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public WebAppAndServiceResponseInfo withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * container_name
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public WebAppAndServiceResponseInfo withRecordTime(Long recordTime) {
        this.recordTime = recordTime;
        return this;
    }

    /**
     * record_time
     * @return recordTime
     */
    public Long getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Long recordTime) {
        this.recordTime = recordTime;
    }

    public WebAppAndServiceResponseInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * host_name
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public WebAppAndServiceResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * host_id
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public WebAppAndServiceResponseInfo withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * host_ip
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebAppAndServiceResponseInfo that = (WebAppAndServiceResponseInfo) obj;
        return Objects.equals(this.catalogue, that.catalogue) && Objects.equals(this.name, that.name)
            && Objects.equals(this.version, that.version) && Objects.equals(this.agentId, that.agentId)
            && Objects.equals(this.installPath, that.installPath) && Objects.equals(this.configPath, that.configPath)
            && Objects.equals(this.uid, that.uid) && Objects.equals(this.gid, that.gid)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.ctime, that.ctime)
            && Objects.equals(this.mtime, that.mtime) && Objects.equals(this.atime, that.atime)
            && Objects.equals(this.pid, that.pid) && Objects.equals(this.procPath, that.procPath)
            && Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.containerName, that.containerName)
            && Objects.equals(this.recordTime, that.recordTime) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostIp, that.hostIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogue,
            name,
            version,
            agentId,
            installPath,
            configPath,
            uid,
            gid,
            mode,
            ctime,
            mtime,
            atime,
            pid,
            procPath,
            containerId,
            containerName,
            recordTime,
            hostName,
            hostId,
            hostIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebAppAndServiceResponseInfo {\n");
        sb.append("    catalogue: ").append(toIndentedString(catalogue)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    installPath: ").append(toIndentedString(installPath)).append("\n");
        sb.append("    configPath: ").append(toIndentedString(configPath)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    ctime: ").append(toIndentedString(ctime)).append("\n");
        sb.append("    mtime: ").append(toIndentedString(mtime)).append("\n");
        sb.append("    atime: ").append(toIndentedString(atime)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    procPath: ").append(toIndentedString(procPath)).append("\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    recordTime: ").append(toIndentedString(recordTime)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
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
