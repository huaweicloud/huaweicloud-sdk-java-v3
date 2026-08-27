package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 模型信息项响应（简化版）。
 */
public class ModelItemResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_model_id")

    private String providerModelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private List<String> input = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_builtin")

    private Boolean isBuiltin;

    public ModelItemResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 模型id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ModelItemResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模型名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModelItemResp withProviderModelId(String providerModelId) {
        this.providerModelId = providerModelId;
        return this;
    }

    /**
     * 供应商侧模型标识。
     * @return providerModelId
     */
    public String getProviderModelId() {
        return providerModelId;
    }

    public void setProviderModelId(String providerModelId) {
        this.providerModelId = providerModelId;
    }

    public ModelItemResp withInput(List<String> input) {
        this.input = input;
        return this;
    }

    public ModelItemResp addInputItem(String inputItem) {
        if (this.input == null) {
            this.input = new ArrayList<>();
        }
        this.input.add(inputItem);
        return this;
    }

    public ModelItemResp withInput(Consumer<List<String>> inputSetter) {
        if (this.input == null) {
            this.input = new ArrayList<>();
        }
        inputSetter.accept(this.input);
        return this;
    }

    /**
     * 输入类型数组。
     * @return input
     */
    public List<String> getInput() {
        return input;
    }

    public void setInput(List<String> input) {
        this.input = input;
    }

    public ModelItemResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模型描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ModelItemResp withIsBuiltin(Boolean isBuiltin) {
        this.isBuiltin = isBuiltin;
        return this;
    }

    /**
     * 是否为内置模型。
     * @return isBuiltin
     */
    public Boolean getIsBuiltin() {
        return isBuiltin;
    }

    public void setIsBuiltin(Boolean isBuiltin) {
        this.isBuiltin = isBuiltin;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelItemResp that = (ModelItemResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.providerModelId, that.providerModelId) && Objects.equals(this.input, that.input)
            && Objects.equals(this.description, that.description) && Objects.equals(this.isBuiltin, that.isBuiltin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, providerModelId, input, description, isBuiltin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelItemResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    providerModelId: ").append(toIndentedString(providerModelId)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isBuiltin: ").append(toIndentedString(isBuiltin)).append("\n");
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
