package com.huaweicloud.sdk.workspaceapp.v1.model;

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
 * Sbc
 */
public class Sbc {

    /**
     * 连接策略。 - DISABLED：已禁用 - AUTO_DISCONNECT：自动断开 - AUTO_LOCK：自动锁屏
     */
    public static final class SbcAutomaticDisconnectionEnum {

        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final SbcAutomaticDisconnectionEnum DISABLED = new SbcAutomaticDisconnectionEnum("DISABLED");

        /**
         * Enum AUTO_DISCONNECT for value: "AUTO_DISCONNECT"
         */
        public static final SbcAutomaticDisconnectionEnum AUTO_DISCONNECT =
            new SbcAutomaticDisconnectionEnum("AUTO_DISCONNECT");

        /**
         * Enum AUTO_LOCK for value: "AUTO_LOCK"
         */
        public static final SbcAutomaticDisconnectionEnum AUTO_LOCK = new SbcAutomaticDisconnectionEnum("AUTO_LOCK");

        private static final Map<String, SbcAutomaticDisconnectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SbcAutomaticDisconnectionEnum> createStaticFields() {
            Map<String, SbcAutomaticDisconnectionEnum> map = new HashMap<>();
            map.put("DISABLED", DISABLED);
            map.put("AUTO_DISCONNECT", AUTO_DISCONNECT);
            map.put("AUTO_LOCK", AUTO_LOCK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SbcAutomaticDisconnectionEnum(String value) {
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
        public static SbcAutomaticDisconnectionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new SbcAutomaticDisconnectionEnum(value));
        }

        public static SbcAutomaticDisconnectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SbcAutomaticDisconnectionEnum) {
                return this.value.equals(((SbcAutomaticDisconnectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sbc_automatic_disconnection")

    private SbcAutomaticDisconnectionEnum sbcAutomaticDisconnection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sbc_automatic_disconnection_options")

    private SbcAutomaticDisconnectionOptions sbcAutomaticDisconnectionOptions;

    public Sbc withSbcAutomaticDisconnection(SbcAutomaticDisconnectionEnum sbcAutomaticDisconnection) {
        this.sbcAutomaticDisconnection = sbcAutomaticDisconnection;
        return this;
    }

    /**
     * 连接策略。 - DISABLED：已禁用 - AUTO_DISCONNECT：自动断开 - AUTO_LOCK：自动锁屏
     * @return sbcAutomaticDisconnection
     */
    public SbcAutomaticDisconnectionEnum getSbcAutomaticDisconnection() {
        return sbcAutomaticDisconnection;
    }

    public void setSbcAutomaticDisconnection(SbcAutomaticDisconnectionEnum sbcAutomaticDisconnection) {
        this.sbcAutomaticDisconnection = sbcAutomaticDisconnection;
    }

    public Sbc withSbcAutomaticDisconnectionOptions(SbcAutomaticDisconnectionOptions sbcAutomaticDisconnectionOptions) {
        this.sbcAutomaticDisconnectionOptions = sbcAutomaticDisconnectionOptions;
        return this;
    }

    public Sbc withSbcAutomaticDisconnectionOptions(
        Consumer<SbcAutomaticDisconnectionOptions> sbcAutomaticDisconnectionOptionsSetter) {
        if (this.sbcAutomaticDisconnectionOptions == null) {
            this.sbcAutomaticDisconnectionOptions = new SbcAutomaticDisconnectionOptions();
            sbcAutomaticDisconnectionOptionsSetter.accept(this.sbcAutomaticDisconnectionOptions);
        }

        return this;
    }

    /**
     * Get sbcAutomaticDisconnectionOptions
     * @return sbcAutomaticDisconnectionOptions
     */
    public SbcAutomaticDisconnectionOptions getSbcAutomaticDisconnectionOptions() {
        return sbcAutomaticDisconnectionOptions;
    }

    public void setSbcAutomaticDisconnectionOptions(SbcAutomaticDisconnectionOptions sbcAutomaticDisconnectionOptions) {
        this.sbcAutomaticDisconnectionOptions = sbcAutomaticDisconnectionOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Sbc that = (Sbc) obj;
        return Objects.equals(this.sbcAutomaticDisconnection, that.sbcAutomaticDisconnection)
            && Objects.equals(this.sbcAutomaticDisconnectionOptions, that.sbcAutomaticDisconnectionOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sbcAutomaticDisconnection, sbcAutomaticDisconnectionOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Sbc {\n");
        sb.append("    sbcAutomaticDisconnection: ").append(toIndentedString(sbcAutomaticDisconnection)).append("\n");
        sb.append("    sbcAutomaticDisconnectionOptions: ")
            .append(toIndentedString(sbcAutomaticDisconnectionOptions))
            .append("\n");
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
