package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 关联关系
 */
public class Relation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "categories")

    private List<String> categories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link_field_code")

    private String linkFieldCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_name")

    private String relationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_scope")

    private String displayScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<RelateAction> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relate_type")

    private String relateType;

    public Relation withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 关系code。 **取值范围**： 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Relation withCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

    public Relation addCategoriesItem(String categoriesItem) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.add(categoriesItem);
        return this;
    }

    public Relation withCategories(Consumer<List<String>> categoriesSetter) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        categoriesSetter.accept(this.categories);
        return this;
    }

    /**
     * **参数解释**： 关联的工作项code列表。 **取值范围**： 不涉及。
     * @return categories
     */
    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public Relation withLinkFieldCode(String linkFieldCode) {
        this.linkFieldCode = linkFieldCode;
        return this;
    }

    /**
     * **参数解释**： 工作流场景使用，前置校验中的关联关系校验字段。 **取值范围**： 不涉及。
     * @return linkFieldCode
     */
    public String getLinkFieldCode() {
        return linkFieldCode;
    }

    public void setLinkFieldCode(String linkFieldCode) {
        this.linkFieldCode = linkFieldCode;
    }

    public Relation withRelationName(String relationName) {
        this.relationName = relationName;
        return this;
    }

    /**
     * **参数解释**： 关系名称，在工作项详情关联项下左侧显示。 **取值范围**： 不涉及。
     * @return relationName
     */
    public String getRelationName() {
        return relationName;
    }

    public void setRelationName(String relationName) {
        this.relationName = relationName;
    }

    public Relation withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 关系描述。 **取值范围**： 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Relation withDisplayScope(String displayScope) {
        this.displayScope = displayScope;
        return this;
    }

    /**
     * **参数解释**： 展示范围。 **取值范围**： 不涉及。
     * @return displayScope
     */
    public String getDisplayScope() {
        return displayScope;
    }

    public void setDisplayScope(String displayScope) {
        this.displayScope = displayScope;
    }

    public Relation withActions(List<RelateAction> actions) {
        this.actions = actions;
        return this;
    }

    public Relation addActionsItem(RelateAction actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public Relation withActions(Consumer<List<RelateAction>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * **参数解释**： 动作行为。 **取值范围**： 不涉及。
     * @return actions
     */
    public List<RelateAction> getActions() {
        return actions;
    }

    public void setActions(List<RelateAction> actions) {
        this.actions = actions;
    }

    public Relation withRelateType(String relateType) {
        this.relateType = relateType;
        return this;
    }

    /**
     * **参数解释**： 动作行为。 **取值范围**： - ONE_TO_ONE 一对一 - ONE_TO_MANY 一对多 - MANY_TO_ONE 多对一 - MANY_TO_MANY 多对多
     * @return relateType
     */
    public String getRelateType() {
        return relateType;
    }

    public void setRelateType(String relateType) {
        this.relateType = relateType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Relation that = (Relation) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.categories, that.categories)
            && Objects.equals(this.linkFieldCode, that.linkFieldCode)
            && Objects.equals(this.relationName, that.relationName)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.displayScope, that.displayScope) && Objects.equals(this.actions, that.actions)
            && Objects.equals(this.relateType, that.relateType);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(type, categories, linkFieldCode, relationName, description, displayScope, actions, relateType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Relation {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
        sb.append("    linkFieldCode: ").append(toIndentedString(linkFieldCode)).append("\n");
        sb.append("    relationName: ").append(toIndentedString(relationName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    displayScope: ").append(toIndentedString(displayScope)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    relateType: ").append(toIndentedString(relateType)).append("\n");
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
