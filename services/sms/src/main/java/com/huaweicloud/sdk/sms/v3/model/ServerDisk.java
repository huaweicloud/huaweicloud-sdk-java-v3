package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 磁盘信息
 */
public class ServerDisk {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 磁盘的分区类型，添加源端时源端磁盘必选 MBR：mbr格式 GPT：gpt格式
     */
    public static final class PartitionStyleEnum {

        /**
         * Enum MBR for value: "MBR"
         */
        public static final PartitionStyleEnum MBR = new PartitionStyleEnum("MBR");

        /**
         * Enum GPT for value: "GPT"
         */
        public static final PartitionStyleEnum GPT = new PartitionStyleEnum("GPT");

        private static final Map<String, PartitionStyleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PartitionStyleEnum> createStaticFields() {
            Map<String, PartitionStyleEnum> map = new HashMap<>();
            map.put("MBR", MBR);
            map.put("GPT", GPT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PartitionStyleEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PartitionStyleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PartitionStyleEnum(value));
        }

        public static PartitionStyleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PartitionStyleEnum) {
                return this.value.equals(((PartitionStyleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_style")

    private PartitionStyleEnum partitionStyle;

    /**
     * 磁盘类型 BOOT：BOOT设备 OS：系统设备
     */
    public static final class DeviceUseEnum {

        /**
         * Enum BOOT for value: "BOOT"
         */
        public static final DeviceUseEnum BOOT = new DeviceUseEnum("BOOT");

        /**
         * Enum OS for value: "OS"
         */
        public static final DeviceUseEnum OS = new DeviceUseEnum("OS");

        private static final Map<String, DeviceUseEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeviceUseEnum> createStaticFields() {
            Map<String, DeviceUseEnum> map = new HashMap<>();
            map.put("BOOT", BOOT);
            map.put("OS", OS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeviceUseEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DeviceUseEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeviceUseEnum(value));
        }

        public static DeviceUseEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeviceUseEnum) {
                return this.value.equals(((DeviceUseEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_use")

    private DeviceUseEnum deviceUse;

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

    public ServerDisk withPartitionStyle(PartitionStyleEnum partitionStyle) {
        this.partitionStyle = partitionStyle;
        return this;
    }

    /**
     * 磁盘的分区类型，添加源端时源端磁盘必选 MBR：mbr格式 GPT：gpt格式
     * @return partitionStyle
     */
    public PartitionStyleEnum getPartitionStyle() {
        return partitionStyle;
    }

    public void setPartitionStyle(PartitionStyleEnum partitionStyle) {
        this.partitionStyle = partitionStyle;
    }

    public ServerDisk withDeviceUse(DeviceUseEnum deviceUse) {
        this.deviceUse = deviceUse;
        return this;
    }

    /**
     * 磁盘类型 BOOT：BOOT设备 OS：系统设备
     * @return deviceUse
     */
    public DeviceUseEnum getDeviceUse() {
        return deviceUse;
    }

    public void setDeviceUse(DeviceUseEnum deviceUse) {
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
