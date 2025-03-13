package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSecurityDataCategoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_groups")

    private List<DataCategoryDTO> categoryGroups = null;

    public ListSecurityDataCategoriesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 数据分类总的数量
     * minimum: 0
     * maximum: 100
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListSecurityDataCategoriesResponse withCategoryGroups(List<DataCategoryDTO> categoryGroups) {
        this.categoryGroups = categoryGroups;
        return this;
    }

    public ListSecurityDataCategoriesResponse addCategoryGroupsItem(DataCategoryDTO categoryGroupsItem) {
        if (this.categoryGroups == null) {
            this.categoryGroups = new ArrayList<>();
        }
        this.categoryGroups.add(categoryGroupsItem);
        return this;
    }

    public ListSecurityDataCategoriesResponse withCategoryGroups(Consumer<List<DataCategoryDTO>> categoryGroupsSetter) {
        if (this.categoryGroups == null) {
            this.categoryGroups = new ArrayList<>();
        }
        categoryGroupsSetter.accept(this.categoryGroups);
        return this;
    }

    /**
     * 数据分类列表
     * @return categoryGroups
     */
    public List<DataCategoryDTO> getCategoryGroups() {
        return categoryGroups;
    }

    public void setCategoryGroups(List<DataCategoryDTO> categoryGroups) {
        this.categoryGroups = categoryGroups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecurityDataCategoriesResponse that = (ListSecurityDataCategoriesResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.categoryGroups, that.categoryGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, categoryGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityDataCategoriesResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    categoryGroups: ").append(toIndentedString(categoryGroups)).append("\n");
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
