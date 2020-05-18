package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.PostPaidServerDataVolumeExtendParam;
import com.huaweicloud.sdk.ecs.v2.model.PostPaidServerDataVolumeMetadata;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 云服务器对应数据盘相关配置。
 */
public class PostPaidServerDataVolume  {

    /**
     * 云服务器数据盘对应的磁盘类型，需要与系统所提供的磁盘类型相匹配。  磁盘类型枚举值：  - SATA：普通IO磁盘类型。 - SAS：高IO磁盘类型。 - SSD：超高IO磁盘类型。 - co-p1：高IO (性能优化Ⅰ型) - uh-l1：超高IO (时延优化)磁盘类型。  > 说明： >  > 对于HANA云服务器、HL1型云服务器、HL2型云服务器，需使用co-p1和uh-l1两种磁盘类型。对于其他类型的云服务器，不能使用co-p1和uh-l1两种磁盘类型。
     */
    public static class VolumetypeEnum {

        
        /**
         * Enum SATA for value: "SATA"
         */
        public static final VolumetypeEnum SATA = new VolumetypeEnum("SATA");

        
        /**
         * Enum SAS for value: "SAS"
         */
        public static final VolumetypeEnum SAS = new VolumetypeEnum("SAS");

        
        /**
         * Enum SSD for value: "SSD"
         */
        public static final VolumetypeEnum SSD = new VolumetypeEnum("SSD");

        
        /**
         * Enum GPSSD for value: "GPSSD"
         */
        public static final VolumetypeEnum GPSSD = new VolumetypeEnum("GPSSD");

        
        /**
         * Enum CO_P1 for value: "co-p1"
         */
        public static final VolumetypeEnum CO_P1 = new VolumetypeEnum("co-p1");

        
        /**
         * Enum UH_L1 for value: "uh-l1"
         */
        public static final VolumetypeEnum UH_L1 = new VolumetypeEnum("uh-l1");

        

        public static Map<String, VolumetypeEnum> staticFields =
                new HashMap<String, VolumetypeEnum>() {
                    { 
                        put("SATA", SATA);
                        put("SAS", SAS);
                        put("SSD", SSD);
                        put("GPSSD", GPSSD);
                        put("co-p1", CO_P1);
                        put("uh-l1", UH_L1);
                    }
                };

        private String value;

        VolumetypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VolumetypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            VolumetypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new VolumetypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static VolumetypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            VolumetypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof VolumetypeEnum) {
                return this.value.equals(((VolumetypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumetype")
    
    private VolumetypeEnum volumetype;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="shareable")
    
    private Boolean shareable = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="multiattach")
    
    private Boolean multiattach = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hw:passthrough")
    
    private Boolean hwPassthrough = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extendparam")
    
    private PostPaidServerDataVolumeExtendParam extendparam = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private PostPaidServerDataVolumeMetadata metadata = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_image_id")
    
    private String dataImageId;

    public PostPaidServerDataVolume withVolumetype(VolumetypeEnum volumetype) {
        this.volumetype = volumetype;
        return this;
    }

    


    /**
     * 云服务器数据盘对应的磁盘类型，需要与系统所提供的磁盘类型相匹配。  磁盘类型枚举值：  - SATA：普通IO磁盘类型。 - SAS：高IO磁盘类型。 - SSD：超高IO磁盘类型。 - co-p1：高IO (性能优化Ⅰ型) - uh-l1：超高IO (时延优化)磁盘类型。  > 说明： >  > 对于HANA云服务器、HL1型云服务器、HL2型云服务器，需使用co-p1和uh-l1两种磁盘类型。对于其他类型的云服务器，不能使用co-p1和uh-l1两种磁盘类型。
     * @return volumetype
     */
    public VolumetypeEnum getVolumetype() {
        return volumetype;
    }

    public void setVolumetype(VolumetypeEnum volumetype) {
        this.volumetype = volumetype;
    }

    public PostPaidServerDataVolume withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 数据盘大小，容量单位为GB，输入大小范围为[10,32768]。
     * minimum: 10
     * maximum: 32768
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public PostPaidServerDataVolume withShareable(Boolean shareable) {
        this.shareable = shareable;
        return this;
    }

    


    /**
     * 是否为共享磁盘。true为共享盘，false为普通云硬盘。  > 说明： >  > 该字段已废弃，请使用multiattach。
     * @return shareable
     */
    public Boolean getShareable() {
        return shareable;
    }

    public void setShareable(Boolean shareable) {
        this.shareable = shareable;
    }

    public PostPaidServerDataVolume withMultiattach(Boolean multiattach) {
        this.multiattach = multiattach;
        return this;
    }

    


    /**
     * 创建共享磁盘的信息。  - true：创建的磁盘为共享盘。 - false：创建的磁盘为普通云硬盘。  > 说明： >  > shareable当前为废弃字段，如果确实需要同时使用shareable字段和multiattach字段，此时，请确保两个字段的参数值相同。当不指定该字段时，系统默认创建普通云硬盘。
     * @return multiattach
     */
    public Boolean getMultiattach() {
        return multiattach;
    }

    public void setMultiattach(Boolean multiattach) {
        this.multiattach = multiattach;
    }

    public PostPaidServerDataVolume withHwPassthrough(Boolean hwPassthrough) {
        this.hwPassthrough = hwPassthrough;
        return this;
    }

    


    /**
     * 数据卷是否使用SCSI锁。  - true表示云硬盘的设备类型为SCSI类型，即允许ECS操作系统直接访问底层存储介质。支持SCSI锁命令。 - false表示云硬盘的设备类型为VBD (虚拟块存储设备 , Virtual Block Device)类型，即为默认类型，VBD只能支持简单的SCSI读写命令。 - 该字段不存在时，云硬盘默认为VBD类型。  > 说明： >  > 此参数为boolean类型，若传入非boolean类型字符，程序将按照【false】方式处理。
     * @return hwPassthrough
     */
    public Boolean getHwPassthrough() {
        return hwPassthrough;
    }

    public void setHwPassthrough(Boolean hwPassthrough) {
        this.hwPassthrough = hwPassthrough;
    }

    public PostPaidServerDataVolume withExtendparam(PostPaidServerDataVolumeExtendParam extendparam) {
        this.extendparam = extendparam;
        return this;
    }

    public PostPaidServerDataVolume withExtendparam(Consumer<PostPaidServerDataVolumeExtendParam> extendparamSetter) {
        if(this.extendparam == null ){
            this.extendparam = new PostPaidServerDataVolumeExtendParam();
        }
        extendparamSetter.accept(this.extendparam);
        return this;
    }


    /**
     * Get extendparam
     * @return extendparam
     */
    public PostPaidServerDataVolumeExtendParam getExtendparam() {
        return extendparam;
    }

    public void setExtendparam(PostPaidServerDataVolumeExtendParam extendparam) {
        this.extendparam = extendparam;
    }

    public PostPaidServerDataVolume withMetadata(PostPaidServerDataVolumeMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public PostPaidServerDataVolume withMetadata(Consumer<PostPaidServerDataVolumeMetadata> metadataSetter) {
        if(this.metadata == null ){
            this.metadata = new PostPaidServerDataVolumeMetadata();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }


    /**
     * Get metadata
     * @return metadata
     */
    public PostPaidServerDataVolumeMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(PostPaidServerDataVolumeMetadata metadata) {
        this.metadata = metadata;
    }

    public PostPaidServerDataVolume withDataImageId(String dataImageId) {
        this.dataImageId = dataImageId;
        return this;
    }

    


    /**
     * 数据镜像的ID，UUID格式。  如果使用数据盘镜像创建数据盘，则data_image_id为必选参数，且不支持使用metadata。
     * @return dataImageId
     */
    public String getDataImageId() {
        return dataImageId;
    }

    public void setDataImageId(String dataImageId) {
        this.dataImageId = dataImageId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostPaidServerDataVolume postPaidServerDataVolume = (PostPaidServerDataVolume) o;
        return Objects.equals(this.volumetype, postPaidServerDataVolume.volumetype) &&
            Objects.equals(this.size, postPaidServerDataVolume.size) &&
            Objects.equals(this.shareable, postPaidServerDataVolume.shareable) &&
            Objects.equals(this.multiattach, postPaidServerDataVolume.multiattach) &&
            Objects.equals(this.hwPassthrough, postPaidServerDataVolume.hwPassthrough) &&
            Objects.equals(this.extendparam, postPaidServerDataVolume.extendparam) &&
            Objects.equals(this.metadata, postPaidServerDataVolume.metadata) &&
            Objects.equals(this.dataImageId, postPaidServerDataVolume.dataImageId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(volumetype, size, shareable, multiattach, hwPassthrough, extendparam, metadata, dataImageId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostPaidServerDataVolume {\n");
            sb.append("    volumetype: ").append(toIndentedString(volumetype)).append("\n");
            sb.append("    size: ").append(toIndentedString(size)).append("\n");
            sb.append("    shareable: ").append(toIndentedString(shareable)).append("\n");
            sb.append("    multiattach: ").append(toIndentedString(multiattach)).append("\n");
            sb.append("    hwPassthrough: ").append(toIndentedString(hwPassthrough)).append("\n");
            sb.append("    extendparam: ").append(toIndentedString(extendparam)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    dataImageId: ").append(toIndentedString(dataImageId)).append("\n");
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

