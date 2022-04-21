package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowReportRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_run_id")

    private Integer taskRunId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_run_id")

    private Integer caseRunId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brokens_limit_count")

    private Integer brokensLimitCount;

    public ShowReportRequest withTaskRunId(Integer taskRunId) {
        this.taskRunId = taskRunId;
        return this;
    }

    /**
     * 运行任务id
     * minimum: 0
     * maximum: 2147483647
     * @return taskRunId
     */
    public Integer getTaskRunId() {
        return taskRunId;
    }

    public void setTaskRunId(Integer taskRunId) {
        this.taskRunId = taskRunId;
    }

    public ShowReportRequest withCaseRunId(Integer caseRunId) {
        this.caseRunId = caseRunId;
        return this;
    }

    /**
     * 运行用例id
     * minimum: 0
     * maximum: 2147483647
     * @return caseRunId
     */
    public Integer getCaseRunId() {
        return caseRunId;
    }

    public void setCaseRunId(Integer caseRunId) {
        this.caseRunId = caseRunId;
    }

    public ShowReportRequest withBrokensLimitCount(Integer brokensLimitCount) {
        this.brokensLimitCount = brokensLimitCount;
        return this;
    }

    /**
     * 曲线图点数
     * minimum: 0
     * maximum: 2147483647
     * @return brokensLimitCount
     */
    public Integer getBrokensLimitCount() {
        return brokensLimitCount;
    }

    public void setBrokensLimitCount(Integer brokensLimitCount) {
        this.brokensLimitCount = brokensLimitCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowReportRequest showReportRequest = (ShowReportRequest) o;
        return Objects.equals(this.taskRunId, showReportRequest.taskRunId)
            && Objects.equals(this.caseRunId, showReportRequest.caseRunId)
            && Objects.equals(this.brokensLimitCount, showReportRequest.brokensLimitCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskRunId, caseRunId, brokensLimitCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReportRequest {\n");
        sb.append("    taskRunId: ").append(toIndentedString(taskRunId)).append("\n");
        sb.append("    caseRunId: ").append(toIndentedString(caseRunId)).append("\n");
        sb.append("    brokensLimitCount: ").append(toIndentedString(brokensLimitCount)).append("\n");
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
