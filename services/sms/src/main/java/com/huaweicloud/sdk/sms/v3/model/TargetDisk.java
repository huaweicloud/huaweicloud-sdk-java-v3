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
 * 目的端磁盘
 */
public class TargetDisk {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    /**
     * 判断是普通分区，启动分区还是系统分区 BOOT：BOOT设备 OS：系统设备 NORMAL:平常
     */
    public static final class DeviceUseEnum {

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final DeviceUseEnum NORMAL = new DeviceUseEnum("NORMAL");

        /**
         * Enum OS for value: "OS"
         */
        public static final DeviceUseEnum OS = new DeviceUseEnum("OS");

        /**
         * Enum BOOT for value: "BOOT"
         */
        public static final DeviceUseEnum BOOT = new DeviceUseEnum("BOOT");

        private static final Map<String, DeviceUseEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeviceUseEnum> createStaticFields() {
            Map<String, DeviceUseEnum> map = new HashMap<>();
            map.put("NORMAL", NORMAL);
            map.put("OS", OS);
            map.put("BOOT", BOOT);
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
    @JsonProperty(value = "disk_id")

    private String diskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "physical_volumes")

    private List<TargetPhysicalVolumes> physicalVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_size")

    private Long usedSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_index")

    private String diskIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_disk")

    private Boolean osDisk;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_name")

    private String relationName;

    public TargetDisk withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 磁盘标识ID
     * minimum: 0
     * maximum: 9223372036854775807
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TargetDisk withDeviceUse(DeviceUseEnum deviceUse) {
        this.deviceUse = deviceUse;
        return this;
    }

    /**
     * 判断是普通分区，启动分区还是系统分区 BOOT：BOOT设备 OS：系统设备 NORMAL:平常
     * @return deviceUse
     */
    public DeviceUseEnum getDeviceUse() {
        return deviceUse;
    }

    public void setDeviceUse(DeviceUseEnum deviceUse) {
        this.deviceUse = deviceUse;
    }

    public TargetDisk withDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * 磁盘ID
     * @return diskId
     */
    public String getDiskId() {
        return diskId;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    public TargetDisk withName(String name) {
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

    public TargetDisk withPhysicalVolumes(List<TargetPhysicalVolumes> physicalVolumes) {
        this.physicalVolumes = physicalVolumes;
        return this;
    }

    public TargetDisk addPhysicalVolumesItem(TargetPhysicalVolumes physicalVolumesItem) {
        if (this.physicalVolumes == null) {
            this.physicalVolumes = new ArrayList<>();
        }
        this.physicalVolumes.add(physicalVolumesItem);
        return this;
    }

    public TargetDisk withPhysicalVolumes(Consumer<List<TargetPhysicalVolumes>> physicalVolumesSetter) {
        if (this.physicalVolumes == null) {
            this.physicalVolumes = new ArrayList<>();
        }
        physicalVolumesSetter.accept(this.physicalVolumes);
        return this;
    }

    /**
     * 逻辑卷信息
     * @return physicalVolumes
     */
    public List<TargetPhysicalVolumes> getPhysicalVolumes() {
        return physicalVolumes;
    }

    public void setPhysicalVolumes(List<TargetPhysicalVolumes> physicalVolumes) {
        this.physicalVolumes = physicalVolumes;
    }

    public TargetDisk withSize(Long size) {
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

    public TargetDisk withUsedSize(Long usedSize) {
        this.usedSize = usedSize;
        return this;
    }

    /**
     * 已使用大小
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

    public TargetDisk withDiskIndex(String diskIndex) {
        this.diskIndex = diskIndex;
        return this;
    }

    /**
     * 磁盘索引
     * @return diskIndex
     */
    public String getDiskIndex() {
        return diskIndex;
    }

    public void setDiskIndex(String diskIndex) {
        this.diskIndex = diskIndex;
    }

    public TargetDisk withOsDisk(Boolean osDisk) {
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

    public TargetDisk withPartitionStyle(PartitionStyleEnum partitionStyle) {
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

    public TargetDisk withRelationName(String relationName) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TargetDisk that = (TargetDisk) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.deviceUse, that.deviceUse)
            && Objects.equals(this.diskId, that.diskId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.physicalVolumes, that.physicalVolumes) && Objects.equals(this.size, that.size)
            && Objects.equals(this.usedSize, that.usedSize) && Objects.equals(this.diskIndex, that.diskIndex)
            && Objects.equals(this.osDisk, that.osDisk) && Objects.equals(this.partitionStyle, that.partitionStyle)
            && Objects.equals(this.relationName, that.relationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            deviceUse,
            diskId,
            name,
            physicalVolumes,
            size,
            usedSize,
            diskIndex,
            osDisk,
            partitionStyle,
            relationName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetDisk {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    deviceUse: ").append(toIndentedString(deviceUse)).append("\n");
        sb.append("    diskId: ").append(toIndentedString(diskId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    physicalVolumes: ").append(toIndentedString(physicalVolumes)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    usedSize: ").append(toIndentedString(usedSize)).append("\n");
        sb.append("    diskIndex: ").append(toIndentedString(diskIndex)).append("\n");
        sb.append("    osDisk: ").append(toIndentedString(osDisk)).append("\n");
        sb.append("    partitionStyle: ").append(toIndentedString(partitionStyle)).append("\n");
        sb.append("    relationName: ").append(toIndentedString(relationName)).append("\n");
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
