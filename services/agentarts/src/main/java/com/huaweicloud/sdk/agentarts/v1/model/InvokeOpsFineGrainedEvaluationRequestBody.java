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
 * **参数解释：** 细粒度评估请求体，定义评估场景、待评估数据和运行选项。评估器ID通过路径参数evaluator_id指定。 **约束限制：** scenario和data为必填项。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class InvokeOpsFineGrainedEvaluationRequestBody {

    /**
     * **参数解释：** 评估场景，指定本次评估的数据来源和处理方式。 **约束限制：** 必须为枚举值之一。 **取值范围：** - dataset：评测集评估，直接传入输入输出数据进行评估。 - agent：智能体调用评估，传入输入调用智能体获取输出后进行评估。 - trace：Trace评估，传入TraceId从可观测子服务获取trace数据后进行评估。 **默认取值：** 不涉及。
     */
    public static final class ScenarioEnum {

        /**
         * Enum DATASET for value: "dataset"
         */
        public static final ScenarioEnum DATASET = new ScenarioEnum("dataset");

        /**
         * Enum AGENT for value: "agent"
         */
        public static final ScenarioEnum AGENT = new ScenarioEnum("agent");

        /**
         * Enum TRACE for value: "trace"
         */
        public static final ScenarioEnum TRACE = new ScenarioEnum("trace");

        private static final Map<String, ScenarioEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScenarioEnum> createStaticFields() {
            Map<String, ScenarioEnum> map = new HashMap<>();
            map.put("dataset", DATASET);
            map.put("agent", AGENT);
            map.put("trace", TRACE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScenarioEnum(String value) {
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
        public static ScenarioEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScenarioEnum(value));
        }

        public static ScenarioEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScenarioEnum) {
                return this.value.equals(((ScenarioEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scenario")

    private ScenarioEnum scenario;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_version")

    private String evaluatorVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private OpsFineGrainedEvaluationData data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    private Boolean stream;

    public InvokeOpsFineGrainedEvaluationRequestBody withScenario(ScenarioEnum scenario) {
        this.scenario = scenario;
        return this;
    }

    /**
     * **参数解释：** 评估场景，指定本次评估的数据来源和处理方式。 **约束限制：** 必须为枚举值之一。 **取值范围：** - dataset：评测集评估，直接传入输入输出数据进行评估。 - agent：智能体调用评估，传入输入调用智能体获取输出后进行评估。 - trace：Trace评估，传入TraceId从可观测子服务获取trace数据后进行评估。 **默认取值：** 不涉及。
     * @return scenario
     */
    public ScenarioEnum getScenario() {
        return scenario;
    }

    public void setScenario(ScenarioEnum scenario) {
        this.scenario = scenario;
    }

    public InvokeOpsFineGrainedEvaluationRequestBody withEvaluatorVersion(String evaluatorVersion) {
        this.evaluatorVersion = evaluatorVersion;
        return this;
    }

    /**
     * **参数解释：** 评估器的版本号，用于指定使用评估器的特定版本。 **约束限制：** 字符串类型，最大长度36。 **取值范围：** 系统内有效的评估器版本号。 **默认取值：** 评估器最新版本。
     * @return evaluatorVersion
     */
    public String getEvaluatorVersion() {
        return evaluatorVersion;
    }

    public void setEvaluatorVersion(String evaluatorVersion) {
        this.evaluatorVersion = evaluatorVersion;
    }

    public InvokeOpsFineGrainedEvaluationRequestBody withData(OpsFineGrainedEvaluationData data) {
        this.data = data;
        return this;
    }

    public InvokeOpsFineGrainedEvaluationRequestBody withData(Consumer<OpsFineGrainedEvaluationData> dataSetter) {
        if (this.data == null) {
            this.data = new OpsFineGrainedEvaluationData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public OpsFineGrainedEvaluationData getData() {
        return data;
    }

    public void setData(OpsFineGrainedEvaluationData data) {
        this.data = data;
    }

    public InvokeOpsFineGrainedEvaluationRequestBody withStream(Boolean stream) {
        this.stream = stream;
        return this;
    }

    /**
     * **参数解释：** 是否启用流式返回。启用后，评估结果通过SSE（Server-Sent Events）协议逐步推送，调用方可实时获取评估进度和结果。 **约束限制：** 不涉及。 **取值范围：** true（流式返回）、false（非流式返回，等待全部评估完成后一次性返回JSON结果）。 **默认取值：** true。
     * @return stream
     */
    public Boolean getStream() {
        return stream;
    }

    public void setStream(Boolean stream) {
        this.stream = stream;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InvokeOpsFineGrainedEvaluationRequestBody that = (InvokeOpsFineGrainedEvaluationRequestBody) obj;
        return Objects.equals(this.scenario, that.scenario)
            && Objects.equals(this.evaluatorVersion, that.evaluatorVersion) && Objects.equals(this.data, that.data)
            && Objects.equals(this.stream, that.stream);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scenario, evaluatorVersion, data, stream);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvokeOpsFineGrainedEvaluationRequestBody {\n");
        sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
        sb.append("    evaluatorVersion: ").append(toIndentedString(evaluatorVersion)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
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
