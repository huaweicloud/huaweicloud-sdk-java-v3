package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateBatchClustersTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchAddOrDeleteTagOnClusterReq body;

    public UpdateBatchClustersTagsRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 指定批量添加标签的集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public UpdateBatchClustersTagsRequest withBody(BatchAddOrDeleteTagOnClusterReq body) {
        this.body = body;
        return this;
    }

    public UpdateBatchClustersTagsRequest withBody(Consumer<BatchAddOrDeleteTagOnClusterReq> bodySetter) {
        if (this.body == null) {
            this.body = new BatchAddOrDeleteTagOnClusterReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchAddOrDeleteTagOnClusterReq getBody() {
        return body;
    }

    public void setBody(BatchAddOrDeleteTagOnClusterReq body) {
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
        UpdateBatchClustersTagsRequest updateBatchClustersTagsRequest = (UpdateBatchClustersTagsRequest) o;
        return Objects.equals(this.clusterId, updateBatchClustersTagsRequest.clusterId)
            && Objects.equals(this.body, updateBatchClustersTagsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBatchClustersTagsRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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
