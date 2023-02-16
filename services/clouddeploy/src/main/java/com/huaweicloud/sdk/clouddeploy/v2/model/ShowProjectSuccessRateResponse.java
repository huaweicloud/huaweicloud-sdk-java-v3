package com.huaweicloud.sdk.clouddeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowProjectSuccessRateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_rate")

    private String successRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    private String startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_date")

    private String endDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_count")

    private Integer taskCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_count")

    private Integer recordCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_record_count")

    private Integer successRecordCount;

    public ShowProjectSuccessRateResponse withSuccessRate(String successRate) {
        this.successRate = successRate;
        return this;
    }

    /**
     * 成功率
     * @return successRate
     */
    public String getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(String successRate) {
        this.successRate = successRate;
    }

    public ShowProjectSuccessRateResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowProjectSuccessRateResponse withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 项目名称
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ShowProjectSuccessRateResponse withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * 应用部署开始时间范围的左边界（包含），格式yyyy-MM-dd
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public ShowProjectSuccessRateResponse withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * 应用部署开始时间范围的右边界（包含），格式yyyy-MM-dd
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ShowProjectSuccessRateResponse withTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
        return this;
    }

    /**
     * 查询到的应用数
     * @return taskCount
     */
    public Integer getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
    }

    public ShowProjectSuccessRateResponse withRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
        return this;
    }

    /**
     * 查询到的应用部署记录数
     * @return recordCount
     */
    public Integer getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
    }

    public ShowProjectSuccessRateResponse withSuccessRecordCount(Integer successRecordCount) {
        this.successRecordCount = successRecordCount;
        return this;
    }

    /**
     * 成功的应用部署记录数
     * @return successRecordCount
     */
    public Integer getSuccessRecordCount() {
        return successRecordCount;
    }

    public void setSuccessRecordCount(Integer successRecordCount) {
        this.successRecordCount = successRecordCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowProjectSuccessRateResponse showProjectSuccessRateResponse = (ShowProjectSuccessRateResponse) o;
        return Objects.equals(this.successRate, showProjectSuccessRateResponse.successRate)
            && Objects.equals(this.projectId, showProjectSuccessRateResponse.projectId)
            && Objects.equals(this.projectName, showProjectSuccessRateResponse.projectName)
            && Objects.equals(this.startDate, showProjectSuccessRateResponse.startDate)
            && Objects.equals(this.endDate, showProjectSuccessRateResponse.endDate)
            && Objects.equals(this.taskCount, showProjectSuccessRateResponse.taskCount)
            && Objects.equals(this.recordCount, showProjectSuccessRateResponse.recordCount)
            && Objects.equals(this.successRecordCount, showProjectSuccessRateResponse.successRecordCount);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(successRate, projectId, projectName, startDate, endDate, taskCount, recordCount, successRecordCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectSuccessRateResponse {\n");
        sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    taskCount: ").append(toIndentedString(taskCount)).append("\n");
        sb.append("    recordCount: ").append(toIndentedString(recordCount)).append("\n");
        sb.append("    successRecordCount: ").append(toIndentedString(successRecordCount)).append("\n");
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
