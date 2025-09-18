package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 流水线及其最近一次运行信息。 **取值范围**： 不涉及。 
 */
public class PipelineLatestRun {

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

    private List<PipelineLatestRunStageStatusList> stageStatusList = null;

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

    private PipelineLatestRunBuildParams buildParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_params")

    private PipelineLatestRunArtifactParams artifactParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modify_url")

    private String modifyUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail_url")

    private String detailUrl;

    public PipelineLatestRun withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * **参数解释**： 流水线ID。 **取值范围**： 32位字符，仅由数字和字母组成。 
     * @return pipelineId
     */
    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public PipelineLatestRun withPipelineRunId(String pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
        return this;
    }

    /**
     * **参数解释**： 流水线运行实例ID。 **取值范围**： 32位字符，仅由数字和字母组成。 
     * @return pipelineRunId
     */
    public String getPipelineRunId() {
        return pipelineRunId;
    }

    public void setPipelineRunId(String pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
    }

    public PipelineLatestRun withExecutorId(String executorId) {
        this.executorId = executorId;
        return this;
    }

    /**
     * **参数解释**： 执行人ID。 **取值范围**： 32位字符，仅由数字和字母组成。 
     * @return executorId
     */
    public String getExecutorId() {
        return executorId;
    }

    public void setExecutorId(String executorId) {
        this.executorId = executorId;
    }

    public PipelineLatestRun withExecutorName(String executorName) {
        this.executorName = executorName;
        return this;
    }

    /**
     * **参数解释**： 执行人名称。 **取值范围**： 不涉及。 
     * @return executorName
     */
    public String getExecutorName() {
        return executorName;
    }

    public void setExecutorName(String executorName) {
        this.executorName = executorName;
    }

    public PipelineLatestRun withStageStatusList(List<PipelineLatestRunStageStatusList> stageStatusList) {
        this.stageStatusList = stageStatusList;
        return this;
    }

    public PipelineLatestRun addStageStatusListItem(PipelineLatestRunStageStatusList stageStatusListItem) {
        if (this.stageStatusList == null) {
            this.stageStatusList = new ArrayList<>();
        }
        this.stageStatusList.add(stageStatusListItem);
        return this;
    }

    public PipelineLatestRun withStageStatusList(
        Consumer<List<PipelineLatestRunStageStatusList>> stageStatusListSetter) {
        if (this.stageStatusList == null) {
            this.stageStatusList = new ArrayList<>();
        }
        stageStatusListSetter.accept(this.stageStatusList);
        return this;
    }

    /**
     * **参数解释**： 阶段状态信息列表，包含各阶段的详细状态信息。 **约束限制**： 不涉及。 
     * @return stageStatusList
     */
    public List<PipelineLatestRunStageStatusList> getStageStatusList() {
        return stageStatusList;
    }

    public void setStageStatusList(List<PipelineLatestRunStageStatusList> stageStatusList) {
        this.stageStatusList = stageStatusList;
    }

    public PipelineLatestRun withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 流水线运行实例状态。 **取值范围**： - COMPLETED：已完成。 - RUNNING：运行中。 - FAILED：失败。 - CANCELED：取消。 - PAUSED：暂停。 - SUSPEND：挂起。 - IGNORED：忽略。 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PipelineLatestRun withRunNumber(Integer runNumber) {
        this.runNumber = runNumber;
        return this;
    }

    /**
     * **参数解释**： 流水线运行序号。 **取值范围**： 大于等于 1。 
     * @return runNumber
     */
    public Integer getRunNumber() {
        return runNumber;
    }

    public void setRunNumber(Integer runNumber) {
        this.runNumber = runNumber;
    }

    public PipelineLatestRun withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * **参数解释**： 触发类型。 **取值范围**： - Manual：手动触发。 - Scheduler：定时任务。 - MR：MR触发。 - Push：Push事件触发。 - CreateTag：Tag事件触发。 - Issue：Issue触发。 - Note：评论触发。 
     * @return triggerType
     */
    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public PipelineLatestRun withBuildParams(PipelineLatestRunBuildParams buildParams) {
        this.buildParams = buildParams;
        return this;
    }

    public PipelineLatestRun withBuildParams(Consumer<PipelineLatestRunBuildParams> buildParamsSetter) {
        if (this.buildParams == null) {
            this.buildParams = new PipelineLatestRunBuildParams();
            buildParamsSetter.accept(this.buildParams);
        }

        return this;
    }

    /**
     * Get buildParams
     * @return buildParams
     */
    public PipelineLatestRunBuildParams getBuildParams() {
        return buildParams;
    }

    public void setBuildParams(PipelineLatestRunBuildParams buildParams) {
        this.buildParams = buildParams;
    }

    public PipelineLatestRun withArtifactParams(PipelineLatestRunArtifactParams artifactParams) {
        this.artifactParams = artifactParams;
        return this;
    }

    public PipelineLatestRun withArtifactParams(Consumer<PipelineLatestRunArtifactParams> artifactParamsSetter) {
        if (this.artifactParams == null) {
            this.artifactParams = new PipelineLatestRunArtifactParams();
            artifactParamsSetter.accept(this.artifactParams);
        }

        return this;
    }

    /**
     * Get artifactParams
     * @return artifactParams
     */
    public PipelineLatestRunArtifactParams getArtifactParams() {
        return artifactParams;
    }

    public void setArtifactParams(PipelineLatestRunArtifactParams artifactParams) {
        this.artifactParams = artifactParams;
    }

    public PipelineLatestRun withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 流水线开始时间。 **取值范围**： 不涉及。 
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public PipelineLatestRun withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 流水线结束时间。 **取值范围**： 不涉及。 
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public PipelineLatestRun withModifyUrl(String modifyUrl) {
        this.modifyUrl = modifyUrl;
        return this;
    }

    /**
     * **参数解释**： 修改页地址。 **取值范围**： 不涉及。 
     * @return modifyUrl
     */
    public String getModifyUrl() {
        return modifyUrl;
    }

    public void setModifyUrl(String modifyUrl) {
        this.modifyUrl = modifyUrl;
    }

    public PipelineLatestRun withDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
        return this;
    }

    /**
     * **参数解释**： 详情页地址。 **取值范围**： 不涉及。 
     * @return detailUrl
     */
    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PipelineLatestRun that = (PipelineLatestRun) obj;
        return Objects.equals(this.pipelineId, that.pipelineId)
            && Objects.equals(this.pipelineRunId, that.pipelineRunId)
            && Objects.equals(this.executorId, that.executorId) && Objects.equals(this.executorName, that.executorName)
            && Objects.equals(this.stageStatusList, that.stageStatusList) && Objects.equals(this.status, that.status)
            && Objects.equals(this.runNumber, that.runNumber) && Objects.equals(this.triggerType, that.triggerType)
            && Objects.equals(this.buildParams, that.buildParams)
            && Objects.equals(this.artifactParams, that.artifactParams)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.modifyUrl, that.modifyUrl) && Objects.equals(this.detailUrl, that.detailUrl);
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
            endTime,
            modifyUrl,
            detailUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineLatestRun {\n");
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
        sb.append("    modifyUrl: ").append(toIndentedString(modifyUrl)).append("\n");
        sb.append("    detailUrl: ").append(toIndentedString(detailUrl)).append("\n");
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
