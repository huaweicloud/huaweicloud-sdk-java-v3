package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修复进度明细。
 */
public class JobDetailRespRepairProgressInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private String progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_progress_details")

    private JobDetailRespRepairProgressInfoRepairProgressDetails repairProgressDetails;

    public JobDetailRespRepairProgressInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 修复状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public JobDetailRespRepairProgressInfo withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 修复进度，百分比。
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public JobDetailRespRepairProgressInfo withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误信息。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public JobDetailRespRepairProgressInfo withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public JobDetailRespRepairProgressInfo withRepairProgressDetails(
        JobDetailRespRepairProgressInfoRepairProgressDetails repairProgressDetails) {
        this.repairProgressDetails = repairProgressDetails;
        return this;
    }

    public JobDetailRespRepairProgressInfo withRepairProgressDetails(
        Consumer<JobDetailRespRepairProgressInfoRepairProgressDetails> repairProgressDetailsSetter) {
        if (this.repairProgressDetails == null) {
            this.repairProgressDetails = new JobDetailRespRepairProgressInfoRepairProgressDetails();
            repairProgressDetailsSetter.accept(this.repairProgressDetails);
        }

        return this;
    }

    /**
     * Get repairProgressDetails
     * @return repairProgressDetails
     */
    public JobDetailRespRepairProgressInfoRepairProgressDetails getRepairProgressDetails() {
        return repairProgressDetails;
    }

    public void setRepairProgressDetails(JobDetailRespRepairProgressInfoRepairProgressDetails repairProgressDetails) {
        this.repairProgressDetails = repairProgressDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobDetailRespRepairProgressInfo that = (JobDetailRespRepairProgressInfo) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.progress, that.progress)
            && Objects.equals(this.errorMsg, that.errorMsg) && Objects.equals(this.count, that.count)
            && Objects.equals(this.repairProgressDetails, that.repairProgressDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, progress, errorMsg, count, repairProgressDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobDetailRespRepairProgressInfo {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    repairProgressDetails: ").append(toIndentedString(repairProgressDetails)).append("\n");
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
