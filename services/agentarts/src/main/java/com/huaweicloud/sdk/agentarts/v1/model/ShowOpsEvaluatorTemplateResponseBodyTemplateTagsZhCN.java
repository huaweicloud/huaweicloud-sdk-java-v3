package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 中文环境下的标签分类。 **取值范围：** 不涉及。 
 */
public class ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "BusinessScenario")

    private List<String> businessScenario = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Category")

    private List<String> category = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Name")

    private List<String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Objective")

    private List<String> objective = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TargetType")

    private List<String> targetType = null;

    public ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN withBusinessScenario(List<String> businessScenario) {
        this.businessScenario = businessScenario;
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN addBusinessScenarioItem(String businessScenarioItem) {
        if (this.businessScenario == null) {
            this.businessScenario = new ArrayList<>();
        }
        this.businessScenario.add(businessScenarioItem);
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN withBusinessScenario(
        Consumer<List<String>> businessScenarioSetter) {
        if (this.businessScenario == null) {
            this.businessScenario = new ArrayList<>();
        }
        businessScenarioSetter.accept(this.businessScenario);
        return this;
    }

    /**
     * **参数解释：** 业务场景标签。 **取值范围：** 不涉及。 
     * @return businessScenario
     */
    public List<String> getBusinessScenario() {
        return businessScenario;
    }

    public void setBusinessScenario(List<String> businessScenario) {
        this.businessScenario = businessScenario;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN withCategory(List<String> category) {
        this.category = category;
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN addCategoryItem(String categoryItem) {
        if (this.category == null) {
            this.category = new ArrayList<>();
        }
        this.category.add(categoryItem);
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN withCategory(Consumer<List<String>> categorySetter) {
        if (this.category == null) {
            this.category = new ArrayList<>();
        }
        categorySetter.accept(this.category);
        return this;
    }

    /**
     * **参数解释：** 类型标签标识技术领域。 **取值范围：** 不涉及。 
     * @return category
     */
    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * **参数解释：** 名字标签标识功能特点。 **取值范围：** 不涉及。 
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN withObjective(List<String> objective) {
        this.objective = objective;
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN addObjectiveItem(String objectiveItem) {
        if (this.objective == null) {
            this.objective = new ArrayList<>();
        }
        this.objective.add(objectiveItem);
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN withObjective(Consumer<List<String>> objectiveSetter) {
        if (this.objective == null) {
            this.objective = new ArrayList<>();
        }
        objectiveSetter.accept(this.objective);
        return this;
    }

    /**
     * **参数解释：** 目标标签反映核心价值。 **取值范围：** 不涉及。 
     * @return objective
     */
    public List<String> getObjective() {
        return objective;
    }

    public void setObjective(List<String> objective) {
        this.objective = objective;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN withTargetType(List<String> targetType) {
        this.targetType = targetType;
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN addTargetTypeItem(String targetTypeItem) {
        if (this.targetType == null) {
            this.targetType = new ArrayList<>();
        }
        this.targetType.add(targetTypeItem);
        return this;
    }

    public ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN withTargetType(
        Consumer<List<String>> targetTypeSetter) {
        if (this.targetType == null) {
            this.targetType = new ArrayList<>();
        }
        targetTypeSetter.accept(this.targetType);
        return this;
    }

    /**
     * **参数解释：** 目标类型标签标识处理对象。 **取值范围：** 不涉及。 
     * @return targetType
     */
    public List<String> getTargetType() {
        return targetType;
    }

    public void setTargetType(List<String> targetType) {
        this.targetType = targetType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN that =
            (ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN) obj;
        return Objects.equals(this.businessScenario, that.businessScenario)
            && Objects.equals(this.category, that.category) && Objects.equals(this.name, that.name)
            && Objects.equals(this.objective, that.objective) && Objects.equals(this.targetType, that.targetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessScenario, category, name, objective, targetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsEvaluatorTemplateResponseBodyTemplateTagsZhCN {\n");
        sb.append("    businessScenario: ").append(toIndentedString(businessScenario)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    objective: ").append(toIndentedString(objective)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
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
