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
public class ListFunctionReservedInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reservedinstances")

    private List<FuncReservedInstance> reservedinstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public ListFunctionReservedInstancesResponse withReservedinstances(List<FuncReservedInstance> reservedinstances) {
        this.reservedinstances = reservedinstances;
        return this;
    }

    public ListFunctionReservedInstancesResponse addReservedinstancesItem(FuncReservedInstance reservedinstancesItem) {
        if (this.reservedinstances == null) {
            this.reservedinstances = new ArrayList<>();
        }
        this.reservedinstances.add(reservedinstancesItem);
        return this;
    }

    public ListFunctionReservedInstancesResponse withReservedinstances(
        Consumer<List<FuncReservedInstance>> reservedinstancesSetter) {
        if (this.reservedinstances == null) {
            this.reservedinstances = new ArrayList<>();
        }
        reservedinstancesSetter.accept(this.reservedinstances);
        return this;
    }

    /**
     * 函数预留实例列表
     * @return reservedinstances
     */
    public List<FuncReservedInstance> getReservedinstances() {
        return reservedinstances;
    }

    public void setReservedinstances(List<FuncReservedInstance> reservedinstances) {
        this.reservedinstances = reservedinstances;
    }

    public ListFunctionReservedInstancesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListFunctionReservedInstancesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListFunctionReservedInstancesResponse withCount(Long count) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFunctionReservedInstancesResponse listFunctionReservedInstancesResponse =
            (ListFunctionReservedInstancesResponse) o;
        return Objects.equals(this.reservedinstances, listFunctionReservedInstancesResponse.reservedinstances)
            && Objects.equals(this.pageInfo, listFunctionReservedInstancesResponse.pageInfo)
            && Objects.equals(this.count, listFunctionReservedInstancesResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reservedinstances, pageInfo, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFunctionReservedInstancesResponse {\n");
        sb.append("    reservedinstances: ").append(toIndentedString(reservedinstances)).append("\n");
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
