package com.huaweicloud.sdk.eihealth.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 助手修改请求体。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
 */
public class UpdateAssistantModelReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_service_api")

    private String modelServiceApi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_call")

    private Boolean functionCall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chain_of_thought")

    private Boolean chainOfThought;

    public UpdateAssistantModelReq withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * **参数解释**： 服务名称。 **约束限制**： 不涉及 **取值范围**： 支持中英文、数字及 ._-，仅支持中英文、数字开头结尾，长度2-64。 **默认取值**： 不涉及 
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public UpdateAssistantModelReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 模型名称。 **约束限制**： 不涉及 **取值范围**： 支持中英文、数字及 ._-，仅支持中英文、数字开头结尾，长度2-64。 **默认取值**： 不涉及 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateAssistantModelReq withModelServiceApi(String modelServiceApi) {
        this.modelServiceApi = modelServiceApi;
        return this;
    }

    /**
     * **参数解释**： 模型服务API地址。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return modelServiceApi
     */
    public String getModelServiceApi() {
        return modelServiceApi;
    }

    public void setModelServiceApi(String modelServiceApi) {
        this.modelServiceApi = modelServiceApi;
    }

    public UpdateAssistantModelReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 模型供应商描述。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateAssistantModelReq withFunctionCall(Boolean functionCall) {
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

    public UpdateAssistantModelReq withChainOfThought(Boolean chainOfThought) {
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
        UpdateAssistantModelReq that = (UpdateAssistantModelReq) obj;
        return Objects.equals(this.serviceName, that.serviceName) && Objects.equals(this.name, that.name)
            && Objects.equals(this.modelServiceApi, that.modelServiceApi)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.functionCall, that.functionCall)
            && Objects.equals(this.chainOfThought, that.chainOfThought);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName, name, modelServiceApi, description, functionCall, chainOfThought);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAssistantModelReq {\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    modelServiceApi: ").append(toIndentedString(modelServiceApi)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
