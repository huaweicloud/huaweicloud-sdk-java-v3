package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 目录配额信息
 */
public class UpdateFsDirQuotaRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private Integer capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inode")

    private Integer inode;

    public UpdateFsDirQuotaRequestBody withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 合法的已存在的目录的全路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public UpdateFsDirQuotaRequestBody withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * 目录的容量大小，单位：MB; 设置为0会导致数据无法写入目录; capacity和quota至少二选一
     * @return capacity
     */
    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public UpdateFsDirQuotaRequestBody withInode(Integer inode) {
        this.inode = inode;
        return this;
    }

    /**
     * 目录的inode数量限制; 设置为0会导致数据无法写入目录; capacity和quota至少二选一
     * @return inode
     */
    public Integer getInode() {
        return inode;
    }

    public void setInode(Integer inode) {
        this.inode = inode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateFsDirQuotaRequestBody that = (UpdateFsDirQuotaRequestBody) obj;
        return Objects.equals(this.path, that.path) && Objects.equals(this.capacity, that.capacity)
            && Objects.equals(this.inode, that.inode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, capacity, inode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFsDirQuotaRequestBody {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    inode: ").append(toIndentedString(inode)).append("\n");
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
