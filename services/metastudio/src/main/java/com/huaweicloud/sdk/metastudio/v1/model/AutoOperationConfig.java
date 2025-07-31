package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 资产自动处理任务配置。
 */
public class AutoOperationConfig {

    /**
     * BLOCK: 冻结 DELETE：删除
     */
    public static final class OperationEnum {

        /**
         * Enum BLOCK for value: "BLOCK"
         */
        public static final OperationEnum BLOCK = new OperationEnum("BLOCK");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final OperationEnum DELETE = new OperationEnum("DELETE");

        private static final Map<String, OperationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationEnum> createStaticFields() {
            Map<String, OperationEnum> map = new HashMap<>();
            map.put("BLOCK", BLOCK);
            map.put("DELETE", DELETE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationEnum(String value) {
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
        public static OperationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperationEnum(value));
        }

        public static OperationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperationEnum) {
                return this.value.equals(((OperationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private OperationEnum operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_time")

    private String operationTime;

    public AutoOperationConfig withOperation(OperationEnum operation) {
        this.operation = operation;
        return this;
    }

    /**
     * BLOCK: 冻结 DELETE：删除
     * @return operation
     */
    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(OperationEnum operation) {
        this.operation = operation;
    }

    public AutoOperationConfig withOperationTime(String operationTime) {
        this.operationTime = operationTime;
        return this;
    }

    /**
     * 资源过期时间，格式遵循：RFC 3339 如\"2025-01-10T00:00:00Z\"
     * @return operationTime
     */
    public String getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoOperationConfig that = (AutoOperationConfig) obj;
        return Objects.equals(this.operation, that.operation) && Objects.equals(this.operationTime, that.operationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation, operationTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoOperationConfig {\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    operationTime: ").append(toIndentedString(operationTime)).append("\n");
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
