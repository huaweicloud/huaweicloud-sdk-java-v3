package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 使用大小
 */
public class PhysicalVolume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_use")

    private String deviceUse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_system")

    private String fileSystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private Integer index;

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
    @JsonProperty(value = "inode_size")

    private Integer inodeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inode_nums")

    private Long inodeNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size_per_cluster")

    private Integer sizePerCluster;

    public PhysicalVolume withDeviceUse(String deviceUse) {
        this.deviceUse = deviceUse;
        return this;
    }

    /**
     * 分区类型，普通分区，启动分区，系统分区
     * @return deviceUse
     */
    public String getDeviceUse() {
        return deviceUse;
    }

    public void setDeviceUse(String deviceUse) {
        this.deviceUse = deviceUse;
    }

    public PhysicalVolume withFileSystem(String fileSystem) {
        this.fileSystem = fileSystem;
        return this;
    }

    /**
     * 文件系统类型
     * @return fileSystem
     */
    public String getFileSystem() {
        return fileSystem;
    }

    public void setFileSystem(String fileSystem) {
        this.fileSystem = fileSystem;
    }

    public PhysicalVolume withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * 顺序
     * minimum: 0
     * maximum: 2147483647
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public PhysicalVolume withMountPoint(String mountPoint) {
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

    public PhysicalVolume withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称，windows表示盘符，Linux表示设备号
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PhysicalVolume withSize(Long size) {
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

    public PhysicalVolume withUsedSize(Long usedSize) {
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

    public PhysicalVolume withInodeSize(Integer inodeSize) {
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

    public PhysicalVolume withInodeNums(Long inodeNums) {
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

    public PhysicalVolume withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * GUID，可从源端查询
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public PhysicalVolume withSizePerCluster(Integer sizePerCluster) {
        this.sizePerCluster = sizePerCluster;
        return this;
    }

    /**
     * 每个cluster大小
     * minimum: 0
     * maximum: 2147483647
     * @return sizePerCluster
     */
    public Integer getSizePerCluster() {
        return sizePerCluster;
    }

    public void setSizePerCluster(Integer sizePerCluster) {
        this.sizePerCluster = sizePerCluster;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PhysicalVolume that = (PhysicalVolume) obj;
        return Objects.equals(this.deviceUse, that.deviceUse) && Objects.equals(this.fileSystem, that.fileSystem)
            && Objects.equals(this.index, that.index) && Objects.equals(this.mountPoint, that.mountPoint)
            && Objects.equals(this.name, that.name) && Objects.equals(this.size, that.size)
            && Objects.equals(this.usedSize, that.usedSize) && Objects.equals(this.inodeSize, that.inodeSize)
            && Objects.equals(this.inodeNums, that.inodeNums) && Objects.equals(this.uuid, that.uuid)
            && Objects.equals(this.sizePerCluster, that.sizePerCluster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceUse,
            fileSystem,
            index,
            mountPoint,
            name,
            size,
            usedSize,
            inodeSize,
            inodeNums,
            uuid,
            sizePerCluster);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PhysicalVolume {\n");
        sb.append("    deviceUse: ").append(toIndentedString(deviceUse)).append("\n");
        sb.append("    fileSystem: ").append(toIndentedString(fileSystem)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    mountPoint: ").append(toIndentedString(mountPoint)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    usedSize: ").append(toIndentedString(usedSize)).append("\n");
        sb.append("    inodeSize: ").append(toIndentedString(inodeSize)).append("\n");
        sb.append("    inodeNums: ").append(toIndentedString(inodeNums)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    sizePerCluster: ").append(toIndentedString(sizePerCluster)).append("\n");
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
