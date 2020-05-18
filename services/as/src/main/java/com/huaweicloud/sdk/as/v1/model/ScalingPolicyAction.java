package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 策略执行具体动作
 */
public class ScalingPolicyAction  {

    /**
     * 操作选项。ADD：添加实例。REMOVE/REDUCE：移除实例。SET：设置实例数为
     */
    public static class OperationEnum {

        
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

        

        public static Map<String, OperationEnum> staticFields =
                new HashMap<String, OperationEnum>() {
                    { 
                        put("ADD", ADD);
                        put("REMOVE", REMOVE);
                        put("REDUCE", REDUCE);
                        put("SET", SET);
                    }
                };

        private String value;

        OperationEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OperationEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            OperationEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new OperationEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static OperationEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OperationEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OperationEnum) {
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
    @JsonProperty(value="operation")
    
    private OperationEnum operation;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_number")
    
    private Integer instanceNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_percentage")
    
    private Integer instancePercentage;

    public ScalingPolicyAction withOperation(OperationEnum operation) {
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

    public ScalingPolicyAction withInstanceNumber(Integer instanceNumber) {
        this.instanceNumber = instanceNumber;
        return this;
    }

    


    /**
     * 操作实例个数，默认为1。配置参数时，instance_number和instance_percentage参数只能选其中一个进行配置。
     * @return instanceNumber
     */
    public Integer getInstanceNumber() {
        return instanceNumber;
    }

    public void setInstanceNumber(Integer instanceNumber) {
        this.instanceNumber = instanceNumber;
    }

    public ScalingPolicyAction withInstancePercentage(Integer instancePercentage) {
        this.instancePercentage = instancePercentage;
        return this;
    }

    


    /**
     * 操作实例百分比，将当前组容量增加、减少或设置为指定的百分比。当instance_number和instance_percentage参数均无配置时，则操作实例个数为1。配置参数时，instance_number和instance_percentage参数只能选其中一个进行配置。
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScalingPolicyAction scalingPolicyAction = (ScalingPolicyAction) o;
        return Objects.equals(this.operation, scalingPolicyAction.operation) &&
            Objects.equals(this.instanceNumber, scalingPolicyAction.instanceNumber) &&
            Objects.equals(this.instancePercentage, scalingPolicyAction.instancePercentage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(operation, instanceNumber, instancePercentage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScalingPolicyAction {\n");
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

