package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改模型优化任务请求体。
 */
public class UpdateOpsModelTuningTaskRequestBody {

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

    /**
     * **参数解释：** 训练类型，决定模型训练所采用的学习算法类别。  **约束限制：** 目前仅支持强化学习。  **取值范围：** 固定值为rl。  **默认取值：** rl
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
     * **参数解释：**  调优方法/算法，指定模型优化所使用的具体算法策略。  **约束限制：**  目前仅支持群组相对优化算法。  **取值范围：**  固定值为 grpo。  **默认取值：**  grpo
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

    private OpsDataset dataset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validation_set")

    private OpsDataset validationSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validation_set_ratio")

    private Integer validationSetRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_product_path")

    private String trainProductPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_config")

    private OpsLogConfig logConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<OpsTasksTagForTMS> tags = null;

    public UpdateOpsModelTuningTaskRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 任务名称，用于标识和区分不同的模型优化任务。  **约束限制：** 不涉及  **取值范围：** 长度1-64个字符，支持中文、字母、数字、中划线及下划线。  **默认取值：** 无
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateOpsModelTuningTaskRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 任务的详细描述，用于记录任务目的或备注信息。  **约束限制：** 不涉及  **取值范围：** 长度0-1024个字符。  **默认取值：** 无
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateOpsModelTuningTaskRequestBody withAgent(OpsTuningTargetAgent agent) {
        this.agent = agent;
        return this;
    }

    public UpdateOpsModelTuningTaskRequestBody withAgent(Consumer<OpsTuningTargetAgent> agentSetter) {
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

    public UpdateOpsModelTuningTaskRequestBody withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * **参数解释：** 基础调优模型名称，作为本次优化训练的底座模型。  **约束限制：**  必须是系统支持的基础模型。  **取值范围：**  可选值为 qwen3_8b 或 qwen3_1_7b。  **默认取值：** 无
     * @return modelName
     */
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public UpdateOpsModelTuningTaskRequestBody withTrainingType(TrainingTypeEnum trainingType) {
        this.trainingType = trainingType;
        return this;
    }

    /**
     * **参数解释：** 训练类型，决定模型训练所采用的学习算法类别。  **约束限制：** 目前仅支持强化学习。  **取值范围：** 固定值为rl。  **默认取值：** rl
     * @return trainingType
     */
    public TrainingTypeEnum getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(TrainingTypeEnum trainingType) {
        this.trainingType = trainingType;
    }

    public UpdateOpsModelTuningTaskRequestBody withTuningMethod(TuningMethodEnum tuningMethod) {
        this.tuningMethod = tuningMethod;
        return this;
    }

    /**
     * **参数解释：**  调优方法/算法，指定模型优化所使用的具体算法策略。  **约束限制：**  目前仅支持群组相对优化算法。  **取值范围：**  固定值为 grpo。  **默认取值：**  grpo
     * @return tuningMethod
     */
    public TuningMethodEnum getTuningMethod() {
        return tuningMethod;
    }

    public void setTuningMethod(TuningMethodEnum tuningMethod) {
        this.tuningMethod = tuningMethod;
    }

    public UpdateOpsModelTuningTaskRequestBody withRewardSetting(OpsTuningRewardSetting rewardSetting) {
        this.rewardSetting = rewardSetting;
        return this;
    }

    public UpdateOpsModelTuningTaskRequestBody withRewardSetting(Consumer<OpsTuningRewardSetting> rewardSettingSetter) {
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

    public UpdateOpsModelTuningTaskRequestBody withParameterSetting(OpsTuningParamSetting parameterSetting) {
        this.parameterSetting = parameterSetting;
        return this;
    }

    public UpdateOpsModelTuningTaskRequestBody withParameterSetting(
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

    public UpdateOpsModelTuningTaskRequestBody withDataset(OpsDataset dataset) {
        this.dataset = dataset;
        return this;
    }

    public UpdateOpsModelTuningTaskRequestBody withDataset(Consumer<OpsDataset> datasetSetter) {
        if (this.dataset == null) {
            this.dataset = new OpsDataset();
            datasetSetter.accept(this.dataset);
        }

        return this;
    }

    /**
     * Get dataset
     * @return dataset
     */
    public OpsDataset getDataset() {
        return dataset;
    }

    public void setDataset(OpsDataset dataset) {
        this.dataset = dataset;
    }

    public UpdateOpsModelTuningTaskRequestBody withValidationSet(OpsDataset validationSet) {
        this.validationSet = validationSet;
        return this;
    }

    public UpdateOpsModelTuningTaskRequestBody withValidationSet(Consumer<OpsDataset> validationSetSetter) {
        if (this.validationSet == null) {
            this.validationSet = new OpsDataset();
            validationSetSetter.accept(this.validationSet);
        }

        return this;
    }

    /**
     * Get validationSet
     * @return validationSet
     */
    public OpsDataset getValidationSet() {
        return validationSet;
    }

    public void setValidationSet(OpsDataset validationSet) {
        this.validationSet = validationSet;
    }

    public UpdateOpsModelTuningTaskRequestBody withValidationSetRatio(Integer validationSetRatio) {
        this.validationSetRatio = validationSetRatio;
        return this;
    }

    /**
     * **参数解释：** 验证集比例，使用训练数据集中的部分数据进行验证。  **约束限制：** 不涉及  **取值范围：** 0到99的整数（单位：%）  **默认取值：** 不涉及
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

    public UpdateOpsModelTuningTaskRequestBody withTrainProductPath(String trainProductPath) {
        this.trainProductPath = trainProductPath;
        return this;
    }

    /**
     * **参数解释：** 训练产物OBS路径。  **约束限制：** 必须是真实存在的OBS路径且具备读写权限。  **取值范围：** 不涉及  **默认取值：** 无
     * @return trainProductPath
     */
    public String getTrainProductPath() {
        return trainProductPath;
    }

    public void setTrainProductPath(String trainProductPath) {
        this.trainProductPath = trainProductPath;
    }

    public UpdateOpsModelTuningTaskRequestBody withLogConfig(OpsLogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }

    public UpdateOpsModelTuningTaskRequestBody withLogConfig(Consumer<OpsLogConfig> logConfigSetter) {
        if (this.logConfig == null) {
            this.logConfig = new OpsLogConfig();
            logConfigSetter.accept(this.logConfig);
        }

        return this;
    }

    /**
     * Get logConfig
     * @return logConfig
     */
    public OpsLogConfig getLogConfig() {
        return logConfig;
    }

    public void setLogConfig(OpsLogConfig logConfig) {
        this.logConfig = logConfig;
    }

    public UpdateOpsModelTuningTaskRequestBody withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * **参数解释：** 委托名称，赋予服务访问用户资源的权限。  **约束限制：** 必须是IAM中已创建的有效委托。  **取值范围：** 合法的委托名称字符串。  **默认取值：** 无
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public UpdateOpsModelTuningTaskRequestBody withTags(List<OpsTasksTagForTMS> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateOpsModelTuningTaskRequestBody addTagsItem(OpsTasksTagForTMS tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateOpsModelTuningTaskRequestBody withTags(Consumer<List<OpsTasksTagForTMS>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 资源标签列表，用于资源分类。  **约束限制：** 不涉及  **取值范围：** 数组长度0-20。  **默认取值：** 空数组
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
        UpdateOpsModelTuningTaskRequestBody that = (UpdateOpsModelTuningTaskRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.agent, that.agent) && Objects.equals(this.modelName, that.modelName)
            && Objects.equals(this.trainingType, that.trainingType)
            && Objects.equals(this.tuningMethod, that.tuningMethod)
            && Objects.equals(this.rewardSetting, that.rewardSetting)
            && Objects.equals(this.parameterSetting, that.parameterSetting)
            && Objects.equals(this.dataset, that.dataset) && Objects.equals(this.validationSet, that.validationSet)
            && Objects.equals(this.validationSetRatio, that.validationSetRatio)
            && Objects.equals(this.trainProductPath, that.trainProductPath)
            && Objects.equals(this.logConfig, that.logConfig) && Objects.equals(this.agencyName, that.agencyName)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            agent,
            modelName,
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
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOpsModelTuningTaskRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
        sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
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
