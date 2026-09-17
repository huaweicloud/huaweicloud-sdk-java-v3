package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询流水线运行历史请求体
 */
public class ListPipelineRunsQuery {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private List<String> status = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private List<String> triggerType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_ids")

    private List<String> executorIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_job_details")

    private Boolean showJobDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_id")

    private String stageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    public ListPipelineRunsQuery withStatus(List<String> status) {
        this.status = status;
        return this;
    }

    public ListPipelineRunsQuery addStatusItem(String statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public ListPipelineRunsQuery withStatus(Consumer<List<String>> statusSetter) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        statusSetter.accept(this.status);
        return this;
    }

    /**
     * **参数解释**： 流水线状态列表。 **约束限制**： 不涉及。 **取值范围**： - COMPLETED：已完成。 - RUNNING：运行中。 - FAILED：失败。 - CANCELED：取消。 - PAUSED：暂停。 - SUSPEND：挂起。 - IGNORED：忽略。 **默认取值**： 不涉及。 
     * @return status
     */
    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
    }

    public ListPipelineRunsQuery withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 流水线开始时间。 **约束限制**： 不涉及。 **取值范围**： 时间戳或者yyyy-MM-dd HH:mm:ss格式均可。 **默认取值**： 不涉及。 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListPipelineRunsQuery withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 流水线结束时间。 **约束限制**： 不涉及。 **取值范围**： 时间戳或者yyyy-MM-dd HH:mm:ss格式均可。 **默认取值**： 不涉及。 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListPipelineRunsQuery withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**： 流水线状态更新时间。 **约束限制**： 不涉及。 **取值范围**： 时间戳或者yyyy-MM-dd HH:mm:ss格式均可。 **默认取值**： 不涉及。 
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ListPipelineRunsQuery withTriggerType(List<String> triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    public ListPipelineRunsQuery addTriggerTypeItem(String triggerTypeItem) {
        if (this.triggerType == null) {
            this.triggerType = new ArrayList<>();
        }
        this.triggerType.add(triggerTypeItem);
        return this;
    }

    public ListPipelineRunsQuery withTriggerType(Consumer<List<String>> triggerTypeSetter) {
        if (this.triggerType == null) {
            this.triggerType = new ArrayList<>();
        }
        triggerTypeSetter.accept(this.triggerType);
        return this;
    }

    /**
     * **参数解释**： 触发类型列表。 **约束限制**： 不涉及。 **取值范围**： - Manual：手动触发。 - Scheduler：定时触发。 - RollBack：回退触发。 - CreateTag：Tag事件触发。 - Note：评论触发。 - Issue：Issue触发。 - MR：MR触发。 - CR：CR触发。 - Generic：流水线触发器触发。 - Push：Push事件触发。 - SubPipeline：子流水线触发。 **默认取值**： 不涉及。 
     * @return triggerType
     */
    public List<String> getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(List<String> triggerType) {
        this.triggerType = triggerType;
    }

    public ListPipelineRunsQuery withExecutorIds(List<String> executorIds) {
        this.executorIds = executorIds;
        return this;
    }

    public ListPipelineRunsQuery addExecutorIdsItem(String executorIdsItem) {
        if (this.executorIds == null) {
            this.executorIds = new ArrayList<>();
        }
        this.executorIds.add(executorIdsItem);
        return this;
    }

    public ListPipelineRunsQuery withExecutorIds(Consumer<List<String>> executorIdsSetter) {
        if (this.executorIds == null) {
            this.executorIds = new ArrayList<>();
        }
        executorIdsSetter.accept(this.executorIds);
        return this;
    }

    /**
     * **参数解释**： 执行人ID列表。 **约束限制**： 不涉及。 **取值范围**： 32位字符，仅由数字和字母组成。 **默认取值**： 不涉及。 
     * @return executorIds
     */
    public List<String> getExecutorIds() {
        return executorIds;
    }

    public void setExecutorIds(List<String> executorIds) {
        this.executorIds = executorIds;
    }

    public ListPipelineRunsQuery withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**： 起始偏移。 **约束限制**： 不涉及。 **取值范围**： 大于等于零。 **默认取值**： 不涉及。 
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListPipelineRunsQuery withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**： 查询数量。 **约束限制**： 不涉及。 **取值范围**： 大于等于零。 **默认取值**： 不涉及。 
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListPipelineRunsQuery withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * **参数解释**： 排序字段名称。 **约束限制**： 不涉及。 **取值范围**： \"start_time\" - 流水线开始时间。 \"update_time\" - 流水线更新时间。 **默认取值**： 不涉及。 
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListPipelineRunsQuery withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * **参数解释**： 排序规则。 **约束限制**： 不涉及。 **取值范围**： - asc：按排序字段升序。 - desc：按排序字段降序。 **默认取值**： 不涉及。 
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListPipelineRunsQuery withShowJobDetails(Boolean showJobDetails) {
        this.showJobDetails = showJobDetails;
        return this;
    }

    /**
     * **参数解释**： 是否返回Job状态详情。 **约束限制**： 不涉及。 **取值范围**： - true：返回Job状态列表。 - false：不返回。 **默认取值**： false。 
     * @return showJobDetails
     */
    public Boolean getShowJobDetails() {
        return showJobDetails;
    }

    public void setShowJobDetails(Boolean showJobDetails) {
        this.showJobDetails = showJobDetails;
    }

    public ListPipelineRunsQuery withStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }

    /**
     * **参数解释**： 阶段ID，用于指定返回Job状态详情的阶段。 **约束限制**： 不涉及。 **取值范围**： 32位字符，仅由数字和字母组成。 **默认取值**： 不涉及，为空时默认取流水线最后一个阶段。 
     * @return stageId
     */
    public String getStageId() {
        return stageId;
    }

    public void setStageId(String stageId) {
        this.stageId = stageId;
    }

    public ListPipelineRunsQuery withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**： Job ID，仅在show_job_details为true时生效，用于过滤包含指定Job的执行记录。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPipelineRunsQuery that = (ListPipelineRunsQuery) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.triggerType, that.triggerType) && Objects.equals(this.executorIds, that.executorIds)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.sortKey, that.sortKey) && Objects.equals(this.sortDir, that.sortDir)
            && Objects.equals(this.showJobDetails, that.showJobDetails) && Objects.equals(this.stageId, that.stageId)
            && Objects.equals(this.jobId, that.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status,
            startTime,
            endTime,
            updateTime,
            triggerType,
            executorIds,
            offset,
            limit,
            sortKey,
            sortDir,
            showJobDetails,
            stageId,
            jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPipelineRunsQuery {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    executorIds: ").append(toIndentedString(executorIds)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    showJobDetails: ").append(toIndentedString(showJobDetails)).append("\n");
        sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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
