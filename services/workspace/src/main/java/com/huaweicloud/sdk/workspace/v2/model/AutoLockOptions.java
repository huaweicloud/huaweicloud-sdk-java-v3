package com.huaweicloud.sdk.workspace.v2.model;

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
 * AutoLockOptions
 */
public class AutoLockOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_lock_minutes")

    private Integer autoLockMinutes;

    /**
     * 自动断开或注销。取值为：AUTO_DISCONNECT：自动断开。AUTO_LOGOUT：自动注销。DISABLED：已禁用。（默认）AUTO_RESTART：自动重启。AUTO_STOP：自动停止。HIBERNATE:休眠。
     */
    public static final class AutoDisconnectEnum {

        /**
         * Enum AUTO_DISCONNECT for value: "AUTO_DISCONNECT"
         */
        public static final AutoDisconnectEnum AUTO_DISCONNECT = new AutoDisconnectEnum("AUTO_DISCONNECT");

        /**
         * Enum AUTO_LOGOUT for value: "AUTO_LOGOUT"
         */
        public static final AutoDisconnectEnum AUTO_LOGOUT = new AutoDisconnectEnum("AUTO_LOGOUT");

        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final AutoDisconnectEnum DISABLED = new AutoDisconnectEnum("DISABLED");

        /**
         * Enum AUTO_RESTART for value: "AUTO_RESTART"
         */
        public static final AutoDisconnectEnum AUTO_RESTART = new AutoDisconnectEnum("AUTO_RESTART");

        /**
         * Enum AUTO_STOP for value: "AUTO_STOP"
         */
        public static final AutoDisconnectEnum AUTO_STOP = new AutoDisconnectEnum("AUTO_STOP");

        /**
         * Enum HIBERNATE for value: "HIBERNATE"
         */
        public static final AutoDisconnectEnum HIBERNATE = new AutoDisconnectEnum("HIBERNATE");

        private static final Map<String, AutoDisconnectEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AutoDisconnectEnum> createStaticFields() {
            Map<String, AutoDisconnectEnum> map = new HashMap<>();
            map.put("AUTO_DISCONNECT", AUTO_DISCONNECT);
            map.put("AUTO_LOGOUT", AUTO_LOGOUT);
            map.put("DISABLED", DISABLED);
            map.put("AUTO_RESTART", AUTO_RESTART);
            map.put("AUTO_STOP", AUTO_STOP);
            map.put("HIBERNATE", HIBERNATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AutoDisconnectEnum(String value) {
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
        public static AutoDisconnectEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AutoDisconnectEnum(value));
        }

        public static AutoDisconnectEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AutoDisconnectEnum) {
                return this.value.equals(((AutoDisconnectEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_disconnect")

    private AutoDisconnectEnum autoDisconnect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private AutoDisconnectOrLogoutControlOptions options;

    public AutoLockOptions withAutoLockMinutes(Integer autoLockMinutes) {
        this.autoLockMinutes = autoLockMinutes;
        return this;
    }

    /**
     * 锁屏等待时间（分钟）。取值范围为[3-86400]。默认：10。
     * minimum: 3
     * maximum: 86400
     * @return autoLockMinutes
     */
    public Integer getAutoLockMinutes() {
        return autoLockMinutes;
    }

    public void setAutoLockMinutes(Integer autoLockMinutes) {
        this.autoLockMinutes = autoLockMinutes;
    }

    public AutoLockOptions withAutoDisconnect(AutoDisconnectEnum autoDisconnect) {
        this.autoDisconnect = autoDisconnect;
        return this;
    }

    /**
     * 自动断开或注销。取值为：AUTO_DISCONNECT：自动断开。AUTO_LOGOUT：自动注销。DISABLED：已禁用。（默认）AUTO_RESTART：自动重启。AUTO_STOP：自动停止。HIBERNATE:休眠。
     * @return autoDisconnect
     */
    public AutoDisconnectEnum getAutoDisconnect() {
        return autoDisconnect;
    }

    public void setAutoDisconnect(AutoDisconnectEnum autoDisconnect) {
        this.autoDisconnect = autoDisconnect;
    }

    public AutoLockOptions withOptions(AutoDisconnectOrLogoutControlOptions options) {
        this.options = options;
        return this;
    }

    public AutoLockOptions withOptions(Consumer<AutoDisconnectOrLogoutControlOptions> optionsSetter) {
        if (this.options == null) {
            this.options = new AutoDisconnectOrLogoutControlOptions();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public AutoDisconnectOrLogoutControlOptions getOptions() {
        return options;
    }

    public void setOptions(AutoDisconnectOrLogoutControlOptions options) {
        this.options = options;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoLockOptions that = (AutoLockOptions) obj;
        return Objects.equals(this.autoLockMinutes, that.autoLockMinutes)
            && Objects.equals(this.autoDisconnect, that.autoDisconnect) && Objects.equals(this.options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoLockMinutes, autoDisconnect, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoLockOptions {\n");
        sb.append("    autoLockMinutes: ").append(toIndentedString(autoLockMinutes)).append("\n");
        sb.append("    autoDisconnect: ").append(toIndentedString(autoDisconnect)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
