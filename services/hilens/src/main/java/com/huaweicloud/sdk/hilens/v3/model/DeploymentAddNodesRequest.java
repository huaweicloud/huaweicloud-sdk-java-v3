package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeploymentAddNodesRequest
 */
public class DeploymentAddNodesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ids")

    private List<String> nodeIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_id")

    private String deploymentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_tags")

    private List<DeploymentTag> nodeTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    public DeploymentAddNodesRequest withNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }

    public DeploymentAddNodesRequest addNodeIdsItem(String nodeIdsItem) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        this.nodeIds.add(nodeIdsItem);
        return this;
    }

    public DeploymentAddNodesRequest withNodeIds(Consumer<List<String>> nodeIdsSetter) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        nodeIdsSetter.accept(this.nodeIds);
        return this;
    }

    /**
     * 应用部署到指定节点
     * @return nodeIds
     */
    public List<String> getNodeIds() {
        return nodeIds;
    }

    public void setNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
    }

    public DeploymentAddNodesRequest withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * 应用部署ID
     * @return deploymentId
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public DeploymentAddNodesRequest withNodeTags(List<DeploymentTag> nodeTags) {
        this.nodeTags = nodeTags;
        return this;
    }

    public DeploymentAddNodesRequest addNodeTagsItem(DeploymentTag nodeTagsItem) {
        if (this.nodeTags == null) {
            this.nodeTags = new ArrayList<>();
        }
        this.nodeTags.add(nodeTagsItem);
        return this;
    }

    public DeploymentAddNodesRequest withNodeTags(Consumer<List<DeploymentTag>> nodeTagsSetter) {
        if (this.nodeTags == null) {
            this.nodeTags = new ArrayList<>();
        }
        nodeTagsSetter.accept(this.nodeTags);
        return this;
    }

    /**
     * 添加节点的标签
     * @return nodeTags
     */
    public List<DeploymentTag> getNodeTags() {
        return nodeTags;
    }

    public void setNodeTags(List<DeploymentTag> nodeTags) {
        this.nodeTags = nodeTags;
    }

    public DeploymentAddNodesRequest withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * 添加的节点数量
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeploymentAddNodesRequest deploymentAddNodesRequest = (DeploymentAddNodesRequest) o;
        return Objects.equals(this.nodeIds, deploymentAddNodesRequest.nodeIds)
            && Objects.equals(this.deploymentId, deploymentAddNodesRequest.deploymentId)
            && Objects.equals(this.nodeTags, deploymentAddNodesRequest.nodeTags)
            && Objects.equals(this.nodeNum, deploymentAddNodesRequest.nodeNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeIds, deploymentId, nodeTags, nodeNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentAddNodesRequest {\n");
        sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
        sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
        sb.append("    nodeTags: ").append(toIndentedString(nodeTags)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
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
