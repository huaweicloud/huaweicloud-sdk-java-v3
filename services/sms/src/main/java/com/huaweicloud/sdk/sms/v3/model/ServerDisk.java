package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 磁盘信息
 */
public class ServerDisk {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_style")

    private String partitionStyle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_use")

    private String deviceUse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_size")

    private Long usedSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "physical_volumes")

    private List<PhysicalVolume> physicalVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_disk")

    private Boolean osDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_name")

    private String relationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inode_size")

    private Integer inodeSize;

    public ServerDisk withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 磁盘名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServerDisk withPartitionStyle(String partitionStyle) {
        this.partitionStyle = partitionStyle;
        return this;
    }

    /**
     * 磁盘的分区类型，添加源端时源端磁盘必选，否则无法通过后续环境检查 （非枚举数据，来源于EVS服务） 常见类型如：MBR：主启动记录分区，GPT：Guid Partition Table，全局分区表。 详细类型请参考EVS服务API文档中“MBR和GPT分区形式有何区别”部分描述
     * @return partitionStyle
     */
    public String getPartitionStyle() {
        return partitionStyle;
    }

    public void setPartitionStyle(String partitionStyle) {
        this.partitionStyle = partitionStyle;
    }

    public ServerDisk withDeviceUse(String deviceUse) {
        this.deviceUse = deviceUse;
        return this;
    }

    /**
     * 磁盘类型。 无强约束，可为空值，常见取值如下 NORMAL：平常 OS：系统设备 BOOT：BOOT设备 VOLUME_GROUP：VolumeGroup组成设备 BTRFS：BTRFS组成设备
     * @return deviceUse
     */
    public String getDeviceUse() {
        return deviceUse;
    }

    public void setDeviceUse(String deviceUse) {
        this.deviceUse = deviceUse;
    }

    public ServerDisk withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 磁盘总大小，以字节为单位
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

    public ServerDisk withUsedSize(Long usedSize) {
        this.usedSize = usedSize;
        return this;
    }

    /**
     * 磁盘已使用大小，以字节为单位
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

    public ServerDisk withPhysicalVolumes(List<PhysicalVolume> physicalVolumes) {
        this.physicalVolumes = physicalVolumes;
        return this;
    }

    public ServerDisk addPhysicalVolumesItem(PhysicalVolume physicalVolumesItem) {
        if (this.physicalVolumes == null) {
            this.physicalVolumes = new ArrayList<>();
        }
        this.physicalVolumes.add(physicalVolumesItem);
        return this;
    }

    public ServerDisk withPhysicalVolumes(Consumer<List<PhysicalVolume>> physicalVolumesSetter) {
        if (this.physicalVolumes == null) {
            this.physicalVolumes = new ArrayList<>();
        }
        physicalVolumesSetter.accept(this.physicalVolumes);
        return this;
    }

    /**
     * 磁盘上的物理分区信息
     * @return physicalVolumes
     */
    public List<PhysicalVolume> getPhysicalVolumes() {
        return physicalVolumes;
    }

    public void setPhysicalVolumes(List<PhysicalVolume> physicalVolumes) {
        this.physicalVolumes = physicalVolumes;
    }

    public ServerDisk withOsDisk(Boolean osDisk) {
        this.osDisk = osDisk;
        return this;
    }

    /**
     * 是否为系统盘
     * @return osDisk
     */
    public Boolean getOsDisk() {
        return osDisk;
    }

    public void setOsDisk(Boolean osDisk) {
        this.osDisk = osDisk;
    }

    public ServerDisk withRelationName(String relationName) {
        this.relationName = relationName;
        return this;
    }

    /**
     * Linux系统 目的端ECS中与源端关联的磁盘名称
     * @return relationName
     */
    public String getRelationName() {
        return relationName;
    }

    public void setRelationName(String relationName) {
        this.relationName = relationName;
    }

    public ServerDisk withInodeSize(Integer inodeSize) {
        this.inodeSize = inodeSize;
        return this;
    }

    /**
     * inode大小
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerDisk that = (ServerDisk) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.partitionStyle, that.partitionStyle)
            && Objects.equals(this.deviceUse, that.deviceUse) && Objects.equals(this.size, that.size)
            && Objects.equals(this.usedSize, that.usedSize)
            && Objects.equals(this.physicalVolumes, that.physicalVolumes) && Objects.equals(this.osDisk, that.osDisk)
            && Objects.equals(this.relationName, that.relationName) && Objects.equals(this.inodeSize, that.inodeSize);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, partitionStyle, deviceUse, size, usedSize, physicalVolumes, osDisk, relationName, inodeSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerDisk {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    partitionStyle: ").append(toIndentedString(partitionStyle)).append("\n");
        sb.append("    deviceUse: ").append(toIndentedString(deviceUse)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    usedSize: ").append(toIndentedString(usedSize)).append("\n");
        sb.append("    physicalVolumes: ").append(toIndentedString(physicalVolumes)).append("\n");
        sb.append("    osDisk: ").append(toIndentedString(osDisk)).append("\n");
        sb.append("    relationName: ").append(toIndentedString(relationName)).append("\n");
        sb.append("    inodeSize: ").append(toIndentedString(inodeSize)).append("\n");
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
