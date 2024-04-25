package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 敏感数据结果分类统计概览的查询对象
 */
public class SensitiveDataCategoryOverviewQueryDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_id")

    private String rootId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_id")

    private String categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_name")

    private String categoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_path")

    private String categoryPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private List<SensitiveDataCategoryOverviewQueryDTO> children = null;

    public SensitiveDataCategoryOverviewQueryDTO withRootId(String rootId) {
        this.rootId = rootId;
        return this;
    }

    /**
     * 当前分类节点的根节点id,根节点的
     * @return rootId
     */
    public String getRootId() {
        return rootId;
    }

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    public SensitiveDataCategoryOverviewQueryDTO withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 当前分类节点的父节点id
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public SensitiveDataCategoryOverviewQueryDTO withCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * 分类的Id
     * @return categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public SensitiveDataCategoryOverviewQueryDTO withCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    /**
     * 分类的名称
     * @return categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public SensitiveDataCategoryOverviewQueryDTO withCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
        return this;
    }

    /**
     * 分类path
     * @return categoryPath
     */
    public String getCategoryPath() {
        return categoryPath;
    }

    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
    }

    public SensitiveDataCategoryOverviewQueryDTO withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 当前分类下的敏感字段数量
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public SensitiveDataCategoryOverviewQueryDTO withChildren(List<SensitiveDataCategoryOverviewQueryDTO> children) {
        this.children = children;
        return this;
    }

    public SensitiveDataCategoryOverviewQueryDTO addChildrenItem(SensitiveDataCategoryOverviewQueryDTO childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public SensitiveDataCategoryOverviewQueryDTO withChildren(
        Consumer<List<SensitiveDataCategoryOverviewQueryDTO>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * 当前分类的子节点
     * @return children
     */
    public List<SensitiveDataCategoryOverviewQueryDTO> getChildren() {
        return children;
    }

    public void setChildren(List<SensitiveDataCategoryOverviewQueryDTO> children) {
        this.children = children;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SensitiveDataCategoryOverviewQueryDTO that = (SensitiveDataCategoryOverviewQueryDTO) obj;
        return Objects.equals(this.rootId, that.rootId) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.categoryId, that.categoryId) && Objects.equals(this.categoryName, that.categoryName)
            && Objects.equals(this.categoryPath, that.categoryPath) && Objects.equals(this.count, that.count)
            && Objects.equals(this.children, that.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rootId, parentId, categoryId, categoryName, categoryPath, count, children);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SensitiveDataCategoryOverviewQueryDTO {\n");
        sb.append("    rootId: ").append(toIndentedString(rootId)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
        sb.append("    categoryPath: ").append(toIndentedString(categoryPath)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
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
