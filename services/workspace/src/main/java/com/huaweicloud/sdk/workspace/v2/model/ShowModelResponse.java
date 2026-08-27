package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowModelResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private List<String> input = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "context_window")

    private Integer contextWindow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_tokens")

    private Integer maxTokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reasoning")

    private Boolean reasoning;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cost")

    private ModelCost cost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compat")

    private ModelCompat compat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_builtin")

    private Boolean isBuiltin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_model_id")

    private String providerModelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_id")

    private String providerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_name")

    private String providerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private List<AttachModelGroupInfo> groups = null;

    public ShowModelResponse withId(String id) {
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

    public ShowModelResponse withName(String name) {
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

    public ShowModelResponse withInput(List<String> input) {
        this.input = input;
        return this;
    }

    public ShowModelResponse addInputItem(String inputItem) {
        if (this.input == null) {
            this.input = new ArrayList<>();
        }
        this.input.add(inputItem);
        return this;
    }

    public ShowModelResponse withInput(Consumer<List<String>> inputSetter) {
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

    public ShowModelResponse withContextWindow(Integer contextWindow) {
        this.contextWindow = contextWindow;
        return this;
    }

    /**
     * 最大上下文窗口。
     * @return contextWindow
     */
    public Integer getContextWindow() {
        return contextWindow;
    }

    public void setContextWindow(Integer contextWindow) {
        this.contextWindow = contextWindow;
    }

    public ShowModelResponse withMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }

    /**
     * 最大输出Token数。
     * @return maxTokens
     */
    public Integer getMaxTokens() {
        return maxTokens;
    }

    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    public ShowModelResponse withReasoning(Boolean reasoning) {
        this.reasoning = reasoning;
        return this;
    }

    /**
     * 是否支持推理。
     * @return reasoning
     */
    public Boolean getReasoning() {
        return reasoning;
    }

    public void setReasoning(Boolean reasoning) {
        this.reasoning = reasoning;
    }

    public ShowModelResponse withCost(ModelCost cost) {
        this.cost = cost;
        return this;
    }

    public ShowModelResponse withCost(Consumer<ModelCost> costSetter) {
        if (this.cost == null) {
            this.cost = new ModelCost();
            costSetter.accept(this.cost);
        }

        return this;
    }

    /**
     * Get cost
     * @return cost
     */
    public ModelCost getCost() {
        return cost;
    }

    public void setCost(ModelCost cost) {
        this.cost = cost;
    }

    public ShowModelResponse withCompat(ModelCompat compat) {
        this.compat = compat;
        return this;
    }

    public ShowModelResponse withCompat(Consumer<ModelCompat> compatSetter) {
        if (this.compat == null) {
            this.compat = new ModelCompat();
            compatSetter.accept(this.compat);
        }

        return this;
    }

    /**
     * Get compat
     * @return compat
     */
    public ModelCompat getCompat() {
        return compat;
    }

    public void setCompat(ModelCompat compat) {
        this.compat = compat;
    }

    public ShowModelResponse withIsBuiltin(Boolean isBuiltin) {
        this.isBuiltin = isBuiltin;
        return this;
    }

    /**
     * 是否内置模型。
     * @return isBuiltin
     */
    public Boolean getIsBuiltin() {
        return isBuiltin;
    }

    public void setIsBuiltin(Boolean isBuiltin) {
        this.isBuiltin = isBuiltin;
    }

    public ShowModelResponse withProviderModelId(String providerModelId) {
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

    public ShowModelResponse withProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    /**
     * 供应商id。
     * @return providerId
     */
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public ShowModelResponse withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * 供应商名称。
     * @return providerName
     */
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public ShowModelResponse withDescription(String description) {
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

    public ShowModelResponse withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 组内排序优先级。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public ShowModelResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowModelResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowModelResponse withGroups(List<AttachModelGroupInfo> groups) {
        this.groups = groups;
        return this;
    }

    public ShowModelResponse addGroupsItem(AttachModelGroupInfo groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public ShowModelResponse withGroups(Consumer<List<AttachModelGroupInfo>> groupsSetter) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * 关联为默认模型的模型分组
     * @return groups
     */
    public List<AttachModelGroupInfo> getGroups() {
        return groups;
    }

    public void setGroups(List<AttachModelGroupInfo> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowModelResponse that = (ShowModelResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.input, that.input) && Objects.equals(this.contextWindow, that.contextWindow)
            && Objects.equals(this.maxTokens, that.maxTokens) && Objects.equals(this.reasoning, that.reasoning)
            && Objects.equals(this.cost, that.cost) && Objects.equals(this.compat, that.compat)
            && Objects.equals(this.isBuiltin, that.isBuiltin)
            && Objects.equals(this.providerModelId, that.providerModelId)
            && Objects.equals(this.providerId, that.providerId) && Objects.equals(this.providerName, that.providerName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.groups, that.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            input,
            contextWindow,
            maxTokens,
            reasoning,
            cost,
            compat,
            isBuiltin,
            providerModelId,
            providerId,
            providerName,
            description,
            priority,
            createTime,
            updateTime,
            groups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowModelResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    contextWindow: ").append(toIndentedString(contextWindow)).append("\n");
        sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n");
        sb.append("    reasoning: ").append(toIndentedString(reasoning)).append("\n");
        sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
        sb.append("    compat: ").append(toIndentedString(compat)).append("\n");
        sb.append("    isBuiltin: ").append(toIndentedString(isBuiltin)).append("\n");
        sb.append("    providerModelId: ").append(toIndentedString(providerModelId)).append("\n");
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
        sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
