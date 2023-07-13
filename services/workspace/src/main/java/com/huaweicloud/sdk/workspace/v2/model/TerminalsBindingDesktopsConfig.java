package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * TerminalsBindingDesktopsConfig
 */
public class TerminalsBindingDesktopsConfig {

    /**
     * 绑定开关,只取值on或off
     */
    public static final class TcBindSwitchEnum {

        /**
         * Enum ON for value: "ON"
         */
        public static final TcBindSwitchEnum ON = new TcBindSwitchEnum("ON");

        /**
         * Enum OFF for value: "OFF"
         */
        public static final TcBindSwitchEnum OFF = new TcBindSwitchEnum("OFF");

        private static final Map<String, TcBindSwitchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TcBindSwitchEnum> createStaticFields() {
            Map<String, TcBindSwitchEnum> map = new HashMap<>();
            map.put("ON", ON);
            map.put("OFF", OFF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TcBindSwitchEnum(String value) {
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
        public static TcBindSwitchEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TcBindSwitchEnum(value));
        }

        public static TcBindSwitchEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TcBindSwitchEnum) {
                return this.value.equals(((TcBindSwitchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tc_bind_switch")

    private TcBindSwitchEnum tcBindSwitch;

    public TerminalsBindingDesktopsConfig withTcBindSwitch(TcBindSwitchEnum tcBindSwitch) {
        this.tcBindSwitch = tcBindSwitch;
        return this;
    }

    /**
     * 绑定开关,只取值on或off
     * @return tcBindSwitch
     */
    public TcBindSwitchEnum getTcBindSwitch() {
        return tcBindSwitch;
    }

    public void setTcBindSwitch(TcBindSwitchEnum tcBindSwitch) {
        this.tcBindSwitch = tcBindSwitch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TerminalsBindingDesktopsConfig that = (TerminalsBindingDesktopsConfig) obj;
        return Objects.equals(this.tcBindSwitch, that.tcBindSwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tcBindSwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TerminalsBindingDesktopsConfig {\n");
        sb.append("    tcBindSwitch: ").append(toIndentedString(tcBindSwitch)).append("\n");
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
