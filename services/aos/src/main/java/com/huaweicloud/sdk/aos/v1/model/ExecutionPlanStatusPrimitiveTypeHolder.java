package com.huaweicloud.sdk.aos.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ExecutionPlanStatusPrimitiveTypeHolder
 */
public class ExecutionPlanStatusPrimitiveTypeHolder  {

    /**
     * 执行计划的状态    * `CREATION_IN_PROGRESS` - 正在创建，请等待    * `CREATION_FAILED` - 创建失败，请从status_message获取错误信息汇总    * `AVAILABLE` - 创建完成，可以调用ApplyExecutionPlan API进行执行    * `APPLY_IN_PROGRESS` - 执行中，可通过GetStackMetadata查询资源栈状态，通过ListStackEvents获取执行过程中产生的资源栈事件    * `APPLIED` - 已执行
     */
    public static final class StatusEnum {

        
        /**
         * Enum CREATION_IN_PROGRESS for value: "CREATION_IN_PROGRESS"
         */
        public static final StatusEnum CREATION_IN_PROGRESS = new StatusEnum("CREATION_IN_PROGRESS");
        
        /**
         * Enum CREATION_FAILED for value: "CREATION_FAILED"
         */
        public static final StatusEnum CREATION_FAILED = new StatusEnum("CREATION_FAILED");
        
        /**
         * Enum AVAILABLE for value: "AVAILABLE"
         */
        public static final StatusEnum AVAILABLE = new StatusEnum("AVAILABLE");
        
        /**
         * Enum APPLY_IN_PROGRESS for value: "APPLY_IN_PROGRESS"
         */
        public static final StatusEnum APPLY_IN_PROGRESS = new StatusEnum("APPLY_IN_PROGRESS");
        
        /**
         * Enum APPLIED for value: "APPLIED"
         */
        public static final StatusEnum APPLIED = new StatusEnum("APPLIED");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATION_IN_PROGRESS", CREATION_IN_PROGRESS);
            map.put("CREATION_FAILED", CREATION_FAILED);
            map.put("AVAILABLE", AVAILABLE);
            map.put("APPLY_IN_PROGRESS", APPLY_IN_PROGRESS);
            map.put("APPLIED", APPLIED);
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
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value="status")
    

    private StatusEnum status;

    public ExecutionPlanStatusPrimitiveTypeHolder withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 执行计划的状态    * `CREATION_IN_PROGRESS` - 正在创建，请等待    * `CREATION_FAILED` - 创建失败，请从status_message获取错误信息汇总    * `AVAILABLE` - 创建完成，可以调用ApplyExecutionPlan API进行执行    * `APPLY_IN_PROGRESS` - 执行中，可通过GetStackMetadata查询资源栈状态，通过ListStackEvents获取执行过程中产生的资源栈事件    * `APPLIED` - 已执行
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecutionPlanStatusPrimitiveTypeHolder executionPlanStatusPrimitiveTypeHolder = (ExecutionPlanStatusPrimitiveTypeHolder) o;
        return Objects.equals(this.status, executionPlanStatusPrimitiveTypeHolder.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutionPlanStatusPrimitiveTypeHolder {\n");
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

