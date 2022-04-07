package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateNodeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ClusterNodeInformation body;

    public UpdateNodeRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /** 集群 ID，获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。
     * 
     * @return clusterId */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public UpdateNodeRequest withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /** 节点ID，获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。
     * 
     * @return nodeId */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public UpdateNodeRequest withBody(ClusterNodeInformation body) {
        this.body = body;
        return this;
    }

    public UpdateNodeRequest withBody(Consumer<ClusterNodeInformation> bodySetter) {
        if (this.body == null) {
            this.body = new ClusterNodeInformation();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public ClusterNodeInformation getBody() {
        return body;
    }

    public void setBody(ClusterNodeInformation body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateNodeRequest updateNodeRequest = (UpdateNodeRequest) o;
        return Objects.equals(this.clusterId, updateNodeRequest.clusterId)
            && Objects.equals(this.nodeId, updateNodeRequest.nodeId)
            && Objects.equals(this.body, updateNodeRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, nodeId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNodeRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
