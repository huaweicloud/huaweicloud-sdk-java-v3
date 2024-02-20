package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateArchiveRuleReqBody
 */
public class UpdateArchiveRuleReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filters")

    private List<FindingFilter> filters = null;

    public UpdateArchiveRuleReqBody withFilters(List<FindingFilter> filters) {
        this.filters = filters;
        return this;
    }

    public UpdateArchiveRuleReqBody addFiltersItem(FindingFilter filtersItem) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filtersItem);
        return this;
    }

    public UpdateArchiveRuleReqBody withFilters(Consumer<List<FindingFilter>> filtersSetter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        filtersSetter.accept(this.filters);
        return this;
    }

    /**
     * Get filters
     * @return filters
     */
    public List<FindingFilter> getFilters() {
        return filters;
    }

    public void setFilters(List<FindingFilter> filters) {
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
        UpdateArchiveRuleReqBody that = (UpdateArchiveRuleReqBody) obj;
        return Objects.equals(this.filters, that.filters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateArchiveRuleReqBody {\n");
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
