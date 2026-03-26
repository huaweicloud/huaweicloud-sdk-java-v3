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
 * CapacityReservationSpecification
 */
public class CapacityReservationSpecification {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * 实例启动的私有池容量选项
     */
    public static final class PreferenceEnum {

        /**
         * Enum NONE for value: "none"
         */
        public static final PreferenceEnum NONE = new PreferenceEnum("none");

        /**
         * Enum TARGETED for value: "targeted"
         */
        public static final PreferenceEnum TARGETED = new PreferenceEnum("targeted");

        private static final Map<String, PreferenceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PreferenceEnum> createStaticFields() {
            Map<String, PreferenceEnum> map = new HashMap<>();
            map.put("none", NONE);
            map.put("targeted", TARGETED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PreferenceEnum(String value) {
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
        public static PreferenceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PreferenceEnum(value));
        }

        public static PreferenceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PreferenceEnum) {
                return this.value.equals(((PreferenceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preference")

    private PreferenceEnum preference;

    public CapacityReservationSpecification withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 目标容量预留ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CapacityReservationSpecification withPreference(PreferenceEnum preference) {
        this.preference = preference;
        return this;
    }

    /**
     * 实例启动的私有池容量选项
     * @return preference
     */
    public PreferenceEnum getPreference() {
        return preference;
    }

    public void setPreference(PreferenceEnum preference) {
        this.preference = preference;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CapacityReservationSpecification that = (CapacityReservationSpecification) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.preference, that.preference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, preference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CapacityReservationSpecification {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    preference: ").append(toIndentedString(preference)).append("\n");
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
