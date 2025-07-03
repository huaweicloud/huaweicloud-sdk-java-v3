package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListTicketParamsV2CountFilters
 */
public class ListTicketParamsV2CountFilters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filters")

    private List<ObjectFilterV2> filters = null;

    public ListTicketParamsV2CountFilters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 过滤名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListTicketParamsV2CountFilters withFilters(List<ObjectFilterV2> filters) {
        this.filters = filters;
        return this;
    }

    public ListTicketParamsV2CountFilters addFiltersItem(ObjectFilterV2 filtersItem) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filtersItem);
        return this;
    }

    public ListTicketParamsV2CountFilters withFilters(Consumer<List<ObjectFilterV2>> filtersSetter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        filtersSetter.accept(this.filters);
        return this;
    }

    /**
     * 批量计数
     * @return filters
     */
    public List<ObjectFilterV2> getFilters() {
        return filters;
    }

    public void setFilters(List<ObjectFilterV2> filters) {
        this.filters = filters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTicketParamsV2CountFilters that = (ListTicketParamsV2CountFilters) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.filters, that.filters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, filters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTicketParamsV2CountFilters {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
