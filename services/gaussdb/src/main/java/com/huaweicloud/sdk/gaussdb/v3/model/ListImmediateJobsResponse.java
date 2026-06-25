package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ListImmediateJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<TaskDetailInfo> jobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_names")

    private List<String> actionNames = null;

    public ListImmediateJobsResponse withJobs(List<TaskDetailInfo> jobs) {
        this.jobs = jobs;
        return this;
    }

    public ListImmediateJobsResponse addJobsItem(TaskDetailInfo jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public ListImmediateJobsResponse withJobs(Consumer<List<TaskDetailInfo>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 任务详情。
     * @return jobs
     */
    public List<TaskDetailInfo> getJobs() {
        return jobs;
    }

    public void setJobs(List<TaskDetailInfo> jobs) {
        this.jobs = jobs;
    }

    public ListImmediateJobsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 任务总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListImmediateJobsResponse withActionNames(List<String> actionNames) {
        this.actionNames = actionNames;
        return this;
    }

    public ListImmediateJobsResponse addActionNamesItem(String actionNamesItem) {
        if (this.actionNames == null) {
            this.actionNames = new ArrayList<>();
        }
        this.actionNames.add(actionNamesItem);
        return this;
    }

    public ListImmediateJobsResponse withActionNames(Consumer<List<String>> actionNamesSetter) {
        if (this.actionNames == null) {
            this.actionNames = new ArrayList<>();
        }
        actionNamesSetter.accept(this.actionNames);
        return this;
    }

    /**
     * **参数解释**：  支持筛选的任务名称。  **取值范围**：  不涉及。
     * @return actionNames
     */
    public List<String> getActionNames() {
        return actionNames;
    }

    public void setActionNames(List<String> actionNames) {
        this.actionNames = actionNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListImmediateJobsResponse that = (ListImmediateJobsResponse) obj;
        return Objects.equals(this.jobs, that.jobs) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.actionNames, that.actionNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs, totalCount, actionNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListImmediateJobsResponse {\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    actionNames: ").append(toIndentedString(actionNames)).append("\n");
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
