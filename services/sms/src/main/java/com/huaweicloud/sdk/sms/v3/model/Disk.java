package com.huaweicloud.sdk.sms.v3.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.sms.v3.model.PhysicalVolumes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 磁盘信息
 */
public class Disk  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * 磁盘的分区类型，添加源端时源端磁盘必选
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
            if( value == null ){
                return null;
            }
            PartitionStyleEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PartitionStyleEnum(value);
            }
            return result;
        }

        public static PartitionStyleEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            PartitionStyleEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value="partition_style")
    
    private PartitionStyleEnum partitionStyle;
    /**
     * 磁盘类型
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
            if( value == null ){
                return null;
            }
            DeviceUseEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DeviceUseEnum(value);
            }
            return result;
        }

        public static DeviceUseEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DeviceUseEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value="device_use")
    
    private DeviceUseEnum deviceUse;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Long size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="used_size")
    
    private Long usedSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="physical_volumes")
    
    private List<PhysicalVolumes> physicalVolumes = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disk_id")
    
    private String diskId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_disk")
    
    private Boolean osDisk;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="relation_name")
    
    private String relationName;

    public Disk withName(String name) {
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

    

    public Disk withPartitionStyle(PartitionStyleEnum partitionStyle) {
        this.partitionStyle = partitionStyle;
        return this;
    }

    


    /**
     * 磁盘的分区类型，添加源端时源端磁盘必选
     * @return partitionStyle
     */
    public PartitionStyleEnum getPartitionStyle() {
        return partitionStyle;
    }

    public void setPartitionStyle(PartitionStyleEnum partitionStyle) {
        this.partitionStyle = partitionStyle;
    }

    

    public Disk withDeviceUse(DeviceUseEnum deviceUse) {
        this.deviceUse = deviceUse;
        return this;
    }

    


    /**
     * 磁盘类型
     * @return deviceUse
     */
    public DeviceUseEnum getDeviceUse() {
        return deviceUse;
    }

    public void setDeviceUse(DeviceUseEnum deviceUse) {
        this.deviceUse = deviceUse;
    }

    

    public Disk withSize(Long size) {
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

    

    public Disk withUsedSize(Long usedSize) {
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

    

    public Disk withPhysicalVolumes(List<PhysicalVolumes> physicalVolumes) {
        this.physicalVolumes = physicalVolumes;
        return this;
    }

    
    public Disk addPhysicalVolumesItem(PhysicalVolumes physicalVolumesItem) {
        if(this.physicalVolumes == null) {
            this.physicalVolumes = new ArrayList<>();
        }
        this.physicalVolumes.add(physicalVolumesItem);
        return this;
    }

    public Disk withPhysicalVolumes(Consumer<List<PhysicalVolumes>> physicalVolumesSetter) {
        if(this.physicalVolumes == null) {
            this.physicalVolumes = new ArrayList<>();
        }
        physicalVolumesSetter.accept(this.physicalVolumes);
        return this;
    }

    /**
     * 磁盘上的物理分区信息
     * @return physicalVolumes
     */
    public List<PhysicalVolumes> getPhysicalVolumes() {
        return physicalVolumes;
    }

    public void setPhysicalVolumes(List<PhysicalVolumes> physicalVolumes) {
        this.physicalVolumes = physicalVolumes;
    }

    

    public Disk withDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    


    /**
     * 创建任务时，如果选择已有虚拟机，此参数必选
     * @return diskId
     */
    public String getDiskId() {
        return diskId;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    

    public Disk withOsDisk(Boolean osDisk) {
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

    

    public Disk withRelationName(String relationName) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Disk disk = (Disk) o;
        return Objects.equals(this.name, disk.name) &&
            Objects.equals(this.partitionStyle, disk.partitionStyle) &&
            Objects.equals(this.deviceUse, disk.deviceUse) &&
            Objects.equals(this.size, disk.size) &&
            Objects.equals(this.usedSize, disk.usedSize) &&
            Objects.equals(this.physicalVolumes, disk.physicalVolumes) &&
            Objects.equals(this.diskId, disk.diskId) &&
            Objects.equals(this.osDisk, disk.osDisk) &&
            Objects.equals(this.relationName, disk.relationName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, partitionStyle, deviceUse, size, usedSize, physicalVolumes, diskId, osDisk, relationName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Disk {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    partitionStyle: ").append(toIndentedString(partitionStyle)).append("\n");
        sb.append("    deviceUse: ").append(toIndentedString(deviceUse)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    usedSize: ").append(toIndentedString(usedSize)).append("\n");
        sb.append("    physicalVolumes: ").append(toIndentedString(physicalVolumes)).append("\n");
        sb.append("    diskId: ").append(toIndentedString(diskId)).append("\n");
        sb.append("    osDisk: ").append(toIndentedString(osDisk)).append("\n");
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

