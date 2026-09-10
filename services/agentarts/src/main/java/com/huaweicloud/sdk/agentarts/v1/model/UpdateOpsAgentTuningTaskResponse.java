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
public class UpdateOpsAgentTuningTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * **参数解释：**  任务类型，用于根据类型筛选任务。  **取值范围：**  tool：工具，skill：技能。
     */
    public static final class TypeEnum {

        /**
         * Enum TOOL for value: "tool"
         */
        public static final TypeEnum TOOL = new TypeEnum("tool");

        /**
         * Enum SKILL for value: "skill"
         */
        public static final TypeEnum SKILL = new TypeEnum("skill");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("tool", TOOL);
            map.put("skill", SKILL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent")

    private OpsAgentTuningTaskAgent agent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analysis_task_id")

    private String analysisTaskId;

    /**
     * **参数解释：** 任务状态。  **取值范围：** draft：草稿态，running：运行中，stopping：停止中，stopped：已停止，success：成功，fail：失败。
     */
    public static final class StatusEnum {

        /**
         * Enum DRAFT for value: "draft"
         */
        public static final StatusEnum DRAFT = new StatusEnum("draft");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("running");

        /**
         * Enum STOPPED for value: "stopped"
         */
        public static final StatusEnum STOPPED = new StatusEnum("stopped");

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("success");

        /**
         * Enum FAIL for value: "fail"
         */
        public static final StatusEnum FAIL = new StatusEnum("fail");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("draft", DRAFT);
            map.put("running", RUNNING);
            map.put("stopped", STOPPED);
            map.put("success", SUCCESS);
            map.put("fail", FAIL);
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
    @JsonProperty(value = "fail_reason")

    private String failReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private Long createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private Long updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executed_time")

    private Integer executedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<OpsTasksTagForTMS> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tuning_target")

    private OpsTuningTarget tuningTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tuning_output")

    private OpsTuningOutput tuningOutput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample_duration")

    private OpsSampleDuration sampleDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample_strategy")

    private OpsSampleStrategy sampleStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_tokens")

    private Integer inputTokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_tokens")

    private Integer outputTokens;

    public UpdateOpsAgentTuningTaskResponse withId(String id) {
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

    public UpdateOpsAgentTuningTaskResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 任务名称。  **取值范围：** 长度1-64个字符的字符串。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateOpsAgentTuningTaskResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 任务描述。  **取值范围：** 长度0-255个字符的字符串。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateOpsAgentTuningTaskResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：**  任务类型，用于根据类型筛选任务。  **取值范围：**  tool：工具，skill：技能。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public UpdateOpsAgentTuningTaskResponse withAgent(OpsAgentTuningTaskAgent agent) {
        this.agent = agent;
        return this;
    }

    public UpdateOpsAgentTuningTaskResponse withAgent(Consumer<OpsAgentTuningTaskAgent> agentSetter) {
        if (this.agent == null) {
            this.agent = new OpsAgentTuningTaskAgent();
            agentSetter.accept(this.agent);
        }

        return this;
    }

    /**
     * Get agent
     * @return agent
     */
    public OpsAgentTuningTaskAgent getAgent() {
        return agent;
    }

    public void setAgent(OpsAgentTuningTaskAgent agent) {
        this.agent = agent;
    }

    public UpdateOpsAgentTuningTaskResponse withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * **参数解释：** 委托名称，赋予服务访问用户资源的权限。  **取值范围：** 有效的IAM委托名称字符串。
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public UpdateOpsAgentTuningTaskResponse withAnalysisTaskId(String analysisTaskId) {
        this.analysisTaskId = analysisTaskId;
        return this;
    }

    /**
     * **参数解释：** 分析任务ID，通过分析任务一键优化创建出来的智能体优化任务该字段不为空。  **取值范围：** 有效分析任务ID。
     * @return analysisTaskId
     */
    public String getAnalysisTaskId() {
        return analysisTaskId;
    }

    public void setAnalysisTaskId(String analysisTaskId) {
        this.analysisTaskId = analysisTaskId;
    }

    public UpdateOpsAgentTuningTaskResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 任务状态。  **取值范围：** draft：草稿态，running：运行中，stopping：停止中，stopped：已停止，success：成功，fail：失败。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public UpdateOpsAgentTuningTaskResponse withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * **参数解释：** 失败的错误信息。  **取值范围：** 无。
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public UpdateOpsAgentTuningTaskResponse withCreatedAt(Long createdAt) {
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

    public UpdateOpsAgentTuningTaskResponse withUpdatedAt(Long updatedAt) {
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

    public UpdateOpsAgentTuningTaskResponse withExecutedTime(Integer executedTime) {
        this.executedTime = executedTime;
        return this;
    }

    /**
     * **参数解释：** 运行时长，单位：分钟。  **取值范围：** 大于等于0的整数（单位：分钟）
     * minimum: 0
     * maximum: 2147483647
     * @return executedTime
     */
    public Integer getExecutedTime() {
        return executedTime;
    }

    public void setExecutedTime(Integer executedTime) {
        this.executedTime = executedTime;
    }

    public UpdateOpsAgentTuningTaskResponse withTags(List<OpsTasksTagForTMS> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateOpsAgentTuningTaskResponse addTagsItem(OpsTasksTagForTMS tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateOpsAgentTuningTaskResponse withTags(Consumer<List<OpsTasksTagForTMS>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 资源标签列表。  **取值范围：** 符合OpsTasksTagForTMS定义的对象数组。
     * @return tags
     */
    public List<OpsTasksTagForTMS> getTags() {
        return tags;
    }

    public void setTags(List<OpsTasksTagForTMS> tags) {
        this.tags = tags;
    }

    public UpdateOpsAgentTuningTaskResponse withTuningTarget(OpsTuningTarget tuningTarget) {
        this.tuningTarget = tuningTarget;
        return this;
    }

    public UpdateOpsAgentTuningTaskResponse withTuningTarget(Consumer<OpsTuningTarget> tuningTargetSetter) {
        if (this.tuningTarget == null) {
            this.tuningTarget = new OpsTuningTarget();
            tuningTargetSetter.accept(this.tuningTarget);
        }

        return this;
    }

    /**
     * Get tuningTarget
     * @return tuningTarget
     */
    public OpsTuningTarget getTuningTarget() {
        return tuningTarget;
    }

    public void setTuningTarget(OpsTuningTarget tuningTarget) {
        this.tuningTarget = tuningTarget;
    }

    public UpdateOpsAgentTuningTaskResponse withTuningOutput(OpsTuningOutput tuningOutput) {
        this.tuningOutput = tuningOutput;
        return this;
    }

    public UpdateOpsAgentTuningTaskResponse withTuningOutput(Consumer<OpsTuningOutput> tuningOutputSetter) {
        if (this.tuningOutput == null) {
            this.tuningOutput = new OpsTuningOutput();
            tuningOutputSetter.accept(this.tuningOutput);
        }

        return this;
    }

    /**
     * Get tuningOutput
     * @return tuningOutput
     */
    public OpsTuningOutput getTuningOutput() {
        return tuningOutput;
    }

    public void setTuningOutput(OpsTuningOutput tuningOutput) {
        this.tuningOutput = tuningOutput;
    }

    public UpdateOpsAgentTuningTaskResponse withSampleDuration(OpsSampleDuration sampleDuration) {
        this.sampleDuration = sampleDuration;
        return this;
    }

    public UpdateOpsAgentTuningTaskResponse withSampleDuration(Consumer<OpsSampleDuration> sampleDurationSetter) {
        if (this.sampleDuration == null) {
            this.sampleDuration = new OpsSampleDuration();
            sampleDurationSetter.accept(this.sampleDuration);
        }

        return this;
    }

    /**
     * Get sampleDuration
     * @return sampleDuration
     */
    public OpsSampleDuration getSampleDuration() {
        return sampleDuration;
    }

    public void setSampleDuration(OpsSampleDuration sampleDuration) {
        this.sampleDuration = sampleDuration;
    }

    public UpdateOpsAgentTuningTaskResponse withSampleStrategy(OpsSampleStrategy sampleStrategy) {
        this.sampleStrategy = sampleStrategy;
        return this;
    }

    public UpdateOpsAgentTuningTaskResponse withSampleStrategy(Consumer<OpsSampleStrategy> sampleStrategySetter) {
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

    public UpdateOpsAgentTuningTaskResponse withInputTokens(Integer inputTokens) {
        this.inputTokens = inputTokens;
        return this;
    }

    /**
     * **参数解释：** 输入的 Token 数。  **取值范围：** 无。
     * minimum: 0
     * maximum: 100000000
     * @return inputTokens
     */
    public Integer getInputTokens() {
        return inputTokens;
    }

    public void setInputTokens(Integer inputTokens) {
        this.inputTokens = inputTokens;
    }

    public UpdateOpsAgentTuningTaskResponse withOutputTokens(Integer outputTokens) {
        this.outputTokens = outputTokens;
        return this;
    }

    /**
     * **参数解释：** 模型输出的 Token 数。  **取值范围：** 无。
     * minimum: 0
     * maximum: 100000000
     * @return outputTokens
     */
    public Integer getOutputTokens() {
        return outputTokens;
    }

    public void setOutputTokens(Integer outputTokens) {
        this.outputTokens = outputTokens;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateOpsAgentTuningTaskResponse that = (UpdateOpsAgentTuningTaskResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.type, that.type)
            && Objects.equals(this.agent, that.agent) && Objects.equals(this.agencyName, that.agencyName)
            && Objects.equals(this.analysisTaskId, that.analysisTaskId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.failReason, that.failReason) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.executedTime, that.executedTime)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.tuningTarget, that.tuningTarget)
            && Objects.equals(this.tuningOutput, that.tuningOutput)
            && Objects.equals(this.sampleDuration, that.sampleDuration)
            && Objects.equals(this.sampleStrategy, that.sampleStrategy)
            && Objects.equals(this.inputTokens, that.inputTokens)
            && Objects.equals(this.outputTokens, that.outputTokens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            type,
            agent,
            agencyName,
            analysisTaskId,
            status,
            failReason,
            createdAt,
            updatedAt,
            executedTime,
            tags,
            tuningTarget,
            tuningOutput,
            sampleDuration,
            sampleStrategy,
            inputTokens,
            outputTokens);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOpsAgentTuningTaskResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    analysisTaskId: ").append(toIndentedString(analysisTaskId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    executedTime: ").append(toIndentedString(executedTime)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tuningTarget: ").append(toIndentedString(tuningTarget)).append("\n");
        sb.append("    tuningOutput: ").append(toIndentedString(tuningOutput)).append("\n");
        sb.append("    sampleDuration: ").append(toIndentedString(sampleDuration)).append("\n");
        sb.append("    sampleStrategy: ").append(toIndentedString(sampleStrategy)).append("\n");
        sb.append("    inputTokens: ").append(toIndentedString(inputTokens)).append("\n");
        sb.append("    outputTokens: ").append(toIndentedString(outputTokens)).append("\n");
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
