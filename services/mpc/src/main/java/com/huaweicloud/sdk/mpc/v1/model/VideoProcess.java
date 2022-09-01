package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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

    @JacksonXmlProperty(localName = "hls_init_count")

    private Integer hlsInitCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hls_init_interval")

    @JacksonXmlProperty(localName = "hls_init_interval")

    private Integer hlsInitInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rotate")

    @JacksonXmlProperty(localName = "rotate")

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
            AdaptationEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AdaptationEnum(value);
            }
            return result;
        }

        public static AdaptationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AdaptationEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "adaptation")

    private AdaptationEnum adaptation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upsample")

    @JacksonXmlProperty(localName = "upsample")

    private Integer upsample;

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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoProcess videoProcess = (VideoProcess) o;
        return Objects.equals(this.hlsInitCount, videoProcess.hlsInitCount)
            && Objects.equals(this.hlsInitInterval, videoProcess.hlsInitInterval)
            && Objects.equals(this.rotate, videoProcess.rotate)
            && Objects.equals(this.adaptation, videoProcess.adaptation)
            && Objects.equals(this.upsample, videoProcess.upsample);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hlsInitCount, hlsInitInterval, rotate, adaptation, upsample);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoProcess {\n");
        sb.append("    hlsInitCount: ").append(toIndentedString(hlsInitCount)).append("\n");
        sb.append("    hlsInitInterval: ").append(toIndentedString(hlsInitInterval)).append("\n");
        sb.append("    rotate: ").append(toIndentedString(rotate)).append("\n");
        sb.append("    adaptation: ").append(toIndentedString(adaptation)).append("\n");
        sb.append("    upsample: ").append(toIndentedString(upsample)).append("\n");
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
