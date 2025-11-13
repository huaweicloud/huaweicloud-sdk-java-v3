package com.huaweicloud.sdk.eihealth.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 供应商模型详情。
 */
public class AssistantModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_service_api")

    private String modelServiceApi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_call")

    private Boolean functionCall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chain_of_thought")

    private Boolean chainOfThought;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public AssistantModel withId(String id) {
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

    public AssistantModel withServiceName(String serviceName) {
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

    public AssistantModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 模型名称。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AssistantModel withType(String type) {
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

    public AssistantModel withModelServiceApi(String modelServiceApi) {
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

    public AssistantModel withFunctionCall(Boolean functionCall) {
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

    public AssistantModel withChainOfThought(Boolean chainOfThought) {
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

    public AssistantModel withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * **参数解释**： 模型创建人。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public AssistantModel withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * **参数解释**： 模型创建人ID。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public AssistantModel withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 模型创建时间。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public AssistantModel withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**： 模型修改时间。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public AssistantModel withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 模型描述。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssistantModel that = (AssistantModel) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.serviceName, that.serviceName)
            && Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.modelServiceApi, that.modelServiceApi)
            && Objects.equals(this.functionCall, that.functionCall)
            && Objects.equals(this.chainOfThought, that.chainOfThought) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.creatorId, that.creatorId) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            serviceName,
            name,
            type,
            modelServiceApi,
            functionCall,
            chainOfThought,
            creator,
            creatorId,
            createTime,
            updateTime,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssistantModel {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    modelServiceApi: ").append(toIndentedString(modelServiceApi)).append("\n");
        sb.append("    functionCall: ").append(toIndentedString(functionCall)).append("\n");
        sb.append("    chainOfThought: ").append(toIndentedString(chainOfThought)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
