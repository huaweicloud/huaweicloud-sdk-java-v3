package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateLogicalClusterRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_cluster_id")

    private String logicalClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateLogicalClusterRequestBody body;

    public UpdateLogicalClusterRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 指定待编辑集群的ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public UpdateLogicalClusterRequest withLogicalClusterId(String logicalClusterId) {
        this.logicalClusterId = logicalClusterId;
        return this;
    }

    /**
     * 指定待编辑逻辑集群的ID
     * @return logicalClusterId
     */
    public String getLogicalClusterId() {
        return logicalClusterId;
    }

    public void setLogicalClusterId(String logicalClusterId) {
        this.logicalClusterId = logicalClusterId;
    }

    public UpdateLogicalClusterRequest withBody(UpdateLogicalClusterRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateLogicalClusterRequest withBody(Consumer<UpdateLogicalClusterRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateLogicalClusterRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateLogicalClusterRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateLogicalClusterRequestBody body) {
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
        UpdateLogicalClusterRequest that = (UpdateLogicalClusterRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.logicalClusterId, that.logicalClusterId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, logicalClusterId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLogicalClusterRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    logicalClusterId: ").append(toIndentedString(logicalClusterId)).append("\n");
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
