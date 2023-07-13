package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowTaskCaseAwChartRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_run_id")

    private Integer taskRunId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_run_id")

    private Integer caseRunId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail_id")

    private String detailId;

    public ShowTaskCaseAwChartRequest withTaskRunId(Integer taskRunId) {
        this.taskRunId = taskRunId;
        return this;
    }

    /**
     * 任务运行id（报告id）
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

    public ShowTaskCaseAwChartRequest withCaseRunId(Integer caseRunId) {
        this.caseRunId = caseRunId;
        return this;
    }

    /**
     * 用例运行id
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

    public ShowTaskCaseAwChartRequest withDetailId(String detailId) {
        this.detailId = detailId;
        return this;
    }

    /**
     * 详情id
     * @return detailId
     */
    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskCaseAwChartRequest that = (ShowTaskCaseAwChartRequest) obj;
        return Objects.equals(this.taskRunId, that.taskRunId) && Objects.equals(this.caseRunId, that.caseRunId)
            && Objects.equals(this.detailId, that.detailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskRunId, caseRunId, detailId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskCaseAwChartRequest {\n");
        sb.append("    taskRunId: ").append(toIndentedString(taskRunId)).append("\n");
        sb.append("    caseRunId: ").append(toIndentedString(caseRunId)).append("\n");
        sb.append("    detailId: ").append(toIndentedString(detailId)).append("\n");
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
