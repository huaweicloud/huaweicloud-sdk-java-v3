package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * StackSetOperationStatusPrimitiveTypeHolder
 */
public class StackSetOperationStatusPrimitiveTypeHolder {

    /**
     * 资源栈集操作状态   * `QUEUE_IN_PROGRESS` - 正在排队   * `OPERATION_IN_PROGRESS` - 正在操作   * `OPERATION_COMPLETE` - 操作完成   * `OPERATION_FAILED` - 操作失败   * `STOP_IN_PROGRESS` - 正在停止   * `STOP_COMPLETE` - 停止完成   * `STOP_FAILED` - 停止失败
     */
    public static final class StatusEnum {

        /**
         * Enum QUEUE_IN_PROGRESS for value: "QUEUE_IN_PROGRESS"
         */
        public static final StatusEnum QUEUE_IN_PROGRESS = new StatusEnum("QUEUE_IN_PROGRESS");

        /**
         * Enum OPERATION_IN_PROGRESS for value: "OPERATION_IN_PROGRESS"
         */
        public static final StatusEnum OPERATION_IN_PROGRESS = new StatusEnum("OPERATION_IN_PROGRESS");

        /**
         * Enum OPERATION_COMPLETE for value: "OPERATION_COMPLETE"
         */
        public static final StatusEnum OPERATION_COMPLETE = new StatusEnum("OPERATION_COMPLETE");

        /**
         * Enum OPERATION_FAILED for value: "OPERATION_FAILED"
         */
        public static final StatusEnum OPERATION_FAILED = new StatusEnum("OPERATION_FAILED");

        /**
         * Enum STOP_IN_PROGRESS for value: "STOP_IN_PROGRESS"
         */
        public static final StatusEnum STOP_IN_PROGRESS = new StatusEnum("STOP_IN_PROGRESS");

        /**
         * Enum STOP_COMPLETE for value: "STOP_COMPLETE"
         */
        public static final StatusEnum STOP_COMPLETE = new StatusEnum("STOP_COMPLETE");

        /**
         * Enum STOP_FAILED for value: "STOP_FAILED"
         */
        public static final StatusEnum STOP_FAILED = new StatusEnum("STOP_FAILED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("QUEUE_IN_PROGRESS", QUEUE_IN_PROGRESS);
            map.put("OPERATION_IN_PROGRESS", OPERATION_IN_PROGRESS);
            map.put("OPERATION_COMPLETE", OPERATION_COMPLETE);
            map.put("OPERATION_FAILED", OPERATION_FAILED);
            map.put("STOP_IN_PROGRESS", STOP_IN_PROGRESS);
            map.put("STOP_COMPLETE", STOP_COMPLETE);
            map.put("STOP_FAILED", STOP_FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    public StackSetOperationStatusPrimitiveTypeHolder withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 资源栈集操作状态   * `QUEUE_IN_PROGRESS` - 正在排队   * `OPERATION_IN_PROGRESS` - 正在操作   * `OPERATION_COMPLETE` - 操作完成   * `OPERATION_FAILED` - 操作失败   * `STOP_IN_PROGRESS` - 正在停止   * `STOP_COMPLETE` - 停止完成   * `STOP_FAILED` - 停止失败
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StackSetOperationStatusPrimitiveTypeHolder that = (StackSetOperationStatusPrimitiveTypeHolder) obj;
        return Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StackSetOperationStatusPrimitiveTypeHolder {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
