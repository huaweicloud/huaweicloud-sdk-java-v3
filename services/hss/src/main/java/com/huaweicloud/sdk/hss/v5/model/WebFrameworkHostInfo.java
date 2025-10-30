package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释** 服务器列表 
 */
public class WebFrameworkHostInfo {

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
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_time")

    private Long recordTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalogue")

    private String catalogue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gid")

    private Integer gid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash")

    private String hash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_embedded")

    private Integer isEmbedded;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pid")

    private Integer pid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proc_path")

    private String procPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private Integer uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    public WebFrameworkHostInfo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * **参数解释** agent id **取值范围** 字符长度1-64 
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public WebFrameworkHostInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释** 主机id **取值范围** 字符长度1-64 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public WebFrameworkHostInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释** 服务器名称 **取值范围** 字符长度1-64 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public WebFrameworkHostInfo withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * **参数解释** 服务器ip **取值范围** 字符长度1-64 
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public WebFrameworkHostInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: web框架名称 **取值范围**: 字符长度1-256 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebFrameworkHostInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**: web框架版本 **取值范围**: 字符长度1-512 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public WebFrameworkHostInfo withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释**: web框架文件路径 **取值范围**: 字符长度1-512 
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public WebFrameworkHostInfo withRecordTime(Long recordTime) {
        this.recordTime = recordTime;
        return this;
    }

    /**
     * **参数解释**: web框架扫描时间 **取值范围**: 最小值0，最大值2^63-1 
     * @return recordTime
     */
    public Long getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Long recordTime) {
        this.recordTime = recordTime;
    }

    public WebFrameworkHostInfo withCatalogue(String catalogue) {
        this.catalogue = catalogue;
        return this;
    }

    /**
     * **参数解释**: 软件的类型 **取值范围**: 字符长度1-32 
     * @return catalogue
     */
    public String getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(String catalogue) {
        this.catalogue = catalogue;
    }

    public WebFrameworkHostInfo withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * **参数解释**: web框架文件名称 **取值范围**: 字符长度1-256 
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public WebFrameworkHostInfo withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * **参数解释**: web框架文件类型 **取值范围**: 字符长度1-32 
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public WebFrameworkHostInfo withGid(Integer gid) {
        this.gid = gid;
        return this;
    }

    /**
     * **参数解释**: web框架进程gid **取值范围**: 最小值0，最大值2147483647 
     * @return gid
     */
    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public WebFrameworkHostInfo withHash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * **参数解释**: web框架文件哈希 **取值范围**: 字符长度1-64 
     * @return hash
     */
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public WebFrameworkHostInfo withIsEmbedded(Integer isEmbedded) {
        this.isEmbedded = isEmbedded;
        return this;
    }

    /**
     * **参数解释**: 是否是压缩的文件 **取值范围**: - 0：不是压缩文件 - 1：是压缩文件 
     * @return isEmbedded
     */
    public Integer getIsEmbedded() {
        return isEmbedded;
    }

    public void setIsEmbedded(Integer isEmbedded) {
        this.isEmbedded = isEmbedded;
    }

    public WebFrameworkHostInfo withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * **参数解释**: web框架文件权限 **取值范围**: 字符长度1-32 
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public WebFrameworkHostInfo withPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    /**
     * **参数解释**: web框架进程pid **取值范围**: 最小值0，最大值2147483647 
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public WebFrameworkHostInfo withProcPath(String procPath) {
        this.procPath = procPath;
        return this;
    }

    /**
     * **参数解释**: web框架进程路径 **取值范围**: 字符长度1-1024 
     * @return procPath
     */
    public String getProcPath() {
        return procPath;
    }

    public void setProcPath(String procPath) {
        this.procPath = procPath;
    }

    public WebFrameworkHostInfo withUid(Integer uid) {
        this.uid = uid;
        return this;
    }

    /**
     * **参数解释**: web框架进程uid **取值范围**: 最小值0，最大值2147483647 
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public WebFrameworkHostInfo withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * **参数解释**: 容器id **取值范围**: 字符长度1-128 
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public WebFrameworkHostInfo withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * **参数解释**: 容器名称 **取值范围**: 字符长度1-256 
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
        WebFrameworkHostInfo that = (WebFrameworkHostInfo) obj;
        return Objects.equals(this.agentId, that.agentId) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.hostIp, that.hostIp)
            && Objects.equals(this.name, that.name) && Objects.equals(this.version, that.version)
            && Objects.equals(this.path, that.path) && Objects.equals(this.recordTime, that.recordTime)
            && Objects.equals(this.catalogue, that.catalogue) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.fileType, that.fileType) && Objects.equals(this.gid, that.gid)
            && Objects.equals(this.hash, that.hash) && Objects.equals(this.isEmbedded, that.isEmbedded)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.pid, that.pid)
            && Objects.equals(this.procPath, that.procPath) && Objects.equals(this.uid, that.uid)
            && Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.containerName, that.containerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId,
            hostId,
            hostName,
            hostIp,
            name,
            version,
            path,
            recordTime,
            catalogue,
            fileName,
            fileType,
            gid,
            hash,
            isEmbedded,
            mode,
            pid,
            procPath,
            uid,
            containerId,
            containerName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebFrameworkHostInfo {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    recordTime: ").append(toIndentedString(recordTime)).append("\n");
        sb.append("    catalogue: ").append(toIndentedString(catalogue)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    isEmbedded: ").append(toIndentedString(isEmbedded)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    procPath: ").append(toIndentedString(procPath)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
