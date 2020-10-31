package com.huaweicloud.sdk.sms.v3.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 物理分区
 */
public class TargetPhysicalVolumes  {

    /**
     * 分区类型
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
            return String.valueOf(value);
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
            if (obj != null && obj instanceof DeviceUseEnum) {
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
    
    private DeviceUseEnum deviceUse = DeviceUseEnum.NORMAL;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_system")
    
    private String fileSystem;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="index")
    
    private Integer index;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mount_point")
    
    private String mountPoint;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="used_size")
    
    private Integer usedSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="uuid")
    
    private String uuid;

    public TargetPhysicalVolumes withDeviceUse(DeviceUseEnum deviceUse) {
        this.deviceUse = deviceUse;
        return this;
    }

    


    /**
     * 分区类型
     * @return deviceUse
     */
    public DeviceUseEnum getDeviceUse() {
        return deviceUse;
    }

    public void setDeviceUse(DeviceUseEnum deviceUse) {
        this.deviceUse = deviceUse;
    }

    public TargetPhysicalVolumes withFileSystem(String fileSystem) {
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

    public TargetPhysicalVolumes withIndex(Integer index) {
        this.index = index;
        return this;
    }

    


    /**
     * 编号
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public TargetPhysicalVolumes withMountPoint(String mountPoint) {
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

    public TargetPhysicalVolumes withName(String name) {
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

    public TargetPhysicalVolumes withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 大小
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public TargetPhysicalVolumes withUsedSize(Integer usedSize) {
        this.usedSize = usedSize;
        return this;
    }

    


    /**
     * 使用大小
     * @return usedSize
     */
    public Integer getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(Integer usedSize) {
        this.usedSize = usedSize;
    }

    public TargetPhysicalVolumes withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    


    /**
     * uuid
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TargetPhysicalVolumes targetPhysicalVolumes = (TargetPhysicalVolumes) o;
        return Objects.equals(this.deviceUse, targetPhysicalVolumes.deviceUse) &&
            Objects.equals(this.fileSystem, targetPhysicalVolumes.fileSystem) &&
            Objects.equals(this.index, targetPhysicalVolumes.index) &&
            Objects.equals(this.mountPoint, targetPhysicalVolumes.mountPoint) &&
            Objects.equals(this.name, targetPhysicalVolumes.name) &&
            Objects.equals(this.size, targetPhysicalVolumes.size) &&
            Objects.equals(this.usedSize, targetPhysicalVolumes.usedSize) &&
            Objects.equals(this.uuid, targetPhysicalVolumes.uuid);
    }
    @Override
    public int hashCode() {
        return Objects.hash(deviceUse, fileSystem, index, mountPoint, name, size, usedSize, uuid);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetPhysicalVolumes {\n");
        sb.append("    deviceUse: ").append(toIndentedString(deviceUse)).append("\n");
        sb.append("    fileSystem: ").append(toIndentedString(fileSystem)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    mountPoint: ").append(toIndentedString(mountPoint)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    usedSize: ").append(toIndentedString(usedSize)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

