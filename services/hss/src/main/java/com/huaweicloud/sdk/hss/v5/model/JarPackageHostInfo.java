package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 服务器列表
 */
public class JarPackageHostInfo {

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
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalogue")

    private String catalogue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash")

    private String hash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

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
    @JsonProperty(value = "package_path")

    private String packagePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_embedded")

    private Integer isEmbedded;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_time")

    private Long recordTime;

    public JarPackageHostInfo withAgentId(String agentId) {
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

    public JarPackageHostInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 主机id
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public JarPackageHostInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 服务器名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public JarPackageHostInfo withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * 服务器ip
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public JarPackageHostInfo withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Jar包名称
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public JarPackageHostInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Jar包名称(不带后缀)
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JarPackageHostInfo withCatalogue(String catalogue) {
        this.catalogue = catalogue;
        return this;
    }

    /**
     * Jar包类型
     * @return catalogue
     */
    public String getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(String catalogue) {
        this.catalogue = catalogue;
    }

    public JarPackageHostInfo withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * Jar包后缀
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public JarPackageHostInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Jar包版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public JarPackageHostInfo withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Jar包路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public JarPackageHostInfo withHash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * Jar包hash
     * @return hash
     */
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public JarPackageHostInfo withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Jar包大小
     * minimum: 0
     * maximum: 2147483647
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public JarPackageHostInfo withUid(Integer uid) {
        this.uid = uid;
        return this;
    }

    /**
     * uid
     * minimum: 0
     * maximum: 2147483647
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public JarPackageHostInfo withGid(Integer gid) {
        this.gid = gid;
        return this;
    }

    /**
     * gid
     * minimum: 0
     * maximum: 2147483647
     * @return gid
     */
    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public JarPackageHostInfo withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 文件权限
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public JarPackageHostInfo withPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    /**
     * 进程id
     * minimum: 0
     * maximum: 2147483647
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public JarPackageHostInfo withProcPath(String procPath) {
        this.procPath = procPath;
        return this;
    }

    /**
     * 进程可执行文件路径
     * @return procPath
     */
    public String getProcPath() {
        return procPath;
    }

    public void setProcPath(String procPath) {
        this.procPath = procPath;
    }

    public JarPackageHostInfo withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * 容器实例id
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public JarPackageHostInfo withContainerName(String containerName) {
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

    public JarPackageHostInfo withPackagePath(String packagePath) {
        this.packagePath = packagePath;
        return this;
    }

    /**
     * 包路径
     * @return packagePath
     */
    public String getPackagePath() {
        return packagePath;
    }

    public void setPackagePath(String packagePath) {
        this.packagePath = packagePath;
    }

    public JarPackageHostInfo withIsEmbedded(Integer isEmbedded) {
        this.isEmbedded = isEmbedded;
        return this;
    }

    /**
     * 显示的是否是嵌套包
     * minimum: 0
     * maximum: 2147483647
     * @return isEmbedded
     */
    public Integer getIsEmbedded() {
        return isEmbedded;
    }

    public void setIsEmbedded(Integer isEmbedded) {
        this.isEmbedded = isEmbedded;
    }

    public JarPackageHostInfo withRecordTime(Long recordTime) {
        this.recordTime = recordTime;
        return this;
    }

    /**
     * 扫描时间
     * minimum: 0
     * maximum: 4070880000000
     * @return recordTime
     */
    public Long getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Long recordTime) {
        this.recordTime = recordTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JarPackageHostInfo that = (JarPackageHostInfo) obj;
        return Objects.equals(this.agentId, that.agentId) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.hostIp, that.hostIp)
            && Objects.equals(this.fileName, that.fileName) && Objects.equals(this.name, that.name)
            && Objects.equals(this.catalogue, that.catalogue) && Objects.equals(this.fileType, that.fileType)
            && Objects.equals(this.version, that.version) && Objects.equals(this.path, that.path)
            && Objects.equals(this.hash, that.hash) && Objects.equals(this.size, that.size)
            && Objects.equals(this.uid, that.uid) && Objects.equals(this.gid, that.gid)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.pid, that.pid)
            && Objects.equals(this.procPath, that.procPath) && Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.containerName, that.containerName)
            && Objects.equals(this.packagePath, that.packagePath) && Objects.equals(this.isEmbedded, that.isEmbedded)
            && Objects.equals(this.recordTime, that.recordTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId,
            hostId,
            hostName,
            hostIp,
            fileName,
            name,
            catalogue,
            fileType,
            version,
            path,
            hash,
            size,
            uid,
            gid,
            mode,
            pid,
            procPath,
            containerId,
            containerName,
            packagePath,
            isEmbedded,
            recordTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JarPackageHostInfo {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    catalogue: ").append(toIndentedString(catalogue)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    procPath: ").append(toIndentedString(procPath)).append("\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    packagePath: ").append(toIndentedString(packagePath)).append("\n");
        sb.append("    isEmbedded: ").append(toIndentedString(isEmbedded)).append("\n");
        sb.append("    recordTime: ").append(toIndentedString(recordTime)).append("\n");
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
