package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowWorkloadQueueResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_res_code")

    private Integer workloadResCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_res_str")

    private String workloadResStr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_queue")

    private WorkloadQueueItem workloadQueue;

    public ShowWorkloadQueueResponse withWorkloadResCode(Integer workloadResCode) {
        this.workloadResCode = workloadResCode;
        return this;
    }

    /**
     * 结果状态码。
     * @return workloadResCode
     */
    public Integer getWorkloadResCode() {
        return workloadResCode;
    }

    public void setWorkloadResCode(Integer workloadResCode) {
        this.workloadResCode = workloadResCode;
    }

    public ShowWorkloadQueueResponse withWorkloadResStr(String workloadResStr) {
        this.workloadResStr = workloadResStr;
        return this;
    }

    /**
     * 结果描述。
     * @return workloadResStr
     */
    public String getWorkloadResStr() {
        return workloadResStr;
    }

    public void setWorkloadResStr(String workloadResStr) {
        this.workloadResStr = workloadResStr;
    }

    public ShowWorkloadQueueResponse withWorkloadQueue(WorkloadQueueItem workloadQueue) {
        this.workloadQueue = workloadQueue;
        return this;
    }

    public ShowWorkloadQueueResponse withWorkloadQueue(Consumer<WorkloadQueueItem> workloadQueueSetter) {
        if (this.workloadQueue == null) {
            this.workloadQueue = new WorkloadQueueItem();
            workloadQueueSetter.accept(this.workloadQueue);
        }

        return this;
    }

    /**
     * Get workloadQueue
     * @return workloadQueue
     */
    public WorkloadQueueItem getWorkloadQueue() {
        return workloadQueue;
    }

    public void setWorkloadQueue(WorkloadQueueItem workloadQueue) {
        this.workloadQueue = workloadQueue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowWorkloadQueueResponse that = (ShowWorkloadQueueResponse) obj;
        return Objects.equals(this.workloadResCode, that.workloadResCode)
            && Objects.equals(this.workloadResStr, that.workloadResStr)
            && Objects.equals(this.workloadQueue, that.workloadQueue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadResCode, workloadResStr, workloadQueue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWorkloadQueueResponse {\n");
        sb.append("    workloadResCode: ").append(toIndentedString(workloadResCode)).append("\n");
        sb.append("    workloadResStr: ").append(toIndentedString(workloadResStr)).append("\n");
        sb.append("    workloadQueue: ").append(toIndentedString(workloadQueue)).append("\n");
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
