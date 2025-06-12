package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UpdateRecycleBinOption
 */
public class UpdateRecycleBinOption {

    /**
     * 回收站开启开关
     */
    public static final class SwitchEnum {

        /**
         * Enum ON for value: "on"
         */
        public static final SwitchEnum ON = new SwitchEnum("on");

        /**
         * Enum OFF for value: "off"
         */
        public static final SwitchEnum OFF = new SwitchEnum("off");

        private static final Map<String, SwitchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SwitchEnum> createStaticFields() {
            Map<String, SwitchEnum> map = new HashMap<>();
            map.put("on", ON);
            map.put("off", OFF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SwitchEnum(String value) {
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
        public static SwitchEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SwitchEnum(value));
        }

        public static SwitchEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SwitchEnum) {
                return this.value.equals(((SwitchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch")

    private SwitchEnum _switch;

    public UpdateRecycleBinOption withSwitch(SwitchEnum _switch) {
        this._switch = _switch;
        return this;
    }

    /**
     * 回收站开启开关
     * @return _switch
     */
    public SwitchEnum getSwitch() {
        return _switch;
    }

    public void setSwitch(SwitchEnum _switch) {
        this._switch = _switch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateRecycleBinOption that = (UpdateRecycleBinOption) obj;
        return Objects.equals(this._switch, that._switch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_switch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRecycleBinOption {\n");
        sb.append("    _switch: ").append(toIndentedString(_switch)).append("\n");
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
