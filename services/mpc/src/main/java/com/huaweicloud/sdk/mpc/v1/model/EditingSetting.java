package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * EditingSetting
 */
public class EditingSetting {

    /**
     * 分辨率自适应策略, 选值：OPEN, CLOSE（默认OPEN） 输入为OPEN时，width表示长边，height表示短边 输入为CLOSE时，width表示宽度，height表示长度 
     */
    public static final class ResolutionAdaptationEnum {

        /**
         * Enum OPEN for value: "OPEN"
         */
        public static final ResolutionAdaptationEnum OPEN = new ResolutionAdaptationEnum("OPEN");

        /**
         * Enum CLOSE for value: "CLOSE"
         */
        public static final ResolutionAdaptationEnum CLOSE = new ResolutionAdaptationEnum("CLOSE");

        private static final Map<String, ResolutionAdaptationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResolutionAdaptationEnum> createStaticFields() {
            Map<String, ResolutionAdaptationEnum> map = new HashMap<>();
            map.put("OPEN", OPEN);
            map.put("CLOSE", CLOSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResolutionAdaptationEnum(String value) {
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
        public static ResolutionAdaptationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ResolutionAdaptationEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResolutionAdaptationEnum(value);
            }
            return result;
        }

        public static ResolutionAdaptationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResolutionAdaptationEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResolutionAdaptationEnum) {
                return this.value.equals(((ResolutionAdaptationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolution_adaptation")

    private ResolutionAdaptationEnum resolutionAdaptation;

    /**
     * 分辨率上采样开关, 选值：ON, OFF（默认OFF） 
     */
    public static final class ResolutionUpsampleEnum {

        /**
         * Enum ON for value: "ON"
         */
        public static final ResolutionUpsampleEnum ON = new ResolutionUpsampleEnum("ON");

        /**
         * Enum OFF for value: "OFF"
         */
        public static final ResolutionUpsampleEnum OFF = new ResolutionUpsampleEnum("OFF");

        private static final Map<String, ResolutionUpsampleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResolutionUpsampleEnum> createStaticFields() {
            Map<String, ResolutionUpsampleEnum> map = new HashMap<>();
            map.put("ON", ON);
            map.put("OFF", OFF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResolutionUpsampleEnum(String value) {
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
        public static ResolutionUpsampleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ResolutionUpsampleEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResolutionUpsampleEnum(value);
            }
            return result;
        }

        public static ResolutionUpsampleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResolutionUpsampleEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResolutionUpsampleEnum) {
                return this.value.equals(((ResolutionUpsampleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolution_upsample")

    private ResolutionUpsampleEnum resolutionUpsample;

    /**
     * 输出封装格式，HLS、MP4（默认MP4） 
     */
    public static final class FormatEnum {

        /**
         * Enum MP4 for value: "MP4"
         */
        public static final FormatEnum MP4 = new FormatEnum("MP4");

        /**
         * Enum HLS for value: "HLS"
         */
        public static final FormatEnum HLS = new FormatEnum("HLS");

        private static final Map<String, FormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FormatEnum> createStaticFields() {
            Map<String, FormatEnum> map = new HashMap<>();
            map.put("MP4", MP4);
            map.put("HLS", HLS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FormatEnum(String value) {
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
        public static FormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            FormatEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FormatEnum(value);
            }
            return result;
        }

        public static FormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            FormatEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FormatEnum) {
                return this.value.equals(((FormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private FormatEnum format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    /**
     * 输出参考基准，可选，默认为空  - NONE 输出分辨率按输入的第一个片源为主，码率按输出分辨率自适应，帧率固定输出25fps - MAX_BITRATE 按码率最大的输入片源参数为基准 - MAX_RESOLUTION 按分辨率最大的输入片源参数为基准 
     */
    public static final class ReferenceEnum {

        /**
         * Enum NONE for value: "NONE"
         */
        public static final ReferenceEnum NONE = new ReferenceEnum("NONE");

        /**
         * Enum MAX_BITRATE for value: "MAX_BITRATE"
         */
        public static final ReferenceEnum MAX_BITRATE = new ReferenceEnum("MAX_BITRATE");

        /**
         * Enum MAX_RESOLUTION for value: "MAX_RESOLUTION"
         */
        public static final ReferenceEnum MAX_RESOLUTION = new ReferenceEnum("MAX_RESOLUTION");

        private static final Map<String, ReferenceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReferenceEnum> createStaticFields() {
            Map<String, ReferenceEnum> map = new HashMap<>();
            map.put("NONE", NONE);
            map.put("MAX_BITRATE", MAX_BITRATE);
            map.put("MAX_RESOLUTION", MAX_RESOLUTION);
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

    public EditingSetting withResolutionAdaptation(ResolutionAdaptationEnum resolutionAdaptation) {
        this.resolutionAdaptation = resolutionAdaptation;
        return this;
    }

    /**
     * 分辨率自适应策略, 选值：OPEN, CLOSE（默认OPEN） 输入为OPEN时，width表示长边，height表示短边 输入为CLOSE时，width表示宽度，height表示长度 
     * @return resolutionAdaptation
     */
    public ResolutionAdaptationEnum getResolutionAdaptation() {
        return resolutionAdaptation;
    }

    public void setResolutionAdaptation(ResolutionAdaptationEnum resolutionAdaptation) {
        this.resolutionAdaptation = resolutionAdaptation;
    }

    public EditingSetting withResolutionUpsample(ResolutionUpsampleEnum resolutionUpsample) {
        this.resolutionUpsample = resolutionUpsample;
        return this;
    }

    /**
     * 分辨率上采样开关, 选值：ON, OFF（默认OFF） 
     * @return resolutionUpsample
     */
    public ResolutionUpsampleEnum getResolutionUpsample() {
        return resolutionUpsample;
    }

    public void setResolutionUpsample(ResolutionUpsampleEnum resolutionUpsample) {
        this.resolutionUpsample = resolutionUpsample;
    }

    public EditingSetting withFormat(FormatEnum format) {
        this.format = format;
        return this;
    }

    /**
     * 输出封装格式，HLS、MP4（默认MP4） 
     * @return format
     */
    public FormatEnum getFormat() {
        return format;
    }

    public void setFormat(FormatEnum format) {
        this.format = format;
    }

    public EditingSetting withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 输出宽或长边，整型，输入小数向下取整，默认0，按源  - 当 width、height 均为 0，则分辨率取片源分辨率； - 当 width 为 0，height 非 0，则 width 按片源分辨率比例缩放； - 当 width 非 0，height 为 0，则 height 按片源分辨率比例缩放； - 当 width、height 均非 0，则分辨率按用户指定。 
     * minimum: 0
     * maximum: 4096
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public EditingSetting withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 输出高或短边，整型，输入小数向下取整，默认0，按源  - 当 Width、Height 均为 0，则分辨率取片源分辨率； - 当 Width 为 0，Height 非 0，则 Width 按片源分辨率比例缩放； - 当 Width 非 0，Height 为 0，则 Height 按片源分辨率比例缩放； - 当 Width、Height 均非 0，则分辨率按用户指定。 
     * minimum: 0
     * maximum: 4096
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public EditingSetting withReference(ReferenceEnum reference) {
        this.reference = reference;
        return this;
    }

    /**
     * 输出参考基准，可选，默认为空  - NONE 输出分辨率按输入的第一个片源为主，码率按输出分辨率自适应，帧率固定输出25fps - MAX_BITRATE 按码率最大的输入片源参数为基准 - MAX_RESOLUTION 按分辨率最大的输入片源参数为基准 
     * @return reference
     */
    public ReferenceEnum getReference() {
        return reference;
    }

    public void setReference(ReferenceEnum reference) {
        this.reference = reference;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EditingSetting editingSetting = (EditingSetting) o;
        return Objects.equals(this.resolutionAdaptation, editingSetting.resolutionAdaptation)
            && Objects.equals(this.resolutionUpsample, editingSetting.resolutionUpsample)
            && Objects.equals(this.format, editingSetting.format) && Objects.equals(this.width, editingSetting.width)
            && Objects.equals(this.height, editingSetting.height)
            && Objects.equals(this.reference, editingSetting.reference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolutionAdaptation, resolutionUpsample, format, width, height, reference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EditingSetting {\n");
        sb.append("    resolutionAdaptation: ").append(toIndentedString(resolutionAdaptation)).append("\n");
        sb.append("    resolutionUpsample: ").append(toIndentedString(resolutionUpsample)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
