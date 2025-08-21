package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CategoryDto
 */
public class CategoryDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_zh")

    private String nameZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_categories")

    private List<CategoryDto> subCategories = null;

    public CategoryDto withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 检视意见分类key。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public CategoryDto withNameZh(String nameZh) {
        this.nameZh = nameZh;
        return this;
    }

    /**
     * **参数解释：** 检视意见分类中文名。
     * @return nameZh
     */
    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public CategoryDto withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * **参数解释：** 检视意见分类英文名。
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public CategoryDto withSubCategories(List<CategoryDto> subCategories) {
        this.subCategories = subCategories;
        return this;
    }

    public CategoryDto addSubCategoriesItem(CategoryDto subCategoriesItem) {
        if (this.subCategories == null) {
            this.subCategories = new ArrayList<>();
        }
        this.subCategories.add(subCategoriesItem);
        return this;
    }

    public CategoryDto withSubCategories(Consumer<List<CategoryDto>> subCategoriesSetter) {
        if (this.subCategories == null) {
            this.subCategories = new ArrayList<>();
        }
        subCategoriesSetter.accept(this.subCategories);
        return this;
    }

    /**
     * **参数解释：** 子检视意见分类。
     * @return subCategories
     */
    public List<CategoryDto> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<CategoryDto> subCategories) {
        this.subCategories = subCategories;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CategoryDto that = (CategoryDto) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.nameZh, that.nameZh)
            && Objects.equals(this.nameEn, that.nameEn) && Objects.equals(this.subCategories, that.subCategories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, nameZh, nameEn, subCategories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CategoryDto {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    nameZh: ").append(toIndentedString(nameZh)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    subCategories: ").append(toIndentedString(subCategories)).append("\n");
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
