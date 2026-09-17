package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作流节点信息
 */
public class WorkItemFlowProcessNodeVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_instance_id")

    private String processInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_activity_id")

    private String workflowActivityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private WorkItemFlowNodeConfigVO config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_suspend")

    private Boolean enableSuspend;

    public WorkItemFlowProcessNodeVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 节点ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WorkItemFlowProcessNodeVO withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 节点类别
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public WorkItemFlowProcessNodeVO withProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }

    /**
     * 工作流实例ID
     * @return processInstanceId
     */
    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public WorkItemFlowProcessNodeVO withWorkflowActivityId(String workflowActivityId) {
        this.workflowActivityId = workflowActivityId;
        return this;
    }

    /**
     * 工作流活动ID
     * @return workflowActivityId
     */
    public String getWorkflowActivityId() {
        return workflowActivityId;
    }

    public void setWorkflowActivityId(String workflowActivityId) {
        this.workflowActivityId = workflowActivityId;
    }

    public WorkItemFlowProcessNodeVO withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 节点编码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public WorkItemFlowProcessNodeVO withConfig(WorkItemFlowNodeConfigVO config) {
        this.config = config;
        return this;
    }

    public WorkItemFlowProcessNodeVO withConfig(Consumer<WorkItemFlowNodeConfigVO> configSetter) {
        if (this.config == null) {
            this.config = new WorkItemFlowNodeConfigVO();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public WorkItemFlowNodeConfigVO getConfig() {
        return config;
    }

    public void setConfig(WorkItemFlowNodeConfigVO config) {
        this.config = config;
    }

    public WorkItemFlowProcessNodeVO withEnableSuspend(Boolean enableSuspend) {
        this.enableSuspend = enableSuspend;
        return this;
    }

    /**
     * 是否允许挂起
     * @return enableSuspend
     */
    public Boolean getEnableSuspend() {
        return enableSuspend;
    }

    public void setEnableSuspend(Boolean enableSuspend) {
        this.enableSuspend = enableSuspend;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkItemFlowProcessNodeVO that = (WorkItemFlowProcessNodeVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.category, that.category)
            && Objects.equals(this.processInstanceId, that.processInstanceId)
            && Objects.equals(this.workflowActivityId, that.workflowActivityId) && Objects.equals(this.code, that.code)
            && Objects.equals(this.config, that.config) && Objects.equals(this.enableSuspend, that.enableSuspend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, processInstanceId, workflowActivityId, code, config, enableSuspend);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkItemFlowProcessNodeVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
        sb.append("    workflowActivityId: ").append(toIndentedString(workflowActivityId)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    enableSuspend: ").append(toIndentedString(enableSuspend)).append("\n");
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
