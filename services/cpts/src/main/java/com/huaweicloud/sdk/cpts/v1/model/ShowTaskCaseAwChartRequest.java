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
     * 运行任务id，即报告id。启动任务（更新任务状态或批量启停任务）接口，会返回运行任务id。
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
     * 运行用例id，通过报告管理中的“内外融合当前任务用例列表”接口获取：使用任务运行id（task_run_id）作为路径参数，可以查询到该报告关联的用例运行id集合，即返回结构体中result.case_aw_info_list[index].case_uri_i为索引为index的运行用例id（case_run_id）。
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
     * 运行用例详情id，通过报告管理中的“内外融合当前任务用例列表”接口获取：使用运行任务id（task_run_id）作为路径参数，可以查询到该报告关联的运行用例详情id集合，即返回结构体中result.case_aw_info_list[index].testcaseId为索引为index的运行用例详情id（detail_id）。
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
