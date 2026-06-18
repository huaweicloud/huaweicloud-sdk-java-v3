package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAlgorithmsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

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
    @JsonProperty(value = "group_by")

    private String groupBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<AlgorithmResponse> items = null;

    public ListAlgorithmsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 查询到当前用户名下的所有算法总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListAlgorithmsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 查询到当前用户名下的所有符合查询条件的算法总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListAlgorithmsResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询到当前用户名下的所有算法限制个数。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAlgorithmsResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询到当前用户名下的所有算法查询偏移量。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAlgorithmsResponse withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * 查询到当前用户名下的所有算法排序依赖字段。
     * @return sortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public ListAlgorithmsResponse withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * 查询到当前用户名下的所有算法排序方式，默认为“desc”，降序排序。也可以选择对应的“asc”，升序排序。
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public ListAlgorithmsResponse withGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * 查询到当前用户名下的所有算法分组方式。
     * @return groupBy
     */
    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public ListAlgorithmsResponse withItems(List<AlgorithmResponse> items) {
        this.items = items;
        return this;
    }

    public ListAlgorithmsResponse addItemsItem(AlgorithmResponse itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListAlgorithmsResponse withItems(Consumer<List<AlgorithmResponse>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 查询到当前用户名下的所有符合查询条件的算法详情。
     * @return items
     */
    public List<AlgorithmResponse> getItems() {
        return items;
    }

    public void setItems(List<AlgorithmResponse> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlgorithmsResponse that = (ListAlgorithmsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.count, that.count)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.sortBy, that.sortBy) && Objects.equals(this.order, that.order)
            && Objects.equals(this.groupBy, that.groupBy) && Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, count, limit, offset, sortBy, order, groupBy, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlgorithmsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
