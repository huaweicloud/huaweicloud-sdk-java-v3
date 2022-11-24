package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowQosThresholdRequest {

    /**
     * 阈值类型。 * AUDIO：音频告警阈值 * VIDEO：视频告警阈值 * SCREEN：屏幕共享告警阈值 * CPU：CPU告警阈值
     */
    public static final class ThresholdTypeEnum {

        /**
         * Enum AUDIO for value: "AUDIO"
         */
        public static final ThresholdTypeEnum AUDIO = new ThresholdTypeEnum("AUDIO");

        /**
         * Enum VIDEO for value: "VIDEO"
         */
        public static final ThresholdTypeEnum VIDEO = new ThresholdTypeEnum("VIDEO");

        /**
         * Enum SCREEN for value: "SCREEN"
         */
        public static final ThresholdTypeEnum SCREEN = new ThresholdTypeEnum("SCREEN");

        /**
         * Enum CPU for value: "CPU"
         */
        public static final ThresholdTypeEnum CPU = new ThresholdTypeEnum("CPU");

        private static final Map<String, ThresholdTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ThresholdTypeEnum> createStaticFields() {
            Map<String, ThresholdTypeEnum> map = new HashMap<>();
            map.put("AUDIO", AUDIO);
            map.put("VIDEO", VIDEO);
            map.put("SCREEN", SCREEN);
            map.put("CPU", CPU);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ThresholdTypeEnum(String value) {
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
        public static ThresholdTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ThresholdTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ThresholdTypeEnum(value);
            }
            return result;
        }

        public static ThresholdTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ThresholdTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ThresholdTypeEnum) {
                return this.value.equals(((ThresholdTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thresholdType")

    private ThresholdTypeEnum thresholdType;

    public ShowQosThresholdRequest withThresholdType(ThresholdTypeEnum thresholdType) {
        this.thresholdType = thresholdType;
        return this;
    }

    /**
     * 阈值类型。 * AUDIO：音频告警阈值 * VIDEO：视频告警阈值 * SCREEN：屏幕共享告警阈值 * CPU：CPU告警阈值
     * @return thresholdType
     */
    public ThresholdTypeEnum getThresholdType() {
        return thresholdType;
    }

    public void setThresholdType(ThresholdTypeEnum thresholdType) {
        this.thresholdType = thresholdType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowQosThresholdRequest showQosThresholdRequest = (ShowQosThresholdRequest) o;
        return Objects.equals(this.thresholdType, showQosThresholdRequest.thresholdType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(thresholdType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQosThresholdRequest {\n");
        sb.append("    thresholdType: ").append(toIndentedString(thresholdType)).append("\n");
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
