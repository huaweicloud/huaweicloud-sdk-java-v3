package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowSecondLevelMonitoringResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_option")

    private Boolean switchOption;

    /**
     * 监控间隔, 支持1秒和5秒
     */
    public static final class IntervalEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final IntervalEnum NUMBER_1 = new IntervalEnum(1);

        /**
         * Enum NUMBER_5 for value: 5
         */
        public static final IntervalEnum NUMBER_5 = new IntervalEnum(5);

        private static final Map<Integer, IntervalEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IntervalEnum> createStaticFields() {
            Map<Integer, IntervalEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(5, NUMBER_5);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        IntervalEnum(Integer value) {
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
        public static IntervalEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            IntervalEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IntervalEnum(value);
            }
            return result;
        }

        public static IntervalEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            IntervalEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IntervalEnum) {
                return this.value.equals(((IntervalEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private IntervalEnum interval;

    public ShowSecondLevelMonitoringResponse withSwitchOption(Boolean switchOption) {
        this.switchOption = switchOption;
        return this;
    }

    /**
     * 秒级监控开关
     * @return switchOption
     */
    public Boolean getSwitchOption() {
        return switchOption;
    }

    public void setSwitchOption(Boolean switchOption) {
        this.switchOption = switchOption;
    }

    public ShowSecondLevelMonitoringResponse withInterval(IntervalEnum interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 监控间隔, 支持1秒和5秒
     * @return interval
     */
    public IntervalEnum getInterval() {
        return interval;
    }

    public void setInterval(IntervalEnum interval) {
        this.interval = interval;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSecondLevelMonitoringResponse showSecondLevelMonitoringResponse = (ShowSecondLevelMonitoringResponse) o;
        return Objects.equals(this.switchOption, showSecondLevelMonitoringResponse.switchOption)
            && Objects.equals(this.interval, showSecondLevelMonitoringResponse.interval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchOption, interval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSecondLevelMonitoringResponse {\n");
        sb.append("    switchOption: ").append(toIndentedString(switchOption)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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
