package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListClusterWorkloadResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_status")

    private WorkloadStatus workloadStatus;

    public ListClusterWorkloadResponse withWorkloadStatus(WorkloadStatus workloadStatus) {
        this.workloadStatus = workloadStatus;
        return this;
    }

    public ListClusterWorkloadResponse withWorkloadStatus(Consumer<WorkloadStatus> workloadStatusSetter) {
        if (this.workloadStatus == null) {
            this.workloadStatus = new WorkloadStatus();
            workloadStatusSetter.accept(this.workloadStatus);
        }

        return this;
    }

    /**
     * Get workloadStatus
     * @return workloadStatus
     */
    public WorkloadStatus getWorkloadStatus() {
        return workloadStatus;
    }

    public void setWorkloadStatus(WorkloadStatus workloadStatus) {
        this.workloadStatus = workloadStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListClusterWorkloadResponse listClusterWorkloadResponse = (ListClusterWorkloadResponse) o;
        return Objects.equals(this.workloadStatus, listClusterWorkloadResponse.workloadStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterWorkloadResponse {\n");
        sb.append("    workloadStatus: ").append(toIndentedString(workloadStatus)).append("\n");
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
