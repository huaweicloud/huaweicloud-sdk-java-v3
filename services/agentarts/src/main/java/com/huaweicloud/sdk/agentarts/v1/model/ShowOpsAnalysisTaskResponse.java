package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowOpsAnalysisTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent")

    private OpsAnalysisTaskAgent agent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    /**
     * **参数解释：** 任务状态。  **取值范围：** draft：草稿态，scheduled：待运行，running：运行中，paused：已暂停，completed：已完成，fail：失败，stopping：停止中，stopped：已停止。
     */
    public static final class StatusEnum {

        /**
         * Enum DRAFT for value: "draft"
         */
        public static final StatusEnum DRAFT = new StatusEnum("draft");

        /**
         * Enum SCHEDULED for value: "scheduled"
         */
        public static final StatusEnum SCHEDULED = new StatusEnum("scheduled");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("running");

        /**
         * Enum PAUSED for value: "paused"
         */
        public static final StatusEnum PAUSED = new StatusEnum("paused");

        /**
         * Enum COMPLETED for value: "completed"
         */
        public static final StatusEnum COMPLETED = new StatusEnum("completed");

        /**
         * Enum FAIL for value: "fail"
         */
        public static final StatusEnum FAIL = new StatusEnum("fail");

        /**
         * Enum STOPPING for value: "stopping"
         */
        public static final StatusEnum STOPPING = new StatusEnum("stopping");

        /**
         * Enum STOPPED for value: "stopped"
         */
        public static final StatusEnum STOPPED = new StatusEnum("stopped");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("draft", DRAFT);
            map.put("scheduled", SCHEDULED);
            map.put("running", RUNNING);
            map.put("paused", PAUSED);
            map.put("completed", COMPLETED);
            map.put("fail", FAIL);
            map.put("stopping", STOPPING);
            map.put("stopped", STOPPED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private Long createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private Long updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_fire_time")

    private Long nextFireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<OpsTasksTagForTMS> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private OpsTaskProgress progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_strategy")

    private OpsExecutionStrategy executionStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_count")

    private OpsAnalysisTaskInstanceStatusCount statusCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample_strategy")

    private OpsSampleStrategy sampleStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failures")

    private List<OpsFailureCategory> failures = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_tokens")

    private Long inputTokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_tokens")

    private Long outputTokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_session_count")

    private Integer totalSessionCount;

    public ShowOpsAnalysisTaskResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 智能体优化任务ID。  **取值范围：** UUID格式字符串。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowOpsAnalysisTaskResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 任务名称，用于标识和区分不同的分析任务。  **取值范围：** 长度1-64个字符，支持中文、字母、数字、中划线及下划线。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowOpsAnalysisTaskResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 任务的详细描述，用于记录任务目的或备注信息。  **取值范围：** 长度0-1024个字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowOpsAnalysisTaskResponse withAgent(OpsAnalysisTaskAgent agent) {
        this.agent = agent;
        return this;
    }

    public ShowOpsAnalysisTaskResponse withAgent(Consumer<OpsAnalysisTaskAgent> agentSetter) {
        if (this.agent == null) {
            this.agent = new OpsAnalysisTaskAgent();
            agentSetter.accept(this.agent);
        }

        return this;
    }

    /**
     * Get agent
     * @return agent
     */
    public OpsAnalysisTaskAgent getAgent() {
        return agent;
    }

    public void setAgent(OpsAnalysisTaskAgent agent) {
        this.agent = agent;
    }

    public ShowOpsAnalysisTaskResponse withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * **参数解释：** 委托名称，赋予服务访问用户资源的权限。  **取值范围：** 合法的委托名称字符串。
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public ShowOpsAnalysisTaskResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 任务状态。  **取值范围：** draft：草稿态，scheduled：待运行，running：运行中，paused：已暂停，completed：已完成，fail：失败，stopping：停止中，stopped：已停止。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowOpsAnalysisTaskResponse withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间，单位：毫秒（13位时间戳）。  **取值范围：** 13位毫秒级时间戳。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createdAt
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public ShowOpsAnalysisTaskResponse withUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间（单位：毫秒）  **取值范围：** 13位毫秒级时间戳。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ShowOpsAnalysisTaskResponse withNextFireTime(Long nextFireTime) {
        this.nextFireTime = nextFireTime;
        return this;
    }

    /**
     * **参数解释：** 计划下次执行时间。对于待运行、运行中的周期任务，显示下一个task instance时间。对于其他状态的周期任务为null。对待运行的单次任务显示计划运行时间。无后续调度时为 null。  **取值范围：** 13位毫秒级时间戳或 null。
     * @return nextFireTime
     */
    public Long getNextFireTime() {
        return nextFireTime;
    }

    public void setNextFireTime(Long nextFireTime) {
        this.nextFireTime = nextFireTime;
    }

    public ShowOpsAnalysisTaskResponse withTags(List<OpsTasksTagForTMS> tags) {
        this.tags = tags;
        return this;
    }

    public ShowOpsAnalysisTaskResponse addTagsItem(OpsTasksTagForTMS tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowOpsAnalysisTaskResponse withTags(Consumer<List<OpsTasksTagForTMS>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 资源标签列表，用于资源分类。  **取值范围：** 数组长度0-20。
     * @return tags
     */
    public List<OpsTasksTagForTMS> getTags() {
        return tags;
    }

    public void setTags(List<OpsTasksTagForTMS> tags) {
        this.tags = tags;
    }

    public ShowOpsAnalysisTaskResponse withProgress(OpsTaskProgress progress) {
        this.progress = progress;
        return this;
    }

    public ShowOpsAnalysisTaskResponse withProgress(Consumer<OpsTaskProgress> progressSetter) {
        if (this.progress == null) {
            this.progress = new OpsTaskProgress();
            progressSetter.accept(this.progress);
        }

        return this;
    }

    /**
     * Get progress
     * @return progress
     */
    public OpsTaskProgress getProgress() {
        return progress;
    }

    public void setProgress(OpsTaskProgress progress) {
        this.progress = progress;
    }

    public ShowOpsAnalysisTaskResponse withExecutionStrategy(OpsExecutionStrategy executionStrategy) {
        this.executionStrategy = executionStrategy;
        return this;
    }

    public ShowOpsAnalysisTaskResponse withExecutionStrategy(Consumer<OpsExecutionStrategy> executionStrategySetter) {
        if (this.executionStrategy == null) {
            this.executionStrategy = new OpsExecutionStrategy();
            executionStrategySetter.accept(this.executionStrategy);
        }

        return this;
    }

    /**
     * Get executionStrategy
     * @return executionStrategy
     */
    public OpsExecutionStrategy getExecutionStrategy() {
        return executionStrategy;
    }

    public void setExecutionStrategy(OpsExecutionStrategy executionStrategy) {
        this.executionStrategy = executionStrategy;
    }

    public ShowOpsAnalysisTaskResponse withStatusCount(OpsAnalysisTaskInstanceStatusCount statusCount) {
        this.statusCount = statusCount;
        return this;
    }

    public ShowOpsAnalysisTaskResponse withStatusCount(Consumer<OpsAnalysisTaskInstanceStatusCount> statusCountSetter) {
        if (this.statusCount == null) {
            this.statusCount = new OpsAnalysisTaskInstanceStatusCount();
            statusCountSetter.accept(this.statusCount);
        }

        return this;
    }

    /**
     * Get statusCount
     * @return statusCount
     */
    public OpsAnalysisTaskInstanceStatusCount getStatusCount() {
        return statusCount;
    }

    public void setStatusCount(OpsAnalysisTaskInstanceStatusCount statusCount) {
        this.statusCount = statusCount;
    }

    public ShowOpsAnalysisTaskResponse withSampleStrategy(OpsSampleStrategy sampleStrategy) {
        this.sampleStrategy = sampleStrategy;
        return this;
    }

    public ShowOpsAnalysisTaskResponse withSampleStrategy(Consumer<OpsSampleStrategy> sampleStrategySetter) {
        if (this.sampleStrategy == null) {
            this.sampleStrategy = new OpsSampleStrategy();
            sampleStrategySetter.accept(this.sampleStrategy);
        }

        return this;
    }

    /**
     * Get sampleStrategy
     * @return sampleStrategy
     */
    public OpsSampleStrategy getSampleStrategy() {
        return sampleStrategy;
    }

    public void setSampleStrategy(OpsSampleStrategy sampleStrategy) {
        this.sampleStrategy = sampleStrategy;
    }

    public ShowOpsAnalysisTaskResponse withFailures(List<OpsFailureCategory> failures) {
        this.failures = failures;
        return this;
    }

    public ShowOpsAnalysisTaskResponse addFailuresItem(OpsFailureCategory failuresItem) {
        if (this.failures == null) {
            this.failures = new ArrayList<>();
        }
        this.failures.add(failuresItem);
        return this;
    }

    public ShowOpsAnalysisTaskResponse withFailures(Consumer<List<OpsFailureCategory>> failuresSetter) {
        if (this.failures == null) {
            this.failures = new ArrayList<>();
        }
        failuresSetter.accept(this.failures);
        return this;
    }

    /**
     * **参数解释：** 故障列表。  **取值范围：** 长度为0-100的数组。
     * @return failures
     */
    public List<OpsFailureCategory> getFailures() {
        return failures;
    }

    public void setFailures(List<OpsFailureCategory> failures) {
        this.failures = failures;
    }

    public ShowOpsAnalysisTaskResponse withInputTokens(Long inputTokens) {
        this.inputTokens = inputTokens;
        return this;
    }

    /**
     * **参数解释：** 输入的 Token 数。 **取值范围：** 无。任务未执行过时为 null。
     * @return inputTokens
     */
    public Long getInputTokens() {
        return inputTokens;
    }

    public void setInputTokens(Long inputTokens) {
        this.inputTokens = inputTokens;
    }

    public ShowOpsAnalysisTaskResponse withOutputTokens(Long outputTokens) {
        this.outputTokens = outputTokens;
        return this;
    }

    /**
     * **参数解释：** 模型输出的 Token 数。 **取值范围：** 无。任务未执行过时为 null。
     * @return outputTokens
     */
    public Long getOutputTokens() {
        return outputTokens;
    }

    public void setOutputTokens(Long outputTokens) {
        this.outputTokens = outputTokens;
    }

    public ShowOpsAnalysisTaskResponse withTotalSessionCount(Integer totalSessionCount) {
        this.totalSessionCount = totalSessionCount;
        return this;
    }

    /**
     * **参数解释：** 分析覆盖的session总数。 **取值范围：** 无。
     * @return totalSessionCount
     */
    public Integer getTotalSessionCount() {
        return totalSessionCount;
    }

    public void setTotalSessionCount(Integer totalSessionCount) {
        this.totalSessionCount = totalSessionCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsAnalysisTaskResponse that = (ShowOpsAnalysisTaskResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.agent, that.agent)
            && Objects.equals(this.agencyName, that.agencyName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.nextFireTime, that.nextFireTime) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.progress, that.progress)
            && Objects.equals(this.executionStrategy, that.executionStrategy)
            && Objects.equals(this.statusCount, that.statusCount)
            && Objects.equals(this.sampleStrategy, that.sampleStrategy) && Objects.equals(this.failures, that.failures)
            && Objects.equals(this.inputTokens, that.inputTokens)
            && Objects.equals(this.outputTokens, that.outputTokens)
            && Objects.equals(this.totalSessionCount, that.totalSessionCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            agent,
            agencyName,
            status,
            createdAt,
            updatedAt,
            nextFireTime,
            tags,
            progress,
            executionStrategy,
            statusCount,
            sampleStrategy,
            failures,
            inputTokens,
            outputTokens,
            totalSessionCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsAnalysisTaskResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    nextFireTime: ").append(toIndentedString(nextFireTime)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    executionStrategy: ").append(toIndentedString(executionStrategy)).append("\n");
        sb.append("    statusCount: ").append(toIndentedString(statusCount)).append("\n");
        sb.append("    sampleStrategy: ").append(toIndentedString(sampleStrategy)).append("\n");
        sb.append("    failures: ").append(toIndentedString(failures)).append("\n");
        sb.append("    inputTokens: ").append(toIndentedString(inputTokens)).append("\n");
        sb.append("    outputTokens: ").append(toIndentedString(outputTokens)).append("\n");
        sb.append("    totalSessionCount: ").append(toIndentedString(totalSessionCount)).append("\n");
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
