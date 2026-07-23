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
 * CreateOpsSynthesisTaskRequestBody
 */
public class CreateOpsSynthesisTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * **参数解释：**   指定数据合成的具体逻辑场景。 **约束限制：**   必填，仅支持枚举值。字符长度1-100。 **取值范围：**   字符长度1-100，seed_data (基于种子数据生成)。 **默认取值：**   不涉及。 
     */
    public static final class ScenarioTypeEnum {

        /**
         * Enum SEED_DATA for value: "seed_data"
         */
        public static final ScenarioTypeEnum SEED_DATA = new ScenarioTypeEnum("seed_data");

        private static final Map<String, ScenarioTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScenarioTypeEnum> createStaticFields() {
            Map<String, ScenarioTypeEnum> map = new HashMap<>();
            map.put("seed_data", SEED_DATA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScenarioTypeEnum(String value) {
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
        public static ScenarioTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScenarioTypeEnum(value));
        }

        public static ScenarioTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScenarioTypeEnum) {
                return this.value.equals(((ScenarioTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scenario_type")

    private ScenarioTypeEnum scenarioType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scenario_description")

    private String scenarioDescription;

    /**
     * **参数解释：**   任务创建后的初始执行状态。 **约束限制：**   字符长度1-100，枚举类型。 **取值范围：**   字符长度1-100，pending(仅保存草稿)，running(立即启动运行)。 **默认取值：**   pending。 
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

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("pending", PENDING);
            map.put("running", RUNNING);
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
    @JsonProperty(value = "model_config")

    private EvaluationOpsModelConfig modelConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seed_data")

    private EvaluationOpsSeedDataCreateConfig seedData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schemas")

    private List<EvaluationOpsSynthesisSchema> schemas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample_count")

    private Integer sampleCount;

    public CreateOpsSynthesisTaskRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：**   数据合成任务的显示名称，用于在任务列表中进行识别与检索。 **约束限制：**   长度为2-100个字符。 **取值范围：**   任意字符串。 **默认取值：**   不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateOpsSynthesisTaskRequestBody withScenarioType(ScenarioTypeEnum scenarioType) {
        this.scenarioType = scenarioType;
        return this;
    }

    /**
     * **参数解释：**   指定数据合成的具体逻辑场景。 **约束限制：**   必填，仅支持枚举值。字符长度1-100。 **取值范围：**   字符长度1-100，seed_data (基于种子数据生成)。 **默认取值：**   不涉及。 
     * @return scenarioType
     */
    public ScenarioTypeEnum getScenarioType() {
        return scenarioType;
    }

    public void setScenarioType(ScenarioTypeEnum scenarioType) {
        this.scenarioType = scenarioType;
    }

    public CreateOpsSynthesisTaskRequestBody withScenarioDescription(String scenarioDescription) {
        this.scenarioDescription = scenarioDescription;
        return this;
    }

    /**
     * **参数解释：**   对合成任务背景的详细描述，辅助模型更好地理解合成目标。 **约束限制：**   1-4000个字符。 **取值范围：**   字符长度1-4000，由用户定义的业务背景描述。 **默认取值：**   不涉及。 
     * @return scenarioDescription
     */
    public String getScenarioDescription() {
        return scenarioDescription;
    }

    public void setScenarioDescription(String scenarioDescription) {
        this.scenarioDescription = scenarioDescription;
    }

    public CreateOpsSynthesisTaskRequestBody withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：**   任务创建后的初始执行状态。 **约束限制：**   字符长度1-100，枚举类型。 **取值范围：**   字符长度1-100，pending(仅保存草稿)，running(立即启动运行)。 **默认取值：**   pending。 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CreateOpsSynthesisTaskRequestBody withModelConfig(EvaluationOpsModelConfig modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }

    public CreateOpsSynthesisTaskRequestBody withModelConfig(Consumer<EvaluationOpsModelConfig> modelConfigSetter) {
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

    public CreateOpsSynthesisTaskRequestBody withSeedData(EvaluationOpsSeedDataCreateConfig seedData) {
        this.seedData = seedData;
        return this;
    }

    public CreateOpsSynthesisTaskRequestBody withSeedData(Consumer<EvaluationOpsSeedDataCreateConfig> seedDataSetter) {
        if (this.seedData == null) {
            this.seedData = new EvaluationOpsSeedDataCreateConfig();
            seedDataSetter.accept(this.seedData);
        }

        return this;
    }

    /**
     * Get seedData
     * @return seedData
     */
    public EvaluationOpsSeedDataCreateConfig getSeedData() {
        return seedData;
    }

    public void setSeedData(EvaluationOpsSeedDataCreateConfig seedData) {
        this.seedData = seedData;
    }

    public CreateOpsSynthesisTaskRequestBody withSchemas(List<EvaluationOpsSynthesisSchema> schemas) {
        this.schemas = schemas;
        return this;
    }

    public CreateOpsSynthesisTaskRequestBody addSchemasItem(EvaluationOpsSynthesisSchema schemasItem) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        this.schemas.add(schemasItem);
        return this;
    }

    public CreateOpsSynthesisTaskRequestBody withSchemas(Consumer<List<EvaluationOpsSynthesisSchema>> schemasSetter) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        schemasSetter.accept(this.schemas);
        return this;
    }

    /**
     * **参数解释：**   定义合成数据输出的字段结构与约束。 **约束限制：**   数组长度为 1-50。 **取值范围：**   参考EvaluationOpsSynthesisSchema定义。 **默认取值：**   不涉及。 
     * @return schemas
     */
    public List<EvaluationOpsSynthesisSchema> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<EvaluationOpsSynthesisSchema> schemas) {
        this.schemas = schemas;
    }

    public CreateOpsSynthesisTaskRequestBody withSampleCount(Integer sampleCount) {
        this.sampleCount = sampleCount;
        return this;
    }

    /**
     * **参数解释：**   期望通过本次合成任务产出的目标样本总数。 **约束限制：**   1-500之间的整数。 **取值范围：**   1-500。 **默认取值：**   不涉及。 
     * minimum: 1
     * maximum: 500
     * @return sampleCount
     */
    public Integer getSampleCount() {
        return sampleCount;
    }

    public void setSampleCount(Integer sampleCount) {
        this.sampleCount = sampleCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOpsSynthesisTaskRequestBody that = (CreateOpsSynthesisTaskRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.scenarioType, that.scenarioType)
            && Objects.equals(this.scenarioDescription, that.scenarioDescription)
            && Objects.equals(this.status, that.status) && Objects.equals(this.modelConfig, that.modelConfig)
            && Objects.equals(this.seedData, that.seedData) && Objects.equals(this.schemas, that.schemas)
            && Objects.equals(this.sampleCount, that.sampleCount);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, scenarioType, scenarioDescription, status, modelConfig, seedData, schemas, sampleCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOpsSynthesisTaskRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    scenarioType: ").append(toIndentedString(scenarioType)).append("\n");
        sb.append("    scenarioDescription: ").append(toIndentedString(scenarioDescription)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    modelConfig: ").append(toIndentedString(modelConfig)).append("\n");
        sb.append("    seedData: ").append(toIndentedString(seedData)).append("\n");
        sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
        sb.append("    sampleCount: ").append(toIndentedString(sampleCount)).append("\n");
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
