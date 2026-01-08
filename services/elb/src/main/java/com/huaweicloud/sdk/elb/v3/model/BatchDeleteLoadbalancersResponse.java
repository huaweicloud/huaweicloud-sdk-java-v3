package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchDeleteLoadbalancersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_ids")

    private List<String> loadbalancerIds = null;

    public BatchDeleteLoadbalancersResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 批量删除任务id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public BatchDeleteLoadbalancersResponse withLoadbalancerIds(List<String> loadbalancerIds) {
        this.loadbalancerIds = loadbalancerIds;
        return this;
    }

    public BatchDeleteLoadbalancersResponse addLoadbalancerIdsItem(String loadbalancerIdsItem) {
        if (this.loadbalancerIds == null) {
            this.loadbalancerIds = new ArrayList<>();
        }
        this.loadbalancerIds.add(loadbalancerIdsItem);
        return this;
    }

    public BatchDeleteLoadbalancersResponse withLoadbalancerIds(Consumer<List<String>> loadbalancerIdsSetter) {
        if (this.loadbalancerIds == null) {
            this.loadbalancerIds = new ArrayList<>();
        }
        loadbalancerIdsSetter.accept(this.loadbalancerIds);
        return this;
    }

    /**
     * 待删除的负载均衡器id列表。
     * @return loadbalancerIds
     */
    public List<String> getLoadbalancerIds() {
        return loadbalancerIds;
    }

    public void setLoadbalancerIds(List<String> loadbalancerIds) {
        this.loadbalancerIds = loadbalancerIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteLoadbalancersResponse that = (BatchDeleteLoadbalancersResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.loadbalancerIds, that.loadbalancerIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, loadbalancerIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteLoadbalancersResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    loadbalancerIds: ").append(toIndentedString(loadbalancerIds)).append("\n");
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
