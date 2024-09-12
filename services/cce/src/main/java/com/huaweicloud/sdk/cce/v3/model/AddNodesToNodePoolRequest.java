package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AddNodesToNodePoolRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodepool_id")

    private String nodepoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AddNodesToNodePoolList body;

    public AddNodesToNodePoolRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID，获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public AddNodesToNodePoolRequest withNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
        return this;
    }

    /**
     * 节点池ID
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return nodepoolId;
    }

    public void setNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
    }

    public AddNodesToNodePoolRequest withBody(AddNodesToNodePoolList body) {
        this.body = body;
        return this;
    }

    public AddNodesToNodePoolRequest withBody(Consumer<AddNodesToNodePoolList> bodySetter) {
        if (this.body == null) {
            this.body = new AddNodesToNodePoolList();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AddNodesToNodePoolList getBody() {
        return body;
    }

    public void setBody(AddNodesToNodePoolList body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddNodesToNodePoolRequest that = (AddNodesToNodePoolRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.nodepoolId, that.nodepoolId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, nodepoolId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddNodesToNodePoolRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    nodepoolId: ").append(toIndentedString(nodepoolId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
