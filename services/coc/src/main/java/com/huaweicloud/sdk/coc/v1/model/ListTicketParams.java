package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListTicketParams
 */
public class ListTicketParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "string_filters")

    private List<ObjectFilter> stringFilters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_filter")

    private ObjectFilter sortFilter;

    public ListTicketParams withStringFilters(List<ObjectFilter> stringFilters) {
        this.stringFilters = stringFilters;
        return this;
    }

    public ListTicketParams addStringFiltersItem(ObjectFilter stringFiltersItem) {
        if (this.stringFilters == null) {
            this.stringFilters = new ArrayList<>();
        }
        this.stringFilters.add(stringFiltersItem);
        return this;
    }

    public ListTicketParams withStringFilters(Consumer<List<ObjectFilter>> stringFiltersSetter) {
        if (this.stringFilters == null) {
            this.stringFilters = new ArrayList<>();
        }
        stringFiltersSetter.accept(this.stringFilters);
        return this;
    }

    /**
     * 字符串搜索条件，可根据该条件搜索到具体的工单。
     * @return stringFilters
     */
    public List<ObjectFilter> getStringFilters() {
        return stringFilters;
    }

    public void setStringFilters(List<ObjectFilter> stringFilters) {
        this.stringFilters = stringFilters;
    }

    public ListTicketParams withSortFilter(ObjectFilter sortFilter) {
        this.sortFilter = sortFilter;
        return this;
    }

    public ListTicketParams withSortFilter(Consumer<ObjectFilter> sortFilterSetter) {
        if (this.sortFilter == null) {
            this.sortFilter = new ObjectFilter();
            sortFilterSetter.accept(this.sortFilter);
        }

        return this;
    }

    /**
     * Get sortFilter
     * @return sortFilter
     */
    public ObjectFilter getSortFilter() {
        return sortFilter;
    }

    public void setSortFilter(ObjectFilter sortFilter) {
        this.sortFilter = sortFilter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTicketParams that = (ListTicketParams) obj;
        return Objects.equals(this.stringFilters, that.stringFilters)
            && Objects.equals(this.sortFilter, that.sortFilter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stringFilters, sortFilter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTicketParams {\n");
        sb.append("    stringFilters: ").append(toIndentedString(stringFilters)).append("\n");
        sb.append("    sortFilter: ").append(toIndentedString(sortFilter)).append("\n");
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
