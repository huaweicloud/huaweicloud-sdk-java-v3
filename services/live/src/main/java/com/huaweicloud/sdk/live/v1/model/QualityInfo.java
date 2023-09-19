package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * QualityInfo
 */
public class QualityInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templateName")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quality")

    private String quality;

    /**
     * 是否使用窄带高清转码。默认值：off。  注意：该字段已不再维护，建议使用hdlb。  包含如下取值： - off：不启用。 - on：启用。 
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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PvcEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PvcEnum(value));
        }

        public static PvcEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PvcEnum) {
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
    @JsonProperty(value = "PVC")

    private PvcEnum pvc;

    /**
     * 是否启用高清低码，较PVC相比画质增强。默认值：off。  提示：使用hdlb字段开启高清低码时，PVC字段不生效。  包含如下取值： - off：不开启高清低码； - on：开启高清低码。 
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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static HdlbEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HdlbEnum(value));
        }

        public static HdlbEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HdlbEnum) {
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
    @JsonProperty(value = "hdlb")

    private HdlbEnum hdlb;

    /**
     * 视频编码格式。默认为H264。 - H264：使用H.264。 - H265：使用H.265。 
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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CodecEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CodecEnum(value));
        }

        public static CodecEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CodecEnum) {
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
    @JsonProperty(value = "codec")

    private CodecEnum codec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bitrate")

    private Integer bitrate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_frame_rate")

    private Integer videoFrameRate;

    /**
     * 转码输出支持的协议类型。默认为RTMP。当前只支持RTMP。  包含如下取值： - RTMP 
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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtocolEnum(value));
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolEnum) {
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
    @JsonProperty(value = "protocol")

    private ProtocolEnum protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iFrameInterval")

    private Integer iFrameInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gop")

    private Integer gop;

    /**
     * 自适应码率参数，默认值：off。  包含如下取值： - off：关闭码率自适应，目标码率按设定的码率输出； - minimum：目标码率按设定码率和源文件码率最小值输出（即码率不上扬）； - adaptive：目标码率按源文件码率自适应输出。 
     */
    public static final class BitrateAdaptiveEnum {

        /**
         * Enum MINIMUM for value: "minimum"
         */
        public static final BitrateAdaptiveEnum MINIMUM = new BitrateAdaptiveEnum("minimum");

        /**
         * Enum ADAPTIVE for value: "adaptive"
         */
        public static final BitrateAdaptiveEnum ADAPTIVE = new BitrateAdaptiveEnum("adaptive");

        private static final Map<String, BitrateAdaptiveEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BitrateAdaptiveEnum> createStaticFields() {
            Map<String, BitrateAdaptiveEnum> map = new HashMap<>();
            map.put("minimum", MINIMUM);
            map.put("adaptive", ADAPTIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BitrateAdaptiveEnum(String value) {
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
        public static BitrateAdaptiveEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BitrateAdaptiveEnum(value));
        }

        public static BitrateAdaptiveEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BitrateAdaptiveEnum) {
                return this.value.equals(((BitrateAdaptiveEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bitrate_adaptive")

    private BitrateAdaptiveEnum bitrateAdaptive;

    /**
     * 编码输出I帧策略，默认值：auto。  包含如下取值： - auto：I帧按设置的gop时长输出； - strictSync：编码输出I帧完全和源保持一致（源是I帧则编码输出I帧，源不是I帧则编码非I帧），设置该参数后gop时长设置无效。 
     */
    public static final class IFramePolicyEnum {

        /**
         * Enum AUTO for value: "auto"
         */
        public static final IFramePolicyEnum AUTO = new IFramePolicyEnum("auto");

        /**
         * Enum STRICTSYNC for value: "strictSync"
         */
        public static final IFramePolicyEnum STRICTSYNC = new IFramePolicyEnum("strictSync");

        private static final Map<String, IFramePolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IFramePolicyEnum> createStaticFields() {
            Map<String, IFramePolicyEnum> map = new HashMap<>();
            map.put("auto", AUTO);
            map.put("strictSync", STRICTSYNC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IFramePolicyEnum(String value) {
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
        public static IFramePolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IFramePolicyEnum(value));
        }

        public static IFramePolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IFramePolicyEnum) {
                return this.value.equals(((IFramePolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "i_frame_policy")

    private IFramePolicyEnum iFramePolicy;

    public QualityInfo withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 自定义模板名称。 - 若需要自定义模板名称，请将quality参数设置为userdefine； - 多个自定义模板名称之间不能重复； - 自定义模板名称不能与其他模板的quality参数重复； - 若quality不为userdefine，请勿填写此字段。 
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
     * 包含如下取值： - lud： 超高清，系统缺省名称； - lhd： 高清，系统缺省名称； - lsd： 标清，系统缺省名称； - lld： 流畅，系统缺省名称； - userdefine： 视频质量自定义。填写userdefine时，templateName字段不能为空。 
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
     * 是否使用窄带高清转码。默认值：off。  注意：该字段已不再维护，建议使用hdlb。  包含如下取值： - off：不启用。 - on：启用。 
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
     * 是否启用高清低码，较PVC相比画质增强。默认值：off。  提示：使用hdlb字段开启高清低码时，PVC字段不生效。  包含如下取值： - off：不开启高清低码； - on：开启高清低码。 
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
     * 视频编码格式。默认为H264。 - H264：使用H.264。 - H265：使用H.265。 
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
     * 视频长边（横屏的宽，竖屏的高）  单位：像素；默认值：0 - H264 建议取值范围：32-3840，必须为2的倍数 。 - H265 建议取值范围：320-3840 ，必须为2的倍数。  注意：width和height全为0，则输出分辨率和源一致；width和height只有一个为0， 则分辨率按非0项的比例缩放。 
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
     * 视频短边（横屏的高，竖屏的宽）  单位：像素；默认值：0 - H264 建议取值范围：32-2160，必须为2的倍数。 - H265 建议取值范围：240-2160，必须为2的倍数。  注意：width和height全为0，则输出分辨率和源一致；width和height只有一个为0， 则分辨率按非0项的比例缩放。 
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
     * 转码视频的码率  单位：Kbps  取值范围：40-30000 
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
     * 转码视频帧率  单位：fps  默认值：0  取值范围：0-60，0表示保持帧率不变。 
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
     * 转码输出支持的协议类型。默认为RTMP。当前只支持RTMP。  包含如下取值： - RTMP 
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
     * 最大I帧间隔  单位：帧数  取值范围：[0, 500]，默认值：50  注意：若希望通过iFrameInterval设置i帧间隔，请将gop设为0，或不传gop参数。 
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
     * 按时间设置I帧间隔  单位：秒  取值范围：[0,10]，默认值：2  注意：gop不为0时，则以gop设置i帧间隔，iFrameInterval字段不生效。 
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

    public QualityInfo withBitrateAdaptive(BitrateAdaptiveEnum bitrateAdaptive) {
        this.bitrateAdaptive = bitrateAdaptive;
        return this;
    }

    /**
     * 自适应码率参数，默认值：off。  包含如下取值： - off：关闭码率自适应，目标码率按设定的码率输出； - minimum：目标码率按设定码率和源文件码率最小值输出（即码率不上扬）； - adaptive：目标码率按源文件码率自适应输出。 
     * @return bitrateAdaptive
     */
    public BitrateAdaptiveEnum getBitrateAdaptive() {
        return bitrateAdaptive;
    }

    public void setBitrateAdaptive(BitrateAdaptiveEnum bitrateAdaptive) {
        this.bitrateAdaptive = bitrateAdaptive;
    }

    public QualityInfo withIFramePolicy(IFramePolicyEnum iFramePolicy) {
        this.iFramePolicy = iFramePolicy;
        return this;
    }

    /**
     * 编码输出I帧策略，默认值：auto。  包含如下取值： - auto：I帧按设置的gop时长输出； - strictSync：编码输出I帧完全和源保持一致（源是I帧则编码输出I帧，源不是I帧则编码非I帧），设置该参数后gop时长设置无效。 
     * @return iFramePolicy
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "i_frame_policy")
    public IFramePolicyEnum getIFramePolicy() {
        return iFramePolicy;
    }

    public void setIFramePolicy(IFramePolicyEnum iFramePolicy) {
        this.iFramePolicy = iFramePolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QualityInfo that = (QualityInfo) obj;
        return Objects.equals(this.templateName, that.templateName) && Objects.equals(this.quality, that.quality)
            && Objects.equals(this.pvc, that.pvc) && Objects.equals(this.hdlb, that.hdlb)
            && Objects.equals(this.codec, that.codec) && Objects.equals(this.width, that.width)
            && Objects.equals(this.height, that.height) && Objects.equals(this.bitrate, that.bitrate)
            && Objects.equals(this.videoFrameRate, that.videoFrameRate) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.iFrameInterval, that.iFrameInterval) && Objects.equals(this.gop, that.gop)
            && Objects.equals(this.bitrateAdaptive, that.bitrateAdaptive)
            && Objects.equals(this.iFramePolicy, that.iFramePolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateName,
            quality,
            pvc,
            hdlb,
            codec,
            width,
            height,
            bitrate,
            videoFrameRate,
            protocol,
            iFrameInterval,
            gop,
            bitrateAdaptive,
            iFramePolicy);
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
        sb.append("    bitrateAdaptive: ").append(toIndentedString(bitrateAdaptive)).append("\n");
        sb.append("    iFramePolicy: ").append(toIndentedString(iFramePolicy)).append("\n");
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
