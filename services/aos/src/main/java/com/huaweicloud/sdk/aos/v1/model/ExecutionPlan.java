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
 * 执行计划的元数据
 */
public class ExecutionPlan  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_id")
    
    
    private String stackId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_name")
    
    
    private String stackName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execution_plan_id")
    
    
    private String executionPlanId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execution_plan_name")
    
    
    private String executionPlanName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apply_time")
    
    
    private String applyTime;
    /**
     * 执行计划的执行状态，只有当AVAILABLE的时候才可以使用apply执行     * `CREATION_IN_PROGRESS` - 正在生成     * `CREATION_FAILED` - 生成失败     * `AVAILABLE` - 执行计划已经生成完成。可以使用apply进行执行     * `APPLIED` - 执行完成
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
         * Enum APPLIED for value: "APPLIED"
         */
        public static final StatusEnum APPLIED = new StatusEnum("APPLIED");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATION_IN_PROGRESS", CREATION_IN_PROGRESS);
            map.put("CREATION_FAILED", CREATION_FAILED);
            map.put("AVAILABLE", AVAILABLE);
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status_message")
    
    
    private String statusMessage;

    public ExecutionPlan withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    


    /**
     * 栈的唯一Id,为uuid
     * @return stackId
     */
    public String getStackId() {
        return stackId;
    }

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    

    public ExecutionPlan withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    


    /**
     * 栈的名字
     * @return stackName
     */
    public String getStackName() {
        return stackName;
    }

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    

    public ExecutionPlan withExecutionPlanId(String executionPlanId) {
        this.executionPlanId = executionPlanId;
        return this;
    }

    


    /**
     * 执行计划的唯一Id，由资源编排服务随机生成,为uuid
     * @return executionPlanId
     */
    public String getExecutionPlanId() {
        return executionPlanId;
    }

    public void setExecutionPlanId(String executionPlanId) {
        this.executionPlanId = executionPlanId;
    }

    

    public ExecutionPlan withExecutionPlanName(String executionPlanName) {
        this.executionPlanName = executionPlanName;
        return this;
    }

    


    /**
     * 执行计划的名字
     * @return executionPlanName
     */
    public String getExecutionPlanName() {
        return executionPlanName;
    }

    public void setExecutionPlanName(String executionPlanName) {
        this.executionPlanName = executionPlanName;
    }

    

    public ExecutionPlan withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 执行计划的描述，此描述为用户在生成时指定
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public ExecutionPlan withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 执行计划的生成时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    public ExecutionPlan withApplyTime(String applyTime) {
        this.applyTime = applyTime;
        return this;
    }

    


    /**
     * 执行时间
     * @return applyTime
     */
    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    

    public ExecutionPlan withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 执行计划的执行状态，只有当AVAILABLE的时候才可以使用apply执行     * `CREATION_IN_PROGRESS` - 正在生成     * `CREATION_FAILED` - 生成失败     * `AVAILABLE` - 执行计划已经生成完成。可以使用apply进行执行     * `APPLIED` - 执行完成
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public ExecutionPlan withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    


    /**
     * 展示执行计划状态更多细节的信息
     * @return statusMessage
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecutionPlan executionPlan = (ExecutionPlan) o;
        return Objects.equals(this.stackId, executionPlan.stackId) &&
            Objects.equals(this.stackName, executionPlan.stackName) &&
            Objects.equals(this.executionPlanId, executionPlan.executionPlanId) &&
            Objects.equals(this.executionPlanName, executionPlan.executionPlanName) &&
            Objects.equals(this.description, executionPlan.description) &&
            Objects.equals(this.createTime, executionPlan.createTime) &&
            Objects.equals(this.applyTime, executionPlan.applyTime) &&
            Objects.equals(this.status, executionPlan.status) &&
            Objects.equals(this.statusMessage, executionPlan.statusMessage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(stackId, stackName, executionPlanId, executionPlanName, description, createTime, applyTime, status, statusMessage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutionPlan {\n");
        sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
        sb.append("    stackName: ").append(toIndentedString(stackName)).append("\n");
        sb.append("    executionPlanId: ").append(toIndentedString(executionPlanId)).append("\n");
        sb.append("    executionPlanName: ").append(toIndentedString(executionPlanName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    applyTime: ").append(toIndentedString(applyTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
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

