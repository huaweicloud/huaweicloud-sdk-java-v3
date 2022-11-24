package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class SetQosThresholdRequest {

    /**
     * 阈值类型： * AUDIO：音频相关阈值 * VIDEO：视频相关阈值 * SCREEN：屏幕共享相关阈值 * CPU：CPU相关阈值
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private SetQosThresholdReq body;

    public SetQosThresholdRequest withThresholdType(ThresholdTypeEnum thresholdType) {
        this.thresholdType = thresholdType;
        return this;
    }

    /**
     * 阈值类型： * AUDIO：音频相关阈值 * VIDEO：视频相关阈值 * SCREEN：屏幕共享相关阈值 * CPU：CPU相关阈值
     * @return thresholdType
     */
    public ThresholdTypeEnum getThresholdType() {
        return thresholdType;
    }

    public void setThresholdType(ThresholdTypeEnum thresholdType) {
        this.thresholdType = thresholdType;
    }

    public SetQosThresholdRequest withBody(SetQosThresholdReq body) {
        this.body = body;
        return this;
    }

    public SetQosThresholdRequest withBody(Consumer<SetQosThresholdReq> bodySetter) {
        if (this.body == null) {
            this.body = new SetQosThresholdReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public SetQosThresholdReq getBody() {
        return body;
    }

    public void setBody(SetQosThresholdReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetQosThresholdRequest setQosThresholdRequest = (SetQosThresholdRequest) o;
        return Objects.equals(this.thresholdType, setQosThresholdRequest.thresholdType)
            && Objects.equals(this.body, setQosThresholdRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(thresholdType, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetQosThresholdRequest {\n");
        sb.append("    thresholdType: ").append(toIndentedString(thresholdType)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
