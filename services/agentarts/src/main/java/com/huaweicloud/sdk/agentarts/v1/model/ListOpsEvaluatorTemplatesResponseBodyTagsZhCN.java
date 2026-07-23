package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 中文标签分类信息。 **取值范围：** 不涉及。 
 */
public class ListOpsEvaluatorTemplatesResponseBodyTagsZhCN {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "BusinessScenario")

    private List<String> businessScenario = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Category")

    private List<String> category = null;

    public ListOpsEvaluatorTemplatesResponseBodyTagsZhCN withBusinessScenario(List<String> businessScenario) {
        this.businessScenario = businessScenario;
        return this;
    }

    public ListOpsEvaluatorTemplatesResponseBodyTagsZhCN addBusinessScenarioItem(String businessScenarioItem) {
        if (this.businessScenario == null) {
            this.businessScenario = new ArrayList<>();
        }
        this.businessScenario.add(businessScenarioItem);
        return this;
    }

    public ListOpsEvaluatorTemplatesResponseBodyTagsZhCN withBusinessScenario(
        Consumer<List<String>> businessScenarioSetter) {
        if (this.businessScenario == null) {
            this.businessScenario = new ArrayList<>();
        }
        businessScenarioSetter.accept(this.businessScenario);
        return this;
    }

    /**
     * **参数解释：** 业务场景标签。 **取值范围：** 如 AIGC。 
     * @return businessScenario
     */
    public List<String> getBusinessScenario() {
        return businessScenario;
    }

    public void setBusinessScenario(List<String> businessScenario) {
        this.businessScenario = businessScenario;
    }

    public ListOpsEvaluatorTemplatesResponseBodyTagsZhCN withCategory(List<String> category) {
        this.category = category;
        return this;
    }

    public ListOpsEvaluatorTemplatesResponseBodyTagsZhCN addCategoryItem(String categoryItem) {
        if (this.category == null) {
            this.category = new ArrayList<>();
        }
        this.category.add(categoryItem);
        return this;
    }

    public ListOpsEvaluatorTemplatesResponseBodyTagsZhCN withCategory(Consumer<List<String>> categorySetter) {
        if (this.category == null) {
            this.category = new ArrayList<>();
        }
        categorySetter.accept(this.category);
        return this;
    }

    /**
     * **参数解释：** 功能类别标签。 **取值范围：** 如 LLM。 
     * @return category
     */
    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsEvaluatorTemplatesResponseBodyTagsZhCN that = (ListOpsEvaluatorTemplatesResponseBodyTagsZhCN) obj;
        return Objects.equals(this.businessScenario, that.businessScenario)
            && Objects.equals(this.category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessScenario, category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluatorTemplatesResponseBodyTagsZhCN {\n");
        sb.append("    businessScenario: ").append(toIndentedString(businessScenario)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
