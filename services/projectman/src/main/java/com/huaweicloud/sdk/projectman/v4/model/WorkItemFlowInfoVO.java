package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作项流转信息
 */
public class WorkItemFlowInfoVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_instance")

    private WorkItemFlowProcessInstanceVO processInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_nodes")

    private List<WorkItemFlowProcessNodeVO> processNodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_process_node")

    private WorkItemFlowProcessNodeVO currentProcessNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_flow")

    private List<FlowsInfoVO> nextFlow = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_result")

    private String failResult;

    public WorkItemFlowInfoVO withProcessInstance(WorkItemFlowProcessInstanceVO processInstance) {
        this.processInstance = processInstance;
        return this;
    }

    public WorkItemFlowInfoVO withProcessInstance(Consumer<WorkItemFlowProcessInstanceVO> processInstanceSetter) {
        if (this.processInstance == null) {
            this.processInstance = new WorkItemFlowProcessInstanceVO();
            processInstanceSetter.accept(this.processInstance);
        }

        return this;
    }

    /**
     * Get processInstance
     * @return processInstance
     */
    public WorkItemFlowProcessInstanceVO getProcessInstance() {
        return processInstance;
    }

    public void setProcessInstance(WorkItemFlowProcessInstanceVO processInstance) {
        this.processInstance = processInstance;
    }

    public WorkItemFlowInfoVO withProcessNodes(List<WorkItemFlowProcessNodeVO> processNodes) {
        this.processNodes = processNodes;
        return this;
    }

    public WorkItemFlowInfoVO addProcessNodesItem(WorkItemFlowProcessNodeVO processNodesItem) {
        if (this.processNodes == null) {
            this.processNodes = new ArrayList<>();
        }
        this.processNodes.add(processNodesItem);
        return this;
    }

    public WorkItemFlowInfoVO withProcessNodes(Consumer<List<WorkItemFlowProcessNodeVO>> processNodesSetter) {
        if (this.processNodes == null) {
            this.processNodes = new ArrayList<>();
        }
        processNodesSetter.accept(this.processNodes);
        return this;
    }

    /**
     * **参数解释**： 工作项关联的全部工作流节点列表。 **取值范围**： 不涉及。
     * @return processNodes
     */
    public List<WorkItemFlowProcessNodeVO> getProcessNodes() {
        return processNodes;
    }

    public void setProcessNodes(List<WorkItemFlowProcessNodeVO> processNodes) {
        this.processNodes = processNodes;
    }

    public WorkItemFlowInfoVO withCurrentProcessNode(WorkItemFlowProcessNodeVO currentProcessNode) {
        this.currentProcessNode = currentProcessNode;
        return this;
    }

    public WorkItemFlowInfoVO withCurrentProcessNode(Consumer<WorkItemFlowProcessNodeVO> currentProcessNodeSetter) {
        if (this.currentProcessNode == null) {
            this.currentProcessNode = new WorkItemFlowProcessNodeVO();
            currentProcessNodeSetter.accept(this.currentProcessNode);
        }

        return this;
    }

    /**
     * Get currentProcessNode
     * @return currentProcessNode
     */
    public WorkItemFlowProcessNodeVO getCurrentProcessNode() {
        return currentProcessNode;
    }

    public void setCurrentProcessNode(WorkItemFlowProcessNodeVO currentProcessNode) {
        this.currentProcessNode = currentProcessNode;
    }

    public WorkItemFlowInfoVO withNextFlow(List<FlowsInfoVO> nextFlow) {
        this.nextFlow = nextFlow;
        return this;
    }

    public WorkItemFlowInfoVO addNextFlowItem(FlowsInfoVO nextFlowItem) {
        if (this.nextFlow == null) {
            this.nextFlow = new ArrayList<>();
        }
        this.nextFlow.add(nextFlowItem);
        return this;
    }

    public WorkItemFlowInfoVO withNextFlow(Consumer<List<FlowsInfoVO>> nextFlowSetter) {
        if (this.nextFlow == null) {
            this.nextFlow = new ArrayList<>();
        }
        nextFlowSetter.accept(this.nextFlow);
        return this;
    }

    /**
     * **参数解释**： 可以流转的流转线信息。 **取值范围**： 不涉及。
     * @return nextFlow
     */
    public List<FlowsInfoVO> getNextFlow() {
        return nextFlow;
    }

    public void setNextFlow(List<FlowsInfoVO> nextFlow) {
        this.nextFlow = nextFlow;
    }

    public WorkItemFlowInfoVO withFailResult(String failResult) {
        this.failResult = failResult;
        return this;
    }

    /**
     * **参数解释**： 流转失败时的失败原因。 **取值范围**： 不涉及。
     * @return failResult
     */
    public String getFailResult() {
        return failResult;
    }

    public void setFailResult(String failResult) {
        this.failResult = failResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkItemFlowInfoVO that = (WorkItemFlowInfoVO) obj;
        return Objects.equals(this.processInstance, that.processInstance)
            && Objects.equals(this.processNodes, that.processNodes)
            && Objects.equals(this.currentProcessNode, that.currentProcessNode)
            && Objects.equals(this.nextFlow, that.nextFlow) && Objects.equals(this.failResult, that.failResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processInstance, processNodes, currentProcessNode, nextFlow, failResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkItemFlowInfoVO {\n");
        sb.append("    processInstance: ").append(toIndentedString(processInstance)).append("\n");
        sb.append("    processNodes: ").append(toIndentedString(processNodes)).append("\n");
        sb.append("    currentProcessNode: ").append(toIndentedString(currentProcessNode)).append("\n");
        sb.append("    nextFlow: ").append(toIndentedString(nextFlow)).append("\n");
        sb.append("    failResult: ").append(toIndentedString(failResult)).append("\n");
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
