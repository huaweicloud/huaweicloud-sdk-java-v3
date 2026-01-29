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
 * 流选择配置
 */
public class ManifestSelection {

    /**
     * **参数解释**： 流排序模式 **约束限制**： 不涉及 **取值范围**： - ORIGINAL：保持原始顺序，即按照频道配置中转码模板的顺序 - VIDEO_BITRATE_ASCENDING：按照视频码率升序 - VIDEO_BITRATE_DESCENDING：按照视频码率降序 
     */
    public static final class StreamOrderEnum {

        /**
         * Enum ORIGINAL for value: "ORIGINAL"
         */
        public static final StreamOrderEnum ORIGINAL = new StreamOrderEnum("ORIGINAL");

        /**
         * Enum VIDEO_BITRATE_ASCENDING for value: "VIDEO_BITRATE_ASCENDING"
         */
        public static final StreamOrderEnum VIDEO_BITRATE_ASCENDING = new StreamOrderEnum("VIDEO_BITRATE_ASCENDING");

        /**
         * Enum VIDEO_BITRATE_DESCENDING for value: "VIDEO_BITRATE_DESCENDING"
         */
        public static final StreamOrderEnum VIDEO_BITRATE_DESCENDING = new StreamOrderEnum("VIDEO_BITRATE_DESCENDING");

        private static final Map<String, StreamOrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StreamOrderEnum> createStaticFields() {
            Map<String, StreamOrderEnum> map = new HashMap<>();
            map.put("ORIGINAL", ORIGINAL);
            map.put("VIDEO_BITRATE_ASCENDING", VIDEO_BITRATE_ASCENDING);
            map.put("VIDEO_BITRATE_DESCENDING", VIDEO_BITRATE_DESCENDING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StreamOrderEnum(String value) {
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
        public static StreamOrderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StreamOrderEnum(value));
        }

        public static StreamOrderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StreamOrderEnum) {
                return this.value.equals(((StreamOrderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_order")

    private StreamOrderEnum streamOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_video_bandwidth")

    private Integer minVideoBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_video_bandwidth")

    private Integer maxVideoBandwidth;

    public ManifestSelection withStreamOrder(StreamOrderEnum streamOrder) {
        this.streamOrder = streamOrder;
        return this;
    }

    /**
     * **参数解释**： 流排序模式 **约束限制**： 不涉及 **取值范围**： - ORIGINAL：保持原始顺序，即按照频道配置中转码模板的顺序 - VIDEO_BITRATE_ASCENDING：按照视频码率升序 - VIDEO_BITRATE_DESCENDING：按照视频码率降序 
     * @return streamOrder
     */
    public StreamOrderEnum getStreamOrder() {
        return streamOrder;
    }

    public void setStreamOrder(StreamOrderEnum streamOrder) {
        this.streamOrder = streamOrder;
    }

    public ManifestSelection withMinVideoBandwidth(Integer minVideoBandwidth) {
        this.minVideoBandwidth = minVideoBandwidth;
        return this;
    }

    /**
     * **参数解释**： 视频码率过滤的最小码率 **约束限制**： 单位：bit/s；取值必须比max_video_bandwidth小 
     * minimum: 0
     * maximum: 2147483647
     * @return minVideoBandwidth
     */
    public Integer getMinVideoBandwidth() {
        return minVideoBandwidth;
    }

    public void setMinVideoBandwidth(Integer minVideoBandwidth) {
        this.minVideoBandwidth = minVideoBandwidth;
    }

    public ManifestSelection withMaxVideoBandwidth(Integer maxVideoBandwidth) {
        this.maxVideoBandwidth = maxVideoBandwidth;
        return this;
    }

    /**
     * **参数解释**： 视频码率过滤的最大码率 **约束限制**： 单位：bit/s；取值必须比min_video_bandwidth大 
     * minimum: 0
     * maximum: 2147483647
     * @return maxVideoBandwidth
     */
    public Integer getMaxVideoBandwidth() {
        return maxVideoBandwidth;
    }

    public void setMaxVideoBandwidth(Integer maxVideoBandwidth) {
        this.maxVideoBandwidth = maxVideoBandwidth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ManifestSelection that = (ManifestSelection) obj;
        return Objects.equals(this.streamOrder, that.streamOrder)
            && Objects.equals(this.minVideoBandwidth, that.minVideoBandwidth)
            && Objects.equals(this.maxVideoBandwidth, that.maxVideoBandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streamOrder, minVideoBandwidth, maxVideoBandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ManifestSelection {\n");
        sb.append("    streamOrder: ").append(toIndentedString(streamOrder)).append("\n");
        sb.append("    minVideoBandwidth: ").append(toIndentedString(minVideoBandwidth)).append("\n");
        sb.append("    maxVideoBandwidth: ").append(toIndentedString(maxVideoBandwidth)).append("\n");
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
