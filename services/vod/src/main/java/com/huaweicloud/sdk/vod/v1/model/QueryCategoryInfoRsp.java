package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryCategoryInfoRsp
 */
public class QueryCategoryInfoRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_categories")

    private List<CategoryInfo> subCategories = null;

    public QueryCategoryInfoRsp withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 查询的分类ID，-1表示默认的其他分类 
     * minimum: -1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public QueryCategoryInfoRsp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 查询的分类名称 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QueryCategoryInfoRsp withSubCategories(List<CategoryInfo> subCategories) {
        this.subCategories = subCategories;
        return this;
    }

    public QueryCategoryInfoRsp addSubCategoriesItem(CategoryInfo subCategoriesItem) {
        if (this.subCategories == null) {
            this.subCategories = new ArrayList<>();
        }
        this.subCategories.add(subCategoriesItem);
        return this;
    }

    public QueryCategoryInfoRsp withSubCategories(Consumer<List<CategoryInfo>> subCategoriesSetter) {
        if (this.subCategories == null) {
            this.subCategories = new ArrayList<>();
        }
        subCategoriesSetter.accept(this.subCategories);
        return this;
    }

    /**
     * 子层分类信息 
     * @return subCategories
     */
    public List<CategoryInfo> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<CategoryInfo> subCategories) {
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
        QueryCategoryInfoRsp that = (QueryCategoryInfoRsp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.subCategories, that.subCategories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, subCategories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryCategoryInfoRsp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
