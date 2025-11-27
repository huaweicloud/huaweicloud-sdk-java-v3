package com.huaweicloud.sdk.rfs.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * StackInstanceStatusPrimitiveTypeHolder
 */
public class StackInstanceStatusPrimitiveTypeHolder {

    /**
     * 资源栈实例的状态  * `WAIT_IN_PROGRESS` - 资源栈实例等待操作中 * `CANCEL_COMPLETE` - 资源栈实例操作取消完成 * `OPERATION_IN_PROGRESS` - 资源栈实例操作中 * `OPERATION_FAILED` - 资源栈实例操作失败 * `INOPERABLE` - 资源栈实例不可操作 * `OPERATION_COMPLETE` - 资源栈实例操作完成
     */
    public static final class StatusEnum {

        /**
         * Enum WAIT_IN_PROGRESS for value: "WAIT_IN_PROGRESS"
         */
        public static final StatusEnum WAIT_IN_PROGRESS = new StatusEnum("WAIT_IN_PROGRESS");

        /**
         * Enum CANCEL_COMPLETE for value: "CANCEL_COMPLETE"
         */
        public static final StatusEnum CANCEL_COMPLETE = new StatusEnum("CANCEL_COMPLETE");

        /**
         * Enum OPERATION_IN_PROGRESS for value: "OPERATION_IN_PROGRESS"
         */
        public static final StatusEnum OPERATION_IN_PROGRESS = new StatusEnum("OPERATION_IN_PROGRESS");

        /**
         * Enum OPERATION_FAILED for value: "OPERATION_FAILED"
         */
        public static final StatusEnum OPERATION_FAILED = new StatusEnum("OPERATION_FAILED");

        /**
         * Enum INOPERABLE for value: "INOPERABLE"
         */
        public static final StatusEnum INOPERABLE = new StatusEnum("INOPERABLE");

        /**
         * Enum OPERATION_COMPLETE for value: "OPERATION_COMPLETE"
         */
        public static final StatusEnum OPERATION_COMPLETE = new StatusEnum("OPERATION_COMPLETE");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("WAIT_IN_PROGRESS", WAIT_IN_PROGRESS);
            map.put("CANCEL_COMPLETE", CANCEL_COMPLETE);
            map.put("OPERATION_IN_PROGRESS", OPERATION_IN_PROGRESS);
            map.put("OPERATION_FAILED", OPERATION_FAILED);
            map.put("INOPERABLE", INOPERABLE);
            map.put("OPERATION_COMPLETE", OPERATION_COMPLETE);
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

    public StackInstanceStatusPrimitiveTypeHolder withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 资源栈实例的状态  * `WAIT_IN_PROGRESS` - 资源栈实例等待操作中 * `CANCEL_COMPLETE` - 资源栈实例操作取消完成 * `OPERATION_IN_PROGRESS` - 资源栈实例操作中 * `OPERATION_FAILED` - 资源栈实例操作失败 * `INOPERABLE` - 资源栈实例不可操作 * `OPERATION_COMPLETE` - 资源栈实例操作完成
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
        StackInstanceStatusPrimitiveTypeHolder that = (StackInstanceStatusPrimitiveTypeHolder) obj;
        return Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StackInstanceStatusPrimitiveTypeHolder {\n");
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
