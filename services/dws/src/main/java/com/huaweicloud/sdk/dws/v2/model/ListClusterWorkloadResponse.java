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
    @JsonProperty(value = "workload_res_code")

    private Integer workloadResCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_res_str")

    private String workloadResStr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_status")

    private WorkloadStatus workloadStatus;

    public ListClusterWorkloadResponse withWorkloadResCode(Integer workloadResCode) {
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

    public ListClusterWorkloadResponse withWorkloadResStr(String workloadResStr) {
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
        return Objects.equals(this.workloadResCode, listClusterWorkloadResponse.workloadResCode)
            && Objects.equals(this.workloadResStr, listClusterWorkloadResponse.workloadResStr)
            && Objects.equals(this.workloadStatus, listClusterWorkloadResponse.workloadStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadResCode, workloadResStr, workloadStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterWorkloadResponse {\n");
        sb.append("    workloadResCode: ").append(toIndentedString(workloadResCode)).append("\n");
        sb.append("    workloadResStr: ").append(toIndentedString(workloadResStr)).append("\n");
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
