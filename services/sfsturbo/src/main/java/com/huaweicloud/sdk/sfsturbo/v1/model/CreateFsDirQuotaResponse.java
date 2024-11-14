package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateFsDirQuotaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private Integer capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inode")

    private Integer inode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_capacity")

    private Integer usedCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_inode")

    private Integer usedInode;

    public CreateFsDirQuotaResponse withPath(String path) {
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

    public CreateFsDirQuotaResponse withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * 目录的容量大小，单位：MB
     * @return capacity
     */
    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public CreateFsDirQuotaResponse withInode(Integer inode) {
        this.inode = inode;
        return this;
    }

    /**
     * 目录的inode数量限制
     * @return inode
     */
    public Integer getInode() {
        return inode;
    }

    public void setInode(Integer inode) {
        this.inode = inode;
    }

    public CreateFsDirQuotaResponse withUsedCapacity(Integer usedCapacity) {
        this.usedCapacity = usedCapacity;
        return this;
    }

    /**
     * 目录已使用的容量大小，单位：MB。仅SFSTurbo 20MB/s/TiB、40MB/s/TiB、125MB/s/TiB、250MB/s/TiB、500MB/s/TiB、1000MB/s/TiB返回该字段
     * @return usedCapacity
     */
    public Integer getUsedCapacity() {
        return usedCapacity;
    }

    public void setUsedCapacity(Integer usedCapacity) {
        this.usedCapacity = usedCapacity;
    }

    public CreateFsDirQuotaResponse withUsedInode(Integer usedInode) {
        this.usedInode = usedInode;
        return this;
    }

    /**
     * 目录的已使用的inode数量。仅SFSTurbo 20MB/s/TiB、40MB/s/TiB、125MB/s/TiB、250MB/s/TiB、500MB/s/TiB、1000MB/s/TiB返回该字段
     * @return usedInode
     */
    public Integer getUsedInode() {
        return usedInode;
    }

    public void setUsedInode(Integer usedInode) {
        this.usedInode = usedInode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFsDirQuotaResponse that = (CreateFsDirQuotaResponse) obj;
        return Objects.equals(this.path, that.path) && Objects.equals(this.capacity, that.capacity)
            && Objects.equals(this.inode, that.inode) && Objects.equals(this.usedCapacity, that.usedCapacity)
            && Objects.equals(this.usedInode, that.usedInode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, capacity, inode, usedCapacity, usedInode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFsDirQuotaResponse {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    inode: ").append(toIndentedString(inode)).append("\n");
        sb.append("    usedCapacity: ").append(toIndentedString(usedCapacity)).append("\n");
        sb.append("    usedInode: ").append(toIndentedString(usedInode)).append("\n");
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
