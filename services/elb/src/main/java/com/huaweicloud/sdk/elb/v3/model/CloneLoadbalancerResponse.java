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
public class CloneLoadbalancerResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_list")

    private List<CloneLoadbalancerResponseBodyLoadbalancerList> loadbalancerList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    public CloneLoadbalancerResponse withLoadbalancerList(
        List<CloneLoadbalancerResponseBodyLoadbalancerList> loadbalancerList) {
        this.loadbalancerList = loadbalancerList;
        return this;
    }

    public CloneLoadbalancerResponse addLoadbalancerListItem(
        CloneLoadbalancerResponseBodyLoadbalancerList loadbalancerListItem) {
        if (this.loadbalancerList == null) {
            this.loadbalancerList = new ArrayList<>();
        }
        this.loadbalancerList.add(loadbalancerListItem);
        return this;
    }

    public CloneLoadbalancerResponse withLoadbalancerList(
        Consumer<List<CloneLoadbalancerResponseBodyLoadbalancerList>> loadbalancerListSetter) {
        if (this.loadbalancerList == null) {
            this.loadbalancerList = new ArrayList<>();
        }
        loadbalancerListSetter.accept(this.loadbalancerList);
        return this;
    }

    /**
     * **参数解释**：新实例信息。
     * @return loadbalancerList
     */
    public List<CloneLoadbalancerResponseBodyLoadbalancerList> getLoadbalancerList() {
        return loadbalancerList;
    }

    public void setLoadbalancerList(List<CloneLoadbalancerResponseBodyLoadbalancerList> loadbalancerList) {
        this.loadbalancerList = loadbalancerList;
    }

    public CloneLoadbalancerResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * **参数解释**：请求ID。  **取值范围**：由数字、小写字母和中划线（-）组成的字符串，自动生成。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CloneLoadbalancerResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：实例复制任务ID。  **取值范围**：不涉及
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
        CloneLoadbalancerResponse that = (CloneLoadbalancerResponse) obj;
        return Objects.equals(this.loadbalancerList, that.loadbalancerList)
            && Objects.equals(this.requestId, that.requestId) && Objects.equals(this.jobId, that.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadbalancerList, requestId, jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloneLoadbalancerResponse {\n");
        sb.append("    loadbalancerList: ").append(toIndentedString(loadbalancerList)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
