package com.huaweicloud.sdk.clouddeploy.v2.model;

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
public class ListTaskSuccessRateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks_success_rate")

    private List<TaskSuccessRate> tasksSuccessRate = null;

    public ListTaskSuccessRateResponse withProjectId(String projectId) {
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

    public ListTaskSuccessRateResponse withProjectName(String projectName) {
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

    public ListTaskSuccessRateResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 任务执行开始时间范围的左边界（包含），格式yyyy-MM-dd
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListTaskSuccessRateResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 任务执行开始时间范围的右边界（包含），格式yyyy-MM-dd 。最大时间范围为1年。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListTaskSuccessRateResponse withTasksSuccessRate(List<TaskSuccessRate> tasksSuccessRate) {
        this.tasksSuccessRate = tasksSuccessRate;
        return this;
    }

    public ListTaskSuccessRateResponse addTasksSuccessRateItem(TaskSuccessRate tasksSuccessRateItem) {
        if (this.tasksSuccessRate == null) {
            this.tasksSuccessRate = new ArrayList<>();
        }
        this.tasksSuccessRate.add(tasksSuccessRateItem);
        return this;
    }

    public ListTaskSuccessRateResponse withTasksSuccessRate(Consumer<List<TaskSuccessRate>> tasksSuccessRateSetter) {
        if (this.tasksSuccessRate == null) {
            this.tasksSuccessRate = new ArrayList<>();
        }
        tasksSuccessRateSetter.accept(this.tasksSuccessRate);
        return this;
    }

    /**
     * 任务的成功率列表
     * @return tasksSuccessRate
     */
    public List<TaskSuccessRate> getTasksSuccessRate() {
        return tasksSuccessRate;
    }

    public void setTasksSuccessRate(List<TaskSuccessRate> tasksSuccessRate) {
        this.tasksSuccessRate = tasksSuccessRate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTaskSuccessRateResponse listTaskSuccessRateResponse = (ListTaskSuccessRateResponse) o;
        return Objects.equals(this.projectId, listTaskSuccessRateResponse.projectId)
            && Objects.equals(this.projectName, listTaskSuccessRateResponse.projectName)
            && Objects.equals(this.startTime, listTaskSuccessRateResponse.startTime)
            && Objects.equals(this.endTime, listTaskSuccessRateResponse.endTime)
            && Objects.equals(this.tasksSuccessRate, listTaskSuccessRateResponse.tasksSuccessRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, projectName, startTime, endTime, tasksSuccessRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTaskSuccessRateResponse {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    tasksSuccessRate: ").append(toIndentedString(tasksSuccessRate)).append("\n");
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
