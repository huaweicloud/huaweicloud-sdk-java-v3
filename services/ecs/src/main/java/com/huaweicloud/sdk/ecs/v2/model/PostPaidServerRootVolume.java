package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.PostPaidServerRootVolumeExtendParam;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class PostPaidServerRootVolume  {

    /**
     * 云服务器系统盘对应的磁盘类型，需要与系统所提供的磁盘类型相匹配。  - SATA：普通IO磁盘类型。 - SAS：高IO磁盘类型。 - SSD：超高IO磁盘类型。 - co-p1：高IO (性能优化Ⅰ型) - uh-l1：超高IO (时延优化)  > 说明： >  > 对于HANA云服务器、HL1型云服务器、HL2型云服务器，需使用co-p1和uh-l1两种磁盘类型。对于其他类型的云服务器，不能使用co-p1和uh-l1两种磁盘类型。
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
    @JsonProperty(value="hw:passthrough")
    
    private Boolean hwPassthrough = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extendparam")
    
    private PostPaidServerRootVolumeExtendParam extendparam = null;

    public PostPaidServerRootVolume withVolumetype(VolumetypeEnum volumetype) {
        this.volumetype = volumetype;
        return this;
    }

    


    /**
     * 云服务器系统盘对应的磁盘类型，需要与系统所提供的磁盘类型相匹配。  - SATA：普通IO磁盘类型。 - SAS：高IO磁盘类型。 - SSD：超高IO磁盘类型。 - co-p1：高IO (性能优化Ⅰ型) - uh-l1：超高IO (时延优化)  > 说明： >  > 对于HANA云服务器、HL1型云服务器、HL2型云服务器，需使用co-p1和uh-l1两种磁盘类型。对于其他类型的云服务器，不能使用co-p1和uh-l1两种磁盘类型。
     * @return volumetype
     */
    public VolumetypeEnum getVolumetype() {
        return volumetype;
    }

    public void setVolumetype(VolumetypeEnum volumetype) {
        this.volumetype = volumetype;
    }

    public PostPaidServerRootVolume withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 系统盘大小，容量单位为GB， 输入大小范围为[1,1024]。  约束：  - 系统盘大小取值应不小于镜像支持的系统盘的最小值(镜像的min_disk属性)。 - 若该参数没有指定或者指定为0时，系统盘大小默认取值为镜像中系统盘的最小值(镜像的min_disk属性)。  > 说明： >  > 镜像系统盘的最小值(镜像的min_disk属性)可在控制台中点击镜像详情查看。或通过调用“查询镜像详情（OpenStack原生）”API获取，详细操作请参考《镜像服务API参考》中“查询镜像详情（OpenStack原生）”章节。
     * minimum: 1
     * maximum: 1024
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public PostPaidServerRootVolume withHwPassthrough(Boolean hwPassthrough) {
        this.hwPassthrough = hwPassthrough;
        return this;
    }

    


    /**
     * 使用SDI规格创建虚拟机时请关注该参数，如果该参数值为true，说明创建的为scsi类型的卷  > 说明： >  > 此参数为boolean类型，若传入非boolean类型字符，程序将按照false方式处理。
     * @return hwPassthrough
     */
    public Boolean getHwPassthrough() {
        return hwPassthrough;
    }

    public void setHwPassthrough(Boolean hwPassthrough) {
        this.hwPassthrough = hwPassthrough;
    }

    public PostPaidServerRootVolume withExtendparam(PostPaidServerRootVolumeExtendParam extendparam) {
        this.extendparam = extendparam;
        return this;
    }

    public PostPaidServerRootVolume withExtendparam(Consumer<PostPaidServerRootVolumeExtendParam> extendparamSetter) {
        if(this.extendparam == null ){
            this.extendparam = new PostPaidServerRootVolumeExtendParam();
        }
        extendparamSetter.accept(this.extendparam);
        return this;
    }


    /**
     * Get extendparam
     * @return extendparam
     */
    public PostPaidServerRootVolumeExtendParam getExtendparam() {
        return extendparam;
    }

    public void setExtendparam(PostPaidServerRootVolumeExtendParam extendparam) {
        this.extendparam = extendparam;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostPaidServerRootVolume postPaidServerRootVolume = (PostPaidServerRootVolume) o;
        return Objects.equals(this.volumetype, postPaidServerRootVolume.volumetype) &&
            Objects.equals(this.size, postPaidServerRootVolume.size) &&
            Objects.equals(this.hwPassthrough, postPaidServerRootVolume.hwPassthrough) &&
            Objects.equals(this.extendparam, postPaidServerRootVolume.extendparam);
    }
    @Override
    public int hashCode() {
        return Objects.hash(volumetype, size, hwPassthrough, extendparam);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostPaidServerRootVolume {\n");
            sb.append("    volumetype: ").append(toIndentedString(volumetype)).append("\n");
            sb.append("    size: ").append(toIndentedString(size)).append("\n");
            sb.append("    hwPassthrough: ").append(toIndentedString(hwPassthrough)).append("\n");
            sb.append("    extendparam: ").append(toIndentedString(extendparam)).append("\n");
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

