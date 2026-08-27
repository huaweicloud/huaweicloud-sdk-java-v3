package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BaseModeInfo
 */
public class BaseModeInfo {

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

    public BaseModeInfo withId(String id) {
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

    public BaseModeInfo withName(String name) {
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

    public BaseModeInfo withInput(List<String> input) {
        this.input = input;
        return this;
    }

    public BaseModeInfo addInputItem(String inputItem) {
        if (this.input == null) {
            this.input = new ArrayList<>();
        }
        this.input.add(inputItem);
        return this;
    }

    public BaseModeInfo withInput(Consumer<List<String>> inputSetter) {
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

    public BaseModeInfo withContextWindow(Integer contextWindow) {
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

    public BaseModeInfo withMaxTokens(Integer maxTokens) {
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

    public BaseModeInfo withReasoning(Boolean reasoning) {
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

    public BaseModeInfo withCost(ModelCost cost) {
        this.cost = cost;
        return this;
    }

    public BaseModeInfo withCost(Consumer<ModelCost> costSetter) {
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

    public BaseModeInfo withCompat(ModelCompat compat) {
        this.compat = compat;
        return this;
    }

    public BaseModeInfo withCompat(Consumer<ModelCompat> compatSetter) {
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

    public BaseModeInfo withIsBuiltin(Boolean isBuiltin) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseModeInfo that = (BaseModeInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.input, that.input) && Objects.equals(this.contextWindow, that.contextWindow)
            && Objects.equals(this.maxTokens, that.maxTokens) && Objects.equals(this.reasoning, that.reasoning)
            && Objects.equals(this.cost, that.cost) && Objects.equals(this.compat, that.compat)
            && Objects.equals(this.isBuiltin, that.isBuiltin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, input, contextWindow, maxTokens, reasoning, cost, compat, isBuiltin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseModeInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    contextWindow: ").append(toIndentedString(contextWindow)).append("\n");
        sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n");
        sb.append("    reasoning: ").append(toIndentedString(reasoning)).append("\n");
        sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
        sb.append("    compat: ").append(toIndentedString(compat)).append("\n");
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
