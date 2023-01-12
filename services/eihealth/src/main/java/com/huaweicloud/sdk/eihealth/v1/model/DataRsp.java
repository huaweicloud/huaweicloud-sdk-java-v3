package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据对象
 */
public class DataRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private PathType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "download_url")

    private String downloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_operate")

    private Boolean allowedOperate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletable")

    private Boolean deletable;

    public DataRsp withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 对象全路径（项目名称:/路径）
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public DataRsp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataRsp withType(PathType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public PathType getType() {
        return type;
    }

    public void setType(PathType type) {
        this.type = type;
    }

    public DataRsp withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 大小
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public DataRsp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public DataRsp withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * 下载链接
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public DataRsp withAllowedOperate(Boolean allowedOperate) {
        this.allowedOperate = allowedOperate;
        return this;
    }

    /**
     * 可操作标记
     * @return allowedOperate
     */
    public Boolean getAllowedOperate() {
        return allowedOperate;
    }

    public void setAllowedOperate(Boolean allowedOperate) {
        this.allowedOperate = allowedOperate;
    }

    public DataRsp withDeletable(Boolean deletable) {
        this.deletable = deletable;
        return this;
    }

    /**
     * 可删除标记
     * @return deletable
     */
    public Boolean getDeletable() {
        return deletable;
    }

    public void setDeletable(Boolean deletable) {
        this.deletable = deletable;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataRsp dataRsp = (DataRsp) o;
        return Objects.equals(this.path, dataRsp.path) && Objects.equals(this.name, dataRsp.name)
            && Objects.equals(this.type, dataRsp.type) && Objects.equals(this.size, dataRsp.size)
            && Objects.equals(this.createTime, dataRsp.createTime)
            && Objects.equals(this.downloadUrl, dataRsp.downloadUrl)
            && Objects.equals(this.allowedOperate, dataRsp.allowedOperate)
            && Objects.equals(this.deletable, dataRsp.deletable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, name, type, size, createTime, downloadUrl, allowedOperate, deletable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataRsp {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
        sb.append("    allowedOperate: ").append(toIndentedString(allowedOperate)).append("\n");
        sb.append("    deletable: ").append(toIndentedString(deletable)).append("\n");
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
