package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 待评估的数据，根据评估场景（scenario）的不同，需要传入不同的字段组合。 - scenario&#x3D;dataset时，需传入items字段（每条为键值对列表，包含评估器Prompt中引用的所有变量，如input、actual_output等）。 - scenario&#x3D;agent时，需传入evaluation_object_config和items字段（每条为键值对列表，包含输入相关字段如input，API调用智能体获取actual_output后自动填充）。 - scenario&#x3D;trace时，需传入trace_ids字段。 **约束限制：** 数据条目数最大支持100条。scenario&#x3D;dataset时需传入items字段；scenario&#x3D;agent时需传入evaluation_object_config和items字段；scenario&#x3D;trace时需传入trace_ids字段。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class OpsFineGrainedEvaluationData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<List<OpsFineGrainedEvalFieldKV>> items = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_object_config")

    private OpsFineGrainedEvaluationObjectConfig evaluationObjectConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_output_variable")

    private String agentOutputVariable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_ids")

    private List<String> traceIds = null;

    public OpsFineGrainedEvaluationData withItems(List<List<OpsFineGrainedEvalFieldKV>> items) {
        this.items = items;
        return this;
    }

    public OpsFineGrainedEvaluationData addItemsItem(List<OpsFineGrainedEvalFieldKV> itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public OpsFineGrainedEvaluationData withItems(Consumer<List<List<OpsFineGrainedEvalFieldKV>>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * **参数解释：** 待评估的数据条目列表，scenario=dataset和scenario=agent时必填。每条数据为键值对列表，字段名和字段数量由评估器Prompt模板决定。 - scenario=dataset时，每条需包含评估器Prompt中引用的所有变量对应的字段（如input、actual_output等）。 - scenario=agent时，每条需包含输入相关字段（如input），API将调用智能体获取actual_output后自动填充。 **约束限制：** 数组长度1到100。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return items
     */
    public List<List<OpsFineGrainedEvalFieldKV>> getItems() {
        return items;
    }

    public void setItems(List<List<OpsFineGrainedEvalFieldKV>> items) {
        this.items = items;
    }

    public OpsFineGrainedEvaluationData withEvaluationObjectConfig(
        OpsFineGrainedEvaluationObjectConfig evaluationObjectConfig) {
        this.evaluationObjectConfig = evaluationObjectConfig;
        return this;
    }

    public OpsFineGrainedEvaluationData withEvaluationObjectConfig(
        Consumer<OpsFineGrainedEvaluationObjectConfig> evaluationObjectConfigSetter) {
        if (this.evaluationObjectConfig == null) {
            this.evaluationObjectConfig = new OpsFineGrainedEvaluationObjectConfig();
            evaluationObjectConfigSetter.accept(this.evaluationObjectConfig);
        }

        return this;
    }

    /**
     * Get evaluationObjectConfig
     * @return evaluationObjectConfig
     */
    public OpsFineGrainedEvaluationObjectConfig getEvaluationObjectConfig() {
        return evaluationObjectConfig;
    }

    public void setEvaluationObjectConfig(OpsFineGrainedEvaluationObjectConfig evaluationObjectConfig) {
        this.evaluationObjectConfig = evaluationObjectConfig;
    }

    public OpsFineGrainedEvaluationData withAgentOutputVariable(String agentOutputVariable) {
        this.agentOutputVariable = agentOutputVariable;
        return this;
    }

    /**
     * **参数解释：** 评估器中接收智能体输出的变量名，scenario=agent时使用。API调用智能体获取输出后，将输出填入该变量名对应的字段中。若不传，默认为actual_output。 **约束限制：** 字符长度1到100。 **取值范围：** 评估器Prompt模板中定义的变量名。 **默认取值：** actual_output。
     * @return agentOutputVariable
     */
    public String getAgentOutputVariable() {
        return agentOutputVariable;
    }

    public void setAgentOutputVariable(String agentOutputVariable) {
        this.agentOutputVariable = agentOutputVariable;
    }

    public OpsFineGrainedEvaluationData withTraceIds(List<String> traceIds) {
        this.traceIds = traceIds;
        return this;
    }

    public OpsFineGrainedEvaluationData addTraceIdsItem(String traceIdsItem) {
        if (this.traceIds == null) {
            this.traceIds = new ArrayList<>();
        }
        this.traceIds.add(traceIdsItem);
        return this;
    }

    public OpsFineGrainedEvaluationData withTraceIds(Consumer<List<String>> traceIdsSetter) {
        if (this.traceIds == null) {
            this.traceIds = new ArrayList<>();
        }
        traceIdsSetter.accept(this.traceIds);
        return this;
    }

    /**
     * **参数解释：** 待评估的TraceId列表，API将根据TraceId从可观测子服务获取对应的trace数据后进行评估，scenario=trace时必填。 **约束限制：** 数组长度1到100，每个元素字符长度1到100。TraceId必须在可观测子服务中存在，否则返回TRACE_NOT_FOUND错误。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return traceIds
     */
    public List<String> getTraceIds() {
        return traceIds;
    }

    public void setTraceIds(List<String> traceIds) {
        this.traceIds = traceIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsFineGrainedEvaluationData that = (OpsFineGrainedEvaluationData) obj;
        return Objects.equals(this.items, that.items)
            && Objects.equals(this.evaluationObjectConfig, that.evaluationObjectConfig)
            && Objects.equals(this.agentOutputVariable, that.agentOutputVariable)
            && Objects.equals(this.traceIds, that.traceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, evaluationObjectConfig, agentOutputVariable, traceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsFineGrainedEvaluationData {\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    evaluationObjectConfig: ").append(toIndentedString(evaluationObjectConfig)).append("\n");
        sb.append("    agentOutputVariable: ").append(toIndentedString(agentOutputVariable)).append("\n");
        sb.append("    traceIds: ").append(toIndentedString(traceIds)).append("\n");
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
