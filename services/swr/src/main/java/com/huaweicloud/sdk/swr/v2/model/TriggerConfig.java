package com.huaweicloud.sdk.swr.v2.model;

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
 * TriggerConfig
 */
public class TriggerConfig {

    /**
     * 触发类型，老化规则只支持manual(手动)、scheduled(定时+手动)；同步策略支持manual(手动)、scheduled(定时+手动)、event_based(事件触发+手动);镜像签名支持manual(手动)、event_based(事件触发+手动)
     */
    public static final class TypeEnum {

        /**
         * Enum MANUAL for value: "manual"
         */
        public static final TypeEnum MANUAL = new TypeEnum("manual");

        /**
         * Enum SCHEDULED for value: "scheduled"
         */
        public static final TypeEnum SCHEDULED = new TypeEnum("scheduled");

        /**
         * Enum EVENT_BASED for value: "event_based"
         */
        public static final TypeEnum EVENT_BASED = new TypeEnum("event_based");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("manual", MANUAL);
            map.put("scheduled", SCHEDULED);
            map.put("event_based", EVENT_BASED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_settings")

    private TriggerSetting triggerSettings;

    public TriggerConfig withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 触发类型，老化规则只支持manual(手动)、scheduled(定时+手动)；同步策略支持manual(手动)、scheduled(定时+手动)、event_based(事件触发+手动);镜像签名支持manual(手动)、event_based(事件触发+手动)
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public TriggerConfig withTriggerSettings(TriggerSetting triggerSettings) {
        this.triggerSettings = triggerSettings;
        return this;
    }

    public TriggerConfig withTriggerSettings(Consumer<TriggerSetting> triggerSettingsSetter) {
        if (this.triggerSettings == null) {
            this.triggerSettings = new TriggerSetting();
            triggerSettingsSetter.accept(this.triggerSettings);
        }

        return this;
    }

    /**
     * Get triggerSettings
     * @return triggerSettings
     */
    public TriggerSetting getTriggerSettings() {
        return triggerSettings;
    }

    public void setTriggerSettings(TriggerSetting triggerSettings) {
        this.triggerSettings = triggerSettings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TriggerConfig that = (TriggerConfig) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.triggerSettings, that.triggerSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, triggerSettings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TriggerConfig {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    triggerSettings: ").append(toIndentedString(triggerSettings)).append("\n");
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
