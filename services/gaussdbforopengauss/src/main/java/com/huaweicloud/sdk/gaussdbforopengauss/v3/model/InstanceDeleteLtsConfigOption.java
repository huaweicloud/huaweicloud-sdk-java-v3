package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * InstanceDeleteLtsConfigOption
 */
public class InstanceDeleteLtsConfigOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * **参数解释**: 日志类型。 **约束限制**: 不涉及。 **取值范围**: - audit_log：审计日志。  **默认取值**: 不涉及。
     */
    public static final class LogTypeEnum {

        /**
         * Enum AUDIT_LOG for value: "audit_log"
         */
        public static final LogTypeEnum AUDIT_LOG = new LogTypeEnum("audit_log");

        private static final Map<String, LogTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LogTypeEnum> createStaticFields() {
            Map<String, LogTypeEnum> map = new HashMap<>();
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

    public InstanceDeleteLtsConfigOption withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**: 实例ID。 **约束限制**: 不涉及。 **取值范围**: 只能由英文字母、数字组成，且长度为36个字符。 **默认取值**: 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceDeleteLtsConfigOption withLogType(LogTypeEnum logType) {
        this.logType = logType;
        return this;
    }

    /**
     * **参数解释**: 日志类型。 **约束限制**: 不涉及。 **取值范围**: - audit_log：审计日志。  **默认取值**: 不涉及。
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
        InstanceDeleteLtsConfigOption that = (InstanceDeleteLtsConfigOption) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.logType, that.logType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, logType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceDeleteLtsConfigOption {\n");
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
