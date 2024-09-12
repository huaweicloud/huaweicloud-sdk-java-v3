package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 视频输出配置。照片数字人支持该输出配置查询，不支持修改。
 */
public class PhotoVideoConfig {

    /**
     * 视频编码格式及视频文件格式。 * H264：h264编码，输出mp4文件
     */
    public static final class CodecEnum {

        /**
         * Enum H264 for value: "H264"
         */
        public static final CodecEnum H264 = new CodecEnum("H264");

        private static final Map<String, CodecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CodecEnum> createStaticFields() {
            Map<String, CodecEnum> map = new HashMap<>();
            map.put("H264", H264);
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
    @JsonProperty(value = "bitrate")

    private Integer bitrate;

    /**
     * 帧率。  单位：FPS。
     */
    public static final class FrameRateEnum {

        /**
         * Enum _24 for value: "24"
         */
        public static final FrameRateEnum _24 = new FrameRateEnum("24");

        /**
         * Enum _25 for value: "25"
         */
        public static final FrameRateEnum _25 = new FrameRateEnum("25");

        /**
         * Enum _30 for value: "30"
         */
        public static final FrameRateEnum _30 = new FrameRateEnum("30");

        private static final Map<String, FrameRateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FrameRateEnum> createStaticFields() {
            Map<String, FrameRateEnum> map = new HashMap<>();
            map.put("24", _24);
            map.put("25", _25);
            map.put("30", _30);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FrameRateEnum(String value) {
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
        public static FrameRateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FrameRateEnum(value));
        }

        public static FrameRateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FrameRateEnum) {
                return this.value.equals(((FrameRateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_rate")

    private FrameRateEnum frameRate;

    public PhotoVideoConfig withCodec(CodecEnum codec) {
        this.codec = codec;
        return this;
    }

    /**
     * 视频编码格式及视频文件格式。 * H264：h264编码，输出mp4文件
     * @return codec
     */
    public CodecEnum getCodec() {
        return codec;
    }

    public void setCodec(CodecEnum codec) {
        this.codec = codec;
    }

    public PhotoVideoConfig withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * **参数解释**： 输出平均码率。  单位：kbps。  最小值40，最大值30000。
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

    public PhotoVideoConfig withFrameRate(FrameRateEnum frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    /**
     * 帧率。  单位：FPS。
     * @return frameRate
     */
    public FrameRateEnum getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(FrameRateEnum frameRate) {
        this.frameRate = frameRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PhotoVideoConfig that = (PhotoVideoConfig) obj;
        return Objects.equals(this.codec, that.codec) && Objects.equals(this.bitrate, that.bitrate)
            && Objects.equals(this.frameRate, that.frameRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codec, bitrate, frameRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PhotoVideoConfig {\n");
        sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
        sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
        sb.append("    frameRate: ").append(toIndentedString(frameRate)).append("\n");
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
