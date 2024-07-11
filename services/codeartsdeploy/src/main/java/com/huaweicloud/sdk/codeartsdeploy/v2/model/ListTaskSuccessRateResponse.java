package com.huaweicloud.sdk.codeartsdeploy.v2.model;

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
    @JsonProperty(value = "start_date")

    private String startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_date")

    private String endDate;

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

    public ListTaskSuccessRateResponse withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * 部署应用开始时间范围的左边界（包含），格式yyyy-MM-dd
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public ListTaskSuccessRateResponse withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * 部署应用开始时间范围的右边界（包含），格式yyyy-MM-dd 。最大时间范围为1年。
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
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
     * 应用的成功率列表
     * @return tasksSuccessRate
     */
    public List<TaskSuccessRate> getTasksSuccessRate() {
        return tasksSuccessRate;
    }

    public void setTasksSuccessRate(List<TaskSuccessRate> tasksSuccessRate) {
        this.tasksSuccessRate = tasksSuccessRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTaskSuccessRateResponse that = (ListTaskSuccessRateResponse) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.projectName, that.projectName)
            && Objects.equals(this.startDate, that.startDate) && Objects.equals(this.endDate, that.endDate)
            && Objects.equals(this.tasksSuccessRate, that.tasksSuccessRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, projectName, startDate, endDate, tasksSuccessRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTaskSuccessRateResponse {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
