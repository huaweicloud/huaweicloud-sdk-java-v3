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
public class BatchDeleteListenersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_ids")

    private List<String> listenerIds = null;

    public BatchDeleteListenersResponse withJobId(String jobId) {
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

    public BatchDeleteListenersResponse withListenerIds(List<String> listenerIds) {
        this.listenerIds = listenerIds;
        return this;
    }

    public BatchDeleteListenersResponse addListenerIdsItem(String listenerIdsItem) {
        if (this.listenerIds == null) {
            this.listenerIds = new ArrayList<>();
        }
        this.listenerIds.add(listenerIdsItem);
        return this;
    }

    public BatchDeleteListenersResponse withListenerIds(Consumer<List<String>> listenerIdsSetter) {
        if (this.listenerIds == null) {
            this.listenerIds = new ArrayList<>();
        }
        listenerIdsSetter.accept(this.listenerIds);
        return this;
    }

    /**
     * 待删除的监听器id列表。
     * @return listenerIds
     */
    public List<String> getListenerIds() {
        return listenerIds;
    }

    public void setListenerIds(List<String> listenerIds) {
        this.listenerIds = listenerIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteListenersResponse that = (BatchDeleteListenersResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.listenerIds, that.listenerIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, listenerIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteListenersResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    listenerIds: ").append(toIndentedString(listenerIds)).append("\n");
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
