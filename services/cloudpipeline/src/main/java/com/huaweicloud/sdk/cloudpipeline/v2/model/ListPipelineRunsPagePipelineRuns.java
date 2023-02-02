package com.huaweicloud.sdk.cloudpipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListPipelineRunsPagePipelineRuns
 */
public class ListPipelineRunsPagePipelineRuns {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_id")

    private String pipelineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_run_id")

    private String pipelineRunId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_id")

    private String executorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_name")

    private String executorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_status_list")

    private List<ListPipelineRunsPageStageStatusList> stageStatusList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_number")

    private Integer runNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private String triggerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_params")

    private ListPipelineRunsPageBuildParams buildParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_params")

    private ListPipelinesPageLatestRunArtifactParams artifactParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    public ListPipelineRunsPagePipelineRuns withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * 流水线ID
     * @return pipelineId
     */
    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public ListPipelineRunsPagePipelineRuns withPipelineRunId(String pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
        return this;
    }

    /**
     * 流水线运行实例ID
     * @return pipelineRunId
     */
    public String getPipelineRunId() {
        return pipelineRunId;
    }

    public void setPipelineRunId(String pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
    }

    public ListPipelineRunsPagePipelineRuns withExecutorId(String executorId) {
        this.executorId = executorId;
        return this;
    }

    /**
     * 执行人ID
     * @return executorId
     */
    public String getExecutorId() {
        return executorId;
    }

    public void setExecutorId(String executorId) {
        this.executorId = executorId;
    }

    public ListPipelineRunsPagePipelineRuns withExecutorName(String executorName) {
        this.executorName = executorName;
        return this;
    }

    /**
     * 执行人名称
     * @return executorName
     */
    public String getExecutorName() {
        return executorName;
    }

    public void setExecutorName(String executorName) {
        this.executorName = executorName;
    }

    public ListPipelineRunsPagePipelineRuns withStageStatusList(
        List<ListPipelineRunsPageStageStatusList> stageStatusList) {
        this.stageStatusList = stageStatusList;
        return this;
    }

    public ListPipelineRunsPagePipelineRuns addStageStatusListItem(
        ListPipelineRunsPageStageStatusList stageStatusListItem) {
        if (this.stageStatusList == null) {
            this.stageStatusList = new ArrayList<>();
        }
        this.stageStatusList.add(stageStatusListItem);
        return this;
    }

    public ListPipelineRunsPagePipelineRuns withStageStatusList(
        Consumer<List<ListPipelineRunsPageStageStatusList>> stageStatusListSetter) {
        if (this.stageStatusList == null) {
            this.stageStatusList = new ArrayList<>();
        }
        stageStatusListSetter.accept(this.stageStatusList);
        return this;
    }

    /**
     * 阶段信息
     * @return stageStatusList
     */
    public List<ListPipelineRunsPageStageStatusList> getStageStatusList() {
        return stageStatusList;
    }

    public void setStageStatusList(List<ListPipelineRunsPageStageStatusList> stageStatusList) {
        this.stageStatusList = stageStatusList;
    }

    public ListPipelineRunsPagePipelineRuns withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListPipelineRunsPagePipelineRuns withRunNumber(Integer runNumber) {
        this.runNumber = runNumber;
        return this;
    }

    /**
     * 运行序号
     * @return runNumber
     */
    public Integer getRunNumber() {
        return runNumber;
    }

    public void setRunNumber(Integer runNumber) {
        this.runNumber = runNumber;
    }

    public ListPipelineRunsPagePipelineRuns withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * 触发类型
     * @return triggerType
     */
    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public ListPipelineRunsPagePipelineRuns withBuildParams(ListPipelineRunsPageBuildParams buildParams) {
        this.buildParams = buildParams;
        return this;
    }

    public ListPipelineRunsPagePipelineRuns withBuildParams(
        Consumer<ListPipelineRunsPageBuildParams> buildParamsSetter) {
        if (this.buildParams == null) {
            this.buildParams = new ListPipelineRunsPageBuildParams();
            buildParamsSetter.accept(this.buildParams);
        }

        return this;
    }

    /**
     * Get buildParams
     * @return buildParams
     */
    public ListPipelineRunsPageBuildParams getBuildParams() {
        return buildParams;
    }

    public void setBuildParams(ListPipelineRunsPageBuildParams buildParams) {
        this.buildParams = buildParams;
    }

    public ListPipelineRunsPagePipelineRuns withArtifactParams(
        ListPipelinesPageLatestRunArtifactParams artifactParams) {
        this.artifactParams = artifactParams;
        return this;
    }

    public ListPipelineRunsPagePipelineRuns withArtifactParams(
        Consumer<ListPipelinesPageLatestRunArtifactParams> artifactParamsSetter) {
        if (this.artifactParams == null) {
            this.artifactParams = new ListPipelinesPageLatestRunArtifactParams();
            artifactParamsSetter.accept(this.artifactParams);
        }

        return this;
    }

    /**
     * Get artifactParams
     * @return artifactParams
     */
    public ListPipelinesPageLatestRunArtifactParams getArtifactParams() {
        return artifactParams;
    }

    public void setArtifactParams(ListPipelinesPageLatestRunArtifactParams artifactParams) {
        this.artifactParams = artifactParams;
    }

    public ListPipelineRunsPagePipelineRuns withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListPipelineRunsPagePipelineRuns withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPipelineRunsPagePipelineRuns listPipelineRunsPagePipelineRuns = (ListPipelineRunsPagePipelineRuns) o;
        return Objects.equals(this.pipelineId, listPipelineRunsPagePipelineRuns.pipelineId)
            && Objects.equals(this.pipelineRunId, listPipelineRunsPagePipelineRuns.pipelineRunId)
            && Objects.equals(this.executorId, listPipelineRunsPagePipelineRuns.executorId)
            && Objects.equals(this.executorName, listPipelineRunsPagePipelineRuns.executorName)
            && Objects.equals(this.stageStatusList, listPipelineRunsPagePipelineRuns.stageStatusList)
            && Objects.equals(this.status, listPipelineRunsPagePipelineRuns.status)
            && Objects.equals(this.runNumber, listPipelineRunsPagePipelineRuns.runNumber)
            && Objects.equals(this.triggerType, listPipelineRunsPagePipelineRuns.triggerType)
            && Objects.equals(this.buildParams, listPipelineRunsPagePipelineRuns.buildParams)
            && Objects.equals(this.artifactParams, listPipelineRunsPagePipelineRuns.artifactParams)
            && Objects.equals(this.startTime, listPipelineRunsPagePipelineRuns.startTime)
            && Objects.equals(this.endTime, listPipelineRunsPagePipelineRuns.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipelineId,
            pipelineRunId,
            executorId,
            executorName,
            stageStatusList,
            status,
            runNumber,
            triggerType,
            buildParams,
            artifactParams,
            startTime,
            endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPipelineRunsPagePipelineRuns {\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    pipelineRunId: ").append(toIndentedString(pipelineRunId)).append("\n");
        sb.append("    executorId: ").append(toIndentedString(executorId)).append("\n");
        sb.append("    executorName: ").append(toIndentedString(executorName)).append("\n");
        sb.append("    stageStatusList: ").append(toIndentedString(stageStatusList)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    runNumber: ").append(toIndentedString(runNumber)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    buildParams: ").append(toIndentedString(buildParams)).append("\n");
        sb.append("    artifactParams: ").append(toIndentedString(artifactParams)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
