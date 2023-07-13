package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QaFlowHitResult
 */
public class QaFlowHitResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_node")

    private QaFlowHitNodeVo currentNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "candidate_nodes")

    private List<QaFlowHitNodeVo> candidateNodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_completed")

    private Boolean isCompleted;

    public QaFlowHitResult withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * seesionID
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public QaFlowHitResult withCurrentNode(QaFlowHitNodeVo currentNode) {
        this.currentNode = currentNode;
        return this;
    }

    public QaFlowHitResult withCurrentNode(Consumer<QaFlowHitNodeVo> currentNodeSetter) {
        if (this.currentNode == null) {
            this.currentNode = new QaFlowHitNodeVo();
            currentNodeSetter.accept(this.currentNode);
        }

        return this;
    }

    /**
     * Get currentNode
     * @return currentNode
     */
    public QaFlowHitNodeVo getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(QaFlowHitNodeVo currentNode) {
        this.currentNode = currentNode;
    }

    public QaFlowHitResult withCandidateNodes(List<QaFlowHitNodeVo> candidateNodes) {
        this.candidateNodes = candidateNodes;
        return this;
    }

    public QaFlowHitResult addCandidateNodesItem(QaFlowHitNodeVo candidateNodesItem) {
        if (this.candidateNodes == null) {
            this.candidateNodes = new ArrayList<>();
        }
        this.candidateNodes.add(candidateNodesItem);
        return this;
    }

    public QaFlowHitResult withCandidateNodes(Consumer<List<QaFlowHitNodeVo>> candidateNodesSetter) {
        if (this.candidateNodes == null) {
            this.candidateNodes = new ArrayList<>();
        }
        candidateNodesSetter.accept(this.candidateNodes);
        return this;
    }

    /**
     * 备用节点
     * @return candidateNodes
     */
    public List<QaFlowHitNodeVo> getCandidateNodes() {
        return candidateNodes;
    }

    public void setCandidateNodes(List<QaFlowHitNodeVo> candidateNodes) {
        this.candidateNodes = candidateNodes;
    }

    public QaFlowHitResult withIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
        return this;
    }

    /**
     * 是否完整
     * @return isCompleted
     */
    public Boolean getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QaFlowHitResult that = (QaFlowHitResult) obj;
        return Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.currentNode, that.currentNode)
            && Objects.equals(this.candidateNodes, that.candidateNodes)
            && Objects.equals(this.isCompleted, that.isCompleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionId, currentNode, candidateNodes, isCompleted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QaFlowHitResult {\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    currentNode: ").append(toIndentedString(currentNode)).append("\n");
        sb.append("    candidateNodes: ").append(toIndentedString(candidateNodes)).append("\n");
        sb.append("    isCompleted: ").append(toIndentedString(isCompleted)).append("\n");
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
