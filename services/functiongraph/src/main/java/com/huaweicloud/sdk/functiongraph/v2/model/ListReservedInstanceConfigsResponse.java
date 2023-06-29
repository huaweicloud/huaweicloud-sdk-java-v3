package com.huaweicloud.sdk.functiongraph.v2.model;

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
public class ListReservedInstanceConfigsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserved_instances")

    private List<ReservedInstanceConfigs> reservedInstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public ListReservedInstanceConfigsResponse withReservedInstances(List<ReservedInstanceConfigs> reservedInstances) {
        this.reservedInstances = reservedInstances;
        return this;
    }

    public ListReservedInstanceConfigsResponse addReservedInstancesItem(ReservedInstanceConfigs reservedInstancesItem) {
        if (this.reservedInstances == null) {
            this.reservedInstances = new ArrayList<>();
        }
        this.reservedInstances.add(reservedInstancesItem);
        return this;
    }

    public ListReservedInstanceConfigsResponse withReservedInstances(
        Consumer<List<ReservedInstanceConfigs>> reservedInstancesSetter) {
        if (this.reservedInstances == null) {
            this.reservedInstances = new ArrayList<>();
        }
        reservedInstancesSetter.accept(this.reservedInstances);
        return this;
    }

    /**
     * 函数预留实例列表
     * @return reservedInstances
     */
    public List<ReservedInstanceConfigs> getReservedInstances() {
        return reservedInstances;
    }

    public void setReservedInstances(List<ReservedInstanceConfigs> reservedInstances) {
        this.reservedInstances = reservedInstances;
    }

    public ListReservedInstanceConfigsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListReservedInstanceConfigsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListReservedInstanceConfigsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 函数个数
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListReservedInstanceConfigsResponse that = (ListReservedInstanceConfigsResponse) obj;
        return Objects.equals(this.reservedInstances, that.reservedInstances)
            && Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reservedInstances, pageInfo, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListReservedInstanceConfigsResponse {\n");
        sb.append("    reservedInstances: ").append(toIndentedString(reservedInstances)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
