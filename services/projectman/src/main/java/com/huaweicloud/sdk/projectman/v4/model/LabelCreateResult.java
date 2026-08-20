package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作项标签对象
 */
public class LabelCreateResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_types")

    private List<String> categoryTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "color")

    private String color;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    public LabelCreateResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 标签ID，可通过查询标签列表接口获取，响应消息体中的id字段的值就是标签ID。 18~19个字符的数字字符串。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LabelCreateResult withCategoryTypes(List<String> categoryTypes) {
        this.categoryTypes = categoryTypes;
        return this;
    }

    public LabelCreateResult addCategoryTypesItem(String categoryTypesItem) {
        if (this.categoryTypes == null) {
            this.categoryTypes = new ArrayList<>();
        }
        this.categoryTypes.add(categoryTypesItem);
        return this;
    }

    public LabelCreateResult withCategoryTypes(Consumer<List<String>> categoryTypesSetter) {
        if (this.categoryTypes == null) {
            this.categoryTypes = new ArrayList<>();
        }
        categoryTypesSetter.accept(this.categoryTypes);
        return this;
    }

    /**
     * 标签所属工作项类型编码。
     * @return categoryTypes
     */
    public List<String> getCategoryTypes() {
        return categoryTypes;
    }

    public void setCategoryTypes(List<String> categoryTypes) {
        this.categoryTypes = categoryTypes;
    }

    public LabelCreateResult withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * 标签颜色RGB。 0~16个字符。
     * @return color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LabelCreateResult withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 标签标题。 2~256个字符。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LabelCreateResult that = (LabelCreateResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.categoryTypes, that.categoryTypes)
            && Objects.equals(this.color, that.color) && Objects.equals(this.title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categoryTypes, color, title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelCreateResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    categoryTypes: ").append(toIndentedString(categoryTypes)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
