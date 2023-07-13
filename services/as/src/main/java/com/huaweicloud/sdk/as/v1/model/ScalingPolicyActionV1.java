package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 策略执行具体动作
 */
public class ScalingPolicyActionV1 {

    /**
     * 操作选项。ADD：添加实例。REMOVE/REDUCE：移除实例。SET：设置实例数为
     */
    public static final class OperationEnum {

        /**
         * Enum ADD for value: "ADD"
         */
        public static final OperationEnum ADD = new OperationEnum("ADD");

        /**
         * Enum REMOVE for value: "REMOVE"
         */
        public static final OperationEnum REMOVE = new OperationEnum("REMOVE");

        /**
         * Enum REDUCE for value: "REDUCE"
         */
        public static final OperationEnum REDUCE = new OperationEnum("REDUCE");

        /**
         * Enum SET for value: "SET"
         */
        public static final OperationEnum SET = new OperationEnum("SET");

        private static final Map<String, OperationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationEnum> createStaticFields() {
            Map<String, OperationEnum> map = new HashMap<>();
            map.put("ADD", ADD);
            map.put("REMOVE", REMOVE);
            map.put("REDUCE", REDUCE);
            map.put("SET", SET);
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
    @JsonProperty(value = "instance_number")

    private Integer instanceNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_percentage")

    private Integer instancePercentage;

    public ScalingPolicyActionV1 withOperation(OperationEnum operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 操作选项。ADD：添加实例。REMOVE/REDUCE：移除实例。SET：设置实例数为
     * @return operation
     */
    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(OperationEnum operation) {
        this.operation = operation;
    }

    public ScalingPolicyActionV1 withInstanceNumber(Integer instanceNumber) {
        this.instanceNumber = instanceNumber;
        return this;
    }

    /**
     * 操作实例个数，默认为1。当配额为默认配额时，取值范围如下：  operation为SET时，取值范围为：0~300。 operation为ADD或REMOVE/REDUCE时，取值范围为：1~300。 说明： 配置参数时，instance_number和instance_percentage参数只能选其中一个进行配置。
     * @return instanceNumber
     */
    public Integer getInstanceNumber() {
        return instanceNumber;
    }

    public void setInstanceNumber(Integer instanceNumber) {
        this.instanceNumber = instanceNumber;
    }

    public ScalingPolicyActionV1 withInstancePercentage(Integer instancePercentage) {
        this.instancePercentage = instancePercentage;
        return this;
    }

    /**
     * 操作实例百分比，将伸缩组容量增加、减少或设置为伸缩组当前实例个数的百分比。操作为ADD或REMOVE/REDUCE时取值范围为1到20000的整数，操作为SET时取值范围为0到20000的整数。当instance_number和instance_percentage参数均无配置时，则操作实例个数为1。配置参数时，instance_number和instance_percentage参数只能选其中一个进行配置。
     * minimum: 0
     * maximum: 100
     * @return instancePercentage
     */
    public Integer getInstancePercentage() {
        return instancePercentage;
    }

    public void setInstancePercentage(Integer instancePercentage) {
        this.instancePercentage = instancePercentage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScalingPolicyActionV1 that = (ScalingPolicyActionV1) obj;
        return Objects.equals(this.operation, that.operation)
            && Objects.equals(this.instanceNumber, that.instanceNumber)
            && Objects.equals(this.instancePercentage, that.instancePercentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation, instanceNumber, instancePercentage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScalingPolicyActionV1 {\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    instanceNumber: ").append(toIndentedString(instanceNumber)).append("\n");
        sb.append("    instancePercentage: ").append(toIndentedString(instancePercentage)).append("\n");
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
