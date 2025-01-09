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
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_operation_list")

    private List<VmOperateResult> failedOperationList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    public BatchRunDesktopsResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码，失败时返回。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public BatchRunDesktopsResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误描述。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

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
     * 任务ID，冷迁移启动时返回。
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
        BatchRunDesktopsResponse that = (BatchRunDesktopsResponse) obj;
        return Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMsg, that.errorMsg)
            && Objects.equals(this.failedOperationList, that.failedOperationList)
            && Objects.equals(this.jobId, that.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMsg, failedOperationList, jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRunDesktopsResponse {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
