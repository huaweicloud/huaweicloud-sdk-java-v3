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
public class ShowOpsSynthesisTaskResponse extends SdkResponse {

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

    /**
     * **参数解释：** 合成任务当前的生命周期运行状态。 **取值范围：** 字符长度1-100，pending(等待执行)，running(正在运行)，completed(已完成)，failed(执行失败)，stopped(已人工停止)。 
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
    @JsonProperty(value = "stats")

    private EvaluationOpsSynthesisStats stats;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage")

    private EvaluationOpsTokenUsage usage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_config")

    private EvaluationOpsModelConfig modelConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seed_data")

    private EvaluationOpsSeedDataConfig seedData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schemas")

    private List<EvaluationOpsSynthesisSchema> schemas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_info")

    private EvaluationOpsTaskBaseInfo baseInfo;

    public ShowOpsSynthesisTaskResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 合成任务的唯一标识符。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowOpsSynthesisTaskResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 用户为合成任务定义的描述性名称。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowOpsSynthesisTaskResponse withScenarioType(String scenarioType) {
        this.scenarioType = scenarioType;
        return this;
    }

    /**
     * **参数解释：** 合成任务所属的技术场景分类标识。 
     * @return scenarioType
     */
    public String getScenarioType() {
        return scenarioType;
    }

    public void setScenarioType(String scenarioType) {
        this.scenarioType = scenarioType;
    }

    public ShowOpsSynthesisTaskResponse withScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
        return this;
    }

    /**
     * **参数解释：** 合成场景的友好展示名称。 
     * @return scenarioName
     */
    public String getScenarioName() {
        return scenarioName;
    }

    public void setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
    }

    public ShowOpsSynthesisTaskResponse withScenarioDescription(String scenarioDescription) {
        this.scenarioDescription = scenarioDescription;
        return this;
    }

    /**
     * **参数解释：** 该合成任务具体业务逻辑或目标的详细说明。 
     * @return scenarioDescription
     */
    public String getScenarioDescription() {
        return scenarioDescription;
    }

    public void setScenarioDescription(String scenarioDescription) {
        this.scenarioDescription = scenarioDescription;
    }

    public ShowOpsSynthesisTaskResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 合成任务当前的生命周期运行状态。 **取值范围：** 字符长度1-100，pending(等待执行)，running(正在运行)，completed(已完成)，failed(执行失败)，stopped(已人工停止)。 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowOpsSynthesisTaskResponse withStats(EvaluationOpsSynthesisStats stats) {
        this.stats = stats;
        return this;
    }

    public ShowOpsSynthesisTaskResponse withStats(Consumer<EvaluationOpsSynthesisStats> statsSetter) {
        if (this.stats == null) {
            this.stats = new EvaluationOpsSynthesisStats();
            statsSetter.accept(this.stats);
        }

        return this;
    }

    /**
     * Get stats
     * @return stats
     */
    public EvaluationOpsSynthesisStats getStats() {
        return stats;
    }

    public void setStats(EvaluationOpsSynthesisStats stats) {
        this.stats = stats;
    }

    public ShowOpsSynthesisTaskResponse withUsage(EvaluationOpsTokenUsage usage) {
        this.usage = usage;
        return this;
    }

    public ShowOpsSynthesisTaskResponse withUsage(Consumer<EvaluationOpsTokenUsage> usageSetter) {
        if (this.usage == null) {
            this.usage = new EvaluationOpsTokenUsage();
            usageSetter.accept(this.usage);
        }

        return this;
    }

    /**
     * Get usage
     * @return usage
     */
    public EvaluationOpsTokenUsage getUsage() {
        return usage;
    }

    public void setUsage(EvaluationOpsTokenUsage usage) {
        this.usage = usage;
    }

    public ShowOpsSynthesisTaskResponse withModelConfig(EvaluationOpsModelConfig modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }

    public ShowOpsSynthesisTaskResponse withModelConfig(Consumer<EvaluationOpsModelConfig> modelConfigSetter) {
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

    public ShowOpsSynthesisTaskResponse withSeedData(EvaluationOpsSeedDataConfig seedData) {
        this.seedData = seedData;
        return this;
    }

    public ShowOpsSynthesisTaskResponse withSeedData(Consumer<EvaluationOpsSeedDataConfig> seedDataSetter) {
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

    public ShowOpsSynthesisTaskResponse withSchemas(List<EvaluationOpsSynthesisSchema> schemas) {
        this.schemas = schemas;
        return this;
    }

    public ShowOpsSynthesisTaskResponse addSchemasItem(EvaluationOpsSynthesisSchema schemasItem) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        this.schemas.add(schemasItem);
        return this;
    }

    public ShowOpsSynthesisTaskResponse withSchemas(Consumer<List<EvaluationOpsSynthesisSchema>> schemasSetter) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        schemasSetter.accept(this.schemas);
        return this;
    }

    /**
     * **参数解释：** 合成数据所遵循的字段结构定义（Schema）列表。 **取值范围：** 包含字段名称、类型、描述等元数据的对象数组。 
     * @return schemas
     */
    public List<EvaluationOpsSynthesisSchema> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<EvaluationOpsSynthesisSchema> schemas) {
        this.schemas = schemas;
    }

    public ShowOpsSynthesisTaskResponse withBaseInfo(EvaluationOpsTaskBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    public ShowOpsSynthesisTaskResponse withBaseInfo(Consumer<EvaluationOpsTaskBaseInfo> baseInfoSetter) {
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
        ShowOpsSynthesisTaskResponse that = (ShowOpsSynthesisTaskResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.scenarioType, that.scenarioType)
            && Objects.equals(this.scenarioName, that.scenarioName)
            && Objects.equals(this.scenarioDescription, that.scenarioDescription)
            && Objects.equals(this.status, that.status) && Objects.equals(this.stats, that.stats)
            && Objects.equals(this.usage, that.usage) && Objects.equals(this.modelConfig, that.modelConfig)
            && Objects.equals(this.seedData, that.seedData) && Objects.equals(this.schemas, that.schemas)
            && Objects.equals(this.baseInfo, that.baseInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            scenarioType,
            scenarioName,
            scenarioDescription,
            status,
            stats,
            usage,
            modelConfig,
            seedData,
            schemas,
            baseInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsSynthesisTaskResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    scenarioType: ").append(toIndentedString(scenarioType)).append("\n");
        sb.append("    scenarioName: ").append(toIndentedString(scenarioName)).append("\n");
        sb.append("    scenarioDescription: ").append(toIndentedString(scenarioDescription)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("    modelConfig: ").append(toIndentedString(modelConfig)).append("\n");
        sb.append("    seedData: ").append(toIndentedString(seedData)).append("\n");
        sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
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
