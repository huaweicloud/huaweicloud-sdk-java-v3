package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据对象
 */
public class DataSummaryRsp {

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
    @JsonProperty(value = "allowed_operate")

    private Boolean allowedOperate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletable")

    private Boolean deletable;

    public DataSummaryRsp withPath(String path) {
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

    public DataSummaryRsp withName(String name) {
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

    public DataSummaryRsp withType(PathType type) {
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

    public DataSummaryRsp withSize(Long size) {
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

    public DataSummaryRsp withCreateTime(String createTime) {
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

    public DataSummaryRsp withAllowedOperate(Boolean allowedOperate) {
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

    public DataSummaryRsp withDeletable(Boolean deletable) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataSummaryRsp that = (DataSummaryRsp) obj;
        return Objects.equals(this.path, that.path) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.size, that.size)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.allowedOperate, that.allowedOperate)
            && Objects.equals(this.deletable, that.deletable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, name, type, size, createTime, allowedOperate, deletable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataSummaryRsp {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
