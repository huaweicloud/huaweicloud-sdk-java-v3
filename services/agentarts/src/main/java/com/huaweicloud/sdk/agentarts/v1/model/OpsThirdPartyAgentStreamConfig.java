package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 流式响应配置，用于解析SSE流式输出。SSE的data字段为JSON字符串，需要通过匹配条件筛选目标数据，再从目标数据中提取Agent输出内容。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class OpsThirdPartyAgentStreamConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_condition")

    private OpsThirdPartyAgentDataMatchCondition matchCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_key")

    private String outputKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_condition")

    private OpsThirdPartyAgentDataMatchCondition endCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_event_type")

    private String endEventType;

    public OpsThirdPartyAgentStreamConfig withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * **参数解释：** 需要匹配的SSE事件类型，用于识别Agent输出事件。不填则匹配所有事件类型。 **约束限制：** 最大长度100字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public OpsThirdPartyAgentStreamConfig withMatchCondition(OpsThirdPartyAgentDataMatchCondition matchCondition) {
        this.matchCondition = matchCondition;
        return this;
    }

    public OpsThirdPartyAgentStreamConfig withMatchCondition(
        Consumer<OpsThirdPartyAgentDataMatchCondition> matchConditionSetter) {
        if (this.matchCondition == null) {
            this.matchCondition = new OpsThirdPartyAgentDataMatchCondition();
            matchConditionSetter.accept(this.matchCondition);
        }

        return this;
    }

    /**
     * Get matchCondition
     * @return matchCondition
     */
    public OpsThirdPartyAgentDataMatchCondition getMatchCondition() {
        return matchCondition;
    }

    public void setMatchCondition(OpsThirdPartyAgentDataMatchCondition matchCondition) {
        this.matchCondition = matchCondition;
    }

    public OpsThirdPartyAgentStreamConfig withOutputKey(String outputKey) {
        this.outputKey = outputKey;
        return this;
    }

    /**
     * **参数解释：** 目标数据中Agent输出内容的字段路径，支持多级路径（如aa.bb.cc）。仅当match_condition匹配成功时，从该条数据中提取output_key对应的值作为Agent输出。 **约束限制：** 最大长度200字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return outputKey
     */
    public String getOutputKey() {
        return outputKey;
    }

    public void setOutputKey(String outputKey) {
        this.outputKey = outputKey;
    }

    public OpsThirdPartyAgentStreamConfig withEndCondition(OpsThirdPartyAgentDataMatchCondition endCondition) {
        this.endCondition = endCondition;
        return this;
    }

    public OpsThirdPartyAgentStreamConfig withEndCondition(
        Consumer<OpsThirdPartyAgentDataMatchCondition> endConditionSetter) {
        if (this.endCondition == null) {
            this.endCondition = new OpsThirdPartyAgentDataMatchCondition();
            endConditionSetter.accept(this.endCondition);
        }

        return this;
    }

    /**
     * Get endCondition
     * @return endCondition
     */
    public OpsThirdPartyAgentDataMatchCondition getEndCondition() {
        return endCondition;
    }

    public void setEndCondition(OpsThirdPartyAgentDataMatchCondition endCondition) {
        this.endCondition = endCondition;
    }

    public OpsThirdPartyAgentStreamConfig withEndEventType(String endEventType) {
        this.endEventType = endEventType;
        return this;
    }

    /**
     * **参数解释：** 标识流式输出结束的SSE事件类型。不填则仅通过end_condition判断流结束。 **约束限制：** 最大长度100字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return endEventType
     */
    public String getEndEventType() {
        return endEventType;
    }

    public void setEndEventType(String endEventType) {
        this.endEventType = endEventType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsThirdPartyAgentStreamConfig that = (OpsThirdPartyAgentStreamConfig) obj;
        return Objects.equals(this.eventType, that.eventType)
            && Objects.equals(this.matchCondition, that.matchCondition)
            && Objects.equals(this.outputKey, that.outputKey) && Objects.equals(this.endCondition, that.endCondition)
            && Objects.equals(this.endEventType, that.endEventType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventType, matchCondition, outputKey, endCondition, endEventType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsThirdPartyAgentStreamConfig {\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    matchCondition: ").append(toIndentedString(matchCondition)).append("\n");
        sb.append("    outputKey: ").append(toIndentedString(outputKey)).append("\n");
        sb.append("    endCondition: ").append(toIndentedString(endCondition)).append("\n");
        sb.append("    endEventType: ").append(toIndentedString(endEventType)).append("\n");
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
