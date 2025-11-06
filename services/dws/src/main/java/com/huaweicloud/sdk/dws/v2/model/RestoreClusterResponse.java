package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class RestoreClusterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster")

    private Cluster cluster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    public RestoreClusterResponse withCluster(Cluster cluster) {
        this.cluster = cluster;
        return this;
    }

    public RestoreClusterResponse withCluster(Consumer<Cluster> clusterSetter) {
        if (this.cluster == null) {
            this.cluster = new Cluster();
            clusterSetter.accept(this.cluster);
        }

        return this;
    }

    /**
     * Get cluster
     * @return cluster
     */
    public Cluster getCluster() {
        return cluster;
    }

    public void setCluster(Cluster cluster) {
        this.cluster = cluster;
    }

    public RestoreClusterResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**： 异步任务ID。 **取值范围**： 不涉及。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestoreClusterResponse that = (RestoreClusterResponse) obj;
        return Objects.equals(this.cluster, that.cluster) && Objects.equals(this.jobId, that.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cluster, jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreClusterResponse {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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
