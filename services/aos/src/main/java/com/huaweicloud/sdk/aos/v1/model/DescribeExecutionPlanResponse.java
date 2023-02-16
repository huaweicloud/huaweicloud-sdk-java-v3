package com.huaweicloud.sdk.aos.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aos.v1.model.ExecutionPlanSummary;
import com.huaweicloud.sdk.aos.v1.model.VarsStructure;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class DescribeExecutionPlanResponse extends SdkResponse {



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
    @JsonProperty(value="vars_structure")
    
    
    private List<VarsStructure> varsStructure = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vars_uri_content")
    
    
    private String varsUriContent;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vars_body")
    
    
    private String varsBody;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apply_time")
    
    
    private String applyTime;
    /**
     * 执行计划的执行状态，只有当AVAILABLE的时候才可以使用apply执行     * `CREATION_IN_PROGRESS` - 正在生成     * `CREATION_FAILED` - 生成失败     * `AVAILABLE` - 执行计划已经生成完成。可以使用apply进行执行     * `APPLY_IN_PROGRESS` - 执行计划正在执行     * `APPLIED` - 执行完成
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status_message")
    
    
    private String statusMessage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="summary")
    
    
    private ExecutionPlanSummary summary;

    public DescribeExecutionPlanResponse withStackId(String stackId) {
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

    

    public DescribeExecutionPlanResponse withStackName(String stackName) {
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

    

    public DescribeExecutionPlanResponse withExecutionPlanId(String executionPlanId) {
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

    

    public DescribeExecutionPlanResponse withExecutionPlanName(String executionPlanName) {
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

    

    public DescribeExecutionPlanResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 执行计划的描述，此描述为用户在创建执行计划时指定
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public DescribeExecutionPlanResponse withVarsStructure(List<VarsStructure> varsStructure) {
        this.varsStructure = varsStructure;
        return this;
    }

    
    public DescribeExecutionPlanResponse addVarsStructureItem(VarsStructure varsStructureItem) {
        if(this.varsStructure == null) {
            this.varsStructure = new ArrayList<>();
        }
        this.varsStructure.add(varsStructureItem);
        return this;
    }

    public DescribeExecutionPlanResponse withVarsStructure(Consumer<List<VarsStructure>> varsStructureSetter) {
        if(this.varsStructure == null) {
            this.varsStructure = new ArrayList<>();
        }
        varsStructureSetter.accept(this.varsStructure);
        return this;
    }

    /**
     * 参数列表
     * @return varsStructure
     */
    public List<VarsStructure> getVarsStructure() {
        return varsStructure;
    }

    public void setVarsStructure(List<VarsStructure> varsStructure) {
        this.varsStructure = varsStructure;
    }

    

    public DescribeExecutionPlanResponse withVarsUriContent(String varsUriContent) {
        this.varsUriContent = varsUriContent;
        return this;
    }

    


    /**
     * 创建该执行计划时，给出的vars文件中的内容
     * @return varsUriContent
     */
    public String getVarsUriContent() {
        return varsUriContent;
    }

    public void setVarsUriContent(String varsUriContent) {
        this.varsUriContent = varsUriContent;
    }

    

    public DescribeExecutionPlanResponse withVarsBody(String varsBody) {
        this.varsBody = varsBody;
        return this;
    }

    


    /**
     * 创建该执行计划时，请求Body体中的tfvars文件内容
     * @return varsBody
     */
    public String getVarsBody() {
        return varsBody;
    }

    public void setVarsBody(String varsBody) {
        this.varsBody = varsBody;
    }

    

    public DescribeExecutionPlanResponse withCreateTime(String createTime) {
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

    

    public DescribeExecutionPlanResponse withApplyTime(String applyTime) {
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

    

    public DescribeExecutionPlanResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 执行计划的执行状态，只有当AVAILABLE的时候才可以使用apply执行     * `CREATION_IN_PROGRESS` - 正在生成     * `CREATION_FAILED` - 生成失败     * `AVAILABLE` - 执行计划已经生成完成。可以使用apply进行执行     * `APPLY_IN_PROGRESS` - 执行计划正在执行     * `APPLIED` - 执行完成
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public DescribeExecutionPlanResponse withStatusMessage(String statusMessage) {
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

    

    public DescribeExecutionPlanResponse withSummary(ExecutionPlanSummary summary) {
        this.summary = summary;
        return this;
    }

    public DescribeExecutionPlanResponse withSummary(Consumer<ExecutionPlanSummary> summarySetter) {
        if(this.summary == null ){
            this.summary = new ExecutionPlanSummary();
            summarySetter.accept(this.summary);
        }
        
        return this;
    }


    /**
     * Get summary
     * @return summary
     */
    public ExecutionPlanSummary getSummary() {
        return summary;
    }

    public void setSummary(ExecutionPlanSummary summary) {
        this.summary = summary;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DescribeExecutionPlanResponse describeExecutionPlanResponse = (DescribeExecutionPlanResponse) o;
        return Objects.equals(this.stackId, describeExecutionPlanResponse.stackId) &&
            Objects.equals(this.stackName, describeExecutionPlanResponse.stackName) &&
            Objects.equals(this.executionPlanId, describeExecutionPlanResponse.executionPlanId) &&
            Objects.equals(this.executionPlanName, describeExecutionPlanResponse.executionPlanName) &&
            Objects.equals(this.description, describeExecutionPlanResponse.description) &&
            Objects.equals(this.varsStructure, describeExecutionPlanResponse.varsStructure) &&
            Objects.equals(this.varsUriContent, describeExecutionPlanResponse.varsUriContent) &&
            Objects.equals(this.varsBody, describeExecutionPlanResponse.varsBody) &&
            Objects.equals(this.createTime, describeExecutionPlanResponse.createTime) &&
            Objects.equals(this.applyTime, describeExecutionPlanResponse.applyTime) &&
            Objects.equals(this.status, describeExecutionPlanResponse.status) &&
            Objects.equals(this.statusMessage, describeExecutionPlanResponse.statusMessage) &&
            Objects.equals(this.summary, describeExecutionPlanResponse.summary);
    }
    @Override
    public int hashCode() {
        return Objects.hash(stackId, stackName, executionPlanId, executionPlanName, description, varsStructure, varsUriContent, varsBody, createTime, applyTime, status, statusMessage, summary);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DescribeExecutionPlanResponse {\n");
        sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
        sb.append("    stackName: ").append(toIndentedString(stackName)).append("\n");
        sb.append("    executionPlanId: ").append(toIndentedString(executionPlanId)).append("\n");
        sb.append("    executionPlanName: ").append(toIndentedString(executionPlanName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    varsStructure: ").append(toIndentedString(varsStructure)).append("\n");
        sb.append("    varsUriContent: ").append(toIndentedString(varsUriContent)).append("\n");
        sb.append("    varsBody: ").append(toIndentedString(varsBody)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    applyTime: ").append(toIndentedString(applyTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

