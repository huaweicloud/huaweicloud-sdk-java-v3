package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 逻辑卷信息 */
public class LogicalVolumes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_count")

    private Integer blockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_size")

    private Long blockSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_system")

    private String fileSystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inode_size")

    private Integer inodeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_point")

    private String mountPoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_size")

    private Long usedSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_size")

    private Long freeSize;

    public LogicalVolumes withBlockCount(Integer blockCount) {
        this.blockCount = blockCount;
        return this;
    }

    /** 块数量 minimum: 0 maximum: 4294967296
     * 
     * @return blockCount */
    public Integer getBlockCount() {
        return blockCount;
    }

    public void setBlockCount(Integer blockCount) {
        this.blockCount = blockCount;
    }

    public LogicalVolumes withBlockSize(Long blockSize) {
        this.blockSize = blockSize;
        return this;
    }

    /** 块大小 minimum: 0 maximum: 1048576
     * 
     * @return blockSize */
    public Long getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(Long blockSize) {
        this.blockSize = blockSize;
    }

    public LogicalVolumes withFileSystem(String fileSystem) {
        this.fileSystem = fileSystem;
        return this;
    }

    /** 文件系统
     * 
     * @return fileSystem */
    public String getFileSystem() {
        return fileSystem;
    }

    public void setFileSystem(String fileSystem) {
        this.fileSystem = fileSystem;
    }

    public LogicalVolumes withInodeSize(Integer inodeSize) {
        this.inodeSize = inodeSize;
        return this;
    }

    /** inode数量 minimum: 0 maximum: 4294967296
     * 
     * @return inodeSize */
    public Integer getInodeSize() {
        return inodeSize;
    }

    public void setInodeSize(Integer inodeSize) {
        this.inodeSize = inodeSize;
    }

    public LogicalVolumes withMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
        return this;
    }

    /** 挂载点
     * 
     * @return mountPoint */
    public String getMountPoint() {
        return mountPoint;
    }

    public void setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
    }

    public LogicalVolumes withName(String name) {
        this.name = name;
        return this;
    }

    /** 名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LogicalVolumes withSize(Long size) {
        this.size = size;
        return this;
    }

    /** 大小 minimum: 0 maximum: 9223372036854775807
     * 
     * @return size */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public LogicalVolumes withUsedSize(Long usedSize) {
        this.usedSize = usedSize;
        return this;
    }

    /** 使用大小 minimum: 0 maximum: 9223372036854775807
     * 
     * @return usedSize */
    public Long getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(Long usedSize) {
        this.usedSize = usedSize;
    }

    public LogicalVolumes withFreeSize(Long freeSize) {
        this.freeSize = freeSize;
        return this;
    }

    /** 剩余空间 minimum: 0 maximum: 9223372036854775807
     * 
     * @return freeSize */
    public Long getFreeSize() {
        return freeSize;
    }

    public void setFreeSize(Long freeSize) {
        this.freeSize = freeSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LogicalVolumes logicalVolumes = (LogicalVolumes) o;
        return Objects.equals(this.blockCount, logicalVolumes.blockCount)
            && Objects.equals(this.blockSize, logicalVolumes.blockSize)
            && Objects.equals(this.fileSystem, logicalVolumes.fileSystem)
            && Objects.equals(this.inodeSize, logicalVolumes.inodeSize)
            && Objects.equals(this.mountPoint, logicalVolumes.mountPoint)
            && Objects.equals(this.name, logicalVolumes.name) && Objects.equals(this.size, logicalVolumes.size)
            && Objects.equals(this.usedSize, logicalVolumes.usedSize)
            && Objects.equals(this.freeSize, logicalVolumes.freeSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockCount, blockSize, fileSystem, inodeSize, mountPoint, name, size, usedSize, freeSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogicalVolumes {\n");
        sb.append("    blockCount: ").append(toIndentedString(blockCount)).append("\n");
        sb.append("    blockSize: ").append(toIndentedString(blockSize)).append("\n");
        sb.append("    fileSystem: ").append(toIndentedString(fileSystem)).append("\n");
        sb.append("    inodeSize: ").append(toIndentedString(inodeSize)).append("\n");
        sb.append("    mountPoint: ").append(toIndentedString(mountPoint)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    usedSize: ").append(toIndentedString(usedSize)).append("\n");
        sb.append("    freeSize: ").append(toIndentedString(freeSize)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
