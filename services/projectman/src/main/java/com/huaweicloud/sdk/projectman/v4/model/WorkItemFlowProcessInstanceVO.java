package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 工作流实例信息
 */
public class WorkItemFlowProcessInstanceVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_state")

    private Integer flowState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_entry_id")

    private String workflowEntryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    public WorkItemFlowProcessInstanceVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 工作项工作流实例ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WorkItemFlowProcessInstanceVO withFlowState(Integer flowState) {
        this.flowState = flowState;
        return this;
    }

    /**
     * **参数解释**： 工作流实例是否挂起。 **取值范围**：  1: 运行  2: 挂起
     * @return flowState
     */
    public Integer getFlowState() {
        return flowState;
    }

    public void setFlowState(Integer flowState) {
        this.flowState = flowState;
    }

    public WorkItemFlowProcessInstanceVO withWorkflowEntryId(String workflowEntryId) {
        this.workflowEntryId = workflowEntryId;
        return this;
    }

    /**
     * **参数解释**： 工作流入口ID。 **取值范围**： 不涉及。
     * @return workflowEntryId
     */
    public String getWorkflowEntryId() {
        return workflowEntryId;
    }

    public void setWorkflowEntryId(String workflowEntryId) {
        this.workflowEntryId = workflowEntryId;
    }

    public WorkItemFlowProcessInstanceVO withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**： 工作流分类。 **取值范围**： 不涉及。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkItemFlowProcessInstanceVO that = (WorkItemFlowProcessInstanceVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.flowState, that.flowState)
            && Objects.equals(this.workflowEntryId, that.workflowEntryId)
            && Objects.equals(this.category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, flowState, workflowEntryId, category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkItemFlowProcessInstanceVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    flowState: ").append(toIndentedString(flowState)).append("\n");
        sb.append("    workflowEntryId: ").append(toIndentedString(workflowEntryId)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
