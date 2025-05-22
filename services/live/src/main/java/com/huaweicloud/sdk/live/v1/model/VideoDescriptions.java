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
 * VideoDescriptions
 */
public class VideoDescriptions {

    /**
     * 自定义gop时长，单位秒，有效取值[0,10]. 默认值0，表示跟随源流，不支持7和9，值无效时按默认值处理
     */
    public static final class GopDurationSecondsEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final GopDurationSecondsEnum NUMBER_0 = new GopDurationSecondsEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final GopDurationSecondsEnum NUMBER_1 = new GopDurationSecondsEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final GopDurationSecondsEnum NUMBER_2 = new GopDurationSecondsEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final GopDurationSecondsEnum NUMBER_3 = new GopDurationSecondsEnum(3);

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final GopDurationSecondsEnum NUMBER_4 = new GopDurationSecondsEnum(4);

        /**
         * Enum NUMBER_5 for value: 5
         */
        public static final GopDurationSecondsEnum NUMBER_5 = new GopDurationSecondsEnum(5);

        /**
         * Enum NUMBER_6 for value: 6
         */
        public static final GopDurationSecondsEnum NUMBER_6 = new GopDurationSecondsEnum(6);

        /**
         * Enum NUMBER_8 for value: 8
         */
        public static final GopDurationSecondsEnum NUMBER_8 = new GopDurationSecondsEnum(8);

        /**
         * Enum NUMBER_10 for value: 10
         */
        public static final GopDurationSecondsEnum NUMBER_10 = new GopDurationSecondsEnum(10);

        private static final Map<Integer, GopDurationSecondsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, GopDurationSecondsEnum> createStaticFields() {
            Map<Integer, GopDurationSecondsEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            map.put(4, NUMBER_4);
            map.put(5, NUMBER_5);
            map.put(6, NUMBER_6);
            map.put(8, NUMBER_8);
            map.put(10, NUMBER_10);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        GopDurationSecondsEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static GopDurationSecondsEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new GopDurationSecondsEnum(value));
        }

        public static GopDurationSecondsEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GopDurationSecondsEnum) {
                return this.value.equals(((GopDurationSecondsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gop_duration_seconds")

    private GopDurationSecondsEnum gopDurationSeconds;

    public VideoDescriptions withGopDurationSeconds(GopDurationSecondsEnum gopDurationSeconds) {
        this.gopDurationSeconds = gopDurationSeconds;
        return this;
    }

    /**
     * 自定义gop时长，单位秒，有效取值[0,10]. 默认值0，表示跟随源流，不支持7和9，值无效时按默认值处理
     * minimum: 0
     * maximum: 10
     * @return gopDurationSeconds
     */
    public GopDurationSecondsEnum getGopDurationSeconds() {
        return gopDurationSeconds;
    }

    public void setGopDurationSeconds(GopDurationSecondsEnum gopDurationSeconds) {
        this.gopDurationSeconds = gopDurationSeconds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoDescriptions that = (VideoDescriptions) obj;
        return Objects.equals(this.gopDurationSeconds, that.gopDurationSeconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gopDurationSeconds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoDescriptions {\n");
        sb.append("    gopDurationSeconds: ").append(toIndentedString(gopDurationSeconds)).append("\n");
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
