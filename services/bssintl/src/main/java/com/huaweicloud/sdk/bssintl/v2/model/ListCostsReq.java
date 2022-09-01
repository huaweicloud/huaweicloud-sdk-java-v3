package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListCostsReq
 */
public class ListCostsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_condition")

    @JacksonXmlProperty(localName = "time_condition")

    private TimeCondition timeCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groupby")

    @JacksonXmlProperty(localName = "groupby")

    private List<GroupBy> groupby = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cost_type")

    @JacksonXmlProperty(localName = "cost_type")

    private String costType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount_type")

    @JacksonXmlProperty(localName = "amount_type")

    private String amountType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filters")

    @JacksonXmlProperty(localName = "filters")

    private List<FilterV2> filters = null;

    public ListCostsReq withTimeCondition(TimeCondition timeCondition) {
        this.timeCondition = timeCondition;
        return this;
    }

    public ListCostsReq withTimeCondition(Consumer<TimeCondition> timeConditionSetter) {
        if (this.timeCondition == null) {
            this.timeCondition = new TimeCondition();
            timeConditionSetter.accept(this.timeCondition);
        }

        return this;
    }

    /**
     * Get timeCondition
     * @return timeCondition
     */
    public TimeCondition getTimeCondition() {
        return timeCondition;
    }

    public void setTimeCondition(TimeCondition timeCondition) {
        this.timeCondition = timeCondition;
    }

    public ListCostsReq withGroupby(List<GroupBy> groupby) {
        this.groupby = groupby;
        return this;
    }

    public ListCostsReq addGroupbyItem(GroupBy groupbyItem) {
        if (this.groupby == null) {
            this.groupby = new ArrayList<>();
        }
        this.groupby.add(groupbyItem);
        return this;
    }

    public ListCostsReq withGroupby(Consumer<List<GroupBy>> groupbySetter) {
        if (this.groupby == null) {
            this.groupby = new ArrayList<>();
        }
        groupbySetter.accept(this.groupby);
        return this;
    }

    /**
     * 查询维度，具体请参见表 GroupBy。
     * @return groupby
     */
    public List<GroupBy> getGroupby() {
        return groupby;
    }

    public void setGroupby(List<GroupBy> groupby) {
        this.groupby = groupby;
    }

    public ListCostsReq withCostType(String costType) {
        this.costType = costType;
        return this;
    }

    /**
     * 成本类型。UNBLENDED_COST：原始成本AMORTIZED_COST：摊销成本
     * @return costType
     */
    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public ListCostsReq withAmountType(String amountType) {
        this.amountType = amountType;
        return this;
    }

    /**
     * 展示的金额类型。PAYMENT_AMOUNT：应付NET_AMOUNT：实付
     * @return amountType
     */
    public String getAmountType() {
        return amountType;
    }

    public void setAmountType(String amountType) {
        this.amountType = amountType;
    }

    public ListCostsReq withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量。从0开始，默认为0
     * minimum: 0
     * maximum: 200000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListCostsReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每次查询的记录数，默认为10
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

    public ListCostsReq withFilters(List<FilterV2> filters) {
        this.filters = filters;
        return this;
    }

    public ListCostsReq addFiltersItem(FilterV2 filtersItem) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filtersItem);
        return this;
    }

    public ListCostsReq withFilters(Consumer<List<FilterV2>> filtersSetter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        filtersSetter.accept(this.filters);
        return this;
    }

    /**
     * 过滤条件，具体请参见表 过滤条件。此参数不携带或携带值为空列表或携带值为null时，不作为筛选条件。
     * @return filters
     */
    public List<FilterV2> getFilters() {
        return filters;
    }

    public void setFilters(List<FilterV2> filters) {
        this.filters = filters;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCostsReq listCostsReq = (ListCostsReq) o;
        return Objects.equals(this.timeCondition, listCostsReq.timeCondition)
            && Objects.equals(this.groupby, listCostsReq.groupby)
            && Objects.equals(this.costType, listCostsReq.costType)
            && Objects.equals(this.amountType, listCostsReq.amountType)
            && Objects.equals(this.offset, listCostsReq.offset) && Objects.equals(this.limit, listCostsReq.limit)
            && Objects.equals(this.filters, listCostsReq.filters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeCondition, groupby, costType, amountType, offset, limit, filters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCostsReq {\n");
        sb.append("    timeCondition: ").append(toIndentedString(timeCondition)).append("\n");
        sb.append("    groupby: ").append(toIndentedString(groupby)).append("\n");
        sb.append("    costType: ").append(toIndentedString(costType)).append("\n");
        sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
