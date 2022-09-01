package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * FilterV2
 */
public class FilterV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    @JacksonXmlProperty(localName = "operator")

    private Integer operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_factor")

    @JacksonXmlProperty(localName = "filter_factor")

    private FilterFactor filterFactor;

    public FilterV2 withOperator(Integer operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 运算符，0：仅包含1：仅排除 此参数不携带或携带值为null时，不作为筛选条件。
     * minimum: 0
     * maximum: 1
     * @return operator
     */
    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public FilterV2 withFilterFactor(FilterFactor filterFactor) {
        this.filterFactor = filterFactor;
        return this;
    }

    public FilterV2 withFilterFactor(Consumer<FilterFactor> filterFactorSetter) {
        if (this.filterFactor == null) {
            this.filterFactor = new FilterFactor();
            filterFactorSetter.accept(this.filterFactor);
        }

        return this;
    }

    /**
     * Get filterFactor
     * @return filterFactor
     */
    public FilterFactor getFilterFactor() {
        return filterFactor;
    }

    public void setFilterFactor(FilterFactor filterFactor) {
        this.filterFactor = filterFactor;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FilterV2 filterV2 = (FilterV2) o;
        return Objects.equals(this.operator, filterV2.operator)
            && Objects.equals(this.filterFactor, filterV2.filterFactor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operator, filterFactor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FilterV2 {\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    filterFactor: ").append(toIndentedString(filterFactor)).append("\n");
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
