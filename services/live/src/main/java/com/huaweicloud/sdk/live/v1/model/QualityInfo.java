package com.huaweicloud.sdk.live.v1.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

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
 * QualityInfo
 */
public class QualityInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="templateName")
    
    private String templateName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quality")
    
    private String quality;
    /**
     * 是否使用窄带高清转码，模板组里不同模板的PVC选项必须相同。 - on：启用。 - off：不启用。 默认为off 
     */
    public static final class PvcEnum {

        
        /**
         * Enum ON for value: "on"
         */
        public static final PvcEnum ON = new PvcEnum("on");
        
        /**
         * Enum OFF for value: "off"
         */
        public static final PvcEnum OFF = new PvcEnum("off");
        

        private static final Map<String, PvcEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PvcEnum> createStaticFields() {
            Map<String, PvcEnum> map = new HashMap<>();
            map.put("on", ON);
            map.put("off", OFF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PvcEnum(String value) {
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
        public static PvcEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            PvcEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PvcEnum(value);
            }
            return result;
        }

        public static PvcEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            PvcEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof PvcEnum) {
                return this.value.equals(((PvcEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="PVC")
    
    private PvcEnum pvc = PvcEnum.ON;
    /**
     * 是否启用高清低码，较PVC相比画质增强。 - on：启用。 - off：不启用。 默认为off。 
     */
    public static final class HdlbEnum {

        
        /**
         * Enum ON for value: "on"
         */
        public static final HdlbEnum ON = new HdlbEnum("on");
        
        /**
         * Enum OFF for value: "off"
         */
        public static final HdlbEnum OFF = new HdlbEnum("off");
        

        private static final Map<String, HdlbEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HdlbEnum> createStaticFields() {
            Map<String, HdlbEnum> map = new HashMap<>();
            map.put("on", ON);
            map.put("off", OFF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HdlbEnum(String value) {
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
        public static HdlbEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            HdlbEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new HdlbEnum(value);
            }
            return result;
        }

        public static HdlbEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            HdlbEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof HdlbEnum) {
                return this.value.equals(((HdlbEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hdlb")
    
    private HdlbEnum hdlb = HdlbEnum.OFF;
    /**
     * 视频编码格式，模板组里不同模板的编码格式必须相同。 - H264：使用H.264。 - H265：使用H.265。 默认为H264。 
     */
    public static final class CodecEnum {

        
        /**
         * Enum H264 for value: "H264"
         */
        public static final CodecEnum H264 = new CodecEnum("H264");
        
        /**
         * Enum H265 for value: "H265"
         */
        public static final CodecEnum H265 = new CodecEnum("H265");
        

        private static final Map<String, CodecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CodecEnum> createStaticFields() {
            Map<String, CodecEnum> map = new HashMap<>();
            map.put("H264", H264);
            map.put("H265", H265);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CodecEnum(String value) {
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
        public static CodecEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            CodecEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CodecEnum(value);
            }
            return result;
        }

        public static CodecEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            CodecEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof CodecEnum) {
                return this.value.equals(((CodecEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="codec")
    
    private CodecEnum codec = CodecEnum.H264;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="width")
    
    private Integer width;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="height")
    
    private Integer height;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bitrate")
    
    private Integer bitrate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="video_frame_rate")
    
    private Integer videoFrameRate = 0;
    /**
     * 转码输出支持的协议类型。当前只支持RTMP和HLS，且模板组里不同模板的输出协议类型必须相同。 - RTMP - HLS - DASH  默认为RTMP。 
     */
    public static final class ProtocolEnum {

        
        /**
         * Enum RTMP for value: "RTMP"
         */
        public static final ProtocolEnum RTMP = new ProtocolEnum("RTMP");
        
        /**
         * Enum HLS for value: "HLS"
         */
        public static final ProtocolEnum HLS = new ProtocolEnum("HLS");
        
        /**
         * Enum DASH for value: "DASH"
         */
        public static final ProtocolEnum DASH = new ProtocolEnum("DASH");
        

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("RTMP", RTMP);
            map.put("HLS", HLS);
            map.put("DASH", DASH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
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
        public static ProtocolEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtocolEnum(value);
            }
            return result;
        }

        public static ProtocolEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private ProtocolEnum protocol = ProtocolEnum.RTMP;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="iFrameInterval")
    
    private Integer iFrameInterval = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gop")
    
    private Integer gop = 0;

    public QualityInfo withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    


    /**
     * 模板名称。
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public QualityInfo withQuality(String quality) {
        this.quality = quality;
        return this;
    }

    


    /**
     * 包含如下取值： - FHD： 超高清，系统缺省名称 - HD： 高清，系统缺省名称 - SD： 标清，系统缺省名称 - LD： 流畅，系统缺省名称 - XXX： 租户自定义名称。用户自定义名称不能与系统缺省名称冲突；多个自定义名称不能重复 
     * @return quality
     */
    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public QualityInfo withPvc(PvcEnum pvc) {
        this.pvc = pvc;
        return this;
    }

    


    /**
     * 是否使用窄带高清转码，模板组里不同模板的PVC选项必须相同。 - on：启用。 - off：不启用。 默认为off 
     * @return pvc
     */
    public PvcEnum getPvc() {
        return pvc;
    }

    public void setPvc(PvcEnum pvc) {
        this.pvc = pvc;
    }

    public QualityInfo withHdlb(HdlbEnum hdlb) {
        this.hdlb = hdlb;
        return this;
    }

    


    /**
     * 是否启用高清低码，较PVC相比画质增强。 - on：启用。 - off：不启用。 默认为off。 
     * @return hdlb
     */
    public HdlbEnum getHdlb() {
        return hdlb;
    }

    public void setHdlb(HdlbEnum hdlb) {
        this.hdlb = hdlb;
    }

    public QualityInfo withCodec(CodecEnum codec) {
        this.codec = codec;
        return this;
    }

    


    /**
     * 视频编码格式，模板组里不同模板的编码格式必须相同。 - H264：使用H.264。 - H265：使用H.265。 默认为H264。 
     * @return codec
     */
    public CodecEnum getCodec() {
        return codec;
    }

    public void setCodec(CodecEnum codec) {
        this.codec = codec;
    }

    public QualityInfo withWidth(Integer width) {
        this.width = width;
        return this;
    }

    


    /**
     * 视频宽度（单位：像素） - H264   取值范围：32-3840，必须为2的倍数 。 - H265   取值范围：320-3840 ，必须为4的倍数。 
     * minimum: 32
     * maximum: 3840
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public QualityInfo withHeight(Integer height) {
        this.height = height;
        return this;
    }

    


    /**
     * 视频高度（单位：像素） - H264   取值范围：32-2160，必须为2的倍数。 - H265   取值范围：240-2160，必须为4的倍数。 
     * minimum: 32
     * maximum: 3840
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public QualityInfo withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    


    /**
     * 转码视频的码率（单位：Kbps）。 取值范围：40-30000。 
     * minimum: 40
     * maximum: 30000
     * @return bitrate
     */
    public Integer getBitrate() {
        return bitrate;
    }

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    public QualityInfo withVideoFrameRate(Integer videoFrameRate) {
        this.videoFrameRate = videoFrameRate;
        return this;
    }

    


    /**
     * 转码视频帧率（单位：fps）。 取值范围：0-30，0表示保持帧率不变。 
     * minimum: 0
     * maximum: 30
     * @return videoFrameRate
     */
    public Integer getVideoFrameRate() {
        return videoFrameRate;
    }

    public void setVideoFrameRate(Integer videoFrameRate) {
        this.videoFrameRate = videoFrameRate;
    }

    public QualityInfo withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * 转码输出支持的协议类型。当前只支持RTMP和HLS，且模板组里不同模板的输出协议类型必须相同。 - RTMP - HLS - DASH  默认为RTMP。 
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public QualityInfo withIFrameInterval(Integer iFrameInterval) {
        this.iFrameInterval = iFrameInterval;
        return this;
    }

    


    /**
     * I帧间隔（单位：帧）。  取值范围：0-500。  默认为25。 
     * minimum: 0
     * maximum: 500
     * @return iFrameInterval
     */
    public Integer getIFrameInterval() {
        return iFrameInterval;
    }

    public void setIFrameInterval(Integer iFrameInterval) {
        this.iFrameInterval = iFrameInterval;
    }

    public QualityInfo withGop(Integer gop) {
        this.gop = gop;
        return this;
    }

    


    /**
     * 按时间设置I帧间隔，与“iFrameInterval”选择一个设置即可。  取值范围：[0,10]  默认值：4 
     * minimum: 0
     * maximum: 10
     * @return gop
     */
    public Integer getGop() {
        return gop;
    }

    public void setGop(Integer gop) {
        this.gop = gop;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QualityInfo qualityInfo = (QualityInfo) o;
        return Objects.equals(this.templateName, qualityInfo.templateName) &&
            Objects.equals(this.quality, qualityInfo.quality) &&
            Objects.equals(this.pvc, qualityInfo.pvc) &&
            Objects.equals(this.hdlb, qualityInfo.hdlb) &&
            Objects.equals(this.codec, qualityInfo.codec) &&
            Objects.equals(this.width, qualityInfo.width) &&
            Objects.equals(this.height, qualityInfo.height) &&
            Objects.equals(this.bitrate, qualityInfo.bitrate) &&
            Objects.equals(this.videoFrameRate, qualityInfo.videoFrameRate) &&
            Objects.equals(this.protocol, qualityInfo.protocol) &&
            Objects.equals(this.iFrameInterval, qualityInfo.iFrameInterval) &&
            Objects.equals(this.gop, qualityInfo.gop);
    }
    @Override
    public int hashCode() {
        return Objects.hash(templateName, quality, pvc, hdlb, codec, width, height, bitrate, videoFrameRate, protocol, iFrameInterval, gop);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualityInfo {\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
        sb.append("    pvc: ").append(toIndentedString(pvc)).append("\n");
        sb.append("    hdlb: ").append(toIndentedString(hdlb)).append("\n");
        sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
        sb.append("    videoFrameRate: ").append(toIndentedString(videoFrameRate)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    iFrameInterval: ").append(toIndentedString(iFrameInterval)).append("\n");
        sb.append("    gop: ").append(toIndentedString(gop)).append("\n");
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

