package com.huaweicloud.sdk.aom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ComponentParam
 */
public class ComponentParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private String modelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_type")

    private String modelType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public ComponentParam withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 组件描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ComponentParam withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * 应用Id、子应用Id,id长度不能超过36位，由大小写字母、数字组成
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public ComponentParam withModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }

    /**
     * 应用、子应用，取值：APPLICATION、SUB_APPLICATION ，不区分大小写
     * @return modelType
     */
    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public ComponentParam withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 组件名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComponentParam that = (ComponentParam) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.modelId, that.modelId)
            && Objects.equals(this.modelType, that.modelType) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, modelId, modelType, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentParam {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
        sb.append("    modelType: ").append(toIndentedString(modelType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
