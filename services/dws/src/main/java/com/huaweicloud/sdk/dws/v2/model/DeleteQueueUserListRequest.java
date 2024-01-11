package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DeleteQueueUserListRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private WorkloadQueueUserReq body;

    public DeleteQueueUserListRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public DeleteQueueUserListRequest withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 队列名称
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public DeleteQueueUserListRequest withBody(WorkloadQueueUserReq body) {
        this.body = body;
        return this;
    }

    public DeleteQueueUserListRequest withBody(Consumer<WorkloadQueueUserReq> bodySetter) {
        if (this.body == null) {
            this.body = new WorkloadQueueUserReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public WorkloadQueueUserReq getBody() {
        return body;
    }

    public void setBody(WorkloadQueueUserReq body) {
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
        DeleteQueueUserListRequest that = (DeleteQueueUserListRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.queueName, that.queueName)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, queueName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteQueueUserListRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
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
