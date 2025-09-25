package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteCategoryGroupDTO
 */
public class BatchDeleteCategoryGroupDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_ids")

    private List<String> categoryIds = null;

    public BatchDeleteCategoryGroupDTO withCategoryIds(List<String> categoryIds) {
        this.categoryIds = categoryIds;
        return this;
    }

    public BatchDeleteCategoryGroupDTO addCategoryIdsItem(String categoryIdsItem) {
        if (this.categoryIds == null) {
            this.categoryIds = new ArrayList<>();
        }
        this.categoryIds.add(categoryIdsItem);
        return this;
    }

    public BatchDeleteCategoryGroupDTO withCategoryIds(Consumer<List<String>> categoryIdsSetter) {
        if (this.categoryIds == null) {
            this.categoryIds = new ArrayList<>();
        }
        categoryIdsSetter.accept(this.categoryIds);
        return this;
    }

    /**
     * 待删除的数据分类id列表。
     * @return categoryIds
     */
    public List<String> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<String> categoryIds) {
        this.categoryIds = categoryIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteCategoryGroupDTO that = (BatchDeleteCategoryGroupDTO) obj;
        return Objects.equals(this.categoryIds, that.categoryIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteCategoryGroupDTO {\n");
        sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
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
