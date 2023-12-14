package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DeleteLogConfigs
 */
public class DeleteLogConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * 日志类型。
     */
    public static final class LogTypeEnum {

        /**
         * Enum ERROR_LOG for value: "error_log"
         */
        public static final LogTypeEnum ERROR_LOG = new LogTypeEnum("error_log");

        /**
         * Enum SLOW_LOG for value: "slow_log"
         */
        public static final LogTypeEnum SLOW_LOG = new LogTypeEnum("slow_log");

        /**
         * Enum AUDIT_LOG for value: "audit_log"
         */
        public static final LogTypeEnum AUDIT_LOG = new LogTypeEnum("audit_log");

        private static final Map<String, LogTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LogTypeEnum> createStaticFields() {
            Map<String, LogTypeEnum> map = new HashMap<>();
            map.put("error_log", ERROR_LOG);
            map.put("slow_log", SLOW_LOG);
            map.put("audit_log", AUDIT_LOG);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LogTypeEnum(String value) {
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
        public static LogTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LogTypeEnum(value));
        }

        public static LogTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LogTypeEnum) {
                return this.value.equals(((LogTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_type")

    private LogTypeEnum logType;

    public DeleteLogConfigs withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DeleteLogConfigs withLogType(LogTypeEnum logType) {
        this.logType = logType;
        return this;
    }

    /**
     * 日志类型。
     * @return logType
     */
    public LogTypeEnum getLogType() {
        return logType;
    }

    public void setLogType(LogTypeEnum logType) {
        this.logType = logType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteLogConfigs that = (DeleteLogConfigs) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.logType, that.logType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, logType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteLogConfigs {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
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
