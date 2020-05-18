package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 *  扩展属性，指定弹性云服务器存储设备的v2接口。是存储资源的新版本接口，指定卷场景不能批创弹性云服务器。  裸金属服务器场景不支持。
 */
public class NovaServerBlockDeviceMapping  {

    /**
     * 卷设备的源头类型，当前只支持volume、image、snapshot、blank类型。  当使用卷创建云服务器时，source_type设置为volume；当使用镜像创建云服务器时，source_type设置为image；当使用快照创建云服务器时，source_type设置为snapshot；当创建空数据卷时，source_type设置为blank。  - 说明： -  - 当卷设备的源头类型为snapshot时，且boot_index为0，则该快照对应的云硬盘必须为系统盘。
     */
    public static class SourceTypeEnum {

        
        /**
         * Enum BLANK for value: "blank"
         */
        public static final SourceTypeEnum BLANK = new SourceTypeEnum("blank");

        
        /**
         * Enum SNAPSHOT for value: "snapshot"
         */
        public static final SourceTypeEnum SNAPSHOT = new SourceTypeEnum("snapshot");

        
        /**
         * Enum VOLUME for value: "volume"
         */
        public static final SourceTypeEnum VOLUME = new SourceTypeEnum("volume");

        
        /**
         * Enum IMAGE for value: "image"
         */
        public static final SourceTypeEnum IMAGE = new SourceTypeEnum("image");

        

        public static Map<String, SourceTypeEnum> staticFields =
                new HashMap<String, SourceTypeEnum>() {
                    { 
                        put("blank", BLANK);
                        put("snapshot", SNAPSHOT);
                        put("volume", VOLUME);
                        put("image", IMAGE);
                    }
                };

        private String value;

        SourceTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SourceTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            SourceTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new SourceTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static SourceTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            SourceTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof SourceTypeEnum) {
                return this.value.equals(((SourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_type")
    
    private SourceTypeEnum sourceType;
    /**
     * 卷设备的目标类型，当前仅支持volume类型。  - volume：卷。 - local：本地文件，当前不支持该类型。
     */
    public static class DestinationTypeEnum {

        
        /**
         * Enum VOLUME for value: "volume"
         */
        public static final DestinationTypeEnum VOLUME = new DestinationTypeEnum("volume");

        

        public static Map<String, DestinationTypeEnum> staticFields =
                new HashMap<String, DestinationTypeEnum>() {
                    { 
                        put("volume", VOLUME);
                    }
                };

        private String value;

        DestinationTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DestinationTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            DestinationTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new DestinationTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static DestinationTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DestinationTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DestinationTypeEnum) {
                return this.value.equals(((DestinationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="destination_type")
    
    private DestinationTypeEnum destinationType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="guest_format")
    
    private String guestFormat;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_name")
    
    private String deviceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delete_on_termination")
    
    private Boolean deleteOnTermination = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="boot_index")
    
    private String bootIndex;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="uuid")
    
    private String uuid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_size")
    
    private Integer volumeSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_type")
    
    private String volumeType;

    public NovaServerBlockDeviceMapping withSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    


    /**
     * 卷设备的源头类型，当前只支持volume、image、snapshot、blank类型。  当使用卷创建云服务器时，source_type设置为volume；当使用镜像创建云服务器时，source_type设置为image；当使用快照创建云服务器时，source_type设置为snapshot；当创建空数据卷时，source_type设置为blank。  - 说明： -  - 当卷设备的源头类型为snapshot时，且boot_index为0，则该快照对应的云硬盘必须为系统盘。
     * @return sourceType
     */
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    public NovaServerBlockDeviceMapping withDestinationType(DestinationTypeEnum destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    


    /**
     * 卷设备的目标类型，当前仅支持volume类型。  - volume：卷。 - local：本地文件，当前不支持该类型。
     * @return destinationType
     */
    public DestinationTypeEnum getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(DestinationTypeEnum destinationType) {
        this.destinationType = destinationType;
    }

    public NovaServerBlockDeviceMapping withGuestFormat(String guestFormat) {
        this.guestFormat = guestFormat;
        return this;
    }

    


    /**
     * local文件系统格式，例如：swap, ext4。  当前不支持该功能。
     * @return guestFormat
     */
    public String getGuestFormat() {
        return guestFormat;
    }

    public void setGuestFormat(String guestFormat) {
        this.guestFormat = guestFormat;
    }

    public NovaServerBlockDeviceMapping withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    


    /**
     * 卷设备名称。  > 说明： >  > 该字段已经废弃。 >  > 用户指定的device_name不会生效，系统会默认生成一个device_name。
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public NovaServerBlockDeviceMapping withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }

    


    /**
     * 删除弹性云服务器时，是否删除卷，默认值false。  true：删除弹性云服务器时，删除卷  false：删除弹性云服务器时，不删除卷
     * @return deleteOnTermination
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
    }

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    public NovaServerBlockDeviceMapping withBootIndex(String bootIndex) {
        this.bootIndex = bootIndex;
        return this;
    }

    


    /**
     * 启动标识，“0”代表启动盘，“-1“代表非启动盘。  > 说明： >  > 当卷设备的源头类型全为volume时，boot_index的值有一个为0。
     * @return bootIndex
     */
    public String getBootIndex() {
        return bootIndex;
    }

    public void setBootIndex(String bootIndex) {
        this.bootIndex = bootIndex;
    }

    public NovaServerBlockDeviceMapping withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    


    /**
     * 当source_type值是volume时，uuid为卷的uuid；  当source_type值是snapshot时，uuid为快照的uuid；  当source_type值是image时，uuid为镜像的uuid；
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public NovaServerBlockDeviceMapping withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    


    /**
     * 卷大小，整数，在source_type是image或blank，destination_type是volume的时候必选。  单位为GB。
     * @return volumeSize
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    public NovaServerBlockDeviceMapping withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    


    /**
     * 卷类型，在source_type是image，destination_type是volume时建议填写。  卷类型取值范围请参考 EVS 服务 磁盘类型介绍。
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaServerBlockDeviceMapping novaServerBlockDeviceMapping = (NovaServerBlockDeviceMapping) o;
        return Objects.equals(this.sourceType, novaServerBlockDeviceMapping.sourceType) &&
            Objects.equals(this.destinationType, novaServerBlockDeviceMapping.destinationType) &&
            Objects.equals(this.guestFormat, novaServerBlockDeviceMapping.guestFormat) &&
            Objects.equals(this.deviceName, novaServerBlockDeviceMapping.deviceName) &&
            Objects.equals(this.deleteOnTermination, novaServerBlockDeviceMapping.deleteOnTermination) &&
            Objects.equals(this.bootIndex, novaServerBlockDeviceMapping.bootIndex) &&
            Objects.equals(this.uuid, novaServerBlockDeviceMapping.uuid) &&
            Objects.equals(this.volumeSize, novaServerBlockDeviceMapping.volumeSize) &&
            Objects.equals(this.volumeType, novaServerBlockDeviceMapping.volumeType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sourceType, destinationType, guestFormat, deviceName, deleteOnTermination, bootIndex, uuid, volumeSize, volumeType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaServerBlockDeviceMapping {\n");
            sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
            sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
            sb.append("    guestFormat: ").append(toIndentedString(guestFormat)).append("\n");
            sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
            sb.append("    deleteOnTermination: ").append(toIndentedString(deleteOnTermination)).append("\n");
            sb.append("    bootIndex: ").append(toIndentedString(bootIndex)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
            sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
            sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
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

