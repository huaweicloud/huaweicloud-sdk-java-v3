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
public class CreateOpsModelTuningTaskResponse extends SdkResponse {

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

    private OpsTuningTargetAgent agent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_name")

    private String modelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_agent")

    private OpsTuningTrainAgent trainAgent;

    /**
     * **参数解释：** 训练类型。  **取值范围：** 固定值为rl（强化学习）。
     */
    public static final class TrainingTypeEnum {

        /**
         * Enum RL for value: "rl"
         */
        public static final TrainingTypeEnum RL = new TrainingTypeEnum("rl");

        private static final Map<String, TrainingTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TrainingTypeEnum> createStaticFields() {
            Map<String, TrainingTypeEnum> map = new HashMap<>();
            map.put("rl", RL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TrainingTypeEnum(String value) {
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
        public static TrainingTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TrainingTypeEnum(value));
        }

        public static TrainingTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TrainingTypeEnum) {
                return this.value.equals(((TrainingTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "training_type")

    private TrainingTypeEnum trainingType;

    /**
     * **参数解释：** 调优方法。  **取值范围：** 固定值为grpo（群组相对策略优化）。
     */
    public static final class TuningMethodEnum {

        /**
         * Enum GRPO for value: "grpo"
         */
        public static final TuningMethodEnum GRPO = new TuningMethodEnum("grpo");

        private static final Map<String, TuningMethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TuningMethodEnum> createStaticFields() {
            Map<String, TuningMethodEnum> map = new HashMap<>();
            map.put("grpo", GRPO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TuningMethodEnum(String value) {
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
        public static TuningMethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TuningMethodEnum(value));
        }

        public static TuningMethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TuningMethodEnum) {
                return this.value.equals(((TuningMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tuning_method")

    private TuningMethodEnum tuningMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reward_setting")

    private OpsTuningRewardSetting rewardSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameter_setting")

    private OpsTuningParamSetting parameterSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset")

    private OpsDatasetInfo dataset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validation_set")

    private OpsDatasetInfo validationSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validation_set_ratio")

    private Integer validationSetRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_product_path")

    private String trainProductPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_config")

    private OpsLogConfigInfo logConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    /**
     * **参数解释：** 任务状态。  **取值范围：** draft草稿态，training训练中，stopped已停止，success成功，fail失败，deleting删除中，stopping停止中。
     */
    public static final class StatusEnum {

        /**
         * Enum DRAFT for value: "draft"
         */
        public static final StatusEnum DRAFT = new StatusEnum("draft");

        /**
         * Enum TRAINING for value: "training"
         */
        public static final StatusEnum TRAINING = new StatusEnum("training");

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

        /**
         * Enum DELETING for value: "deleting"
         */
        public static final StatusEnum DELETING = new StatusEnum("deleting");

        /**
         * Enum STOPPING for value: "stopping"
         */
        public static final StatusEnum STOPPING = new StatusEnum("stopping");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("draft", DRAFT);
            map.put("training", TRAINING);
            map.put("stopped", STOPPED);
            map.put("success", SUCCESS);
            map.put("fail", FAIL);
            map.put("deleting", DELETING);
            map.put("stopping", STOPPING);
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
    @JsonProperty(value = "fail_detail")

    private OpsFailDetail failDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Double progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private Long createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private Long updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executed_at")

    private Long executedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_at")

    private Long endAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executed_time")

    private Integer executedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<OpsTasksTagForTMS> tags = null;

    public CreateOpsModelTuningTaskResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 模型优化任务ID。  **取值范围：** UUID格式字符串。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateOpsModelTuningTaskResponse withName(String name) {
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

    public CreateOpsModelTuningTaskResponse withDescription(String description) {
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

    public CreateOpsModelTuningTaskResponse withAgent(OpsTuningTargetAgent agent) {
        this.agent = agent;
        return this;
    }

    public CreateOpsModelTuningTaskResponse withAgent(Consumer<OpsTuningTargetAgent> agentSetter) {
        if (this.agent == null) {
            this.agent = new OpsTuningTargetAgent();
            agentSetter.accept(this.agent);
        }

        return this;
    }

    /**
     * Get agent
     * @return agent
     */
    public OpsTuningTargetAgent getAgent() {
        return agent;
    }

    public void setAgent(OpsTuningTargetAgent agent) {
        this.agent = agent;
    }

    public CreateOpsModelTuningTaskResponse withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * **参数解释：** 调优模型名称。  **取值范围：** qwen3_8b或qwen3_1_7b。
     * @return modelName
     */
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public CreateOpsModelTuningTaskResponse withTrainAgent(OpsTuningTrainAgent trainAgent) {
        this.trainAgent = trainAgent;
        return this;
    }

    public CreateOpsModelTuningTaskResponse withTrainAgent(Consumer<OpsTuningTrainAgent> trainAgentSetter) {
        if (this.trainAgent == null) {
            this.trainAgent = new OpsTuningTrainAgent();
            trainAgentSetter.accept(this.trainAgent);
        }

        return this;
    }

    /**
     * Get trainAgent
     * @return trainAgent
     */
    public OpsTuningTrainAgent getTrainAgent() {
        return trainAgent;
    }

    public void setTrainAgent(OpsTuningTrainAgent trainAgent) {
        this.trainAgent = trainAgent;
    }

    public CreateOpsModelTuningTaskResponse withTrainingType(TrainingTypeEnum trainingType) {
        this.trainingType = trainingType;
        return this;
    }

    /**
     * **参数解释：** 训练类型。  **取值范围：** 固定值为rl（强化学习）。
     * @return trainingType
     */
    public TrainingTypeEnum getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(TrainingTypeEnum trainingType) {
        this.trainingType = trainingType;
    }

    public CreateOpsModelTuningTaskResponse withTuningMethod(TuningMethodEnum tuningMethod) {
        this.tuningMethod = tuningMethod;
        return this;
    }

    /**
     * **参数解释：** 调优方法。  **取值范围：** 固定值为grpo（群组相对策略优化）。
     * @return tuningMethod
     */
    public TuningMethodEnum getTuningMethod() {
        return tuningMethod;
    }

    public void setTuningMethod(TuningMethodEnum tuningMethod) {
        this.tuningMethod = tuningMethod;
    }

    public CreateOpsModelTuningTaskResponse withRewardSetting(OpsTuningRewardSetting rewardSetting) {
        this.rewardSetting = rewardSetting;
        return this;
    }

    public CreateOpsModelTuningTaskResponse withRewardSetting(Consumer<OpsTuningRewardSetting> rewardSettingSetter) {
        if (this.rewardSetting == null) {
            this.rewardSetting = new OpsTuningRewardSetting();
            rewardSettingSetter.accept(this.rewardSetting);
        }

        return this;
    }

    /**
     * Get rewardSetting
     * @return rewardSetting
     */
    public OpsTuningRewardSetting getRewardSetting() {
        return rewardSetting;
    }

    public void setRewardSetting(OpsTuningRewardSetting rewardSetting) {
        this.rewardSetting = rewardSetting;
    }

    public CreateOpsModelTuningTaskResponse withParameterSetting(OpsTuningParamSetting parameterSetting) {
        this.parameterSetting = parameterSetting;
        return this;
    }

    public CreateOpsModelTuningTaskResponse withParameterSetting(
        Consumer<OpsTuningParamSetting> parameterSettingSetter) {
        if (this.parameterSetting == null) {
            this.parameterSetting = new OpsTuningParamSetting();
            parameterSettingSetter.accept(this.parameterSetting);
        }

        return this;
    }

    /**
     * Get parameterSetting
     * @return parameterSetting
     */
    public OpsTuningParamSetting getParameterSetting() {
        return parameterSetting;
    }

    public void setParameterSetting(OpsTuningParamSetting parameterSetting) {
        this.parameterSetting = parameterSetting;
    }

    public CreateOpsModelTuningTaskResponse withDataset(OpsDatasetInfo dataset) {
        this.dataset = dataset;
        return this;
    }

    public CreateOpsModelTuningTaskResponse withDataset(Consumer<OpsDatasetInfo> datasetSetter) {
        if (this.dataset == null) {
            this.dataset = new OpsDatasetInfo();
            datasetSetter.accept(this.dataset);
        }

        return this;
    }

    /**
     * Get dataset
     * @return dataset
     */
    public OpsDatasetInfo getDataset() {
        return dataset;
    }

    public void setDataset(OpsDatasetInfo dataset) {
        this.dataset = dataset;
    }

    public CreateOpsModelTuningTaskResponse withValidationSet(OpsDatasetInfo validationSet) {
        this.validationSet = validationSet;
        return this;
    }

    public CreateOpsModelTuningTaskResponse withValidationSet(Consumer<OpsDatasetInfo> validationSetSetter) {
        if (this.validationSet == null) {
            this.validationSet = new OpsDatasetInfo();
            validationSetSetter.accept(this.validationSet);
        }

        return this;
    }

    /**
     * Get validationSet
     * @return validationSet
     */
    public OpsDatasetInfo getValidationSet() {
        return validationSet;
    }

    public void setValidationSet(OpsDatasetInfo validationSet) {
        this.validationSet = validationSet;
    }

    public CreateOpsModelTuningTaskResponse withValidationSetRatio(Integer validationSetRatio) {
        this.validationSetRatio = validationSetRatio;
        return this;
    }

    /**
     * **参数解释：** 验证集比例。  **取值范围：** 0到99的整数（单位：%）
     * minimum: 0
     * maximum: 99
     * @return validationSetRatio
     */
    public Integer getValidationSetRatio() {
        return validationSetRatio;
    }

    public void setValidationSetRatio(Integer validationSetRatio) {
        this.validationSetRatio = validationSetRatio;
    }

    public CreateOpsModelTuningTaskResponse withTrainProductPath(String trainProductPath) {
        this.trainProductPath = trainProductPath;
        return this;
    }

    /**
     * **参数解释：** 训练产物路径。  **取值范围：** 不涉及
     * @return trainProductPath
     */
    public String getTrainProductPath() {
        return trainProductPath;
    }

    public void setTrainProductPath(String trainProductPath) {
        this.trainProductPath = trainProductPath;
    }

    public CreateOpsModelTuningTaskResponse withLogConfig(OpsLogConfigInfo logConfig) {
        this.logConfig = logConfig;
        return this;
    }

    public CreateOpsModelTuningTaskResponse withLogConfig(Consumer<OpsLogConfigInfo> logConfigSetter) {
        if (this.logConfig == null) {
            this.logConfig = new OpsLogConfigInfo();
            logConfigSetter.accept(this.logConfig);
        }

        return this;
    }

    /**
     * Get logConfig
     * @return logConfig
     */
    public OpsLogConfigInfo getLogConfig() {
        return logConfig;
    }

    public void setLogConfig(OpsLogConfigInfo logConfig) {
        this.logConfig = logConfig;
    }

    public CreateOpsModelTuningTaskResponse withAgencyName(String agencyName) {
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

    public CreateOpsModelTuningTaskResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 任务状态。  **取值范围：** draft草稿态，training训练中，stopped已停止，success成功，fail失败，deleting删除中，stopping停止中。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CreateOpsModelTuningTaskResponse withFailDetail(OpsFailDetail failDetail) {
        this.failDetail = failDetail;
        return this;
    }

    public CreateOpsModelTuningTaskResponse withFailDetail(Consumer<OpsFailDetail> failDetailSetter) {
        if (this.failDetail == null) {
            this.failDetail = new OpsFailDetail();
            failDetailSetter.accept(this.failDetail);
        }

        return this;
    }

    /**
     * Get failDetail
     * @return failDetail
     */
    public OpsFailDetail getFailDetail() {
        return failDetail;
    }

    public void setFailDetail(OpsFailDetail failDetail) {
        this.failDetail = failDetail;
    }

    public CreateOpsModelTuningTaskResponse withProgress(Double progress) {
        this.progress = progress;
        return this;
    }

    /**
     * **参数解释：** 任务进度，单位：%。  **取值范围：** 0.0到100.0之间的浮点数。
     * minimum: 1
     * maximum: 1E+2
     * @return progress
     */
    public Double getProgress() {
        return progress;
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    public CreateOpsModelTuningTaskResponse withCreatedAt(Long createdAt) {
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

    public CreateOpsModelTuningTaskResponse withUpdatedAt(Long updatedAt) {
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

    public CreateOpsModelTuningTaskResponse withExecutedAt(Long executedAt) {
        this.executedAt = executedAt;
        return this;
    }

    /**
     * **参数解释：** 运行时长，单位：分钟。  **取值范围：** 13位毫秒级时间戳。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return executedAt
     */
    public Long getExecutedAt() {
        return executedAt;
    }

    public void setExecutedAt(Long executedAt) {
        this.executedAt = executedAt;
    }

    public CreateOpsModelTuningTaskResponse withEndAt(Long endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * **参数解释：** 执行结束时间，单位：毫秒（13位时间戳）。  **取值范围：** 13位毫秒级时间戳。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return endAt
     */
    public Long getEndAt() {
        return endAt;
    }

    public void setEndAt(Long endAt) {
        this.endAt = endAt;
    }

    public CreateOpsModelTuningTaskResponse withExecutedTime(Integer executedTime) {
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

    public CreateOpsModelTuningTaskResponse withTags(List<OpsTasksTagForTMS> tags) {
        this.tags = tags;
        return this;
    }

    public CreateOpsModelTuningTaskResponse addTagsItem(OpsTasksTagForTMS tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateOpsModelTuningTaskResponse withTags(Consumer<List<OpsTasksTagForTMS>> tagsSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOpsModelTuningTaskResponse that = (CreateOpsModelTuningTaskResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.agent, that.agent)
            && Objects.equals(this.modelName, that.modelName) && Objects.equals(this.trainAgent, that.trainAgent)
            && Objects.equals(this.trainingType, that.trainingType)
            && Objects.equals(this.tuningMethod, that.tuningMethod)
            && Objects.equals(this.rewardSetting, that.rewardSetting)
            && Objects.equals(this.parameterSetting, that.parameterSetting)
            && Objects.equals(this.dataset, that.dataset) && Objects.equals(this.validationSet, that.validationSet)
            && Objects.equals(this.validationSetRatio, that.validationSetRatio)
            && Objects.equals(this.trainProductPath, that.trainProductPath)
            && Objects.equals(this.logConfig, that.logConfig) && Objects.equals(this.agencyName, that.agencyName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.failDetail, that.failDetail)
            && Objects.equals(this.progress, that.progress) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.executedAt, that.executedAt)
            && Objects.equals(this.endAt, that.endAt) && Objects.equals(this.executedTime, that.executedTime)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            agent,
            modelName,
            trainAgent,
            trainingType,
            tuningMethod,
            rewardSetting,
            parameterSetting,
            dataset,
            validationSet,
            validationSetRatio,
            trainProductPath,
            logConfig,
            agencyName,
            status,
            failDetail,
            progress,
            createdAt,
            updatedAt,
            executedAt,
            endAt,
            executedTime,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOpsModelTuningTaskResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
        sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
        sb.append("    trainAgent: ").append(toIndentedString(trainAgent)).append("\n");
        sb.append("    trainingType: ").append(toIndentedString(trainingType)).append("\n");
        sb.append("    tuningMethod: ").append(toIndentedString(tuningMethod)).append("\n");
        sb.append("    rewardSetting: ").append(toIndentedString(rewardSetting)).append("\n");
        sb.append("    parameterSetting: ").append(toIndentedString(parameterSetting)).append("\n");
        sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
        sb.append("    validationSet: ").append(toIndentedString(validationSet)).append("\n");
        sb.append("    validationSetRatio: ").append(toIndentedString(validationSetRatio)).append("\n");
        sb.append("    trainProductPath: ").append(toIndentedString(trainProductPath)).append("\n");
        sb.append("    logConfig: ").append(toIndentedString(logConfig)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    failDetail: ").append(toIndentedString(failDetail)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    executedAt: ").append(toIndentedString(executedAt)).append("\n");
        sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
        sb.append("    executedTime: ").append(toIndentedString(executedTime)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
