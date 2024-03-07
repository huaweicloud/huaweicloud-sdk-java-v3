package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateArchiveRuleReqBody
 */
public class CreateArchiveRuleReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filters")

    private List<FindingFilter> filters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public CreateArchiveRuleReqBody withFilters(List<FindingFilter> filters) {
        this.filters = filters;
        return this;
    }

    public CreateArchiveRuleReqBody addFiltersItem(FindingFilter filtersItem) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filtersItem);
        return this;
    }

    public CreateArchiveRuleReqBody withFilters(Consumer<List<FindingFilter>> filtersSetter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        filtersSetter.accept(this.filters);
        return this;
    }

    /**
     * 匹配要返回的访问分析结果的筛选器。
     * @return filters
     */
    public List<FindingFilter> getFilters() {
        return filters;
    }

    public void setFilters(List<FindingFilter> filters) {
        this.filters = filters;
    }

    public CreateArchiveRuleReqBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 创建存档规则的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateArchiveRuleReqBody that = (CreateArchiveRuleReqBody) obj;
        return Objects.equals(this.filters, that.filters) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filters, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateArchiveRuleReqBody {\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
