package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListTerminalsBindingDesktopsConfigResponse extends SdkResponse {

    /**
     * 绑定开关，只取值ON或OFF
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

    /**
     * 自动绑定开关，只取值ON或OFF
     */
    public static final class TcAutoBindSwitchEnum {

        /**
         * Enum ON for value: "ON"
         */
        public static final TcAutoBindSwitchEnum ON = new TcAutoBindSwitchEnum("ON");

        /**
         * Enum OFF for value: "OFF"
         */
        public static final TcAutoBindSwitchEnum OFF = new TcAutoBindSwitchEnum("OFF");

        private static final Map<String, TcAutoBindSwitchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TcAutoBindSwitchEnum> createStaticFields() {
            Map<String, TcAutoBindSwitchEnum> map = new HashMap<>();
            map.put("ON", ON);
            map.put("OFF", OFF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TcAutoBindSwitchEnum(String value) {
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
        public static TcAutoBindSwitchEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TcAutoBindSwitchEnum(value));
        }

        public static TcAutoBindSwitchEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TcAutoBindSwitchEnum) {
                return this.value.equals(((TcAutoBindSwitchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tc_auto_bind_switch")

    private TcAutoBindSwitchEnum tcAutoBindSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tc_auto_bind_max")

    private Integer tcAutoBindMax;

    public ListTerminalsBindingDesktopsConfigResponse withTcBindSwitch(TcBindSwitchEnum tcBindSwitch) {
        this.tcBindSwitch = tcBindSwitch;
        return this;
    }

    /**
     * 绑定开关，只取值ON或OFF
     * @return tcBindSwitch
     */
    public TcBindSwitchEnum getTcBindSwitch() {
        return tcBindSwitch;
    }

    public void setTcBindSwitch(TcBindSwitchEnum tcBindSwitch) {
        this.tcBindSwitch = tcBindSwitch;
    }

    public ListTerminalsBindingDesktopsConfigResponse withTcAutoBindSwitch(TcAutoBindSwitchEnum tcAutoBindSwitch) {
        this.tcAutoBindSwitch = tcAutoBindSwitch;
        return this;
    }

    /**
     * 自动绑定开关，只取值ON或OFF
     * @return tcAutoBindSwitch
     */
    public TcAutoBindSwitchEnum getTcAutoBindSwitch() {
        return tcAutoBindSwitch;
    }

    public void setTcAutoBindSwitch(TcAutoBindSwitchEnum tcAutoBindSwitch) {
        this.tcAutoBindSwitch = tcAutoBindSwitch;
    }

    public ListTerminalsBindingDesktopsConfigResponse withTcAutoBindMax(Integer tcAutoBindMax) {
        this.tcAutoBindMax = tcAutoBindMax;
        return this;
    }

    /**
     * 最大绑定数量，默认值为1
     * minimum: 1
     * maximum: 10
     * @return tcAutoBindMax
     */
    public Integer getTcAutoBindMax() {
        return tcAutoBindMax;
    }

    public void setTcAutoBindMax(Integer tcAutoBindMax) {
        this.tcAutoBindMax = tcAutoBindMax;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTerminalsBindingDesktopsConfigResponse that = (ListTerminalsBindingDesktopsConfigResponse) obj;
        return Objects.equals(this.tcBindSwitch, that.tcBindSwitch)
            && Objects.equals(this.tcAutoBindSwitch, that.tcAutoBindSwitch)
            && Objects.equals(this.tcAutoBindMax, that.tcAutoBindMax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tcBindSwitch, tcAutoBindSwitch, tcAutoBindMax);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTerminalsBindingDesktopsConfigResponse {\n");
        sb.append("    tcBindSwitch: ").append(toIndentedString(tcBindSwitch)).append("\n");
        sb.append("    tcAutoBindSwitch: ").append(toIndentedString(tcAutoBindSwitch)).append("\n");
        sb.append("    tcAutoBindMax: ").append(toIndentedString(tcAutoBindMax)).append("\n");
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
