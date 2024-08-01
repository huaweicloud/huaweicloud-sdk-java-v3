package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 提供有关分析器当前状态的更多详细信息。
 */
public class StatusReason {

    /**
     * 分析器当前状态的原因。
     */
    public static final class CodeEnum {

        /**
         * Enum DELEGATED_ADMINISTRATOR_DEREGISTERED for value: "delegated_administrator_deregistered"
         */
        public static final CodeEnum DELEGATED_ADMINISTRATOR_DEREGISTERED =
            new CodeEnum("delegated_administrator_deregistered");

        /**
         * Enum TRUSTED_SERVICE_DISABLED for value: "trusted_service_disabled"
         */
        public static final CodeEnum TRUSTED_SERVICE_DISABLED = new CodeEnum("trusted_service_disabled");

        /**
         * Enum INTERNAL_ERROR for value: "internal_error"
         */
        public static final CodeEnum INTERNAL_ERROR = new CodeEnum("internal_error");

        /**
         * Enum ORGANIZATION_DELETED for value: "organization_deleted"
         */
        public static final CodeEnum ORGANIZATION_DELETED = new CodeEnum("organization_deleted");

        /**
         * Enum SERVICE_LINKED_AGENCY_CREATION_FAILED for value: "service_linked_agency_creation_failed"
         */
        public static final CodeEnum SERVICE_LINKED_AGENCY_CREATION_FAILED =
            new CodeEnum("service_linked_agency_creation_failed");

        private static final Map<String, CodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CodeEnum> createStaticFields() {
            Map<String, CodeEnum> map = new HashMap<>();
            map.put("delegated_administrator_deregistered", DELEGATED_ADMINISTRATOR_DEREGISTERED);
            map.put("trusted_service_disabled", TRUSTED_SERVICE_DISABLED);
            map.put("internal_error", INTERNAL_ERROR);
            map.put("organization_deleted", ORGANIZATION_DELETED);
            map.put("service_linked_agency_creation_failed", SERVICE_LINKED_AGENCY_CREATION_FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CodeEnum(String value) {
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
        public static CodeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CodeEnum(value));
        }

        public static CodeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CodeEnum) {
                return this.value.equals(((CodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private CodeEnum code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "details")

    private String details;

    public StatusReason withCode(CodeEnum code) {
        this.code = code;
        return this;
    }

    /**
     * 分析器当前状态的原因。
     * @return code
     */
    public CodeEnum getCode() {
        return code;
    }

    public void setCode(CodeEnum code) {
        this.code = code;
    }

    public StatusReason withDetails(String details) {
        this.details = details;
        return this;
    }

    /**
     * 分析器当前状态的详细原因。
     * @return details
     */
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatusReason that = (StatusReason) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.details, that.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, details);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatusReason {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
