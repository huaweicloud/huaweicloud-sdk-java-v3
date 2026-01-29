package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 逻辑卷信息
 */
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
    @JsonProperty(value = "inode_nums")

    private Long inodeNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_use")

    private String deviceUse;

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

    /**
     * 块数量
     * minimum: 0
     * maximum: 2147483647
     * @return blockCount
     */
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

    /**
     * 块大小
     * minimum: 0
     * maximum: 1048576
     * @return blockSize
     */
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

    /**
     * 文件系统
     * @return fileSystem
     */
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

    /**
     * inode数量
     * minimum: 0
     * maximum: 2147483647
     * @return inodeSize
     */
    public Integer getInodeSize() {
        return inodeSize;
    }

    public void setInodeSize(Integer inodeSize) {
        this.inodeSize = inodeSize;
    }

    public LogicalVolumes withInodeNums(Long inodeNums) {
        this.inodeNums = inodeNums;
        return this;
    }

    /**
     * inode节点数量
     * minimum: 0
     * maximum: 9223372036854775807
     * @return inodeNums
     */
    public Long getInodeNums() {
        return inodeNums;
    }

    public void setInodeNums(Long inodeNums) {
        this.inodeNums = inodeNums;
    }

    public LogicalVolumes withDeviceUse(String deviceUse) {
        this.deviceUse = deviceUse;
        return this;
    }

    /**
     * 分区类型 无强约束，可为空值，常见取值如下 NORMAL：平常 OS：系统设备 BOOT：BOOT设备 VOLUME_GROUP：VolumeGroup组成设备 BTRFS：BTRFS组成设备
     * @return deviceUse
     */
    public String getDeviceUse() {
        return deviceUse;
    }

    public void setDeviceUse(String deviceUse) {
        this.deviceUse = deviceUse;
    }

    public LogicalVolumes withMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
        return this;
    }

    /**
     * 挂载点
     * @return mountPoint
     */
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

    public LogicalVolumes withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 大小
     * minimum: 0
     * maximum: 9223372036854775807
     * @return size
     */
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

    /**
     * 使用大小
     * minimum: 0
     * maximum: 9223372036854775807
     * @return usedSize
     */
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

    /**
     * 剩余空间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return freeSize
     */
    public Long getFreeSize() {
        return freeSize;
    }

    public void setFreeSize(Long freeSize) {
        this.freeSize = freeSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogicalVolumes that = (LogicalVolumes) obj;
        return Objects.equals(this.blockCount, that.blockCount) && Objects.equals(this.blockSize, that.blockSize)
            && Objects.equals(this.fileSystem, that.fileSystem) && Objects.equals(this.inodeSize, that.inodeSize)
            && Objects.equals(this.inodeNums, that.inodeNums) && Objects.equals(this.deviceUse, that.deviceUse)
            && Objects.equals(this.mountPoint, that.mountPoint) && Objects.equals(this.name, that.name)
            && Objects.equals(this.size, that.size) && Objects.equals(this.usedSize, that.usedSize)
            && Objects.equals(this.freeSize, that.freeSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockCount,
            blockSize,
            fileSystem,
            inodeSize,
            inodeNums,
            deviceUse,
            mountPoint,
            name,
            size,
            usedSize,
            freeSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogicalVolumes {\n");
        sb.append("    blockCount: ").append(toIndentedString(blockCount)).append("\n");
        sb.append("    blockSize: ").append(toIndentedString(blockSize)).append("\n");
        sb.append("    fileSystem: ").append(toIndentedString(fileSystem)).append("\n");
        sb.append("    inodeSize: ").append(toIndentedString(inodeSize)).append("\n");
        sb.append("    inodeNums: ").append(toIndentedString(inodeNums)).append("\n");
        sb.append("    deviceUse: ").append(toIndentedString(deviceUse)).append("\n");
        sb.append("    mountPoint: ").append(toIndentedString(mountPoint)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    usedSize: ").append(toIndentedString(usedSize)).append("\n");
        sb.append("    freeSize: ").append(toIndentedString(freeSize)).append("\n");
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
