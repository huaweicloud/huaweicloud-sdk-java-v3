package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateTaskRequestBody
 */
public class UpdateTaskRequestBody {

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
    @JsonProperty(value = "project_id")

    private Integer projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_status")

    private Integer runStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_type")

    private Integer runType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_run_info")

    private TaskRunInfo taskRunInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_list")

    private List<CaseInfoDetail> caseList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_mode")

    private Integer operateMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bench_concurrent")

    private Integer benchConcurrent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_temp_running_data")

    private List<RelatedTempRunningData> relatedTempRunningData = null;

    public UpdateTaskRequestBody withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * minimum: 0
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UpdateTaskRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateTaskRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateTaskRequestBody withProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * project_id
     * minimum: 0
     * maximum: 2147483647
     * @return projectId
     */
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public UpdateTaskRequestBody withRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
        return this;
    }

    /**
     * run_status
     * minimum: 0
     * maximum: 2147483647
     * @return runStatus
     */
    public Integer getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
    }

    public UpdateTaskRequestBody withRunType(Integer runType) {
        this.runType = runType;
        return this;
    }

    /**
     * run_type
     * minimum: 0
     * maximum: 2147483647
     * @return runType
     */
    public Integer getRunType() {
        return runType;
    }

    public void setRunType(Integer runType) {
        this.runType = runType;
    }

    public UpdateTaskRequestBody withTaskRunInfo(TaskRunInfo taskRunInfo) {
        this.taskRunInfo = taskRunInfo;
        return this;
    }

    public UpdateTaskRequestBody withTaskRunInfo(Consumer<TaskRunInfo> taskRunInfoSetter) {
        if (this.taskRunInfo == null) {
            this.taskRunInfo = new TaskRunInfo();
            taskRunInfoSetter.accept(this.taskRunInfo);
        }

        return this;
    }

    /**
     * Get taskRunInfo
     * @return taskRunInfo
     */
    public TaskRunInfo getTaskRunInfo() {
        return taskRunInfo;
    }

    public void setTaskRunInfo(TaskRunInfo taskRunInfo) {
        this.taskRunInfo = taskRunInfo;
    }

    public UpdateTaskRequestBody withCaseList(List<CaseInfoDetail> caseList) {
        this.caseList = caseList;
        return this;
    }

    public UpdateTaskRequestBody addCaseListItem(CaseInfoDetail caseListItem) {
        if (this.caseList == null) {
            this.caseList = new ArrayList<>();
        }
        this.caseList.add(caseListItem);
        return this;
    }

    public UpdateTaskRequestBody withCaseList(Consumer<List<CaseInfoDetail>> caseListSetter) {
        if (this.caseList == null) {
            this.caseList = new ArrayList<>();
        }
        caseListSetter.accept(this.caseList);
        return this;
    }

    /**
     * case_list
     * @return caseList
     */
    public List<CaseInfoDetail> getCaseList() {
        return caseList;
    }

    public void setCaseList(List<CaseInfoDetail> caseList) {
        this.caseList = caseList;
    }

    public UpdateTaskRequestBody withOperateMode(Integer operateMode) {
        this.operateMode = operateMode;
        return this;
    }

    /**
     * operate_mode
     * minimum: 0
     * maximum: 2147483647
     * @return operateMode
     */
    public Integer getOperateMode() {
        return operateMode;
    }

    public void setOperateMode(Integer operateMode) {
        this.operateMode = operateMode;
    }

    public UpdateTaskRequestBody withBenchConcurrent(Integer benchConcurrent) {
        this.benchConcurrent = benchConcurrent;
        return this;
    }

    /**
     * bench_concurrent
     * minimum: 0
     * maximum: 2147483647
     * @return benchConcurrent
     */
    public Integer getBenchConcurrent() {
        return benchConcurrent;
    }

    public void setBenchConcurrent(Integer benchConcurrent) {
        this.benchConcurrent = benchConcurrent;
    }

    public UpdateTaskRequestBody withRelatedTempRunningData(List<RelatedTempRunningData> relatedTempRunningData) {
        this.relatedTempRunningData = relatedTempRunningData;
        return this;
    }

    public UpdateTaskRequestBody addRelatedTempRunningDataItem(RelatedTempRunningData relatedTempRunningDataItem) {
        if (this.relatedTempRunningData == null) {
            this.relatedTempRunningData = new ArrayList<>();
        }
        this.relatedTempRunningData.add(relatedTempRunningDataItem);
        return this;
    }

    public UpdateTaskRequestBody withRelatedTempRunningData(
        Consumer<List<RelatedTempRunningData>> relatedTempRunningDataSetter) {
        if (this.relatedTempRunningData == null) {
            this.relatedTempRunningData = new ArrayList<>();
        }
        relatedTempRunningDataSetter.accept(this.relatedTempRunningData);
        return this;
    }

    /**
     * related_temp_running_data
     * @return relatedTempRunningData
     */
    public List<RelatedTempRunningData> getRelatedTempRunningData() {
        return relatedTempRunningData;
    }

    public void setRelatedTempRunningData(List<RelatedTempRunningData> relatedTempRunningData) {
        this.relatedTempRunningData = relatedTempRunningData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTaskRequestBody that = (UpdateTaskRequestBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.runStatus, that.runStatus) && Objects.equals(this.runType, that.runType)
            && Objects.equals(this.taskRunInfo, that.taskRunInfo) && Objects.equals(this.caseList, that.caseList)
            && Objects.equals(this.operateMode, that.operateMode)
            && Objects.equals(this.benchConcurrent, that.benchConcurrent)
            && Objects.equals(this.relatedTempRunningData, that.relatedTempRunningData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            projectId,
            runStatus,
            runType,
            taskRunInfo,
            caseList,
            operateMode,
            benchConcurrent,
            relatedTempRunningData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTaskRequestBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
        sb.append("    runType: ").append(toIndentedString(runType)).append("\n");
        sb.append("    taskRunInfo: ").append(toIndentedString(taskRunInfo)).append("\n");
        sb.append("    caseList: ").append(toIndentedString(caseList)).append("\n");
        sb.append("    operateMode: ").append(toIndentedString(operateMode)).append("\n");
        sb.append("    benchConcurrent: ").append(toIndentedString(benchConcurrent)).append("\n");
        sb.append("    relatedTempRunningData: ").append(toIndentedString(relatedTempRunningData)).append("\n");
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
