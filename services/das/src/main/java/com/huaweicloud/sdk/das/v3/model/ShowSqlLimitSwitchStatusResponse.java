package com.huaweicloud.sdk.das.v3.model;

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
public class ShowSqlLimitSwitchStatusResponse extends SdkResponse {

    /**
     * 开关状态
     */
    public static final class SwitchStatusEnum {

        /**
         * Enum ON for value: "ON"
         */
        public static final SwitchStatusEnum ON = new SwitchStatusEnum("ON");

        /**
         * Enum OFF for value: "OFF"
         */
        public static final SwitchStatusEnum OFF = new SwitchStatusEnum("OFF");

        private static final Map<String, SwitchStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SwitchStatusEnum> createStaticFields() {
            Map<String, SwitchStatusEnum> map = new HashMap<>();
            map.put("ON", ON);
            map.put("OFF", OFF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SwitchStatusEnum(String value) {
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
        public static SwitchStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SwitchStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SwitchStatusEnum(value);
            }
            return result;
        }

        public static SwitchStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SwitchStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SwitchStatusEnum) {
                return this.value.equals(((SwitchStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_status")

    private SwitchStatusEnum switchStatus;

    public ShowSqlLimitSwitchStatusResponse withSwitchStatus(SwitchStatusEnum switchStatus) {
        this.switchStatus = switchStatus;
        return this;
    }

    /**
     * 开关状态
     * @return switchStatus
     */
    public SwitchStatusEnum getSwitchStatus() {
        return switchStatus;
    }

    public void setSwitchStatus(SwitchStatusEnum switchStatus) {
        this.switchStatus = switchStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSqlLimitSwitchStatusResponse showSqlLimitSwitchStatusResponse = (ShowSqlLimitSwitchStatusResponse) o;
        return Objects.equals(this.switchStatus, showSqlLimitSwitchStatusResponse.switchStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSqlLimitSwitchStatusResponse {\n");
        sb.append("    switchStatus: ").append(toIndentedString(switchStatus)).append("\n");
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
