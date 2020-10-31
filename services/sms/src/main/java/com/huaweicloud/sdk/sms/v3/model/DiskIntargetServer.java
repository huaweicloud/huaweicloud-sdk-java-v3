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
 * 目的端服务器关联磁盘
 */
public class DiskIntargetServer  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private String size;
    /**
     * 磁盘的作用： BOOT：启动盘,OS：系统盘,NORMAL：普通数据盘
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
        
        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final DeviceUseEnum NORMAL = new DeviceUseEnum("NORMAL");
        

        private static final Map<String, DeviceUseEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeviceUseEnum> createStaticFields() {
            Map<String, DeviceUseEnum> map = new HashMap<>();
            map.put("BOOT", BOOT);
            map.put("OS", OS);
            map.put("NORMAL", NORMAL);
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
    
    private DeviceUseEnum deviceUse;

    public DiskIntargetServer withName(String name) {
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

    public DiskIntargetServer withSize(String size) {
        this.size = size;
        return this;
    }

    


    /**
     * 磁盘大小，单位：字节
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public DiskIntargetServer withDeviceUse(DeviceUseEnum deviceUse) {
        this.deviceUse = deviceUse;
        return this;
    }

    


    /**
     * 磁盘的作用： BOOT：启动盘,OS：系统盘,NORMAL：普通数据盘
     * @return deviceUse
     */
    public DeviceUseEnum getDeviceUse() {
        return deviceUse;
    }

    public void setDeviceUse(DeviceUseEnum deviceUse) {
        this.deviceUse = deviceUse;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiskIntargetServer diskIntargetServer = (DiskIntargetServer) o;
        return Objects.equals(this.name, diskIntargetServer.name) &&
            Objects.equals(this.size, diskIntargetServer.size) &&
            Objects.equals(this.deviceUse, diskIntargetServer.deviceUse);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, size, deviceUse);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiskIntargetServer {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    deviceUse: ").append(toIndentedString(deviceUse)).append("\n");
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

