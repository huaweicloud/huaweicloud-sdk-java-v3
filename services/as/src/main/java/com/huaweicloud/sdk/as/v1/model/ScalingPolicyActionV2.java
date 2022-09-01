package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 策略执行具体动作。
 */
public class ScalingPolicyActionV2 {

    /**
     * 操作选项，默认为ADD。 当scaling_resource_type为SCALING_GROUP，支持如下操作： - ADD：增加 - REMOVE/REDUCE：减少 - SET：设置为 当scaling_resource_type为BANDWIDTH，支持如下操作： - ADD：增加 - REDUCE：减少 - SET：设置为
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
            OperationEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OperationEnum(value);
            }
            return result;
        }

        public static OperationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OperationEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "operation")

    private OperationEnum operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percentage")

    @JacksonXmlProperty(localName = "percentage")

    private Integer percentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limits")

    @JacksonXmlProperty(localName = "limits")

    private Integer limits;

    public ScalingPolicyActionV2 withOperation(OperationEnum operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 操作选项，默认为ADD。 当scaling_resource_type为SCALING_GROUP，支持如下操作： - ADD：增加 - REMOVE/REDUCE：减少 - SET：设置为 当scaling_resource_type为BANDWIDTH，支持如下操作： - ADD：增加 - REDUCE：减少 - SET：设置为
     * @return operation
     */
    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(OperationEnum operation) {
        this.operation = operation;
    }

    public ScalingPolicyActionV2 withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 操作大小，取值范围为0到300的整数，默认为1。当scaling_resource_type为SCALING_GROUP时，size为实例个数,取值范围为0-300的整数，默认为1。当scaling_resource_type为BANDWIDTH时，size表示带宽大小，单位为Mbit/s，取值范围为1到300的整数，默认为1。当scaling_resource_type为SCALING_GROUP时，size和percentage参数只能选其中一个进行配置。
     * minimum: 0
     * maximum: 300
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ScalingPolicyActionV2 withPercentage(Integer percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * 操作百分比，取值为0到20000的整数。当scaling_resource_type为SCALING_GROUP时，size和instance_percentage参数均无配置，则size默认为1。当scaling_resource_type为BANDWIDTH时，不支持配置instance_percentage参数。
     * minimum: 0
     * maximum: 20000
     * @return percentage
     */
    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    public ScalingPolicyActionV2 withLimits(Integer limits) {
        this.limits = limits;
        return this;
    }

    /**
     * 操作限制。当scaling_resource_type为BANDWIDTH，且operation不为SET时，limits参数生效，单位为Mbit/s。此时，当operation为ADD时，limits表示带宽可调整的上限；当operation为REDUCE时，limits表示带宽可调整的下限。
     * @return limits
     */
    public Integer getLimits() {
        return limits;
    }

    public void setLimits(Integer limits) {
        this.limits = limits;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScalingPolicyActionV2 scalingPolicyActionV2 = (ScalingPolicyActionV2) o;
        return Objects.equals(this.operation, scalingPolicyActionV2.operation)
            && Objects.equals(this.size, scalingPolicyActionV2.size)
            && Objects.equals(this.percentage, scalingPolicyActionV2.percentage)
            && Objects.equals(this.limits, scalingPolicyActionV2.limits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation, size, percentage, limits);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScalingPolicyActionV2 {\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
        sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
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
