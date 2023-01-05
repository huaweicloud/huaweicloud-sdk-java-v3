package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UpdateTriggerRequestBody
 */
public class UpdateTriggerRequestBody {

    /**
     * 触发器状态
     */
    public static final class TriggerStatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final TriggerStatusEnum ACTIVE = new TriggerStatusEnum("ACTIVE");

        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final TriggerStatusEnum DISABLED = new TriggerStatusEnum("DISABLED");

        private static final Map<String, TriggerStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TriggerStatusEnum> createStaticFields() {
            Map<String, TriggerStatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("DISABLED", DISABLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TriggerStatusEnum(String value) {
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
        public static TriggerStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TriggerStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TriggerStatusEnum(value);
            }
            return result;
        }

        public static TriggerStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TriggerStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TriggerStatusEnum) {
                return this.value.equals(((TriggerStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_status")

    private TriggerStatusEnum triggerStatus;

    public UpdateTriggerRequestBody withTriggerStatus(TriggerStatusEnum triggerStatus) {
        this.triggerStatus = triggerStatus;
        return this;
    }

    /**
     * 触发器状态
     * @return triggerStatus
     */
    public TriggerStatusEnum getTriggerStatus() {
        return triggerStatus;
    }

    public void setTriggerStatus(TriggerStatusEnum triggerStatus) {
        this.triggerStatus = triggerStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTriggerRequestBody updateTriggerRequestBody = (UpdateTriggerRequestBody) o;
        return Objects.equals(this.triggerStatus, updateTriggerRequestBody.triggerStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(triggerStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTriggerRequestBody {\n");
        sb.append("    triggerStatus: ").append(toIndentedString(triggerStatus)).append("\n");
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
