package com.huaweicloud.sdk.cloudtable.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateCloudTableClusterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobId")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "getJobEndpoint")

    private String getJobEndpoint;

    public CreateCloudTableClusterResponse withClusterId(String clusterId) {
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

    public CreateCloudTableClusterResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get jobId
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CreateCloudTableClusterResponse withGetJobEndpoint(String getJobEndpoint) {
        this.getJobEndpoint = getJobEndpoint;
        return this;
    }

    /**
     * Get getJobEndpoint
     * @return getJobEndpoint
     */
    public String getGetJobEndpoint() {
        return getJobEndpoint;
    }

    public void setGetJobEndpoint(String getJobEndpoint) {
        this.getJobEndpoint = getJobEndpoint;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCloudTableClusterResponse that = (CreateCloudTableClusterResponse) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.getJobEndpoint, that.getJobEndpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, jobId, getJobEndpoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCloudTableClusterResponse {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    getJobEndpoint: ").append(toIndentedString(getJobEndpoint)).append("\n");
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
