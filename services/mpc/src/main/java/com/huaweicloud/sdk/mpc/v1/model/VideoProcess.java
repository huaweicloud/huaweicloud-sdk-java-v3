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
 * VideoProcess
 */
public class VideoProcess {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hls_init_count")

    private Integer hlsInitCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hls_init_interval")

    private Integer hlsInitInterval;

    /**
     * hls的音视频流存储方式。  - composite：存储在同一个文件中。 - separate：存储在不同的文件中 
     */
    public static final class HlsStorageTypeEnum {

        /**
         * Enum COMPOSITE for value: "composite"
         */
        public static final HlsStorageTypeEnum COMPOSITE = new HlsStorageTypeEnum("composite");

        /**
         * Enum SEPARATE for value: "separate"
         */
        public static final HlsStorageTypeEnum SEPARATE = new HlsStorageTypeEnum("separate");

        private static final Map<String, HlsStorageTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HlsStorageTypeEnum> createStaticFields() {
            Map<String, HlsStorageTypeEnum> map = new HashMap<>();
            map.put("composite", COMPOSITE);
            map.put("separate", SEPARATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HlsStorageTypeEnum(String value) {
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
        public static HlsStorageTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HlsStorageTypeEnum(value));
        }

        public static HlsStorageTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HlsStorageTypeEnum) {
                return this.value.equals(((HlsStorageTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hls_storage_type")

    private HlsStorageTypeEnum hlsStorageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rotate")

    private Integer rotate;

    /**
     * 长短边自适应控制字段： - SHORT：表示短边自适应 - LONG：表示长边自适应 - NONE：表示不自适应 
     */
    public static final class AdaptationEnum {

        /**
         * Enum SHORT for value: "SHORT"
         */
        public static final AdaptationEnum SHORT = new AdaptationEnum("SHORT");

        /**
         * Enum LONG for value: "LONG"
         */
        public static final AdaptationEnum LONG = new AdaptationEnum("LONG");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final AdaptationEnum NONE = new AdaptationEnum("NONE");

        private static final Map<String, AdaptationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AdaptationEnum> createStaticFields() {
            Map<String, AdaptationEnum> map = new HashMap<>();
            map.put("SHORT", SHORT);
            map.put("LONG", LONG);
            map.put("NONE", NONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AdaptationEnum(String value) {
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
        public static AdaptationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AdaptationEnum(value));
        }

        public static AdaptationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AdaptationEnum) {
                return this.value.equals(((AdaptationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adaptation")

    private AdaptationEnum adaptation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fill_type")

    private String fillType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upsample")

    private Integer upsample;

    /**
     * HLS切片类型。  取值如下所示： - mpegts：ts切片 - fmp4：fmp4切片  不设置默认为ts切片。 
     */
    public static final class HlsSegmentTypeEnum {

        /**
         * Enum MPEGTS for value: "mpegts"
         */
        public static final HlsSegmentTypeEnum MPEGTS = new HlsSegmentTypeEnum("mpegts");

        /**
         * Enum FMP4 for value: "fmp4"
         */
        public static final HlsSegmentTypeEnum FMP4 = new HlsSegmentTypeEnum("fmp4");

        private static final Map<String, HlsSegmentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HlsSegmentTypeEnum> createStaticFields() {
            Map<String, HlsSegmentTypeEnum> map = new HashMap<>();
            map.put("mpegts", MPEGTS);
            map.put("fmp4", FMP4);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HlsSegmentTypeEnum(String value) {
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
        public static HlsSegmentTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HlsSegmentTypeEnum(value));
        }

        public static HlsSegmentTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HlsSegmentTypeEnum) {
                return this.value.equals(((HlsSegmentTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hls_segment_type")

    private HlsSegmentTypeEnum hlsSegmentType;

    public VideoProcess withHlsInitCount(Integer hlsInitCount) {
        this.hlsInitCount = hlsInitCount;
        return this;
    }

    /**
     * 需要单独设置时长的HLS起始分片数量。与hls_init_interval配合使用，设置前面hls_init_count个HLS分片时长。 为0表示不单独配置时长。 
     * minimum: 0
     * maximum: 10
     * @return hlsInitCount
     */
    public Integer getHlsInitCount() {
        return hlsInitCount;
    }

    public void setHlsInitCount(Integer hlsInitCount) {
        this.hlsInitCount = hlsInitCount;
    }

    public VideoProcess withHlsInitInterval(Integer hlsInitInterval) {
        this.hlsInitInterval = hlsInitInterval;
        return this;
    }

    /**
     * 表示前面hls_init_count个HLS分片的时长,hls_init_count不为0时，该字段才起作用。 
     * minimum: 2
     * maximum: 10
     * @return hlsInitInterval
     */
    public Integer getHlsInitInterval() {
        return hlsInitInterval;
    }

    public void setHlsInitInterval(Integer hlsInitInterval) {
        this.hlsInitInterval = hlsInitInterval;
    }

    public VideoProcess withHlsStorageType(HlsStorageTypeEnum hlsStorageType) {
        this.hlsStorageType = hlsStorageType;
        return this;
    }

    /**
     * hls的音视频流存储方式。  - composite：存储在同一个文件中。 - separate：存储在不同的文件中 
     * @return hlsStorageType
     */
    public HlsStorageTypeEnum getHlsStorageType() {
        return hlsStorageType;
    }

    public void setHlsStorageType(HlsStorageTypeEnum hlsStorageType) {
        this.hlsStorageType = hlsStorageType;
    }

    public VideoProcess withRotate(Integer rotate) {
        this.rotate = rotate;
        return this;
    }

    /**
     * 视频顺时针旋转角度。  - 0：表示不旋转 - 1：表示顺时针旋转90度 - 2：表示顺时针旋转180度 - 3：表示顺时针旋转270度 
     * minimum: 0
     * maximum: 4
     * @return rotate
     */
    public Integer getRotate() {
        return rotate;
    }

    public void setRotate(Integer rotate) {
        this.rotate = rotate;
    }

    public VideoProcess withAdaptation(AdaptationEnum adaptation) {
        this.adaptation = adaptation;
        return this;
    }

    /**
     * 长短边自适应控制字段： - SHORT：表示短边自适应 - LONG：表示长边自适应 - NONE：表示不自适应 
     * @return adaptation
     */
    public AdaptationEnum getAdaptation() {
        return adaptation;
    }

    public void setAdaptation(AdaptationEnum adaptation) {
        this.adaptation = adaptation;
    }

    public VideoProcess withFillType(String fillType) {
        this.fillType = fillType;
        return this;
    }

    /**
     * adaptation为NONE时生效： - stretch：拉伸，对每一帧进行拉伸，填满整个画面 - black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。 - white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充。 - gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊。 
     * @return fillType
     */
    public String getFillType() {
        return fillType;
    }

    public void setFillType(String fillType) {
        this.fillType = fillType;
    }

    public VideoProcess withUpsample(Integer upsample) {
        this.upsample = upsample;
        return this;
    }

    /**
     * 是否开启上采样，如支持从480P的片源转为720P，可取值为:  - 0：表示上采样关闭， - 1：表示上采样开启. 
     * minimum: 0
     * maximum: 1
     * @return upsample
     */
    public Integer getUpsample() {
        return upsample;
    }

    public void setUpsample(Integer upsample) {
        this.upsample = upsample;
    }

    public VideoProcess withHlsSegmentType(HlsSegmentTypeEnum hlsSegmentType) {
        this.hlsSegmentType = hlsSegmentType;
        return this;
    }

    /**
     * HLS切片类型。  取值如下所示： - mpegts：ts切片 - fmp4：fmp4切片  不设置默认为ts切片。 
     * @return hlsSegmentType
     */
    public HlsSegmentTypeEnum getHlsSegmentType() {
        return hlsSegmentType;
    }

    public void setHlsSegmentType(HlsSegmentTypeEnum hlsSegmentType) {
        this.hlsSegmentType = hlsSegmentType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoProcess that = (VideoProcess) obj;
        return Objects.equals(this.hlsInitCount, that.hlsInitCount)
            && Objects.equals(this.hlsInitInterval, that.hlsInitInterval)
            && Objects.equals(this.hlsStorageType, that.hlsStorageType) && Objects.equals(this.rotate, that.rotate)
            && Objects.equals(this.adaptation, that.adaptation) && Objects.equals(this.fillType, that.fillType)
            && Objects.equals(this.upsample, that.upsample) && Objects.equals(this.hlsSegmentType, that.hlsSegmentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hlsInitCount,
            hlsInitInterval,
            hlsStorageType,
            rotate,
            adaptation,
            fillType,
            upsample,
            hlsSegmentType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoProcess {\n");
        sb.append("    hlsInitCount: ").append(toIndentedString(hlsInitCount)).append("\n");
        sb.append("    hlsInitInterval: ").append(toIndentedString(hlsInitInterval)).append("\n");
        sb.append("    hlsStorageType: ").append(toIndentedString(hlsStorageType)).append("\n");
        sb.append("    rotate: ").append(toIndentedString(rotate)).append("\n");
        sb.append("    adaptation: ").append(toIndentedString(adaptation)).append("\n");
        sb.append("    fillType: ").append(toIndentedString(fillType)).append("\n");
        sb.append("    upsample: ").append(toIndentedString(upsample)).append("\n");
        sb.append("    hlsSegmentType: ").append(toIndentedString(hlsSegmentType)).append("\n");
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
