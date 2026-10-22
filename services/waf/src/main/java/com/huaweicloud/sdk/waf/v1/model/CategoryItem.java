package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CategoryItem
 */
public class CategoryItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subcategories")

    private List<SubcategoryItem> subcategories = null;

    public CategoryItem withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 分类标识
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public CategoryItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 分类名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryItem withSubcategories(List<SubcategoryItem> subcategories) {
        this.subcategories = subcategories;
        return this;
    }

    public CategoryItem addSubcategoriesItem(SubcategoryItem subcategoriesItem) {
        if (this.subcategories == null) {
            this.subcategories = new ArrayList<>();
        }
        this.subcategories.add(subcategoriesItem);
        return this;
    }

    public CategoryItem withSubcategories(Consumer<List<SubcategoryItem>> subcategoriesSetter) {
        if (this.subcategories == null) {
            this.subcategories = new ArrayList<>();
        }
        subcategoriesSetter.accept(this.subcategories);
        return this;
    }

    /**
     * 子分类列表
     * @return subcategories
     */
    public List<SubcategoryItem> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<SubcategoryItem> subcategories) {
        this.subcategories = subcategories;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CategoryItem that = (CategoryItem) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.name, that.name)
            && Objects.equals(this.subcategories, that.subcategories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, name, subcategories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CategoryItem {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    subcategories: ").append(toIndentedString(subcategories)).append("\n");
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
