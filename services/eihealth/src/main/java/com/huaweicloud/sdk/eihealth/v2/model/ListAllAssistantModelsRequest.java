package com.huaweicloud.sdk.eihealth.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAllAssistantModelsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chain_of_thought")

    private Boolean chainOfThought;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_of_call")

    private Boolean functionOfCall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ListAllAssistantModelsRequest withChainOfThought(Boolean chainOfThought) {
        this.chainOfThought = chainOfThought;
        return this;
    }

    /**
     * **参数解释**： 是否支持思维链。 **约束限制**： 不涉及 **取值范围**： * true：支持思维链 * false：不支持思维链 **默认取值**： 不涉及 
     * @return chainOfThought
     */
    public Boolean getChainOfThought() {
        return chainOfThought;
    }

    public void setChainOfThought(Boolean chainOfThought) {
        this.chainOfThought = chainOfThought;
    }

    public ListAllAssistantModelsRequest withFunctionOfCall(Boolean functionOfCall) {
        this.functionOfCall = functionOfCall;
        return this;
    }

    /**
     * **参数解释**： 是否支持工具调用。 **约束限制**： 不涉及 **取值范围**： * true：支持工具调用 * false：不支持工具调用 **默认取值**： 不涉及 
     * @return functionOfCall
     */
    public Boolean getFunctionOfCall() {
        return functionOfCall;
    }

    public void setFunctionOfCall(Boolean functionOfCall) {
        this.functionOfCall = functionOfCall;
    }

    public ListAllAssistantModelsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 模型服务状态。 **约束限制**： 不涉及 **取值范围**： * available：已接入 * unavailable：未接入 **默认取值**： 不涉及 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListAllAssistantModelsRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 模型类型。 **约束限制**： 不涉及 **取值范围**： * chat：文本对话模型 * embedding：嵌入式模型 **默认取值**： 不涉及 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAllAssistantModelsRequest that = (ListAllAssistantModelsRequest) obj;
        return Objects.equals(this.chainOfThought, that.chainOfThought)
            && Objects.equals(this.functionOfCall, that.functionOfCall) && Objects.equals(this.status, that.status)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chainOfThought, functionOfCall, status, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllAssistantModelsRequest {\n");
        sb.append("    chainOfThought: ").append(toIndentedString(chainOfThought)).append("\n");
        sb.append("    functionOfCall: ").append(toIndentedString(functionOfCall)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
