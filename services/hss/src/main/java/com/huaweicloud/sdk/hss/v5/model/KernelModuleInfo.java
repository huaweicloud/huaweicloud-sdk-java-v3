package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 内核模块信息
 */
public class KernelModuleInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "srcversion")

    private String srcversion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private Integer uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ctime")

    private Long ctime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mtime")

    private Long mtime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash")

    private String hash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_time")

    private Long recordTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_scan_time")

    private Long firstScanTime;

    public KernelModuleInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 内核模块名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KernelModuleInfo withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名称
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public KernelModuleInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 内核模块版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public KernelModuleInfo withSrcversion(String srcversion) {
        this.srcversion = srcversion;
        return this;
    }

    /**
     * 源码版本号
     * @return srcversion
     */
    public String getSrcversion() {
        return srcversion;
    }

    public void setSrcversion(String srcversion) {
        this.srcversion = srcversion;
    }

    public KernelModuleInfo withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 文件路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public KernelModuleInfo withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 文件大小
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public KernelModuleInfo withMode(String mode) {
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

    public KernelModuleInfo withUid(Integer uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 文件用户ID
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public KernelModuleInfo withCtime(Long ctime) {
        this.ctime = ctime;
        return this;
    }

    /**
     * 文件创建时间
     * @return ctime
     */
    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    public KernelModuleInfo withMtime(Long mtime) {
        this.mtime = mtime;
        return this;
    }

    /**
     * 最后修改时间
     * @return mtime
     */
    public Long getMtime() {
        return mtime;
    }

    public void setMtime(Long mtime) {
        this.mtime = mtime;
    }

    public KernelModuleInfo withHash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * 文件哈希
     * @return hash
     */
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public KernelModuleInfo withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 内核模块描述信息
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public KernelModuleInfo withRecordTime(Long recordTime) {
        this.recordTime = recordTime;
        return this;
    }

    /**
     * 扫描时间
     * @return recordTime
     */
    public Long getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Long recordTime) {
        this.recordTime = recordTime;
    }

    public KernelModuleInfo withFirstScanTime(Long firstScanTime) {
        this.firstScanTime = firstScanTime;
        return this;
    }

    /**
     * 首次扫描时间
     * @return firstScanTime
     */
    public Long getFirstScanTime() {
        return firstScanTime;
    }

    public void setFirstScanTime(Long firstScanTime) {
        this.firstScanTime = firstScanTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KernelModuleInfo that = (KernelModuleInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.version, that.version) && Objects.equals(this.srcversion, that.srcversion)
            && Objects.equals(this.path, that.path) && Objects.equals(this.size, that.size)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.uid, that.uid)
            && Objects.equals(this.ctime, that.ctime) && Objects.equals(this.mtime, that.mtime)
            && Objects.equals(this.hash, that.hash) && Objects.equals(this.desc, that.desc)
            && Objects.equals(this.recordTime, that.recordTime)
            && Objects.equals(this.firstScanTime, that.firstScanTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            fileName,
            version,
            srcversion,
            path,
            size,
            mode,
            uid,
            ctime,
            mtime,
            hash,
            desc,
            recordTime,
            firstScanTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KernelModuleInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    srcversion: ").append(toIndentedString(srcversion)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    ctime: ").append(toIndentedString(ctime)).append("\n");
        sb.append("    mtime: ").append(toIndentedString(mtime)).append("\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    recordTime: ").append(toIndentedString(recordTime)).append("\n");
        sb.append("    firstScanTime: ").append(toIndentedString(firstScanTime)).append("\n");
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
