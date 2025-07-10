package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作流信息
 */
public class WorkflowTemplateVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processNodes")

    private List<WorkflowTemplateNodesVO> processNodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processFlows")

    private List<WorkflowTemplateFlowsVO> processFlows = null;

    public WorkflowTemplateVO withProcessNodes(List<WorkflowTemplateNodesVO> processNodes) {
        this.processNodes = processNodes;
        return this;
    }

    public WorkflowTemplateVO addProcessNodesItem(WorkflowTemplateNodesVO processNodesItem) {
        if (this.processNodes == null) {
            this.processNodes = new ArrayList<>();
        }
        this.processNodes.add(processNodesItem);
        return this;
    }

    public WorkflowTemplateVO withProcessNodes(Consumer<List<WorkflowTemplateNodesVO>> processNodesSetter) {
        if (this.processNodes == null) {
            this.processNodes = new ArrayList<>();
        }
        processNodesSetter.accept(this.processNodes);
        return this;
    }

    /**
     * 状态流中的状态信息
     * @return processNodes
     */
    public List<WorkflowTemplateNodesVO> getProcessNodes() {
        return processNodes;
    }

    public void setProcessNodes(List<WorkflowTemplateNodesVO> processNodes) {
        this.processNodes = processNodes;
    }

    public WorkflowTemplateVO withProcessFlows(List<WorkflowTemplateFlowsVO> processFlows) {
        this.processFlows = processFlows;
        return this;
    }

    public WorkflowTemplateVO addProcessFlowsItem(WorkflowTemplateFlowsVO processFlowsItem) {
        if (this.processFlows == null) {
            this.processFlows = new ArrayList<>();
        }
        this.processFlows.add(processFlowsItem);
        return this;
    }

    public WorkflowTemplateVO withProcessFlows(Consumer<List<WorkflowTemplateFlowsVO>> processFlowsSetter) {
        if (this.processFlows == null) {
            this.processFlows = new ArrayList<>();
        }
        processFlowsSetter.accept(this.processFlows);
        return this;
    }

    /**
     * 状态流中的流转线信息
     * @return processFlows
     */
    public List<WorkflowTemplateFlowsVO> getProcessFlows() {
        return processFlows;
    }

    public void setProcessFlows(List<WorkflowTemplateFlowsVO> processFlows) {
        this.processFlows = processFlows;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkflowTemplateVO that = (WorkflowTemplateVO) obj;
        return Objects.equals(this.processNodes, that.processNodes)
            && Objects.equals(this.processFlows, that.processFlows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processNodes, processFlows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowTemplateVO {\n");
        sb.append("    processNodes: ").append(toIndentedString(processNodes)).append("\n");
        sb.append("    processFlows: ").append(toIndentedString(processFlows)).append("\n");
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
