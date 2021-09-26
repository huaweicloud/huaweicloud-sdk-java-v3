package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** EditVideoInfo */
public class EditVideoInfo {

    /** 剪辑输出视频参数的参照物。取值如下： - MAX，以输入片源中最大分辨率的视频参数作为输出参照。 - MIN，以输入片源中最小分辨率的视频参数作为输出参照。 -
     * CUSTOM，自定义视频输出参数，使用该参数时，所有视频参数必填 */
    public static final class ReferenceEnum {

        /** Enum MAX for value: "MAX" */
        public static final ReferenceEnum MAX = new ReferenceEnum("MAX");

        /** Enum MIN for value: "MIN" */
        public static final ReferenceEnum MIN = new ReferenceEnum("MIN");

        /** Enum CUSTOM for value: "CUSTOM" */
        public static final ReferenceEnum CUSTOM = new ReferenceEnum("CUSTOM");

        private static final Map<String, ReferenceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReferenceEnum> createStaticFields() {
            Map<String, ReferenceEnum> map = new HashMap<>();
            map.put("MAX", MAX);
            map.put("MIN", MIN);
            map.put("CUSTOM", CUSTOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReferenceEnum(String value) {
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
        public static ReferenceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ReferenceEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ReferenceEnum(value);
            }
            return result;
        }

        public static ReferenceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ReferenceEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReferenceEnum) {
                return this.value.equals(((ReferenceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reference")

    private ReferenceEnum reference;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    /** 视频频编码格式。 */
    public static final class CodecEnum {

        /** Enum H264 for value: "H264" */
        public static final CodecEnum H264 = new CodecEnum("H264");

        /** Enum H265 for value: "H265" */
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
            CodecEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CodecEnum(value);
            }
            return result;
        }

        public static CodecEnum valueOf(String value) {
            if (value == null) {
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_rate")

    private Integer frameRate;

    public EditVideoInfo withReference(ReferenceEnum reference) {
        this.reference = reference;
        return this;
    }

    /** 剪辑输出视频参数的参照物。取值如下： - MAX，以输入片源中最大分辨率的视频参数作为输出参照。 - MIN，以输入片源中最小分辨率的视频参数作为输出参照。 -
     * CUSTOM，自定义视频输出参数，使用该参数时，所有视频参数必填
     * 
     * @return reference */
    public ReferenceEnum getReference() {
        return reference;
    }

    public void setReference(ReferenceEnum reference) {
        this.reference = reference;
    }

    public EditVideoInfo withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /** 视频宽度。 minimum: 0 maximum: 3840
     * 
     * @return width */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public EditVideoInfo withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /** 视频高度。 minimum: 0 maximum: 2160
     * 
     * @return height */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public EditVideoInfo withCodec(CodecEnum codec) {
        this.codec = codec;
        return this;
    }

    /** 视频频编码格式。
     * 
     * @return codec */
    public CodecEnum getCodec() {
        return codec;
    }

    public void setCodec(CodecEnum codec) {
        this.codec = codec;
    }

    public EditVideoInfo withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /** 视频码率，单位: bit/s minimum: 0 maximum: 20000000
     * 
     * @return bitrate */
    public Integer getBitrate() {
        return bitrate;
    }

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    public EditVideoInfo withFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    /** 帧率。 minimum: 0 maximum: 60
     * 
     * @return frameRate */
    public Integer getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EditVideoInfo editVideoInfo = (EditVideoInfo) o;
        return Objects.equals(this.reference, editVideoInfo.reference)
            && Objects.equals(this.width, editVideoInfo.width) && Objects.equals(this.height, editVideoInfo.height)
            && Objects.equals(this.codec, editVideoInfo.codec) && Objects.equals(this.bitrate, editVideoInfo.bitrate)
            && Objects.equals(this.frameRate, editVideoInfo.frameRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reference, width, height, codec, bitrate, frameRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EditVideoInfo {\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
        sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
        sb.append("    frameRate: ").append(toIndentedString(frameRate)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
