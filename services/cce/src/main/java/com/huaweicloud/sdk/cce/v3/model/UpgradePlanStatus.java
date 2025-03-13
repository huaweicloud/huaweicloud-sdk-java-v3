package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UpgradePlanStatus
 */
public class UpgradePlanStatus {

    /**
     * 自动升级计划状态 
     */
    public static final class PhaseEnum {

        /**
         * Enum PENDING for value: "Pending"
         */
        public static final PhaseEnum PENDING = new PhaseEnum("Pending");

        /**
         * Enum ENQUEUED for value: "Enqueued"
         */
        public static final PhaseEnum ENQUEUED = new PhaseEnum("Enqueued");

        /**
         * Enum UPGRADING for value: "Upgrading"
         */
        public static final PhaseEnum UPGRADING = new PhaseEnum("Upgrading");

        /**
         * Enum SUCCESS for value: "Success"
         */
        public static final PhaseEnum SUCCESS = new PhaseEnum("Success");

        /**
         * Enum FAILED for value: "Failed"
         */
        public static final PhaseEnum FAILED = new PhaseEnum("Failed");

        /**
         * Enum SKIPPED for value: "Skipped"
         */
        public static final PhaseEnum SKIPPED = new PhaseEnum("Skipped");

        private static final Map<String, PhaseEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PhaseEnum> createStaticFields() {
            Map<String, PhaseEnum> map = new HashMap<>();
            map.put("Pending", PENDING);
            map.put("Enqueued", ENQUEUED);
            map.put("Upgrading", UPGRADING);
            map.put("Success", SUCCESS);
            map.put("Failed", FAILED);
            map.put("Skipped", SKIPPED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PhaseEnum(String value) {
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
        public static PhaseEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PhaseEnum(value));
        }

        public static PhaseEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PhaseEnum) {
                return this.value.equals(((PhaseEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private PhaseEnum phase;

    public UpgradePlanStatus withPhase(PhaseEnum phase) {
        this.phase = phase;
        return this;
    }

    /**
     * 自动升级计划状态 
     * @return phase
     */
    public PhaseEnum getPhase() {
        return phase;
    }

    public void setPhase(PhaseEnum phase) {
        this.phase = phase;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradePlanStatus that = (UpgradePlanStatus) obj;
        return Objects.equals(this.phase, that.phase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradePlanStatus {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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
