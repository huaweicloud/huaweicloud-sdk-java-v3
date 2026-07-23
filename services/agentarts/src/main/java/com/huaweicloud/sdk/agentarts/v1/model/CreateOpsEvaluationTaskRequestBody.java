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
 * **参数解释：** 创建评估任务的请求体，定义了任务的核心元数据及执行逻辑。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class CreateOpsEvaluationTaskRequestBody {

    /**
     * **参数解释：** 评估模式，指定任务是在线评估还是离线评估，影响任务的执行环境和策略。 **约束限制：** 字符串类型，最小长度为1，最大长度为36。 **取值范围：** 枚举值：OFFLINE（离线）、ONLINE（在线）。字符最小长度为1，最大长度为36。 **默认取值：** OFFLINE。
     */
    public static final class EvalModeEnum {

        /**
         * Enum OFFLINE for value: "OFFLINE"
         */
        public static final EvalModeEnum OFFLINE = new EvalModeEnum("OFFLINE");

        /**
         * Enum ONLINE for value: "ONLINE"
         */
        public static final EvalModeEnum ONLINE = new EvalModeEnum("ONLINE");

        private static final Map<String, EvalModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EvalModeEnum> createStaticFields() {
            Map<String, EvalModeEnum> map = new HashMap<>();
            map.put("OFFLINE", OFFLINE);
            map.put("ONLINE", ONLINE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EvalModeEnum(String value) {
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
        public static EvalModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EvalModeEnum(value));
        }

        public static EvalModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EvalModeEnum) {
                return this.value.equals(((EvalModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eval_mode")

    private EvalModeEnum evalMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_id")

    private String datasetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_version")

    private String datasetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "human_read_version")

    private String humanReadVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_name")

    private String datasetName;

    /**
     * **参数解释：** 评估数据来源，指定评估数据的类型和来源，影响数据的获取方式。 **约束限制：** 字符串类型，最大长度为36。 **取值范围：** 字符长度1-36，枚举值：DATASET_DYNAMIC、DATASET_STATIC、TRACE_STREAM。 **默认取值：** DATASET_DYNAMIC。
     */
    public static final class InputSourceTypeEnum {

        /**
         * Enum DATASET_DYNAMIC for value: "DATASET_DYNAMIC"
         */
        public static final InputSourceTypeEnum DATASET_DYNAMIC = new InputSourceTypeEnum("DATASET_DYNAMIC");

        /**
         * Enum DATASET_STATIC for value: "DATASET_STATIC"
         */
        public static final InputSourceTypeEnum DATASET_STATIC = new InputSourceTypeEnum("DATASET_STATIC");

        /**
         * Enum TRACE_STREAM for value: "TRACE_STREAM"
         */
        public static final InputSourceTypeEnum TRACE_STREAM = new InputSourceTypeEnum("TRACE_STREAM");

        private static final Map<String, InputSourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InputSourceTypeEnum> createStaticFields() {
            Map<String, InputSourceTypeEnum> map = new HashMap<>();
            map.put("DATASET_DYNAMIC", DATASET_DYNAMIC);
            map.put("DATASET_STATIC", DATASET_STATIC);
            map.put("TRACE_STREAM", TRACE_STREAM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InputSourceTypeEnum(String value) {
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
        public static InputSourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InputSourceTypeEnum(value));
        }

        public static InputSourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InputSourceTypeEnum) {
                return this.value.equals(((InputSourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_source_type")

    private InputSourceTypeEnum inputSourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_source")

    private OpsInputSource inputSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_config")

    private RuntimeConfig runtimeConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_object_config")

    private Object evaluationObjectConfig;

    public CreateOpsEvaluationTaskRequestBody withEvalMode(EvalModeEnum evalMode) {
        this.evalMode = evalMode;
        return this;
    }

    /**
     * **参数解释：** 评估模式，指定任务是在线评估还是离线评估，影响任务的执行环境和策略。 **约束限制：** 字符串类型，最小长度为1，最大长度为36。 **取值范围：** 枚举值：OFFLINE（离线）、ONLINE（在线）。字符最小长度为1，最大长度为36。 **默认取值：** OFFLINE。
     * @return evalMode
     */
    public EvalModeEnum getEvalMode() {
        return evalMode;
    }

    public void setEvalMode(EvalModeEnum evalMode) {
        this.evalMode = evalMode;
    }

    public CreateOpsEvaluationTaskRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 评估任务的名称，用于标识和区分不同的评估任务，方便管理和查找。 **约束限制：** 字符串类型，最小长度为4，最大长度为100。 **取值范围：** 字符长度4-100。 **默认取值：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateOpsEvaluationTaskRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 评估任务的描述信息，详细说明任务的目的、范围和预期结果等背景信息。 **约束限制：** 字符串类型，最大长度为400。 **取值范围：** 字符长度0-400。 **默认取值：** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateOpsEvaluationTaskRequestBody withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    /**
     * **参数解释：** 评测集ID，离线任务使用的数据集唯一标识符，用于指定评估的数据来源。 通过1.1-创建评测集 - CreateOpsDataset获取。 **约束限制：** 字符串类型，最大长度为36。 **取值范围：** 字符长度0-36，符合通用唯一识别码(UUID)标准的字符串。 **默认取值：** 不涉及。
     * @return datasetId
     */
    public String getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    public CreateOpsEvaluationTaskRequestBody withDatasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
        return this;
    }

    /**
     * **参数解释：** 评测集版本号，离线任务使用的评测集版本标识。 **约束限制：** 字符串类型，最大长度为36。 **取值范围：** 字符长度0-36，系统内有效的评测集版本标识。 **默认取值：** 不涉及。
     * @return datasetVersion
     */
    public String getDatasetVersion() {
        return datasetVersion;
    }

    public void setDatasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
    }

    public CreateOpsEvaluationTaskRequestBody withHumanReadVersion(String humanReadVersion) {
        this.humanReadVersion = humanReadVersion;
        return this;
    }

    /**
     * **参数解释：** 评测集版本，离线任务使用的评测集可读版本标识。 **约束限制：** 字符串类型，最大长度为36。 **取值范围：** 字符长度0-36，如0.0.1格式。 **默认取值：** 不涉及。
     * @return humanReadVersion
     */
    public String getHumanReadVersion() {
        return humanReadVersion;
    }

    public void setHumanReadVersion(String humanReadVersion) {
        this.humanReadVersion = humanReadVersion;
    }

    public CreateOpsEvaluationTaskRequestBody withDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }

    /**
     * **参数解释：** 评测集名称，离线任务使用的评测集显示名称。 **约束限制：** 字符串类型，最小长度为2，最大长度为100。 **取值范围：** 字符长度2-100。 **默认取值：** 不涉及。
     * @return datasetName
     */
    public String getDatasetName() {
        return datasetName;
    }

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    public CreateOpsEvaluationTaskRequestBody withInputSourceType(InputSourceTypeEnum inputSourceType) {
        this.inputSourceType = inputSourceType;
        return this;
    }

    /**
     * **参数解释：** 评估数据来源，指定评估数据的类型和来源，影响数据的获取方式。 **约束限制：** 字符串类型，最大长度为36。 **取值范围：** 字符长度1-36，枚举值：DATASET_DYNAMIC、DATASET_STATIC、TRACE_STREAM。 **默认取值：** DATASET_DYNAMIC。
     * @return inputSourceType
     */
    public InputSourceTypeEnum getInputSourceType() {
        return inputSourceType;
    }

    public void setInputSourceType(InputSourceTypeEnum inputSourceType) {
        this.inputSourceType = inputSourceType;
    }

    public CreateOpsEvaluationTaskRequestBody withInputSource(OpsInputSource inputSource) {
        this.inputSource = inputSource;
        return this;
    }

    public CreateOpsEvaluationTaskRequestBody withInputSource(Consumer<OpsInputSource> inputSourceSetter) {
        if (this.inputSource == null) {
            this.inputSource = new OpsInputSource();
            inputSourceSetter.accept(this.inputSource);
        }

        return this;
    }

    /**
     * Get inputSource
     * @return inputSource
     */
    public OpsInputSource getInputSource() {
        return inputSource;
    }

    public void setInputSource(OpsInputSource inputSource) {
        this.inputSource = inputSource;
    }

    public CreateOpsEvaluationTaskRequestBody withRuntimeConfig(RuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
        return this;
    }

    public CreateOpsEvaluationTaskRequestBody withRuntimeConfig(Consumer<RuntimeConfig> runtimeConfigSetter) {
        if (this.runtimeConfig == null) {
            this.runtimeConfig = new RuntimeConfig();
            runtimeConfigSetter.accept(this.runtimeConfig);
        }

        return this;
    }

    /**
     * Get runtimeConfig
     * @return runtimeConfig
     */
    public RuntimeConfig getRuntimeConfig() {
        return runtimeConfig;
    }

    public void setRuntimeConfig(RuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
    }

    public CreateOpsEvaluationTaskRequestBody withEvaluationObjectConfig(Object evaluationObjectConfig) {
        this.evaluationObjectConfig = evaluationObjectConfig;
        return this;
    }

    /**
     * **参数解释：** 评估对象配置，指定被评估的对象信息（如模型、流等）。 **约束限制：** 结构化对象。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return evaluationObjectConfig
     */
    public Object getEvaluationObjectConfig() {
        return evaluationObjectConfig;
    }

    public void setEvaluationObjectConfig(Object evaluationObjectConfig) {
        this.evaluationObjectConfig = evaluationObjectConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOpsEvaluationTaskRequestBody that = (CreateOpsEvaluationTaskRequestBody) obj;
        return Objects.equals(this.evalMode, that.evalMode) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.datasetId, that.datasetId)
            && Objects.equals(this.datasetVersion, that.datasetVersion)
            && Objects.equals(this.humanReadVersion, that.humanReadVersion)
            && Objects.equals(this.datasetName, that.datasetName)
            && Objects.equals(this.inputSourceType, that.inputSourceType)
            && Objects.equals(this.inputSource, that.inputSource)
            && Objects.equals(this.runtimeConfig, that.runtimeConfig)
            && Objects.equals(this.evaluationObjectConfig, that.evaluationObjectConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evalMode,
            name,
            description,
            datasetId,
            datasetVersion,
            humanReadVersion,
            datasetName,
            inputSourceType,
            inputSource,
            runtimeConfig,
            evaluationObjectConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOpsEvaluationTaskRequestBody {\n");
        sb.append("    evalMode: ").append(toIndentedString(evalMode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
        sb.append("    datasetVersion: ").append(toIndentedString(datasetVersion)).append("\n");
        sb.append("    humanReadVersion: ").append(toIndentedString(humanReadVersion)).append("\n");
        sb.append("    datasetName: ").append(toIndentedString(datasetName)).append("\n");
        sb.append("    inputSourceType: ").append(toIndentedString(inputSourceType)).append("\n");
        sb.append("    inputSource: ").append(toIndentedString(inputSource)).append("\n");
        sb.append("    runtimeConfig: ").append(toIndentedString(runtimeConfig)).append("\n");
        sb.append("    evaluationObjectConfig: ").append(toIndentedString(evaluationObjectConfig)).append("\n");
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
