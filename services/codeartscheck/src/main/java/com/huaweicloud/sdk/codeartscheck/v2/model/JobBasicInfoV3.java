package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 执行记录信息。
 */
public class JobBasicInfoV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor")

    private String executor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finishTime")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobResult")

    private JobResultInfo jobResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobType")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process")

    private ProcessInfo process;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewResult")

    private String reviewResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ruleSets")

    private List<ConfigTemplateRuleSetInfo> ruleSets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sourceRepoUrl")

    private String sourceRepoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subJobIds")

    private List<String> subJobIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subJobStatuses")

    private List<String> subJobStatuses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetRepoUrl")

    private String targetRepoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskId")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalExecuteTime")

    private String totalExecuteTime;

    public JobBasicInfoV3 withExecutor(String executor) {
        this.executor = executor;
        return this;
    }

    /**
     * **参数解释：** 执行人用户名。 **取值范围：** 长度为[1~255]个字符。
     * @return executor
     */
    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public JobBasicInfoV3 withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * **参数解释：** 执行记录的检查完成时间，使用UTC时间，格式为yyyy-MM-ddTHH:mm:ssZ，例如\"2025-11-28T06:55:41Z\"。 **取值范围：** 不涉及。
     * @return finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public JobBasicInfoV3 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 执行ID，来自代码检查执行任务接口的返回值，每次执行代码检查任务都有唯一的执行ID。 **取值范围：** 长度为[1~32]个字符。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JobBasicInfoV3 withJobResult(JobResultInfo jobResult) {
        this.jobResult = jobResult;
        return this;
    }

    public JobBasicInfoV3 withJobResult(Consumer<JobResultInfo> jobResultSetter) {
        if (this.jobResult == null) {
            this.jobResult = new JobResultInfo();
            jobResultSetter.accept(this.jobResult);
        }

        return this;
    }

    /**
     * Get jobResult
     * @return jobResult
     */
    public JobResultInfo getJobResult() {
        return jobResult;
    }

    public void setJobResult(JobResultInfo jobResult) {
        this.jobResult = jobResult;
    }

    public JobBasicInfoV3 withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * **参数解释:** 任务类型。 **取值范围:** - FULL：版本级任务。 - INC_GIT：门禁级任务。 [- INC_COMMIT：流水线指定commitId增量检查、代码检查任务设置-检查范围-版本级检查模式的最近一次提交检查。](tag:hws,hws_hk) [- INC_COMMIT：代码检查任务设置-检查范围-版本级检查模式的最近一次提交检查。](tag:hcs,hcs_sm,hcs_site,hcs_sitesm,fcs) [- INC_LAST_SUCCESS_COMMIT：流水线指定commitId以及最后一次门禁成功的commitId间的增量检查。](tag:hws,hws_hk)
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public JobBasicInfoV3 withProcess(ProcessInfo process) {
        this.process = process;
        return this;
    }

    public JobBasicInfoV3 withProcess(Consumer<ProcessInfo> processSetter) {
        if (this.process == null) {
            this.process = new ProcessInfo();
            processSetter.accept(this.process);
        }

        return this;
    }

    /**
     * Get process
     * @return process
     */
    public ProcessInfo getProcess() {
        return process;
    }

    public void setProcess(ProcessInfo process) {
        this.process = process;
    }

    public JobBasicInfoV3 withReviewResult(String reviewResult) {
        this.reviewResult = reviewResult;
        return this;
    }

    /**
     * **参数解释：** 门禁结果。 **取值范围：** - success：门禁通过。 - error：门禁未通过。
     * @return reviewResult
     */
    public String getReviewResult() {
        return reviewResult;
    }

    public void setReviewResult(String reviewResult) {
        this.reviewResult = reviewResult;
    }

    public JobBasicInfoV3 withRuleSets(List<ConfigTemplateRuleSetInfo> ruleSets) {
        this.ruleSets = ruleSets;
        return this;
    }

    public JobBasicInfoV3 addRuleSetsItem(ConfigTemplateRuleSetInfo ruleSetsItem) {
        if (this.ruleSets == null) {
            this.ruleSets = new ArrayList<>();
        }
        this.ruleSets.add(ruleSetsItem);
        return this;
    }

    public JobBasicInfoV3 withRuleSets(Consumer<List<ConfigTemplateRuleSetInfo>> ruleSetsSetter) {
        if (this.ruleSets == null) {
            this.ruleSets = new ArrayList<>();
        }
        ruleSetsSetter.accept(this.ruleSets);
        return this;
    }

    /**
     * **参数解释：** 规则集配置列表。
     * @return ruleSets
     */
    public List<ConfigTemplateRuleSetInfo> getRuleSets() {
        return ruleSets;
    }

    public void setRuleSets(List<ConfigTemplateRuleSetInfo> ruleSets) {
        this.ruleSets = ruleSets;
    }

    public JobBasicInfoV3 withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * **参数解释：** 执行来源。 **取值范围：** - customer：来自页面点击。 - Scheduled：来自定时任务。 - CodeCheckEdge：来自Edge服务。 - CodeArtsPipeline：来自流水线。 - DevCloudWebhook：来自CodeArtsRepo的Webhook。 - GitCodeActionPipeline：来自流水线的GitCodeAction插件。
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public JobBasicInfoV3 withSourceRepoUrl(String sourceRepoUrl) {
        this.sourceRepoUrl = sourceRepoUrl;
        return this;
    }

    /**
     * **参数解释：** 源分支的代码仓地址。 **取值范围：** 长度为[1~1024]个字符。
     * @return sourceRepoUrl
     */
    public String getSourceRepoUrl() {
        return sourceRepoUrl;
    }

    public void setSourceRepoUrl(String sourceRepoUrl) {
        this.sourceRepoUrl = sourceRepoUrl;
    }

    public JobBasicInfoV3 withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释：**  执行记录的检查开始时间，使用UTC时间，格式为yyyy-MM-ddTHH:mm:ssZ，例如\"2025-11-28T06:55:41Z\"。 **取值范围：** 不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public JobBasicInfoV3 withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释:** 任务执行状态。 **取值范围:** - quering：初始状态。 - running：执行中。 - success：检查成功。 - failed：检查失败。 - aborted：任务中止。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public JobBasicInfoV3 withSubJobIds(List<String> subJobIds) {
        this.subJobIds = subJobIds;
        return this;
    }

    public JobBasicInfoV3 addSubJobIdsItem(String subJobIdsItem) {
        if (this.subJobIds == null) {
            this.subJobIds = new ArrayList<>();
        }
        this.subJobIds.add(subJobIdsItem);
        return this;
    }

    public JobBasicInfoV3 withSubJobIds(Consumer<List<String>> subJobIdsSetter) {
        if (this.subJobIds == null) {
            this.subJobIds = new ArrayList<>();
        }
        subJobIdsSetter.accept(this.subJobIds);
        return this;
    }

    /**
     * **参数解释：** 子任务ID，该字段一般返回空数组[]。
     * @return subJobIds
     */
    public List<String> getSubJobIds() {
        return subJobIds;
    }

    public void setSubJobIds(List<String> subJobIds) {
        this.subJobIds = subJobIds;
    }

    public JobBasicInfoV3 withSubJobStatuses(List<String> subJobStatuses) {
        this.subJobStatuses = subJobStatuses;
        return this;
    }

    public JobBasicInfoV3 addSubJobStatusesItem(String subJobStatusesItem) {
        if (this.subJobStatuses == null) {
            this.subJobStatuses = new ArrayList<>();
        }
        this.subJobStatuses.add(subJobStatusesItem);
        return this;
    }

    public JobBasicInfoV3 withSubJobStatuses(Consumer<List<String>> subJobStatusesSetter) {
        if (this.subJobStatuses == null) {
            this.subJobStatuses = new ArrayList<>();
        }
        subJobStatusesSetter.accept(this.subJobStatuses);
        return this;
    }

    /**
     * **参数解释：** 子任务状态，该字段一般返回空数组[]。
     * @return subJobStatuses
     */
    public List<String> getSubJobStatuses() {
        return subJobStatuses;
    }

    public void setSubJobStatuses(List<String> subJobStatuses) {
        this.subJobStatuses = subJobStatuses;
    }

    public JobBasicInfoV3 withTargetRepoUrl(String targetRepoUrl) {
        this.targetRepoUrl = targetRepoUrl;
        return this;
    }

    /**
     * **参数解释：** 目标分支的代码仓地址。 **取值范围：** 长度为[1~1024]个字符。
     * @return targetRepoUrl
     */
    public String getTargetRepoUrl() {
        return targetRepoUrl;
    }

    public void setTargetRepoUrl(String targetRepoUrl) {
        this.targetRepoUrl = targetRepoUrl;
    }

    public JobBasicInfoV3 withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释：** 任务ID，即新建检查任务接口的返回值，每个代码检查任务及其下的分支任务、通过API创建的增量任务都有唯一的任务ID。即[[查询任务列表](https://support.huaweicloud.com/api-codecheck/ShowTasksList.html)](tag:hws)[[查询任务列表](https://support.huaweicloud.com/intl/zh-cn/api-codecheck/ShowTasksList.html)](tag:hws_hk)[查询任务列表](tag:hcs,hcs_sm)接口响应中的id字段。 **取值范围：** 长度为[1~32]个字符。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public JobBasicInfoV3 withTotalExecuteTime(String totalExecuteTime) {
        this.totalExecuteTime = totalExecuteTime;
        return this;
    }

    /**
     * **参数解释：** 任务总执行时长，格式为%dm%ds，例如\"6m6s\"。 **取值范围：** 不涉及。
     * @return totalExecuteTime
     */
    public String getTotalExecuteTime() {
        return totalExecuteTime;
    }

    public void setTotalExecuteTime(String totalExecuteTime) {
        this.totalExecuteTime = totalExecuteTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobBasicInfoV3 that = (JobBasicInfoV3) obj;
        return Objects.equals(this.executor, that.executor) && Objects.equals(this.finishTime, that.finishTime)
            && Objects.equals(this.id, that.id) && Objects.equals(this.jobResult, that.jobResult)
            && Objects.equals(this.jobType, that.jobType) && Objects.equals(this.process, that.process)
            && Objects.equals(this.reviewResult, that.reviewResult) && Objects.equals(this.ruleSets, that.ruleSets)
            && Objects.equals(this.source, that.source) && Objects.equals(this.sourceRepoUrl, that.sourceRepoUrl)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.subJobIds, that.subJobIds)
            && Objects.equals(this.subJobStatuses, that.subJobStatuses)
            && Objects.equals(this.targetRepoUrl, that.targetRepoUrl) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.totalExecuteTime, that.totalExecuteTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executor,
            finishTime,
            id,
            jobResult,
            jobType,
            process,
            reviewResult,
            ruleSets,
            source,
            sourceRepoUrl,
            startTime,
            status,
            subJobIds,
            subJobStatuses,
            targetRepoUrl,
            taskId,
            totalExecuteTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobBasicInfoV3 {\n");
        sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    jobResult: ").append(toIndentedString(jobResult)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    process: ").append(toIndentedString(process)).append("\n");
        sb.append("    reviewResult: ").append(toIndentedString(reviewResult)).append("\n");
        sb.append("    ruleSets: ").append(toIndentedString(ruleSets)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    sourceRepoUrl: ").append(toIndentedString(sourceRepoUrl)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subJobIds: ").append(toIndentedString(subJobIds)).append("\n");
        sb.append("    subJobStatuses: ").append(toIndentedString(subJobStatuses)).append("\n");
        sb.append("    targetRepoUrl: ").append(toIndentedString(targetRepoUrl)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    totalExecuteTime: ").append(toIndentedString(totalExecuteTime)).append("\n");
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
