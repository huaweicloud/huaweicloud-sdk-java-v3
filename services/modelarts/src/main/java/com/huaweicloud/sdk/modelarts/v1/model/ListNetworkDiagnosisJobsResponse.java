package com.huaweicloud.sdk.modelarts.v1.model;

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
public class ListNetworkDiagnosisJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_jobs")

    private List<NetworkJob> networkJobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListNetworkDiagnosisJobsResponse withNetworkJobs(List<NetworkJob> networkJobs) {
        this.networkJobs = networkJobs;
        return this;
    }

    public ListNetworkDiagnosisJobsResponse addNetworkJobsItem(NetworkJob networkJobsItem) {
        if (this.networkJobs == null) {
            this.networkJobs = new ArrayList<>();
        }
        this.networkJobs.add(networkJobsItem);
        return this;
    }

    public ListNetworkDiagnosisJobsResponse withNetworkJobs(Consumer<List<NetworkJob>> networkJobsSetter) {
        if (this.networkJobs == null) {
            this.networkJobs = new ArrayList<>();
        }
        networkJobsSetter.accept(this.networkJobs);
        return this;
    }

    /**
     * **参数解释**：网络作业列表。
     * @return networkJobs
     */
    public List<NetworkJob> getNetworkJobs() {
        return networkJobs;
    }

    public void setNetworkJobs(List<NetworkJob> networkJobs) {
        this.networkJobs = networkJobs;
    }

    public ListNetworkDiagnosisJobsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：网络作业总数。 **取值范围**：不涉及。
     * minimum: 0
     * maximum: 10000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListNetworkDiagnosisJobsResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNetworkDiagnosisJobsResponse that = (ListNetworkDiagnosisJobsResponse) obj;
        return Objects.equals(this.networkJobs, that.networkJobs) && Objects.equals(this.total, that.total)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkJobs, total, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNetworkDiagnosisJobsResponse {\n");
        sb.append("    networkJobs: ").append(toIndentedString(networkJobs)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
