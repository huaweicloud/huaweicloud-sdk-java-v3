package com.huaweicloud.sdk.workspace.v2.model;

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
public class BatchRunDesktopsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_operation_list")

    private List<VmOperateResult> failedOperationList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    public BatchRunDesktopsResponse withFailedOperationList(List<VmOperateResult> failedOperationList) {
        this.failedOperationList = failedOperationList;
        return this;
    }

    public BatchRunDesktopsResponse addFailedOperationListItem(VmOperateResult failedOperationListItem) {
        if (this.failedOperationList == null) {
            this.failedOperationList = new ArrayList<>();
        }
        this.failedOperationList.add(failedOperationListItem);
        return this;
    }

    public BatchRunDesktopsResponse withFailedOperationList(Consumer<List<VmOperateResult>> failedOperationListSetter) {
        if (this.failedOperationList == null) {
            this.failedOperationList = new ArrayList<>();
        }
        failedOperationListSetter.accept(this.failedOperationList);
        return this;
    }

    /**
     * 操作失败桌面列表。
     * @return failedOperationList
     */
    public List<VmOperateResult> getFailedOperationList() {
        return failedOperationList;
    }

    public void setFailedOperationList(List<VmOperateResult> failedOperationList) {
        this.failedOperationList = failedOperationList;
    }

    public BatchRunDesktopsResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchRunDesktopsResponse batchRunDesktopsResponse = (BatchRunDesktopsResponse) o;
        return Objects.equals(this.failedOperationList, batchRunDesktopsResponse.failedOperationList)
            && Objects.equals(this.jobId, batchRunDesktopsResponse.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failedOperationList, jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRunDesktopsResponse {\n");
        sb.append("    failedOperationList: ").append(toIndentedString(failedOperationList)).append("\n");
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
