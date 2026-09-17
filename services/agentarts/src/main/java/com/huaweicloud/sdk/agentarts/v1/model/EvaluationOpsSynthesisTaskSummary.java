package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EvaluationOpsSynthesisTaskSummary
 */
public class EvaluationOpsSynthesisTaskSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scenario_type")

    private String scenarioType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scenario_name")

    private String scenarioName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scenario_description")

    private String scenarioDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stats")

    private Object stats;

    /**
     * **参数解释：**   合成任务当前的生命周期状态。 **约束限制：**   枚举类型。 **取值范围：**   pending, running, completed, failed, stopped。 **默认取值：**   pending。 
     */
    public static final class StatusEnum {

        /**
         * Enum PENDING for value: "pending"
         */
        public static final StatusEnum PENDING = new StatusEnum("pending");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final StatusEnum RUNNING = new StatusEnum("running");

        /**
         * Enum COMPLETED for value: "completed"
         */
        public static final StatusEnum COMPLETED = new StatusEnum("completed");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("failed");

        /**
         * Enum STOPPED for value: "stopped"
         */
        public static final StatusEnum STOPPED = new StatusEnum("stopped");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("pending", PENDING);
            map.put("running", RUNNING);
            map.put("completed", COMPLETED);
            map.put("failed", FAILED);
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
    @JsonProperty(value = "error_message")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_free")

    private Boolean isFree;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_config")

    private EvaluationOpsModelConfig modelConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seed_data")

    private EvaluationOpsSeedDataConfig seedData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_info")

    private EvaluationOpsTaskBaseInfo baseInfo;

    public EvaluationOpsSynthesisTaskSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：**   合成任务的唯一标识符。 **约束限制：**   1-64 字符。 **取值范围：**   UUID或系统生成的ID。 **默认取值：**   不涉及。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EvaluationOpsSynthesisTaskSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：**   用户为合成任务定义的名称。 **约束限制：**   1-100字符。 **取值范围：**   任意字符串。 **默认取值：**   不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EvaluationOpsSynthesisTaskSummary withScenarioType(String scenarioType) {
        this.scenarioType = scenarioType;
        return this;
    }

    /**
     * **参数解释：**   合成任务的技术场景类型。 **约束限制：**   枚举值。 **取值范围：**   seed_data等。 **默认取值：**   不涉及。 
     * @return scenarioType
     */
    public String getScenarioType() {
        return scenarioType;
    }

    public void setScenarioType(String scenarioType) {
        this.scenarioType = scenarioType;
    }

    public EvaluationOpsSynthesisTaskSummary withScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
        return this;
    }

    /**
     * **参数解释：**   场景的友好展示名称。 **约束限制：**   1-4000字符。 **取值范围：**   如 \"基于种子数据泛化\"。 **默认取值：**   不涉及。 
     * @return scenarioName
     */
    public String getScenarioName() {
        return scenarioName;
    }

    public void setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
    }

    public EvaluationOpsSynthesisTaskSummary withScenarioDescription(String scenarioDescription) {
        this.scenarioDescription = scenarioDescription;
        return this;
    }

    /**
     * **参数解释：**   合成任务背景的详细描述。 **约束限制：**   1-4000字符。 **取值范围：**   场景背景文本。 **默认取值：**   不涉及。 
     * @return scenarioDescription
     */
    public String getScenarioDescription() {
        return scenarioDescription;
    }

    public void setScenarioDescription(String scenarioDescription) {
        this.scenarioDescription = scenarioDescription;
    }

    public EvaluationOpsSynthesisTaskSummary withStats(Object stats) {
        this.stats = stats;
        return this;
    }

    /**
     * **参数解释：**   合成任务的运行状态统计列表。 **约束限制：**   数组类型。 **取值范围：**   不涉及。 **默认取值：**   不涉及。 
     * @return stats
     */
    public Object getStats() {
        return stats;
    }

    public void setStats(Object stats) {
        this.stats = stats;
    }

    public EvaluationOpsSynthesisTaskSummary withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：**   合成任务当前的生命周期状态。 **约束限制：**   枚举类型。 **取值范围：**   pending, running, completed, failed, stopped。 **默认取值：**   pending。 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public EvaluationOpsSynthesisTaskSummary withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * **参数解释：**   任务失败时的错误信息。 **约束限制：**   不涉及。 **取值范围：**   不涉及。 **默认取值：**   不涉及。 
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public EvaluationOpsSynthesisTaskSummary withIsFree(Boolean isFree) {
        this.isFree = isFree;
        return this;
    }

    /**
     * **参数解释：**   是否使用免费额度创建的任务。 **约束限制：**   不涉及。 **取值范围：**   - true：免费任务 - false：付费任务 **默认取值：**   不涉及。 
     * @return isFree
     */
    public Boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    public EvaluationOpsSynthesisTaskSummary withModelConfig(EvaluationOpsModelConfig modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }

    public EvaluationOpsSynthesisTaskSummary withModelConfig(Consumer<EvaluationOpsModelConfig> modelConfigSetter) {
        if (this.modelConfig == null) {
            this.modelConfig = new EvaluationOpsModelConfig();
            modelConfigSetter.accept(this.modelConfig);
        }

        return this;
    }

    /**
     * Get modelConfig
     * @return modelConfig
     */
    public EvaluationOpsModelConfig getModelConfig() {
        return modelConfig;
    }

    public void setModelConfig(EvaluationOpsModelConfig modelConfig) {
        this.modelConfig = modelConfig;
    }

    public EvaluationOpsSynthesisTaskSummary withSeedData(EvaluationOpsSeedDataConfig seedData) {
        this.seedData = seedData;
        return this;
    }

    public EvaluationOpsSynthesisTaskSummary withSeedData(Consumer<EvaluationOpsSeedDataConfig> seedDataSetter) {
        if (this.seedData == null) {
            this.seedData = new EvaluationOpsSeedDataConfig();
            seedDataSetter.accept(this.seedData);
        }

        return this;
    }

    /**
     * Get seedData
     * @return seedData
     */
    public EvaluationOpsSeedDataConfig getSeedData() {
        return seedData;
    }

    public void setSeedData(EvaluationOpsSeedDataConfig seedData) {
        this.seedData = seedData;
    }

    public EvaluationOpsSynthesisTaskSummary withBaseInfo(EvaluationOpsTaskBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    public EvaluationOpsSynthesisTaskSummary withBaseInfo(Consumer<EvaluationOpsTaskBaseInfo> baseInfoSetter) {
        if (this.baseInfo == null) {
            this.baseInfo = new EvaluationOpsTaskBaseInfo();
            baseInfoSetter.accept(this.baseInfo);
        }

        return this;
    }

    /**
     * Get baseInfo
     * @return baseInfo
     */
    public EvaluationOpsTaskBaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(EvaluationOpsTaskBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EvaluationOpsSynthesisTaskSummary that = (EvaluationOpsSynthesisTaskSummary) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.scenarioType, that.scenarioType)
            && Objects.equals(this.scenarioName, that.scenarioName)
            && Objects.equals(this.scenarioDescription, that.scenarioDescription)
            && Objects.equals(this.stats, that.stats) && Objects.equals(this.status, that.status)
            && Objects.equals(this.errorMessage, that.errorMessage) && Objects.equals(this.isFree, that.isFree)
            && Objects.equals(this.modelConfig, that.modelConfig) && Objects.equals(this.seedData, that.seedData)
            && Objects.equals(this.baseInfo, that.baseInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            scenarioType,
            scenarioName,
            scenarioDescription,
            stats,
            status,
            errorMessage,
            isFree,
            modelConfig,
            seedData,
            baseInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationOpsSynthesisTaskSummary {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    scenarioType: ").append(toIndentedString(scenarioType)).append("\n");
        sb.append("    scenarioName: ").append(toIndentedString(scenarioName)).append("\n");
        sb.append("    scenarioDescription: ").append(toIndentedString(scenarioDescription)).append("\n");
        sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    isFree: ").append(toIndentedString(isFree)).append("\n");
        sb.append("    modelConfig: ").append(toIndentedString(modelConfig)).append("\n");
        sb.append("    seedData: ").append(toIndentedString(seedData)).append("\n");
        sb.append("    baseInfo: ").append(toIndentedString(baseInfo)).append("\n");
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
