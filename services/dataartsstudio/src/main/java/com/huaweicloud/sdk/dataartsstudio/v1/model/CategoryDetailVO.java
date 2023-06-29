package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CategoryDetailVO
 */
public class CategoryDetailVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pid")

    private String pid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_categories")

    private List<SubCategoryDetailVO> subCategories = null;

    public CategoryDetailVO withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 目录ID，根目录的ID为0
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CategoryDetailVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryDetailVO withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型 built_in:系统内置 user-defined: 用户自定义
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CategoryDetailVO withPid(String pid) {
        this.pid = pid;
        return this;
    }

    /**
     * 父目录ID
     * @return pid
     */
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public CategoryDetailVO withSubCategories(List<SubCategoryDetailVO> subCategories) {
        this.subCategories = subCategories;
        return this;
    }

    public CategoryDetailVO addSubCategoriesItem(SubCategoryDetailVO subCategoriesItem) {
        if (this.subCategories == null) {
            this.subCategories = new ArrayList<>();
        }
        this.subCategories.add(subCategoriesItem);
        return this;
    }

    public CategoryDetailVO withSubCategories(Consumer<List<SubCategoryDetailVO>> subCategoriesSetter) {
        if (this.subCategories == null) {
            this.subCategories = new ArrayList<>();
        }
        subCategoriesSetter.accept(this.subCategories);
        return this;
    }

    /**
     * 子目录
     * @return subCategories
     */
    public List<SubCategoryDetailVO> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<SubCategoryDetailVO> subCategories) {
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
        CategoryDetailVO that = (CategoryDetailVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.pid, that.pid)
            && Objects.equals(this.subCategories, that.subCategories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, pid, subCategories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CategoryDetailVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
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
