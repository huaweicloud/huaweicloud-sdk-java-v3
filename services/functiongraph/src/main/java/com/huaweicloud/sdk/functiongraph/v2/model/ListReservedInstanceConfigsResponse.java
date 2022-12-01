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
    @JsonProperty(value = "reservedinstances")

    private List<ReservedInstanceConfigs> reservedinstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public ListReservedInstanceConfigsResponse withReservedinstances(List<ReservedInstanceConfigs> reservedinstances) {
        this.reservedinstances = reservedinstances;
        return this;
    }

    public ListReservedInstanceConfigsResponse addReservedinstancesItem(ReservedInstanceConfigs reservedinstancesItem) {
        if (this.reservedinstances == null) {
            this.reservedinstances = new ArrayList<>();
        }
        this.reservedinstances.add(reservedinstancesItem);
        return this;
    }

    public ListReservedInstanceConfigsResponse withReservedinstances(
        Consumer<List<ReservedInstanceConfigs>> reservedinstancesSetter) {
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
    public List<ReservedInstanceConfigs> getReservedinstances() {
        return reservedinstances;
    }

    public void setReservedinstances(List<ReservedInstanceConfigs> reservedinstances) {
        this.reservedinstances = reservedinstances;
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListReservedInstanceConfigsResponse listReservedInstanceConfigsResponse =
            (ListReservedInstanceConfigsResponse) o;
        return Objects.equals(this.reservedinstances, listReservedInstanceConfigsResponse.reservedinstances)
            && Objects.equals(this.pageInfo, listReservedInstanceConfigsResponse.pageInfo)
            && Objects.equals(this.count, listReservedInstanceConfigsResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reservedinstances, pageInfo, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListReservedInstanceConfigsResponse {\n");
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
