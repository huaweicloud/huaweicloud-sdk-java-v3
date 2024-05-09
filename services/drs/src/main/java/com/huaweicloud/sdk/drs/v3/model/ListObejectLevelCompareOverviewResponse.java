package com.huaweicloud.sdk.drs.v3.model;

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
public class ListObejectLevelCompareOverviewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_status")

    private String exportStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_remain_seconds")

    private Long reportRemainSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_job_id")

    private String compareJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_result")

    private List<ObjectsCompareOverviewInfo> compareResult = null;

    public ListObejectLevelCompareOverviewResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 对比任务创建时间，UTC时间，例如：2024-04-09T07:00:57Z。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ListObejectLevelCompareOverviewResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 对比任务开始时间，UTC时间，例如：2024-04-09T07:00:57Z。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListObejectLevelCompareOverviewResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 对比任务状态。 取值： - RUNNING：运行中。 - WAITING_FOR_RUNNING：等待启动中。 - SUCCESSFUL：完成。 - FAILED：失败。 - CANCELLED：已取消。 - TIMEOUT_INTERRUPT：超时中断。 - FULL_DOING：全量校验中。 - INCRE_DOING：增量校验中。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListObejectLevelCompareOverviewResponse withExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
        return this;
    }

    /**
     * 生成对比结果报告文件的状态：  - INIT：初始状态。  - EXPORTING：对比结果导出中。  - EXPORT_COMPLETE：对比结果导出完成。  - EXPORT_COMMON_FAILED：对比结果导出失败。
     * @return exportStatus
     */
    public String getExportStatus() {
        return exportStatus;
    }

    public void setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
    }

    public ListObejectLevelCompareOverviewResponse withReportRemainSeconds(Long reportRemainSeconds) {
        this.reportRemainSeconds = reportRemainSeconds;
        return this;
    }

    /**
     * 对比结果报告文件有效期剩余时间，单位秒，报告未生成时返回-1。
     * @return reportRemainSeconds
     */
    public Long getReportRemainSeconds() {
        return reportRemainSeconds;
    }

    public void setReportRemainSeconds(Long reportRemainSeconds) {
        this.reportRemainSeconds = reportRemainSeconds;
    }

    public ListObejectLevelCompareOverviewResponse withCompareJobId(String compareJobId) {
        this.compareJobId = compareJobId;
        return this;
    }

    /**
     * 对比任务ID。
     * @return compareJobId
     */
    public String getCompareJobId() {
        return compareJobId;
    }

    public void setCompareJobId(String compareJobId) {
        this.compareJobId = compareJobId;
    }

    public ListObejectLevelCompareOverviewResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 失败原因。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ListObejectLevelCompareOverviewResponse withCompareResult(List<ObjectsCompareOverviewInfo> compareResult) {
        this.compareResult = compareResult;
        return this;
    }

    public ListObejectLevelCompareOverviewResponse addCompareResultItem(ObjectsCompareOverviewInfo compareResultItem) {
        if (this.compareResult == null) {
            this.compareResult = new ArrayList<>();
        }
        this.compareResult.add(compareResultItem);
        return this;
    }

    public ListObejectLevelCompareOverviewResponse withCompareResult(
        Consumer<List<ObjectsCompareOverviewInfo>> compareResultSetter) {
        if (this.compareResult == null) {
            this.compareResult = new ArrayList<>();
        }
        compareResultSetter.accept(this.compareResult);
        return this;
    }

    /**
     * 对比结果。
     * @return compareResult
     */
    public List<ObjectsCompareOverviewInfo> getCompareResult() {
        return compareResult;
    }

    public void setCompareResult(List<ObjectsCompareOverviewInfo> compareResult) {
        this.compareResult = compareResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListObejectLevelCompareOverviewResponse that = (ListObejectLevelCompareOverviewResponse) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.exportStatus, that.exportStatus)
            && Objects.equals(this.reportRemainSeconds, that.reportRemainSeconds)
            && Objects.equals(this.compareJobId, that.compareJobId) && Objects.equals(this.errorMsg, that.errorMsg)
            && Objects.equals(this.compareResult, that.compareResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime,
            startTime,
            status,
            exportStatus,
            reportRemainSeconds,
            compareJobId,
            errorMsg,
            compareResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListObejectLevelCompareOverviewResponse {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    exportStatus: ").append(toIndentedString(exportStatus)).append("\n");
        sb.append("    reportRemainSeconds: ").append(toIndentedString(reportRemainSeconds)).append("\n");
        sb.append("    compareJobId: ").append(toIndentedString(compareJobId)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    compareResult: ").append(toIndentedString(compareResult)).append("\n");
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
