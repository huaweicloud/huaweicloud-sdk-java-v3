package com.huaweicloud.sdk.codeartspipeline.v2.model;

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

    private PipelineLatestRunArtifactParams artifactParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail_url")

    private String detailUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modify_url")

    private String modifyUrl;

    public ListPipelineRunsPagePipelineRuns withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * **参数解释**： 流水线ID，可以通过[查询流水线列表](ListPipelines.xml)接口，其中pipelines.pipelineId即为流水线ID。 **取值范围**： 32位字符，仅由数字和字母组成。 
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
     * **参数解释**： 流水线运行实例ID，[启动流水线](RunPipeline.xml)接口的返回值即为流水线运行实例ID。 **取值范围**： 32位字符，仅由数字和字母组成。 
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
     * **参数解释**： 执行人ID。 **取值范围**： 32位字符，仅由数字和字母组成。 
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
     * **参数解释**： 执行人名称。 **取值范围**： 不涉及。 
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
     * **参数解释**： 阶段信息列表。 **取值范围**： 不涉及。 
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
     * **参数解释**： 流水线运行实例状态。 **取值范围**： - COMPLETED：已完成。 - RUNNING：运行中。 - FAILED：失败。 - CANCELED：取消。 - PAUSED：暂停。 - SUSPEND：挂起。 - IGNORED：忽略。 
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
     * **参数解释**： 流水线运行序号。 **取值范围**： 大于等于 1。 
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
     * **参数解释**： 触发类型 **取值范围**： - Manual：手动触发。 - Scheduler：定时任务。 - MR：MR触发。 - Push：Push事件触发。 - CreateTag：Tag事件触发。 - Issue：Issue触发。 - Note：评论触发。 
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

    public ListPipelineRunsPagePipelineRuns withArtifactParams(PipelineLatestRunArtifactParams artifactParams) {
        this.artifactParams = artifactParams;
        return this;
    }

    public ListPipelineRunsPagePipelineRuns withArtifactParams(
        Consumer<PipelineLatestRunArtifactParams> artifactParamsSetter) {
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

    public ListPipelineRunsPagePipelineRuns withStartTime(Long startTime) {
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

    public ListPipelineRunsPagePipelineRuns withEndTime(Long endTime) {
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

    public ListPipelineRunsPagePipelineRuns withDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
        return this;
    }

    /**
     * **参数解释**： 详情页地址，如果x-auth-token中的region信息为空，则详情页地址也返回空。 **取值范围**： 不涉及。 
     * @return detailUrl
     */
    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public ListPipelineRunsPagePipelineRuns withModifyUrl(String modifyUrl) {
        this.modifyUrl = modifyUrl;
        return this;
    }

    /**
     * **参数解释**： 修改页地址，如果x-auth-token中的region信息为空，则修改页地址也返回空。 **取值范围**： 不涉及。 
     * @return modifyUrl
     */
    public String getModifyUrl() {
        return modifyUrl;
    }

    public void setModifyUrl(String modifyUrl) {
        this.modifyUrl = modifyUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPipelineRunsPagePipelineRuns that = (ListPipelineRunsPagePipelineRuns) obj;
        return Objects.equals(this.pipelineId, that.pipelineId)
            && Objects.equals(this.pipelineRunId, that.pipelineRunId)
            && Objects.equals(this.executorId, that.executorId) && Objects.equals(this.executorName, that.executorName)
            && Objects.equals(this.stageStatusList, that.stageStatusList) && Objects.equals(this.status, that.status)
            && Objects.equals(this.runNumber, that.runNumber) && Objects.equals(this.triggerType, that.triggerType)
            && Objects.equals(this.buildParams, that.buildParams)
            && Objects.equals(this.artifactParams, that.artifactParams)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.detailUrl, that.detailUrl) && Objects.equals(this.modifyUrl, that.modifyUrl);
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
            detailUrl,
            modifyUrl);
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
        sb.append("    detailUrl: ").append(toIndentedString(detailUrl)).append("\n");
        sb.append("    modifyUrl: ").append(toIndentedString(modifyUrl)).append("\n");
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
