package com.huaweicloud.sdk.eihealth.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 模型基本信息。
 */
public class ModelInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_call")

    private Boolean functionCall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chain_of_thought")

    private Boolean chainOfThought;

    public ModelInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 模型供应商ID。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ModelInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 模型类型。 **约束限制**： 不涉及 **取值范围**： * CHAT：文本对话模型 * EMBEDDING：嵌入模型 **默认取值**： 不涉及 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ModelInfo withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * **参数解释**： 服务名称。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public ModelInfo withFunctionCall(Boolean functionCall) {
        this.functionCall = functionCall;
        return this;
    }

    /**
     * **参数解释**： 是否支持工具调用。 **约束限制**： 不涉及 **取值范围**： * true：支持工具调用 * false：不支持工具调用 **默认取值**： 不涉及 
     * @return functionCall
     */
    public Boolean getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(Boolean functionCall) {
        this.functionCall = functionCall;
    }

    public ModelInfo withChainOfThought(Boolean chainOfThought) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelInfo that = (ModelInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.type, that.type)
            && Objects.equals(this.serviceName, that.serviceName)
            && Objects.equals(this.functionCall, that.functionCall)
            && Objects.equals(this.chainOfThought, that.chainOfThought);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, serviceName, functionCall, chainOfThought);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    functionCall: ").append(toIndentedString(functionCall)).append("\n");
        sb.append("    chainOfThought: ").append(toIndentedString(chainOfThought)).append("\n");
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
