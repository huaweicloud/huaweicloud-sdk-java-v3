package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Dataobject Search
 */
public class DataobjectSearch {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_by")

    private String sortBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_date")

    private String fromDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_date")

    private String toDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private DataobjectSearchCondition condition;

    public DataobjectSearch withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * limit
     * minimum: 0
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public DataobjectSearch withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * offset
     * minimum: 0
     * maximum: 1000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public DataobjectSearch withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * sortby
     * @return sortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public DataobjectSearch withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * order
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public DataobjectSearch withFromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * search start time
     * @return fromDate
     */
    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public DataobjectSearch withToDate(String toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * search end time
     * @return toDate
     */
    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public DataobjectSearch withCondition(DataobjectSearchCondition condition) {
        this.condition = condition;
        return this;
    }

    public DataobjectSearch withCondition(Consumer<DataobjectSearchCondition> conditionSetter) {
        if (this.condition == null) {
            this.condition = new DataobjectSearchCondition();
            conditionSetter.accept(this.condition);
        }

        return this;
    }

    /**
     * Get condition
     * @return condition
     */
    public DataobjectSearchCondition getCondition() {
        return condition;
    }

    public void setCondition(DataobjectSearchCondition condition) {
        this.condition = condition;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataobjectSearch dataobjectSearch = (DataobjectSearch) o;
        return Objects.equals(this.limit, dataobjectSearch.limit)
            && Objects.equals(this.offset, dataobjectSearch.offset)
            && Objects.equals(this.sortBy, dataobjectSearch.sortBy)
            && Objects.equals(this.order, dataobjectSearch.order)
            && Objects.equals(this.fromDate, dataobjectSearch.fromDate)
            && Objects.equals(this.toDate, dataobjectSearch.toDate)
            && Objects.equals(this.condition, dataobjectSearch.condition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, sortBy, order, fromDate, toDate, condition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataobjectSearch {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
        sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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
