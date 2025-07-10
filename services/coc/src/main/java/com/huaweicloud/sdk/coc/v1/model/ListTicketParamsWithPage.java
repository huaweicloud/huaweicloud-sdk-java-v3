package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 带分页信息的查询
 */
public class ListTicketParamsWithPage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "string_filters")

    private List<ObjectFilter> stringFilters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_filter")

    private ObjectFilter sortFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_page")

    private Integer perPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contain_all")

    private Boolean containAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contain_total")

    private Boolean containTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contain_sub_ticket")

    private Boolean containSubTicket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_types")

    private List<String> ticketTypes = null;

    public ListTicketParamsWithPage withStringFilters(List<ObjectFilter> stringFilters) {
        this.stringFilters = stringFilters;
        return this;
    }

    public ListTicketParamsWithPage addStringFiltersItem(ObjectFilter stringFiltersItem) {
        if (this.stringFilters == null) {
            this.stringFilters = new ArrayList<>();
        }
        this.stringFilters.add(stringFiltersItem);
        return this;
    }

    public ListTicketParamsWithPage withStringFilters(Consumer<List<ObjectFilter>> stringFiltersSetter) {
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

    public ListTicketParamsWithPage withSortFilter(ObjectFilter sortFilter) {
        this.sortFilter = sortFilter;
        return this;
    }

    public ListTicketParamsWithPage withSortFilter(Consumer<ObjectFilter> sortFilterSetter) {
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

    public ListTicketParamsWithPage withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * 当前页
     * minimum: 0
     * maximum: 1024000
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListTicketParamsWithPage withPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * 每页数量
     * minimum: 0
     * maximum: 200
     * @return perPage
     */
    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    public ListTicketParamsWithPage withContainAll(Boolean containAll) {
        this.containAll = containAll;
        return this;
    }

    /**
     * 是否返回所有数据
     * @return containAll
     */
    public Boolean getContainAll() {
        return containAll;
    }

    public void setContainAll(Boolean containAll) {
        this.containAll = containAll;
    }

    public ListTicketParamsWithPage withContainTotal(Boolean containTotal) {
        this.containTotal = containTotal;
        return this;
    }

    /**
     * 是否返回总数
     * @return containTotal
     */
    public Boolean getContainTotal() {
        return containTotal;
    }

    public void setContainTotal(Boolean containTotal) {
        this.containTotal = containTotal;
    }

    public ListTicketParamsWithPage withContainSubTicket(Boolean containSubTicket) {
        this.containSubTicket = containSubTicket;
        return this;
    }

    /**
     * 是否包含子单
     * @return containSubTicket
     */
    public Boolean getContainSubTicket() {
        return containSubTicket;
    }

    public void setContainSubTicket(Boolean containSubTicket) {
        this.containSubTicket = containSubTicket;
    }

    public ListTicketParamsWithPage withTicketTypes(List<String> ticketTypes) {
        this.ticketTypes = ticketTypes;
        return this;
    }

    public ListTicketParamsWithPage addTicketTypesItem(String ticketTypesItem) {
        if (this.ticketTypes == null) {
            this.ticketTypes = new ArrayList<>();
        }
        this.ticketTypes.add(ticketTypesItem);
        return this;
    }

    public ListTicketParamsWithPage withTicketTypes(Consumer<List<String>> ticketTypesSetter) {
        if (this.ticketTypes == null) {
            this.ticketTypes = new ArrayList<>();
        }
        ticketTypesSetter.accept(this.ticketTypes);
        return this;
    }

    /**
     * 搜索的工单类型
     * @return ticketTypes
     */
    public List<String> getTicketTypes() {
        return ticketTypes;
    }

    public void setTicketTypes(List<String> ticketTypes) {
        this.ticketTypes = ticketTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTicketParamsWithPage that = (ListTicketParamsWithPage) obj;
        return Objects.equals(this.stringFilters, that.stringFilters)
            && Objects.equals(this.sortFilter, that.sortFilter) && Objects.equals(this.page, that.page)
            && Objects.equals(this.perPage, that.perPage) && Objects.equals(this.containAll, that.containAll)
            && Objects.equals(this.containTotal, that.containTotal)
            && Objects.equals(this.containSubTicket, that.containSubTicket)
            && Objects.equals(this.ticketTypes, that.ticketTypes);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(stringFilters, sortFilter, page, perPage, containAll, containTotal, containSubTicket, ticketTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTicketParamsWithPage {\n");
        sb.append("    stringFilters: ").append(toIndentedString(stringFilters)).append("\n");
        sb.append("    sortFilter: ").append(toIndentedString(sortFilter)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
        sb.append("    containAll: ").append(toIndentedString(containAll)).append("\n");
        sb.append("    containTotal: ").append(toIndentedString(containTotal)).append("\n");
        sb.append("    containSubTicket: ").append(toIndentedString(containSubTicket)).append("\n");
        sb.append("    ticketTypes: ").append(toIndentedString(ticketTypes)).append("\n");
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
