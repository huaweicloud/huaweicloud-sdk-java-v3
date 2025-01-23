package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * DataCategoryDTO
 */
public class DataCategoryDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "categoryable")

    private ObjectReferenceParamDTO categoryable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private ObjectReferenceParamDTO category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier")

    private String modifier;

    public DataCategoryDTO withCategoryable(ObjectReferenceParamDTO categoryable) {
        this.categoryable = categoryable;
        return this;
    }

    public DataCategoryDTO withCategoryable(Consumer<ObjectReferenceParamDTO> categoryableSetter) {
        if (this.categoryable == null) {
            this.categoryable = new ObjectReferenceParamDTO();
            categoryableSetter.accept(this.categoryable);
        }

        return this;
    }

    /**
     * Get categoryable
     * @return categoryable
     */
    public ObjectReferenceParamDTO getCategoryable() {
        return categoryable;
    }

    public void setCategoryable(ObjectReferenceParamDTO categoryable) {
        this.categoryable = categoryable;
    }

    public DataCategoryDTO withCategory(ObjectReferenceParamDTO category) {
        this.category = category;
        return this;
    }

    public DataCategoryDTO withCategory(Consumer<ObjectReferenceParamDTO> categorySetter) {
        if (this.category == null) {
            this.category = new ObjectReferenceParamDTO();
            categorySetter.accept(this.category);
        }

        return this;
    }

    /**
     * Get category
     * @return category
     */
    public ObjectReferenceParamDTO getCategory() {
        return category;
    }

    public void setCategory(ObjectReferenceParamDTO category) {
        this.category = category;
    }

    public DataCategoryDTO withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    /**
     * **参数解释：**  修改人。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataCategoryDTO that = (DataCategoryDTO) obj;
        return Objects.equals(this.categoryable, that.categoryable) && Objects.equals(this.category, that.category)
            && Objects.equals(this.modifier, that.modifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryable, category, modifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataCategoryDTO {\n");
        sb.append("    categoryable: ").append(toIndentedString(categoryable)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
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
