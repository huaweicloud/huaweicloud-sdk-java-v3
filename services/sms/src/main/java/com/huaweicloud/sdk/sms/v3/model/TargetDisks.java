package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 目的端磁盘信息
 */
public class TargetDisks {

    /**
     * 磁盘类型，普通磁盘，OS所在磁盘，BOOT所在磁盘
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
            DeviceUseEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DeviceUseEnum(value);
            }
            return result;
        }

        public static DeviceUseEnum valueOf(String value) {
            if (value == null) {
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
    @JsonProperty(value = "device_use")

    @JacksonXmlProperty(localName = "device_use")

    private DeviceUseEnum deviceUse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_id")

    @JacksonXmlProperty(localName = "disk_id")

    private String diskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "physical_volumes")

    @JacksonXmlProperty(localName = "physical_volumes")

    private List<PhysicalVolumes> physicalVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_size")

    @JacksonXmlProperty(localName = "used_size")

    private Long usedSize;

    public TargetDisks withDeviceUse(DeviceUseEnum deviceUse) {
        this.deviceUse = deviceUse;
        return this;
    }

    /**
     * 磁盘类型，普通磁盘，OS所在磁盘，BOOT所在磁盘
     * @return deviceUse
     */
    public DeviceUseEnum getDeviceUse() {
        return deviceUse;
    }

    public void setDeviceUse(DeviceUseEnum deviceUse) {
        this.deviceUse = deviceUse;
    }

    public TargetDisks withDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * 磁盘id,自动创建虚拟机不用设置
     * @return diskId
     */
    public String getDiskId() {
        return diskId;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    public TargetDisks withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称，根据磁盘顺序设置为disk X
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TargetDisks withPhysicalVolumes(List<PhysicalVolumes> physicalVolumes) {
        this.physicalVolumes = physicalVolumes;
        return this;
    }

    public TargetDisks addPhysicalVolumesItem(PhysicalVolumes physicalVolumesItem) {
        if (this.physicalVolumes == null) {
            this.physicalVolumes = new ArrayList<>();
        }
        this.physicalVolumes.add(physicalVolumesItem);
        return this;
    }

    public TargetDisks withPhysicalVolumes(Consumer<List<PhysicalVolumes>> physicalVolumesSetter) {
        if (this.physicalVolumes == null) {
            this.physicalVolumes = new ArrayList<>();
        }
        physicalVolumesSetter.accept(this.physicalVolumes);
        return this;
    }

    /**
     * 物理卷信息
     * @return physicalVolumes
     */
    public List<PhysicalVolumes> getPhysicalVolumes() {
        return physicalVolumes;
    }

    public void setPhysicalVolumes(List<PhysicalVolumes> physicalVolumes) {
        this.physicalVolumes = physicalVolumes;
    }

    public TargetDisks withSize(Long size) {
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

    public TargetDisks withUsedSize(Long usedSize) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TargetDisks targetDisks = (TargetDisks) o;
        return Objects.equals(this.deviceUse, targetDisks.deviceUse) && Objects.equals(this.diskId, targetDisks.diskId)
            && Objects.equals(this.name, targetDisks.name)
            && Objects.equals(this.physicalVolumes, targetDisks.physicalVolumes)
            && Objects.equals(this.size, targetDisks.size) && Objects.equals(this.usedSize, targetDisks.usedSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceUse, diskId, name, physicalVolumes, size, usedSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetDisks {\n");
        sb.append("    deviceUse: ").append(toIndentedString(deviceUse)).append("\n");
        sb.append("    diskId: ").append(toIndentedString(diskId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    physicalVolumes: ").append(toIndentedString(physicalVolumes)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    usedSize: ").append(toIndentedString(usedSize)).append("\n");
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
