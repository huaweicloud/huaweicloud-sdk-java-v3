package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**: 中间件信息 
 */
public class JarPackageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalogue")

    private String catalogue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private Integer uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash")

    private String hash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pid")

    private Integer pid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proc_path")

    private String procPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_time")

    private Long recordTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    public JarPackageInfo withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * **参数解释**: 中间件名称 **取值范围**: 字符长度1-256 
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public JarPackageInfo withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * **参数解释**: 中间件类型 **取值范围**: -jar：jar包 -python：python软件包 -npm：npm软件包 
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public JarPackageInfo withCatalogue(String catalogue) {
        this.catalogue = catalogue;
        return this;
    }

    /**
     * **参数解释**: 分类 **取值范围**: -util：默认分类 
     * @return catalogue
     */
    public String getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(String catalogue) {
        this.catalogue = catalogue;
    }

    public JarPackageInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**: 中间件版本 **取值范围**: 字符长度1-512 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public JarPackageInfo withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释**: 中间件路径 **取值范围**: 字符长度1-512 
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public JarPackageInfo withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * **参数解释**: 中间件文件权限 **取值范围**: 字符长度1-32 
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public JarPackageInfo withUid(Integer uid) {
        this.uid = uid;
        return this;
    }

    /**
     * **参数解释**: uid **取值范围**: 最小值0，最大值2147483647 
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public JarPackageInfo withHash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * **参数解释**: 中间件文件hash **取值范围**: 字符长度1-64 
     * @return hash
     */
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public JarPackageInfo withPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    /**
     * **参数解释**: 中间件进程ID **取值范围**: 最小值0，最大值2147483647 
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public JarPackageInfo withProcPath(String procPath) {
        this.procPath = procPath;
        return this;
    }

    /**
     * **参数解释**: 中间件进程路径 **取值范围**: 字符长度1-1024 
     * @return procPath
     */
    public String getProcPath() {
        return procPath;
    }

    public void setProcPath(String procPath) {
        this.procPath = procPath;
    }

    public JarPackageInfo withRecordTime(Long recordTime) {
        this.recordTime = recordTime;
        return this;
    }

    /**
     * **参数解释**: 中间件扫描时间 **取值范围**: 最小值0，最大值2^63-1 
     * @return recordTime
     */
    public Long getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Long recordTime) {
        this.recordTime = recordTime;
    }

    public JarPackageInfo withContainerId(String containerId) {
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

    public JarPackageInfo withContainerName(String containerName) {
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
        JarPackageInfo that = (JarPackageInfo) obj;
        return Objects.equals(this.fileName, that.fileName) && Objects.equals(this.fileType, that.fileType)
            && Objects.equals(this.catalogue, that.catalogue) && Objects.equals(this.version, that.version)
            && Objects.equals(this.path, that.path) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.uid, that.uid) && Objects.equals(this.hash, that.hash)
            && Objects.equals(this.pid, that.pid) && Objects.equals(this.procPath, that.procPath)
            && Objects.equals(this.recordTime, that.recordTime) && Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.containerName, that.containerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName,
            fileType,
            catalogue,
            version,
            path,
            mode,
            uid,
            hash,
            pid,
            procPath,
            recordTime,
            containerId,
            containerName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JarPackageInfo {\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    catalogue: ").append(toIndentedString(catalogue)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    procPath: ").append(toIndentedString(procPath)).append("\n");
        sb.append("    recordTime: ").append(toIndentedString(recordTime)).append("\n");
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
