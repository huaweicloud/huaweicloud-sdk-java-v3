package com.huaweicloud.sdk.bss.v2.model;

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
public class ListMultiAccountRetrieveCouponsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avail_retrieve_coupons")

    private List<AvailRetrieveCoupons> availRetrieveCoupons = null;

    public ListMultiAccountRetrieveCouponsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 记录条数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListMultiAccountRetrieveCouponsResponse withAvailRetrieveCoupons(
        List<AvailRetrieveCoupons> availRetrieveCoupons) {
        this.availRetrieveCoupons = availRetrieveCoupons;
        return this;
    }

    public ListMultiAccountRetrieveCouponsResponse addAvailRetrieveCouponsItem(
        AvailRetrieveCoupons availRetrieveCouponsItem) {
        if (this.availRetrieveCoupons == null) {
            this.availRetrieveCoupons = new ArrayList<>();
        }
        this.availRetrieveCoupons.add(availRetrieveCouponsItem);
        return this;
    }

    public ListMultiAccountRetrieveCouponsResponse withAvailRetrieveCoupons(
        Consumer<List<AvailRetrieveCoupons>> availRetrieveCouponsSetter) {
        if (this.availRetrieveCoupons == null) {
            this.availRetrieveCoupons = new ArrayList<>();
        }
        availRetrieveCouponsSetter.accept(this.availRetrieveCoupons);
        return this;
    }

    /**
     * 可回收余额信息，如果是余额账户，只会有一条记录。 具体请参见表2。
     * @return availRetrieveCoupons
     */
    public List<AvailRetrieveCoupons> getAvailRetrieveCoupons() {
        return availRetrieveCoupons;
    }

    public void setAvailRetrieveCoupons(List<AvailRetrieveCoupons> availRetrieveCoupons) {
        this.availRetrieveCoupons = availRetrieveCoupons;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMultiAccountRetrieveCouponsResponse listMultiAccountRetrieveCouponsResponse =
            (ListMultiAccountRetrieveCouponsResponse) o;
        return Objects.equals(this.totalCount, listMultiAccountRetrieveCouponsResponse.totalCount)
            && Objects.equals(this.availRetrieveCoupons, listMultiAccountRetrieveCouponsResponse.availRetrieveCoupons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, availRetrieveCoupons);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMultiAccountRetrieveCouponsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    availRetrieveCoupons: ").append(toIndentedString(availRetrieveCoupons)).append("\n");
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
