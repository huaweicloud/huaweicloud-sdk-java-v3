package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SearchIpdIssuesRequestBody
 */
public class SearchIpdIssuesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private List<Map<String, ConditionVO>> filter = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private PageInfoVO page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_fields")

    private List<String> returnFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private List<SortInfo> sort = null;

    public SearchIpdIssuesRequestBody withFilter(List<Map<String, ConditionVO>> filter) {
        this.filter = filter;
        return this;
    }

    public SearchIpdIssuesRequestBody addFilterItem(Map<String, ConditionVO> filterItem) {
        if (this.filter == null) {
            this.filter = new ArrayList<>();
        }
        this.filter.add(filterItem);
        return this;
    }

    public SearchIpdIssuesRequestBody withFilter(Consumer<List<Map<String, ConditionVO>>> filterSetter) {
        if (this.filter == null) {
            this.filter = new ArrayList<>();
        }
        filterSetter.accept(this.filter);
        return this;
    }

    /**
     * 过滤条件
     * @return filter
     */
    public List<Map<String, ConditionVO>> getFilter() {
        return filter;
    }

    public void setFilter(List<Map<String, ConditionVO>> filter) {
        this.filter = filter;
    }

    public SearchIpdIssuesRequestBody withPage(PageInfoVO page) {
        this.page = page;
        return this;
    }

    public SearchIpdIssuesRequestBody withPage(Consumer<PageInfoVO> pageSetter) {
        if (this.page == null) {
            this.page = new PageInfoVO();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /**
     * Get page
     * @return page
     */
    public PageInfoVO getPage() {
        return page;
    }

    public void setPage(PageInfoVO page) {
        this.page = page;
    }

    public SearchIpdIssuesRequestBody withReturnFields(List<String> returnFields) {
        this.returnFields = returnFields;
        return this;
    }

    public SearchIpdIssuesRequestBody addReturnFieldsItem(String returnFieldsItem) {
        if (this.returnFields == null) {
            this.returnFields = new ArrayList<>();
        }
        this.returnFields.add(returnFieldsItem);
        return this;
    }

    public SearchIpdIssuesRequestBody withReturnFields(Consumer<List<String>> returnFieldsSetter) {
        if (this.returnFields == null) {
            this.returnFields = new ArrayList<>();
        }
        returnFieldsSetter.accept(this.returnFields);
        return this;
    }

    /**
     * 返回字段
     * @return returnFields
     */
    public List<String> getReturnFields() {
        return returnFields;
    }

    public void setReturnFields(List<String> returnFields) {
        this.returnFields = returnFields;
    }

    public SearchIpdIssuesRequestBody withSort(List<SortInfo> sort) {
        this.sort = sort;
        return this;
    }

    public SearchIpdIssuesRequestBody addSortItem(SortInfo sortItem) {
        if (this.sort == null) {
            this.sort = new ArrayList<>();
        }
        this.sort.add(sortItem);
        return this;
    }

    public SearchIpdIssuesRequestBody withSort(Consumer<List<SortInfo>> sortSetter) {
        if (this.sort == null) {
            this.sort = new ArrayList<>();
        }
        sortSetter.accept(this.sort);
        return this;
    }

    /**
     * 排序字段
     * @return sort
     */
    public List<SortInfo> getSort() {
        return sort;
    }

    public void setSort(List<SortInfo> sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchIpdIssuesRequestBody that = (SearchIpdIssuesRequestBody) obj;
        return Objects.equals(this.filter, that.filter) && Objects.equals(this.page, that.page)
            && Objects.equals(this.returnFields, that.returnFields) && Objects.equals(this.sort, that.sort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filter, page, returnFields, sort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchIpdIssuesRequestBody {\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    returnFields: ").append(toIndentedString(returnFields)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
