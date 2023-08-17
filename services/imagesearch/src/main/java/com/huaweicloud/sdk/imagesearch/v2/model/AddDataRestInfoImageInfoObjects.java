package com.huaweicloud.sdk.imagesearch.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * AddDataRestInfoImageInfoObjects
 */
public class AddDataRestInfoImageInfoObjects {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "box")

    private String box;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private BigDecimal category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_name")

    private String categoryName;

    public AddDataRestInfoImageInfoObjects withBox(String box) {
        this.box = box;
        return this;
    }

    /**
     * 主体目标框。
     * @return box
     */
    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public AddDataRestInfoImageInfoObjects withCategory(BigDecimal category) {
        this.category = category;
        return this;
    }

    /**
     * 主体类目序号。
     * @return category
     */
    public BigDecimal getCategory() {
        return category;
    }

    public void setCategory(BigDecimal category) {
        this.category = category;
    }

    public AddDataRestInfoImageInfoObjects withCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    /**
     * 主体类目名称。
     * @return categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddDataRestInfoImageInfoObjects that = (AddDataRestInfoImageInfoObjects) obj;
        return Objects.equals(this.box, that.box) && Objects.equals(this.category, that.category)
            && Objects.equals(this.categoryName, that.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(box, category, categoryName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDataRestInfoImageInfoObjects {\n");
        sb.append("    box: ").append(toIndentedString(box)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
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
