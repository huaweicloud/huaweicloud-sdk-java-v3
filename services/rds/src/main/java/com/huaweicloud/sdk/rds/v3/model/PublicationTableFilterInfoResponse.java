package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 表筛选器。
 */
public class PublicationTableFilterInfoResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation")

    private String relation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column")

    private String column;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private String condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filters")

    private List<PublicationTableFilterInfoResponse> filters = null;

    public PublicationTableFilterInfoResponse withRelation(String relation) {
        this.relation = relation;
        return this;
    }

    /**
     * 筛选关系。  为空时表示当前为最下级筛选器，不为空时表示当前项还有下级筛选器。
     * @return relation
     */
    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public PublicationTableFilterInfoResponse withColumn(String column) {
        this.column = column;
        return this;
    }

    /**
     * 筛选字段。
     * @return column
     */
    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public PublicationTableFilterInfoResponse withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * 筛选条件。
     * @return condition
     */
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public PublicationTableFilterInfoResponse withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 筛选值。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PublicationTableFilterInfoResponse withFilters(List<PublicationTableFilterInfoResponse> filters) {
        this.filters = filters;
        return this;
    }

    public PublicationTableFilterInfoResponse addFiltersItem(PublicationTableFilterInfoResponse filtersItem) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filtersItem);
        return this;
    }

    public PublicationTableFilterInfoResponse withFilters(
        Consumer<List<PublicationTableFilterInfoResponse>> filtersSetter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        filtersSetter.accept(this.filters);
        return this;
    }

    /**
     * 下级筛选器。
     * @return filters
     */
    public List<PublicationTableFilterInfoResponse> getFilters() {
        return filters;
    }

    public void setFilters(List<PublicationTableFilterInfoResponse> filters) {
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
        PublicationTableFilterInfoResponse that = (PublicationTableFilterInfoResponse) obj;
        return Objects.equals(this.relation, that.relation) && Objects.equals(this.column, that.column)
            && Objects.equals(this.condition, that.condition) && Objects.equals(this.value, that.value)
            && Objects.equals(this.filters, that.filters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relation, column, condition, value, filters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicationTableFilterInfoResponse {\n");
        sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
        sb.append("    column: ").append(toIndentedString(column)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
