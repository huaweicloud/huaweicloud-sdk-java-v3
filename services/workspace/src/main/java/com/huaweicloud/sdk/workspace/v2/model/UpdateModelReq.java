package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新模型请求。
 */
public class UpdateModelReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

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

    public UpdateModelReq withName(String name) {
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

    public UpdateModelReq withDescription(String description) {
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

    public UpdateModelReq withInput(List<String> input) {
        this.input = input;
        return this;
    }

    public UpdateModelReq addInputItem(String inputItem) {
        if (this.input == null) {
            this.input = new ArrayList<>();
        }
        this.input.add(inputItem);
        return this;
    }

    public UpdateModelReq withInput(Consumer<List<String>> inputSetter) {
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

    public UpdateModelReq withContextWindow(Integer contextWindow) {
        this.contextWindow = contextWindow;
        return this;
    }

    /**
     * 最大上下文窗口。
     * minimum: 1
     * maximum: 2147483647
     * @return contextWindow
     */
    public Integer getContextWindow() {
        return contextWindow;
    }

    public void setContextWindow(Integer contextWindow) {
        this.contextWindow = contextWindow;
    }

    public UpdateModelReq withMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }

    /**
     * 最大输出Token数。
     * minimum: 1
     * maximum: 2147483647
     * @return maxTokens
     */
    public Integer getMaxTokens() {
        return maxTokens;
    }

    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    public UpdateModelReq withReasoning(Boolean reasoning) {
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

    public UpdateModelReq withCost(ModelCost cost) {
        this.cost = cost;
        return this;
    }

    public UpdateModelReq withCost(Consumer<ModelCost> costSetter) {
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

    public UpdateModelReq withCompat(ModelCompat compat) {
        this.compat = compat;
        return this;
    }

    public UpdateModelReq withCompat(Consumer<ModelCompat> compatSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateModelReq that = (UpdateModelReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.input, that.input) && Objects.equals(this.contextWindow, that.contextWindow)
            && Objects.equals(this.maxTokens, that.maxTokens) && Objects.equals(this.reasoning, that.reasoning)
            && Objects.equals(this.cost, that.cost) && Objects.equals(this.compat, that.compat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, input, contextWindow, maxTokens, reasoning, cost, compat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateModelReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    contextWindow: ").append(toIndentedString(contextWindow)).append("\n");
        sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n");
        sb.append("    reasoning: ").append(toIndentedString(reasoning)).append("\n");
        sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
        sb.append("    compat: ").append(toIndentedString(compat)).append("\n");
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
