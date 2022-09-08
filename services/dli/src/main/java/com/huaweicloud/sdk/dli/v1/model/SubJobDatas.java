package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 子作业JobData信息，对应spark的JobData。
 */
public class SubJobDatas {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submission_time")

    private String submissionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completion_time")

    private String completionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_ids")

    private List<Integer> stageIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_group")

    private String jobGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_tasks")

    private Integer numTasks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_active_tasks")

    private Integer numActiveTasks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_completed_tasks")

    private Integer numCompletedTasks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_skipped_tasks")

    private Integer numSkippedTasks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_failed_tasks")

    private Integer numFailedTasks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_killed_tasks")

    private Integer numKilledTasks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_completed_indices")

    private Integer numCompletedIndices;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_active_stages")

    private Integer numActiveStages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_completed_stages")

    private Integer numCompletedStages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_skipped_stages")

    private Integer numSkippedStages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_failed_stages")

    private Integer numFailedStages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "killed_tasks_summary")

    private Map<String, Integer> killedTasksSummary = null;

    public SubJobDatas withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 子作业ID，对应开源spark JobData的jobId。
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SubJobDatas withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 子作业name，对应开源spark JobData的name。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubJobDatas withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 子作业description，对应开源spark JobData的description。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SubJobDatas withSubmissionTime(String submissionTime) {
        this.submissionTime = submissionTime;
        return this;
    }

    /**
     * 子作业submission_time，对应开源spark JobData的submissionTime。
     * @return submissionTime
     */
    public String getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(String submissionTime) {
        this.submissionTime = submissionTime;
    }

    public SubJobDatas withCompletionTime(String completionTime) {
        this.completionTime = completionTime;
        return this;
    }

    /**
     * 子作业completion_time，对应开源spark JobData的completionTime。
     * @return completionTime
     */
    public String getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(String completionTime) {
        this.completionTime = completionTime;
    }

    public SubJobDatas withStageIds(List<Integer> stageIds) {
        this.stageIds = stageIds;
        return this;
    }

    public SubJobDatas addStageIdsItem(Integer stageIdsItem) {
        if (this.stageIds == null) {
            this.stageIds = new ArrayList<>();
        }
        this.stageIds.add(stageIdsItem);
        return this;
    }

    public SubJobDatas withStageIds(Consumer<List<Integer>> stageIdsSetter) {
        if (this.stageIds == null) {
            this.stageIds = new ArrayList<>();
        }
        stageIdsSetter.accept(this.stageIds);
        return this;
    }

    /**
     * 子作业stage_ids，对应开源spark JobData的stageIds。
     * @return stageIds
     */
    public List<Integer> getStageIds() {
        return stageIds;
    }

    public void setStageIds(List<Integer> stageIds) {
        this.stageIds = stageIds;
    }

    public SubJobDatas withJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
        return this;
    }

    /**
     * 对应DLI的作业ID，对应开源spark JobData的jobGroup。
     * @return jobGroup
     */
    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    public SubJobDatas withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 子作业状态，对应开源spark JobData的status。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SubJobDatas withNumTasks(Integer numTasks) {
        this.numTasks = numTasks;
        return this;
    }

    /**
     * 子作业task的个数，对应开源spark JobData的numTasks。
     * @return numTasks
     */
    public Integer getNumTasks() {
        return numTasks;
    }

    public void setNumTasks(Integer numTasks) {
        this.numTasks = numTasks;
    }

    public SubJobDatas withNumActiveTasks(Integer numActiveTasks) {
        this.numActiveTasks = numActiveTasks;
        return this;
    }

    /**
     * 子作业正在运行的task个数，对应开源spark JobData的numActiveTasks。
     * @return numActiveTasks
     */
    public Integer getNumActiveTasks() {
        return numActiveTasks;
    }

    public void setNumActiveTasks(Integer numActiveTasks) {
        this.numActiveTasks = numActiveTasks;
    }

    public SubJobDatas withNumCompletedTasks(Integer numCompletedTasks) {
        this.numCompletedTasks = numCompletedTasks;
        return this;
    }

    /**
     * 子作业已经完成的task个数，对应开源spark JobData的numCompletedTasks。
     * @return numCompletedTasks
     */
    public Integer getNumCompletedTasks() {
        return numCompletedTasks;
    }

    public void setNumCompletedTasks(Integer numCompletedTasks) {
        this.numCompletedTasks = numCompletedTasks;
    }

    public SubJobDatas withNumSkippedTasks(Integer numSkippedTasks) {
        this.numSkippedTasks = numSkippedTasks;
        return this;
    }

    /**
     * 子作业跳过的task个数，对应开源spark JobData的numSkippedTasks。
     * @return numSkippedTasks
     */
    public Integer getNumSkippedTasks() {
        return numSkippedTasks;
    }

    public void setNumSkippedTasks(Integer numSkippedTasks) {
        this.numSkippedTasks = numSkippedTasks;
    }

    public SubJobDatas withNumFailedTasks(Integer numFailedTasks) {
        this.numFailedTasks = numFailedTasks;
        return this;
    }

    /**
     * 子作业跳失败的task个数，对应开源spark JobData的numFailedTasks。
     * @return numFailedTasks
     */
    public Integer getNumFailedTasks() {
        return numFailedTasks;
    }

    public void setNumFailedTasks(Integer numFailedTasks) {
        this.numFailedTasks = numFailedTasks;
    }

    public SubJobDatas withNumKilledTasks(Integer numKilledTasks) {
        this.numKilledTasks = numKilledTasks;
        return this;
    }

    /**
     * 子作业kill掉的task个数，对应开源spark JobData的numKilledTasks。
     * @return numKilledTasks
     */
    public Integer getNumKilledTasks() {
        return numKilledTasks;
    }

    public void setNumKilledTasks(Integer numKilledTasks) {
        this.numKilledTasks = numKilledTasks;
    }

    public SubJobDatas withNumCompletedIndices(Integer numCompletedIndices) {
        this.numCompletedIndices = numCompletedIndices;
        return this;
    }

    /**
     * 子作业完成指数，对应开源spark JobData的numCompletedIndices。
     * @return numCompletedIndices
     */
    public Integer getNumCompletedIndices() {
        return numCompletedIndices;
    }

    public void setNumCompletedIndices(Integer numCompletedIndices) {
        this.numCompletedIndices = numCompletedIndices;
    }

    public SubJobDatas withNumActiveStages(Integer numActiveStages) {
        this.numActiveStages = numActiveStages;
        return this;
    }

    /**
     * 子作业正在运行的stage个数，对应开源spark JobData的numActiveStages。
     * @return numActiveStages
     */
    public Integer getNumActiveStages() {
        return numActiveStages;
    }

    public void setNumActiveStages(Integer numActiveStages) {
        this.numActiveStages = numActiveStages;
    }

    public SubJobDatas withNumCompletedStages(Integer numCompletedStages) {
        this.numCompletedStages = numCompletedStages;
        return this;
    }

    /**
     * 子作业已经完成的stage个数，对应开源spark JobData的numCompletedStages。
     * @return numCompletedStages
     */
    public Integer getNumCompletedStages() {
        return numCompletedStages;
    }

    public void setNumCompletedStages(Integer numCompletedStages) {
        this.numCompletedStages = numCompletedStages;
    }

    public SubJobDatas withNumSkippedStages(Integer numSkippedStages) {
        this.numSkippedStages = numSkippedStages;
        return this;
    }

    /**
     * 子作业跳过的stage个数，对应开源spark JobData的numSkippedStages。
     * @return numSkippedStages
     */
    public Integer getNumSkippedStages() {
        return numSkippedStages;
    }

    public void setNumSkippedStages(Integer numSkippedStages) {
        this.numSkippedStages = numSkippedStages;
    }

    public SubJobDatas withNumFailedStages(Integer numFailedStages) {
        this.numFailedStages = numFailedStages;
        return this;
    }

    /**
     * 子作业失败的stage个数，对应开源spark JobData的numFailedStages。
     * @return numFailedStages
     */
    public Integer getNumFailedStages() {
        return numFailedStages;
    }

    public void setNumFailedStages(Integer numFailedStages) {
        this.numFailedStages = numFailedStages;
    }

    public SubJobDatas withKilledTasksSummary(Map<String, Integer> killedTasksSummary) {
        this.killedTasksSummary = killedTasksSummary;
        return this;
    }

    public SubJobDatas putKilledTasksSummaryItem(String key, Integer killedTasksSummaryItem) {
        if (this.killedTasksSummary == null) {
            this.killedTasksSummary = new HashMap<>();
        }
        this.killedTasksSummary.put(key, killedTasksSummaryItem);
        return this;
    }

    public SubJobDatas withKilledTasksSummary(Consumer<Map<String, Integer>> killedTasksSummarySetter) {
        if (this.killedTasksSummary == null) {
            this.killedTasksSummary = new HashMap<>();
        }
        killedTasksSummarySetter.accept(this.killedTasksSummary);
        return this;
    }

    /**
     * 子作业killed_tasks_summary，对应开源spark JobData的killedTasksSummary。
     * @return killedTasksSummary
     */
    public Map<String, Integer> getKilledTasksSummary() {
        return killedTasksSummary;
    }

    public void setKilledTasksSummary(Map<String, Integer> killedTasksSummary) {
        this.killedTasksSummary = killedTasksSummary;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubJobDatas subJobDatas = (SubJobDatas) o;
        return Objects.equals(this.id, subJobDatas.id) && Objects.equals(this.name, subJobDatas.name)
            && Objects.equals(this.description, subJobDatas.description)
            && Objects.equals(this.submissionTime, subJobDatas.submissionTime)
            && Objects.equals(this.completionTime, subJobDatas.completionTime)
            && Objects.equals(this.stageIds, subJobDatas.stageIds)
            && Objects.equals(this.jobGroup, subJobDatas.jobGroup) && Objects.equals(this.status, subJobDatas.status)
            && Objects.equals(this.numTasks, subJobDatas.numTasks)
            && Objects.equals(this.numActiveTasks, subJobDatas.numActiveTasks)
            && Objects.equals(this.numCompletedTasks, subJobDatas.numCompletedTasks)
            && Objects.equals(this.numSkippedTasks, subJobDatas.numSkippedTasks)
            && Objects.equals(this.numFailedTasks, subJobDatas.numFailedTasks)
            && Objects.equals(this.numKilledTasks, subJobDatas.numKilledTasks)
            && Objects.equals(this.numCompletedIndices, subJobDatas.numCompletedIndices)
            && Objects.equals(this.numActiveStages, subJobDatas.numActiveStages)
            && Objects.equals(this.numCompletedStages, subJobDatas.numCompletedStages)
            && Objects.equals(this.numSkippedStages, subJobDatas.numSkippedStages)
            && Objects.equals(this.numFailedStages, subJobDatas.numFailedStages)
            && Objects.equals(this.killedTasksSummary, subJobDatas.killedTasksSummary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            submissionTime,
            completionTime,
            stageIds,
            jobGroup,
            status,
            numTasks,
            numActiveTasks,
            numCompletedTasks,
            numSkippedTasks,
            numFailedTasks,
            numKilledTasks,
            numCompletedIndices,
            numActiveStages,
            numCompletedStages,
            numSkippedStages,
            numFailedStages,
            killedTasksSummary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubJobDatas {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    submissionTime: ").append(toIndentedString(submissionTime)).append("\n");
        sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
        sb.append("    stageIds: ").append(toIndentedString(stageIds)).append("\n");
        sb.append("    jobGroup: ").append(toIndentedString(jobGroup)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    numTasks: ").append(toIndentedString(numTasks)).append("\n");
        sb.append("    numActiveTasks: ").append(toIndentedString(numActiveTasks)).append("\n");
        sb.append("    numCompletedTasks: ").append(toIndentedString(numCompletedTasks)).append("\n");
        sb.append("    numSkippedTasks: ").append(toIndentedString(numSkippedTasks)).append("\n");
        sb.append("    numFailedTasks: ").append(toIndentedString(numFailedTasks)).append("\n");
        sb.append("    numKilledTasks: ").append(toIndentedString(numKilledTasks)).append("\n");
        sb.append("    numCompletedIndices: ").append(toIndentedString(numCompletedIndices)).append("\n");
        sb.append("    numActiveStages: ").append(toIndentedString(numActiveStages)).append("\n");
        sb.append("    numCompletedStages: ").append(toIndentedString(numCompletedStages)).append("\n");
        sb.append("    numSkippedStages: ").append(toIndentedString(numSkippedStages)).append("\n");
        sb.append("    numFailedStages: ").append(toIndentedString(numFailedStages)).append("\n");
        sb.append("    killedTasksSummary: ").append(toIndentedString(killedTasksSummary)).append("\n");
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
