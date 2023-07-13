package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源管理状态
 */
public class WorkloadStatusReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_status")

    private WorkloadStatus workloadStatus;

    public WorkloadStatusReq withWorkloadStatus(WorkloadStatus workloadStatus) {
        this.workloadStatus = workloadStatus;
        return this;
    }

    public WorkloadStatusReq withWorkloadStatus(Consumer<WorkloadStatus> workloadStatusSetter) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkloadStatusReq that = (WorkloadStatusReq) obj;
        return Objects.equals(this.workloadStatus, that.workloadStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadStatusReq {\n");
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
